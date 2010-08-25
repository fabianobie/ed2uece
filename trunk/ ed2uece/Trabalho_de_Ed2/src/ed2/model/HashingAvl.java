package ed2.model;

import ed2.controller.AvlController;

public class HashingAvl {
	private Integer tamanhoAtual; //Tamanho da hashing
	private Integer fatorCarga; //Fator de carga
	private AvlController arvore; //Arvore de cada No
	private Integer numeroDeElementos; //Numero de elementos inseridos
	
	//Construtor da Estrutura
	public HashingAvl(){
		
	}			
	//Os metodos seguintes recebem ou estabelecem as propriedades das estruturas
	public Integer getTamanhoAtual() {
		return tamanhoAtual;
	}
	public void setTamanhoAtual(Integer tamanhoAtual) {
		this.tamanhoAtual = tamanhoAtual;
	}
	public Integer getFatorCarga() {
		return fatorCarga;
	}
	public void setFatorCarga(Integer fatorCarga) {
		this.fatorCarga = fatorCarga;
	}
	
	public Integer getNumeroDeElementos() {
		return numeroDeElementos;
	}
	public void setNumeroDeElementos(Integer numeroDeElementos) {
		this.numeroDeElementos = numeroDeElementos;
	}


	public void setArvore(AvlController arvore) {
		this.arvore = arvore;
	}


	public AvlController getArvore() {
		return arvore;
	}
	
	
}
