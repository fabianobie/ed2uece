package ed2.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import ed2.model.EdManager;
import ed2.view.InsertPanelGUI;

public class InsertPanelController {

	private EdManager edManager;
	private InsertPanelGUI insertPanelGUI;
	private InsertPanelListener listener;
	
	public InsertPanelController(EdManager edManager) {
		initObjs(edManager);
		setProperties();
	}
	
	private void initObjs(EdManager edManager) {
		this.edManager = edManager;
		
		insertPanelGUI = new InsertPanelGUI();
		listener = new InsertPanelListener();
	}
	
	private void setProperties() {
		insertPanelGUI.addListeners(listener);
	}
	
	public InsertPanelGUI getInsertPanelGUI() {
		return insertPanelGUI;
	}
	
	class InsertPanelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == insertPanelGUI.getInsertButton()) {
				//INSERE NA ESTRUTURA ESCOLHIDA
				String text = insertPanelGUI.getInsertTextField().getText();
				String type = insertPanelGUI.getInsertCombox().getSelectedItem()+"";
				
				if (type.equals(EdManager.ED_AVL))
					if (text.contains(",")) {
						String [] endPoints = text.split(",");
						String parent = endPoints[0].trim();
						String child = endPoints[1].trim();
					
						edManager.addChildInAvlTree(parent, child);
//						System.out.println("INSERE O VERTICE : "+child+
//										   " COM O PAI : "+parent+".\n");
					} else {
						edManager.addVertexInAvlTree(insertPanelGUI.getInsertTextField().getText());
//						System.out.println("INSERE VERTICE : "+insertPanelGUI.getInsertTextField().getText()+".\n");
					}
				else {
					if (type.equals(EdManager.ED_B)) {
						String [] info = text.split(",");
						String vertex = info[0];
						int position = Integer.parseInt(info[1].trim());
						
						//edManager.addVertexInPositionBVector(vertex, position);
					} else{
						
					//	edManager.addVertexInBVector(text);
						}
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		
		InsertPanelController ipc = new InsertPanelController(null);
		InsertPanelGUI ipg = ipc.getInsertPanelGUI();
		frame.add(ipg);
		ipg.setBounds(0, 0, 580, 60);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}
