package ed2.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import ed2.model.ArvoreEsquerda;
import ed2.model.FibonacciHeap;

public class FibonacciHeapController {
	
	private FibonacciHeap filaHeap;
	
	
	public FibonacciHeapController(){
		filaHeap = new FibonacciHeap();
	}
	
	public void inputHeap(Integer chave){
		ArvoreEsquerda arvoreTemp = new ArvoreEsquerda(chave);
		arvoreTemp.setAltura(ArvoreEsquerdaController.getAltura(arvoreTemp));
		filaHeap.getLista().add(arvoreTemp);
		verificaAlturas(filaHeap);
		
			
	}
	public Integer outHeap(FibonacciHeap fibonacciHeap){
		return 1;
	}
	public void verificaAlturas(FibonacciHeap filaHeap){
		
	//	List<String> listaTemp = new ArrayList<String>();
		for (Integer i = 0; i < filaHeap.getLista().size(); i++) {
			Integer alturaInicial = ArvoreEsquerdaController.getAltura(filaHeap.getLista().get(i));
			if(alturaInicial == filaHeap.getLista().get(i+1).getAltura()){
				 merge(filaHeap.getLista().get(i),filaHeap.getLista().get(i+1));
			}
		}
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
