package ed2.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import ed2.model.EdManager;
import edu.uci.ics.jung.algorithms.layout.StaticLayout;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;


@SuppressWarnings("serial")
public class BGUI extends JPanel {
	
	public static final int VERTEX_WIDTH = 30;
	public static final int VERTEX_HEIGHT = 30;
	
	private JLabel title;
	private JPanel titlePanel;
	private SparseMultigraph<String, String> graph;
	private StaticLayout<String, String> staticLayout;
	private VisualizationViewer<String, String> bVV;
	
	public BGUI() {
		initObjs();
		setProperties();
	}
	
	private void initObjs() {
		title = new JLabel(EdManager.ED_B, JLabel.LEFT);
		titlePanel = new JPanel();
	
		graph = EdManager.getGraphInstance();
		staticLayout = new StaticLayout<String, String>(graph);
		bVV = new VisualizationViewer<String, String>(staticLayout,
			  new Dimension(EdManager.VV_WIDTH, EdManager.VV_HEIGHT));
	}
	
	private void setProperties() {
		setLayout(null);
		setBackground(Color.WHITE);
		setBorder(new LineBorder(Color.BLACK));
		
		titlePanel.setLayout(null);
		titlePanel.setBackground(Color.BLACK);
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Arial", Font.PLAIN, 13));
		titlePanel.add(title);
		title.setBounds(2, 0, 80, 25);
		
		add(titlePanel);
		titlePanel.setBounds(0, 0, EdManager.VV_WIDTH+2, 25);
		
		add(bVV);
		bVV.setBounds(2, 28, EdManager.VV_WIDTH, EdManager.VV_HEIGHT);
	}
	
	public void addGraphMouse(DefaultModalGraphMouse<String, String> graphMouse) {
		bVV.setGraphMouse(graphMouse);
	}
	
	public VisualizationViewer<String, String> getBVV() {
		return bVV;
	}
	
	public StaticLayout<String, String> getStaticLayout() {
		return staticLayout;
	}
	
	public SparseMultigraph<String, String> getGraph() {
		return graph;
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		BGUI bG = new BGUI();
		frame.add(bG);
		bG.setBounds(0, 0, EdManager.VV_WIDTH + 4, EdManager.VV_HEIGHT + 30);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

}
