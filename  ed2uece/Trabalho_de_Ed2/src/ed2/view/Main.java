package ed2.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		AppletPanel ap = new AppletPanel();
		
	    JFrame frame = new JFrame();
	    frame.getContentPane().add(ap, BorderLayout.CENTER);
	    ap.init();
	    ap.start();
	    frame.setSize(400,320);
	    frame.setVisible(true);
	}
	
	public static void close() {
	}

}
