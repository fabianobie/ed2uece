package ed2.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

import ed2.model.EdManager;
import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;

public class EdManagerController {
	
	private EdManager edManager;
	private EdManagerListener listener;

	
	public EdManagerController() {
		initObjs();
		setProperties();
	}
	
	private void initObjs() {
		edManager = new EdManager();
		listener = new EdManagerListener();
	}
	
	private void setProperties() {
		edManager.addGraphMouse(listener);
		edManager.addKeyListener(listener);
	}
	
	public EdManager getEdManager() {
		return edManager;
	}
	
	class EdManagerListener extends DefaultModalGraphMouse<String, String> implements KeyListener {
		
		@Override
		public void mouseEntered(MouseEvent e0) {
			super.mouseEntered(e0);
			if (e0.getComponent() == edManager.getbVV()) {
				edManager.setPickinkOk(false);
				edManager.setModeTranforming();
			}
		}

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyChar() == 'p') {
				if (e.getComponent() == edManager.getAvlVV()) {
					edManager.setPickinkOk(true);
					edManager.setModePicking();
				}
			} else
				if (e.getKeyChar() == 't')
					edManager.setModeTranforming();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			if (e.getKeyChar() == 'p') {
				if (e.getComponent() == edManager.getAvlVV()) {
					edManager.setPickinkOk(true);
					edManager.setModePicking();
				}
			} else
				if (e.getKeyChar() == 't')
					edManager.setModeTranforming();
		}
		
	}
}
