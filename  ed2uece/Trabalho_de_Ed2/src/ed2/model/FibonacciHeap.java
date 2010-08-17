package ed2.model;

import java.util.LinkedList;

import ed2.controller.ArvoreEsquerdaController;

public class FibonacciHeap {
	
	private LinkedList<ArvoreEsquerda> lista;
	private ArvoreEsquerda arvore;
	
	public FibonacciHeap(Integer chave){
		arvore = new ArvoreEsquerda(chave);
		arvore.setAltura(ArvoreEsquerdaController.getAltura(arvore));
		lista.add(arvore);
	}
	public FibonacciHeap(){
		arvore = new ArvoreEsquerda();
		arvore.setAltura(ArvoreEsquerdaController.getAltura(arvore));
		lista.add(arvore);
	}
	
	
	public void setLista(LinkedList<ArvoreEsquerda> lista) {
		this.lista = lista;
	}
	public LinkedList<ArvoreEsquerda> getLista() {
		return lista;
	}
	public void setArvore(ArvoreEsquerda arvore) {
		this.arvore = arvore;
	}
	public ArvoreEsquerda getArvore() {
		return arvore;
	}

}
