package ed2.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import ed2.controller.EdManagerController;
import ed2.controller.InsertPanelController;
import ed2.model.EdManager;



@SuppressWarnings("serial")
public class AppletPanel extends JApplet {
	
	private static final int AVL_B_BPLUS = 0;
	private static final int HASH = 1;
	
	private static final int WIDTH = 1200;
	private static final int HEIGTH = 650;
	
	private JMenu menu;
	private JMenuBar menuBar;
	private JMenuItem menuItemAvlBBplus;
	private JMenuItem menuItemHash;
	private MenuListener listener;
	
	private JPanel mainPanel;
	private EdManagerController edManagerController;
	private EdManager edManager;
	private InsertPanelController insertPanelController;
	private InsertPanelGUI insertPanelGUI;
	private AvlGUI avlGUI;
	private BGUI bGUI;
	private BplusGUI bplusGUI;
	
	@Override
	public void init() {
		try {
			initObjs();
			setProperties();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "DEU ERRO", "ERROR", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}
	
	@Override
	public void destroy() {
		super.destroy();
		Main.close();
	}
	
	private void initObjs() {
		mainPanel = new JPanel();
		
		menuBar = new JMenuBar();
		menu = new JMenu("Opcoes");
		menuItemAvlBBplus = new JMenuItem("Avl/B/B+");
		menuItemHash = new JMenuItem("Hash/bla bla bla");
		
		listener = new MenuListener();
		
		edManagerController = new EdManagerController();
		edManager = edManagerController.getEdManager();
		
		insertPanelController = new InsertPanelController(edManager);
		insertPanelGUI = insertPanelController.getInsertPanelGUI();
		
		avlGUI = edManager.getAvlGUI();
		bGUI = edManager.getBGUI();
		bplusGUI = edManager.getBplusGUI();
	}
	
	private void setProperties() {
		setLayout(null);
		setBackground(Color.BLACK);
		
		mainPanel.setLayout(null);
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBorder(new LineBorder(Color.BLACK));
		
		menu.add(menuItemAvlBBplus);
		menu.addSeparator();
		menu.add(menuItemHash);
		menuItemAvlBBplus.addActionListener(listener);
		menuItemHash.addActionListener(listener);
		menuBar.add(menu);
		setJMenuBar(menuBar);
	}
	
	private void startGUI(int typeStart) {
		switch (typeStart) {
			case AVL_B_BPLUS:
				mainPanel.add(insertPanelGUI);
				insertPanelGUI.setBounds(HEIGTH/2-30, 5, 580, 60);
				
				mainPanel.add(avlGUI);
				avlGUI.setBounds(10, 70, EdManager.VV_WIDTH + 3, EdManager.VV_HEIGHT + 30);
				
				mainPanel.add(bGUI);
				bGUI.setBounds(EdManager.VV_WIDTH + 20, 70, EdManager.VV_WIDTH + 3, EdManager.VV_HEIGHT + 30);
				
				add(mainPanel);
				mainPanel.setBounds(5, 5, WIDTH, HEIGTH);
				break;

			case HASH:
				System.out.println("STARTA A ESTRUTURA Q TU MONTAR!");
				break;
		}
		this.repaint();
	}
	
	class MenuListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == menuItemAvlBBplus) {
				startGUI(AVL_B_BPLUS);
			} else
				if (e.getSource() == menuItemHash) {
					startGUI(HASH);
				}
		}
		
	}

}
