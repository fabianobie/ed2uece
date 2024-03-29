package ed2.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import ed2.controller.ArvoreEsquerdaController;

public class FibonacciHeap {
	
	
	private ArvoreEsquerda arvore;
	
	public FibonacciHeap(Integer chave){
		lista = new ArrayList<ArvoreEsquerda>();//Lista de Arvores Esquerda
		arvore = new ArvoreEsquerda(chave);//No de Arvore Esquerda
		arvore.setAltura(ArvoreEsquerdaController.getAltura(arvore));
		lista.add(arvore);
	}
	// Construtor da Estrutura
	public FibonacciHeap(){
		lista = new ArrayList<ArvoreEsquerda>();
	}
	
	@Override
	public String toString() {
		String fibonacciEsquerda= "FH"; 
		for (ArvoreEsquerda arvores : lista) {
			fibonacciEsquerda += "-"+"N ["+arvores.toString()+"]";
		}
		
		return fibonacciEsquerda;
		
	}
	
//Os metodos seguintes recebem ou estabelecem as propriedades das estruturas
	public void setArvore(ArvoreEsquerda arvore) {
		this.arvore = arvore;
	}
	public ArvoreEsquerda getArvore() {
		return arvore;
	}
	public List<ArvoreEsquerda> getLista() {
		return lista;
	}
	public void setLista(List<ArvoreEsquerda> lista) {
		this.lista = lista;
	}
	private List<ArvoreEsquerda> lista;

}
