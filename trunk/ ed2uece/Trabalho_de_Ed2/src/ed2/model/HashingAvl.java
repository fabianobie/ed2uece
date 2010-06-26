package ed2.model;

import ed2.controller.AvlController;

public class HashingAvl {
	private Integer tamanhoAtual;
	private Integer fatorCarga;
	private AvlController arvore;
	private Integer numeroDeElementos;
	
	
	public HashingAvl(){
		
	}			
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
