package ed2.view;

import java.awt.Color;
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
public class BplusGUI extends JPanel {
	
	private JLabel title;
	private JPanel titlePanel;
	private DelegateForest<String, String> forest;
	private TreeLayout<String, String> treeLayout;
	private VisualizationViewer<String, String> bplusVV;
	
	public BplusGUI() {
		initObjs();
		setProperties();
	}
	
	private void initObjs() {
		title = new JLabel(EdManager.ED_B_PLUS, JLabel.LEFT);
		titlePanel = new JPanel();
		
		forest = EdManager.getForestInstance();
		treeLayout = new TreeLayout<String, String>(forest, EdManager.VV_WIDTH, EdManager.VV_HEIGHT);
		bplusVV = new VisualizationViewer<String, String>(treeLayout);
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
		title.setBounds(5, 3, 80, 25);
		
		add(titlePanel);
		titlePanel.setBounds(5, 5, EdManager.VV_WIDTH, 25);
		
		add(bplusVV);
		bplusVV.setBounds(5, 30, EdManager.VV_WIDTH, EdManager.VV_HEIGHT);
		
//		makeExample();
	}
	
//	private void makeExample() {
//		String vertice1 = "Vertice 1";
//		String vertice2 = "Vertice 2";
//		tree.addVertex(vertice1);
//		tree.addChild("Edge", vertice1, vertice2);
//		
//		DefaultModalGraphMouse<String, String> graphMouse = new DefaultModalGraphMouse<String, String>();
//		addGraphMouse(graphMouse);
//	}
	
	public void addGraphMouse(DefaultModalGraphMouse<String, String> graphMouse) {
		bplusVV.setGraphMouse(graphMouse);
	}
	
	public VisualizationViewer<String, String> getBPlusVV() {
		return bplusVV;
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
		
		BplusGUI bpG = new BplusGUI();
		frame.add(bpG);
		bpG.setBounds(0, 0, EdManager.VV_WIDTH + 15, EdManager.VV_HEIGHT + 40);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

}
