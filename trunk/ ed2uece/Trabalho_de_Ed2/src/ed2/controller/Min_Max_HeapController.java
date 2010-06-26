package ed2.controller;

import ed2.model.Min_Max_Heap;

public class Min_Max_HeapController {
	
	private static final int QUANTIDADE_ELEMENTOS_DO_VETOR = 100000;
	private Min_Max_Heap heap;
	
	 public Min_Max_HeapController() {
		 Min_Max_Heap heap = new Min_Max_Heap(QUANTIDADE_ELEMENTOS_DO_VETOR); 
	}
    
	public void inHeap(Integer chave){
		//Verificando se o heap está cheio
		if(heap.getTamanhoHeap()+1 == heap.getEstrutura().length){
			Integer vetorTemp[]= new Integer[QUANTIDADE_ELEMENTOS_DO_VETOR*1000 +1]; 
			//esse metodo copia um array para outro array adequqndo os tamanhos
			System.arraycopy(heap.getEstrutura(), 0, vetorTemp, 0, heap.getEstrutura().length);
		    heap.setEstrutura(vetorTemp); 
		}
		heap.getEstrutura()[heap.getTamanhoHeap()+1] = chave;
		inTopMinMax(heap.getTamanhoHeap()+1);
		heap.setTamanhoHeap(heap.getTamanhoHeap()+1);
		
		
	}
	 
	 
	public void inTopMinMax(Integer indiceDoUltimoElemento){
		//verifica se o elemento esta em nivel de maximo ou em nivel de minimo.
		//caso o valor do nivel for igual a 1 o nivel e de maximo caso for igual a zero e de minimo 
		Integer temp = heap.getTamanhoHeap()/2;
		if(getMinimo(heap.getTamanhoHeap()) == 1){
			
		}else{
			
		}
	}
	public 
	public void subirMax(Integer indiceDoUltimoElemento){
		Integer temp = heap.getTamanhoHeap()/2;
		
	}
	
	
	public void subirMin(Integer indiceDoUltimoElemento){
		
	}
	
	//Função utilizada para pegar o indice do pai do valor procurado
	public Integer getPai(Integer indice){
		if(indice==1){//chegamos no primeiro elemento do vetor
			return -1;
		}
		return 2;
	}
	//Função utilizada para pegar o indice do avô do valor procurado
	public Integer getAvo(Integer indice){
		return 2;
	}
	//Função utilizada para encontrar o logaritmo na base 2
	public double log2(double d) {
	    return Math.log(d)/Math.log(2.0);
	}
	//metodo utilizado para fazer troca de posição de elementos em um vetor
	public void trocarDePosicao(Integer elemento1,Integer elemento2){
		Integer temp = heap.getEstrutura()[elemento1];
		heap.getEstrutura()[elemento1] = heap.getEstrutura()[elemento2];
		heap.getEstrutura()[elemento2] = temp;
	}
	public void setHeap(Min_Max_Heap heap) {
		this.heap = heap;
	}
	public Min_Max_Heap getHeap() {
		return heap;
	} 
	
	 
	 

}
