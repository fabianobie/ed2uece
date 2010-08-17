package ed2.controller;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import ed2.model.ArvoreEsquerda;
import ed2.model.FibonacciHeap;

public class FibonacciHeapController {
	
	private FibonacciHeap filaHeap;
	
	
	public FibonacciHeapController(){
		
	}
	
	public void inputHeap(Integer chave){
		setFilaHeap(new FibonacciHeap(chave));
			
	}
	public ArvoreEsquerda merge(ArvoreEsquerda arvoreA, ArvoreEsquerda arvoreB){
		//Caso alguma das arvores for nula retorna a outra arvore
		if(arvoreA == null)
			return arvoreB;
		if(arvoreB == null)
			return arvoreA;
		//Agora verificaremos a prioridade do elemento maior
		if (arvoreA.getChave() > arvoreB.getChave()) {
			if(arvoreA.getNoEsquerdo() == null){
				arvoreA.setNoEsquerdo(arvoreB);
				}
			else{
				arvoreA.setNoDireito(merge(arvoreA.getNoDireito(), arvoreB));
				//Realizando a comparação ente os npl
				if(arvoreA.getNoEsquerdo().getNpl() < arvoreA.getNoDireito().getNpl() ){
					troca(arvoreA);
				}
				arvoreA.setNpl(arvoreA.getNoDireito().getNpl()+1);
				
			}
			return arvoreA;
		}
		else{
			if(arvoreB.getNoEsquerdo() == null){
				arvoreA.setNoEsquerdo(arvoreA);
				}
			else{
				arvoreB.setNoDireito(merge(arvoreB.getNoDireito(), arvoreA));
				//Realizando a comparação ente os npl
				if(arvoreB.getNoEsquerdo().getNpl() < arvoreB.getNoDireito().getNpl() ){
					troca(arvoreB);
				}
				arvoreB.setNpl(arvoreB.getNoDireito().getNpl()+1);
				
			}
			return arvoreB;
		}
					
	}
	
	//Função utilizada para inversão da arvore
	public void troca(ArvoreEsquerda arvore){
		ArvoreEsquerda temp = arvore.getNoEsquerdo();
		arvore.setNoEsquerdo(arvore.getNoDireito());
		arvore.setNoDireito(temp);
	}

	public void setFilaHeap(FibonacciHeap filaHeap) {
		this.filaHeap = filaHeap;
	}

	public FibonacciHeap getFilaHeap() {
		return filaHeap;
	}


	

}
