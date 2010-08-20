//package ed2.model;
//
//import java.awt.Color;
//import java.awt.Component;
//import java.awt.Graphics;
//import java.awt.event.KeyListener;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.swing.Icon;
//
//import org.apache.commons.collections15.Transformer;
//
//import ed2.view.AvlGUI;
//import ed2.view.BGUI;
//import ed2.view.BplusGUI;
//import ed2.view.HashingClosedGUI;
//import ed2.view.HashingMeioAbertoGUI;
//import ed2.view.OpenHashingGUI;
//import ed2.view.SplayGUI;
//import ed2.view.JUNG.PositionerB;
//import edu.uci.ics.jung.algorithms.layout.StaticLayout;
//import edu.uci.ics.jung.algorithms.layout.TreeLayout;
//import edu.uci.ics.jung.graph.DelegateForest;
//import edu.uci.ics.jung.graph.Graph;
//import edu.uci.ics.jung.graph.SparseMultigraph;
//import edu.uci.ics.jung.graph.util.Pair;
//import edu.uci.ics.jung.visualization.VisualizationViewer;
//import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;
//import edu.uci.ics.jung.visualization.control.ModalGraphMouse.Mode;
//import edu.uci.ics.jung.visualization.decorators.EdgeShape;
//import edu.uci.ics.jung.visualization.decorators.PickableEdgePaintTransformer;
//import edu.uci.ics.jung.visualization.decorators.PickableVertexPaintTransformer;
//import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
//import edu.uci.ics.jung.visualization.layout.LayoutTransition;
//import edu.uci.ics.jung.visualization.renderers.DefaultEdgeLabelRenderer;
//import edu.uci.ics.jung.visualization.renderers.DefaultVertexLabelRenderer;
//import edu.uci.ics.jung.visualization.renderers.Renderer.VertexLabel.Position;
//import edu.uci.ics.jung.visualization.util.Animator;
//
//public class EdManagerHashing {
//	
//	public static final String ED_AVL = "AVL";
//	public static final String ED_B = "B";
//	public static final String ED_B_PLUS = "B+";
//	public static final String SPLAY = "SPLAY";
//	public static final int VV_WIDTH =400;
//	public static final int VV_HEIGHT = 400;
//	
//	private OpenHashingGUI openHashingGUI;
//	private HashingClosedGUI hashingClosedGUI;
//	private HashingMeioAbertoGUI hashMeioAbertoGUI;
//	
//	private VisualizationViewer<String, String> closeHashingVV;
////	private VisualizationViewer<String, String> bVV;
//	private VisualizationViewer<String, String> openVV;
//	private VisualizationViewer<String, String> hashingMeioAbertoVV;
//	private DefaultModalGraphMouse<String, String> graphMouse;
//	
////	private List<String> avlVertices;
////	private List<Pair<String>> avlEdges;
////	
////	private List<String> splayVertices;
////	private List<Pair<String>> splayEdges;
//	
//	private List<String> closeHashingVertices;
//	private List<String> openVertices;
//	private List<String> hashingMeioAbertoVertices;
//	
//	
//	private boolean pickinkOk = false;
//	
//	private static int countEdge = 0;
//
//	public EdManagerHashing() {
//		initObjs();
//		setProperties();
//	}
//	
//	private void initObjs() {
//		openHashingGUI = new OpenHashingGUI();
//		hashingClosedGUI = new HashingClosedGUI();
//		hashMeioAbertoGUI = new HashingMeioAbertoGUI();
//		
//		
//		closeHashingVV = hashingClosedGUI.getClosedHashingVV();
//		openVV = openHashingGUI;
//		hashingMeioAbertoVV = splayGUI.getSplayVV();
////		bVV = bGUI.getBVV();
////		bplusVV = bplusGUI.getBPlusVV();
//		
//		avlVertices = new ArrayList<String>();
//		avlEdges = new ArrayList<Pair<String>>();
//		splayEdges = new ArrayList<Pair<String>>();
//		avlVertices = new ArrayList<String>();
//	//	bVertices = new ArrayList<String>();
//	}
//	
//	private void setProperties() {
//		setVisualizationViewerProperties(avlVV);
//		setVisualizationViewerProperties(splayVV);
//		//setVisualizationViewerProperties(bplusVV);
//		
//		addAvlVertices();
//		//addBVertices();
//	}
//	
//	private void setVisualizationViewerProperties(VisualizationViewer<String, String> vv) {
//		
//		vv.setBackground(Color.WHITE);
//		//Vertex Transformations
//		vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<String>());
//		vv.getRenderContext().setVertexLabelRenderer(new DefaultVertexLabelRenderer(
//														   Colors.PICKED_VERTEX_LABEL_COLOR));
//		vv.getRenderContext().setVertexFillPaintTransformer(
//				new PickableVertexPaintTransformer<String>(vv.getPickedVertexState(), 
//														   Colors.VERTEX_COLOR,  
//														   Colors.PCIKED_VERTEX_COLOR));
//		vv.getRenderer().getVertexLabelRenderer().setPosition(Position.S);
//		vv.setVertexToolTipTransformer(new ToStringLabeller<String>());
//		//Edge Transformations
//		vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<String>());
//		vv.getRenderContext().setEdgeShapeTransformer(new EdgeShape.Line<String, String>());
//		vv.getRenderContext().setEdgeLabelRenderer(new DefaultEdgeLabelRenderer(Colors.PICKED_EDGE_LABEL_COLOR));
//        vv.getRenderContext().setEdgeDrawPaintTransformer(
//        		new PickableEdgePaintTransformer<String>(vv.getPickedEdgeState(), 
//        												 Colors.EDGE_COLOR, 
//        												 Colors.PICKED_EDGE_COLOR));
//		vv.setEdgeToolTipTransformer(new ToStringLabeller<String>());
//		
////		if (vv.equals(bVV)) {
////			vv.getRenderer().getVertexLabelRenderer().setPosition(Position.CNTR);
////			vv.getRenderContext().setVertexIconTransformer(new Transformer<String,Icon>() {
////				public Icon transform(final String v) {
////					return new Icon() {
////						
////						public int getIconHeight() {
////							return BGUI.VERTEX_HEIGHT;
////						}
////						
////						public int getIconWidth() {
////							return BGUI.VERTEX_WIDTH;
////						}
////						
////						public void paintIcon(Component c, Graphics g, int x, int y) {
////							g.setColor(Color.BLACK);
////							g.fillRoundRect(x-1, y-1, BGUI.VERTEX_WIDTH+2, BGUI.VERTEX_HEIGHT+2, 5, 5);
////							g.setColor(Color.WHITE);
////							g.fillRoundRect(x, y, BGUI.VERTEX_WIDTH, BGUI.VERTEX_HEIGHT, 5, 5);
//////							g.drawString(""+v, x+6, y+15);
////						}};
////				}});
////			
////		}
//		
//	}
//	
//	public static SparseMultigraph<String, String> getGraphInstance() {
//		return new SparseMultigraph<String, String>();
//	}
//	
//	public static DelegateForest<String, String> getForestInstance() {
//		return new DelegateForest<String, String>();
//	}
//	
//	public void addGraphMouse(DefaultModalGraphMouse<String, String> graphMouse) {
//		this.graphMouse = graphMouse;
//		
//		avlGUI.addGraphMouse(graphMouse);
//		splayGUI.addGraphMouse(graphMouse);
////		bGUI.addGraphMouse(graphMouse);
////		bplusGUI.addGraphMouse(graphMouse);
//	}
//	
//	public void addKeyListener(KeyListener keyListener) {
//		avlVV.addKeyListener(keyListener);
//		splayVV.addKeyListener(keyListener);
////		bVV.addKeyListener(keyListener);
////		bplusVV.addKeyListener(keyListener);
//	}
//	
//	public AvlGUI getAvlGUI() {
//		return avlGUI;
//	}
//	public SplayGUI getSplayGUI() {
//		return splayGUI;
//	}
//	public BGUI getBGUI() {
//		return bGUI;
//	}
//	
//	public BplusGUI getBplusGUI() {
//		return bplusGUI;
//	}
//	
//	public DelegateForest<String, String> getAvlForest() {
//		return avlGUI.getForest();
//	}
//	
//	public SparseMultigraph<String, String> getBGraph() {
//		return bGUI.getGraph();
//	}
//	
//	public VisualizationViewer<String, String> getAvlVV() {
//		return avlVV;
//	}
//	
////	public VisualizationViewer<String, String> getbVV() {
////		return bVV;
////	}
////	
////	public VisualizationViewer<String, String> getBplusVV() {
////		return bplusVV;
////	}
//	
//	public boolean isPickinkOk() {
//		return pickinkOk;
//	}
//	
//	public void setPickinkOk(boolean pickinkOk) {
//		this.pickinkOk = pickinkOk;
//	}
//	
//	public void setModePicking() {
//		if (pickinkOk)
//			graphMouse.setMode(Mode.PICKING);
//	}
//	
//	public void setModeTranforming() {
//		graphMouse.setMode(Mode.TRANSFORMING);
//	}
//	
//	//===================================== METODOS PARA MANIPULACAO DAS ARVORES ==================================
//	
//	//******************************************* AVL ************************************************************
//	private String findAvlRoot() {
//		String root = null;
//		if (!avlVertices.isEmpty())
//			root = avlVertices.get(0);
//		return root;
//	}
//	
//	private void addAvlVertices() {
//		makeAvlExample();
//		updateAvl();
//	}
//	//UM EXAMPLO DE COMO INSERIR VERTICES E ARESTAS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//	private void makeAvlExample() {
//		String vertice1 = "Vertice 1";
//		String vertice2 = "Vertice 2";
//		String vertice3 = "Vertice 3";
//
//		avlVertices.add(vertice1);
//		avlVertices.add(vertice2);
//		avlVertices.add(vertice3);
//		
//		avlEdges.add(new Pair<String>(vertice1, vertice2));
//		avlEdges.add(new Pair<String>(vertice1, vertice3));
//	}
//	
//	public void addVertexInAvlTree(String vertex) {
//		avlVertices.add(vertex);
//		
//		updateAvl();
//	}
//	
//	public void addRootInAvlTree(String root) {
//		String existentRoot = null;
//		
//		existentRoot = findAvlRoot();
//		if (existentRoot == null)
//			avlVertices.add(0, root);
//		
//		updateAvl();
//	}
//	
//	public void addRootChildInAvlTree(String child) {
//		String root = findAvlRoot();
//		if (root != null)
//			avlEdges.add(new Pair<String>(root, child));
//		
//		updateAvl();
//	}
//	
//	public void addChildInAvlTree(String parent, String child) {
//		Pair<String> endPoints = new Pair<String>(parent, child);
//		if (!avlEdges.contains(endPoints))
//			if (parent != null)
//				avlEdges.add(endPoints);
//		
//		updateAvl();
//	}
//	
//	public void removeVertexInAvlTree(String vertex) {
//		List<Pair<String>> edgesToRemove = new ArrayList<Pair<String>>();
//		List<String> verticesToRemove = new ArrayList<String>();
//		for (Pair<String> p : avlEdges)
//			if (p.getFirst().equals(vertex)) {
//				edgesToRemove.add(p);
//				verticesToRemove.add(p.getSecond());
//			}
//		
//		if (avlVertices.contains(vertex))
//			avlVertices.remove(vertex);
//		
//		for (Pair<String> edgeToRemove : edgesToRemove)
//			if (avlEdges.contains(edgeToRemove))
//				avlEdges.remove(edgesToRemove);
//		
//		for (String vertexToRemove : verticesToRemove)
//			if (avlVertices.contains(vertexToRemove))
//				avlVertices.remove(vertexToRemove);
//			
//		updateAvl();
//	}
//	
//	public void removeEdgeInAvlTree(String first, String second) {
//		Pair<String> endPoints = new Pair<String>(first, second);
//		
//		if (avlEdges.contains(endPoints))
//			avlEdges.remove(endPoints);
//		
//		updateAvl();
//	}
//	
//	private void updateAvl() {
//		DelegateForest<String, String> forest = avlGUI.getForest();
//		List<String> vertices = new ArrayList<String>(forest.getVertices());
//		List<String> edges = new ArrayList<String>(forest.getEdges());
//		List<String> existentVertices = new ArrayList<String>();
//		List<Pair<String>> existentEdges = new ArrayList<Pair<String>>();
//		
//		TreeLayout<String, String> oldTreeLayout = avlGUI.getTreeLayout();
//		
//		//CONSTROI A NOVA FLORESTA
//		if (forest.getVertexCount() == 0)
//			forest.addVertex(avlVertices.get(0));
//		
//		for (String edge : edges) {
//			Pair<String> existentEndPoints = forest.getEndpoints(edge);
//			if (avlEdges.contains(existentEndPoints))
//				existentEdges.add(existentEndPoints);
//		}
//		
//		for (String vertex : vertices)
//			if (avlVertices.contains(vertex))
//				existentVertices.add(vertex);
//		
//		for (Pair<String> endPoints : avlEdges)
//			if (!existentEdges.contains(endPoints))
//				if (forest.containsVertex(endPoints.getFirst()))
//					forest.addEdge("aresta "+(++countEdge), endPoints.getFirst(), endPoints.getSecond());
//				else
//					for (String vertex : avlVertices)
//						if (!existentVertices.contains(vertex)) {
//							forest.addVertex(vertex);
//							forest.addEdge("aresta "+(++countEdge), endPoints.getFirst(), endPoints.getSecond());
//						}
//		
//		for (String vertex : avlVertices)
//			if (!existentVertices.contains(vertex))
//				forest.addVertex(vertex);
//		
//		TreeLayout<String, String> treeLayout = new TreeLayout<String, String>(forest);
//		avlVV.getRenderContext().getPickedVertexState().clear();
//		avlVV.getRenderContext().getPickedEdgeState().clear();
//		avlVV.updateUI();
//		
//		LayoutTransition<String, String> lt = new LayoutTransition<String, String>(
//				avlVV, oldTreeLayout, treeLayout);
//		Animator animator = new Animator(lt);
//		animator.start();
//	}
//	//******************************************* AVL ************************************************************
//
//	public void setHashMeioAbertoGUI(HashingMeioAbertoGUI hashMeioAbertoGUI) {
//		this.hashMeioAbertoGUI = hashMeioAbertoGUI;
//	}
//
//	public HashingMeioAbertoGUI getHashMeioAbertoGUI() {
//		return hashMeioAbertoGUI;
//	}
//
//	public void setHashingClosedGUI(HashingClosedGUI hashingClosedGUI) {
//		this.hashingClosedGUI = hashingClosedGUI;
//	}
//
//	public HashingClosedGUI getHashingClosedGUI() {
//		return hashingClosedGUI;
//	}
//
//	public void setOpenHashingGUI(OpenHashingGUI openHashingGUI) {
//		this.openHashingGUI = openHashingGUI;
//	}
//
//	public OpenHashingGUI getOpenHashingGUI() {
//		return openHashingGUI;
//	}
//	
//	//******************************************** B *************************************************************
////	private void addBVertices() {
////		makeBExample();
////		updateBVector();
////	}
////	
////	private void makeBExample() {
////		String vertice1 = "V 1";
////		String vertice2 = "V 2";
////
////		bVertices.add(vertice1);
////		bVertices.add(vertice2);
////	}
////	
////	public void addVertexInBVector(String vertex) {
////		bVertices.add(vertex);
////		updateBVector();
////	}
////	
////	public void addVertexInPositionBVector(String vertex, int position) {
////		if (position < bVertices.size())
////			bVertices.add(position, vertex);
////		else {
////			for (int i = bVertices.size(); i < position; i++) {
////				String ghostVertex = "GV "+i;
////				bVertices.add(ghostVertex);
////			}
////			bVertices.add(position, vertex);
////		}
////		updateBVector();
////	}
////	
////	public void removeVertexInBVector(String vertex) {
////		bVertices.remove(vertex);
////		updateBVector();
////	}
////	
////	private void updateBVector() {
////		Graph<String, String> bGraph = bGUI.getGraph();
////		StaticLayout<String, String> oldStaticLayout = bGUI.getStaticLayout();
////		
////		for (String vertex : bVertices)
////			if (!bGraph.containsVertex(vertex))
////				bGraph.addVertex(vertex);
////
////		StaticLayout<String, String> staticLayout = new StaticLayout<String, String>(bGraph);
////		bVV.getRenderContext().getPickedVertexState().clear();
////		bVV.getRenderContext().getPickedEdgeState().clear();
////		PositionerB.setVerticesPositions(staticLayout, bVV, bVertices);
////		
////		LayoutTransition<String, String> lt = new LayoutTransition<String, String>(
////				bVV, oldStaticLayout, staticLayout);
////		Animator animator = new Animator(lt);
////		animator.start();
////	}
//	//******************************************** B *************************************************************
//}
