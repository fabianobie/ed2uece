package ed2.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import ed2.model.EdManager;
import edu.uci.ics.jung.algorithms.layout.TreeLayout;
import edu.uci.ics.jung.graph.DelegateForest;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;

@SuppressWarnings("serial")
public class SplayGUI extends JPanel {
	
	private JLabel title;
	private JPanel titlePanel;
	private DelegateForest<String, String> forest;
	private TreeLayout<String, String> treeLayout;
	private VisualizationViewer<String, String> splayVV;
	
	public SplayGUI() {
		initObjs();
		setProperties();
	}
	
	private void initObjs() {
		title = new JLabel(EdManager.SPLAY, JLabel.LEFT);
		titlePanel = new JPanel();
		
		forest = EdManager.getForestInstance();
		treeLayout = new TreeLayout<String, String>(forest);
		splayVV = new VisualizationViewer<String, String>(treeLayout, 
				new Dimension(EdManager.VV_WIDTH, EdManager.VV_HEIGHT));
	}
	//Inicializando as Variaveis
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
		titlePanel.setBounds(0, 0, EdManager.VV_WIDTH +2, 25);
		
		add(splayVV);
		splayVV.setBounds(2, 28, EdManager.VV_WIDTH, EdManager.VV_HEIGHT);
	}
	
	public void addGraphMouse(DefaultModalGraphMouse<String, String> graphMouse) {
		splayVV.setGraphMouse(graphMouse);
	}
	
	public VisualizationViewer<String, String> getSplayVV() {
		return splayVV;
	}
	
	public TreeLayout<String, String> getTreeLayout() {
		return treeLayout;
	}
	
	public DelegateForest<String, String> getForest() {
		return forest;
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		SplayGUI avlG = new SplayGUI();
		frame.add(avlG);
		avlG.setBounds(0, 0, EdManager.VV_WIDTH + 4, EdManager.VV_HEIGHT + 30);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}
