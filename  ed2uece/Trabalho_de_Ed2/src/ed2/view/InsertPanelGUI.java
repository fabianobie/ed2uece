package ed2.view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import ed2.model.EdManager;

@SuppressWarnings("serial")
public class InsertPanelGUI extends JPanel{
	
	private JTextField insertTextField;
	private JComboBox insertCombox;
	private JButton insertButton;
	
	public InsertPanelGUI() {
		initObjs();
		setProperties();
	}
	
	private void initObjs() {
		insertTextField = new JTextField();
		insertCombox = new JComboBox();
		insertButton = new JButton("Inserir");
	}
	
	private void setProperties() {
		setLayout(null);
		setBackground(Color.WHITE);
		setBorder(new LineBorder(Color.BLACK));
		
		add(insertTextField);
		insertTextField.setBounds(15, 15, 350, 25);
		
		fillcombox();
		add(insertCombox);
		insertCombox.setBounds(370, 15, 105, 25);
		
		add(insertButton);
		insertButton.setBounds(480, 15, 85, 25);
	}
	
	private void fillcombox() {
		String [] structures = {EdManager.ED_AVL, EdManager.ED_B, EdManager.ED_B_PLUS};
		
		for (int i = 0; i < structures.length; i++)
			insertCombox.addItem(structures[i]);
	}
	
	public void addListeners(ActionListener actionListener) {
		insertButton.addActionListener(actionListener);
	}
	
	public JTextField getInsertTextField() {
		return insertTextField;
	}

	public JButton getInsertButton() {
		return insertButton;
	}
	
	public JComboBox getInsertCombox() {
		return insertCombox;
	}
}
