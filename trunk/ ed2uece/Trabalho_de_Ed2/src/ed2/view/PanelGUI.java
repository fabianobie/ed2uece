package ed2.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;



public class PanelGUI extends JPanel {
	
	private JLabel labelTamanhoInicial,labelFatorCarga,labelValor;
	private JButton buttonInserir, buttonDeletar;
	private JTextField textFieldTamanhoInicial,textFieldFatordeCarga, textFieldValor;
	
	public PanelGUI(){
		initObjs();
		setProperties();
		
	}
	private void initObjs(){
		labelFatorCarga = new JLabel("Fator de Carga");
		labelTamanhoInicial = new JLabel("Tamanho Inicial");
		labelValor = new JLabel("Valor");
		
		buttonInserir = new JButton("Inserir");
		buttonDeletar = new JButton("Deletar");
		
		textFieldTamanhoInicial = new JTextField();
		textFieldFatordeCarga = new JTextField();
		textFieldValor = new JTextField();
		
	}
	private void setProperties(){
		setLayout(null);
		setBackground(Color.WHITE);
		setBorder(new LineBorder(Color.BLACK));
		
		add(labelTamanhoInicial);
		labelTamanhoInicial.setBounds(5,5,100,25);
		
		add(textFieldTamanhoInicial);
		textFieldTamanhoInicial.setBounds(98, 5, 45, 25);
		
		add(labelFatorCarga);
		labelFatorCarga.setBounds(5,35,100,25);
		
		add(textFieldFatordeCarga);
		textFieldFatordeCarga.setBounds(98,35 , 45, 25);
		
		add(labelValor);
		labelValor.setBounds(5, 65, 100,25);
		
		add(textFieldValor);
		textFieldValor.setBounds(98, 65, 45, 25);
		
		add(buttonInserir);
		buttonInserir.setBounds(5, 100, 85, 25);
		
		add(buttonDeletar);
		buttonDeletar.setBounds(100, 100, 85, 25);	
	
	}
	public static void main(String[] args) {
		 JFrame frame = new JFrame();
		 frame.setLayout(null);
		
		 PanelGUI panelGUI = new PanelGUI();
		 frame.add(panelGUI);
		 panelGUI.setBounds(5, 5, 818, 250);
		
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(400, 400);
		 frame.setLocationRelativeTo(null);
		 frame.setVisible(true);
		 }


	public void setTextFieldValor(JTextField textFieldValor) {
		this.textFieldValor = textFieldValor;
	}


	public JTextField getTextFieldValor() {
		return textFieldValor;
	}


	public void setButtonDeletar(JButton buttonDeletar) {
		this.buttonDeletar = buttonDeletar;
	}


	public JButton getButtonDeletar() {
		return buttonDeletar;
	}


	public void setLabelTamanhoInicial(JLabel labelTamanhoInicial) {
		this.labelTamanhoInicial = labelTamanhoInicial;
	}


	public JLabel getLabelTamanhoInicial() {
		return labelTamanhoInicial;
	}


	public void setLabelValor(JLabel labelValor) {
		this.labelValor = labelValor;
	}


	public JLabel getLabelValor() {
		return labelValor;
	}


	public void setLabelFatorCarga(JLabel labelFatorCarga) {
		this.labelFatorCarga = labelFatorCarga;
	}


	public JLabel getLabelFatorCarga() {
		return labelFatorCarga;
	}


	public void setButtonInserir(JButton buttonInserir) {
		this.buttonInserir = buttonInserir;
	}


	public JButton getButtonInserir() {
		return buttonInserir;
	}


	public void setTextFieldTamanhoInicial(JTextField textFieldTamanhoInicial) {
		this.textFieldTamanhoInicial = textFieldTamanhoInicial;
	}


	public JTextField getTextFieldTamanhoInicial() {
		return textFieldTamanhoInicial;
	}


	public void setTextFieldFatordeCarga(JTextField textFieldFatordeCarga) {
		this.textFieldFatordeCarga = textFieldFatordeCarga;
	}


	public JTextField getTextFieldFatordeCarga() {
		return textFieldFatordeCarga;
	}

}
