package ed2.controller;

import ed2.model.Dheap;

public class DHeapController {
	
	private static final int D = 2;
	private static final int QUANTIDADE_ELEMENTOS_DO_VETOR = 100000;
	private Dheap heap;
	
	public DHeapController(){
		heap = new Dheap(D, QUANTIDADE_ELEMENTOS_DO_VETOR);
	}
	
	public void inHeap(Dheap heap ,Integer chave){
		//caso o heap esteja cheio
		
		if(heap.getTamanhoHeap()+1==heap.getEstrutura().length){
			Integer vetorTemp[]= new Integer[QUANTIDADE_ELEMENTOS_DO_VETOR*1000 +1]; 
			//esse metodo copia um array para outro array adequqndo os tamanhos
			System.arraycopy(heap.getEstrutura(), 0, vetorTemp, 0, heap.getEstrutura().length);
		    heap.setEstrutura(vetorTemp); 
		}
		//colocando o elemento inserido no final do Heap
		heap.getEstrutura()[heap.getTamanhoHeap()+1] = chave;
		//Agora vamos colocar o elemento do heap no topo
		InTop(heap.getTamanhoHeap()+1);
		//aumentando a quantidade de elementos do heap
		heap.setTamanhoHeap(heap.getTamanhoHeap()+1);
		
	}
	
	public void inHeap(Integer chave){
		//caso o heap esteja cheio
		
		if(heap.getTamanhoHeap()+1==heap.getEstrutura().length){
			Integer vetorTemp[]= new Integer[QUANTIDADE_ELEMENTOS_DO_VETOR*1000 +1]; 
			//esse metodo copia um array para outro array adequqndo os tamanhos
			System.arraycopy(heap.getEstrutura(), 0, vetorTemp, 0, heap.getEstrutura().length);
		    heap.setEstrutura(vetorTemp); 
		}
		//colocando o elemento inserido no final do Heap
		heap.getEstrutura()[heap.getTamanhoHeap()+1] = chave;
		//Agora vamos colocar o elemento do heap no topo
		InTop(heap.getTamanhoHeap()+1);
		//aumentando a quantidade de elementos do heap
		heap.setTamanhoHeap(heap.getTamanhoHeap()+1);
		
	}
	//Metodo utilizado para colocar o elemento inserido no final do heap no topo no topo
	public void InTop(Integer indiceDoElemento){
		if(indiceDoElemento == 1){//veridfica se o elemento e primero elemento
			System.out.println("Chegou no primeiro elemento do heap");
		}else{
			Integer temp = heap.getEstrutura()[indiceDoElemento];
			Integer indicePai = retornaPai(indiceDoElemento) ;
			Integer pai = heap.getEstrutura()[indicePai];
			if(temp < pai){
				trocarDePosicao(indiceDoElemento, indicePai);
				InTop(indicePai);
			}
			
		}
	}
	
	//metodo utilizado para indicar a posição do pai
	public Integer retornaPai(Integer indiceDoElemento){
		  
		return (int)Math.ceil(((double)indiceDoElemento - 1.0) / (double)D);
	}
	
	//metodo utilizado para fazer troca de posição de elementos em um vetor
	public void trocarDePosicao(Integer elemento1,Integer elemento2){
		Integer temp = heap.getEstrutura()[elemento1];
		heap.getEstrutura()[elemento1] = heap.getEstrutura()[elemento2];
		heap.getEstrutura()[elemento2] = temp;
	}
	
	
	public Integer outHeap(){
		if(heap.getTamanhoHeap() == 0){
			System.out.println("O heap está vazio");
			return -1;
		}else{
			//fazendo uma copia do elemento pesquisado
			Integer elementoPesquisado = heap.getEstrutura()[1];
			//copiando o ultimo elemento do vetor para o inicio
			heap.getEstrutura()[1] = heap.getEstrutura()[heap.getTamanhoHeap()];
			//apagando a ultima posição do vetor
			heap.getEstrutura()[heap.getTamanhoHeap()] = null;
			//subtraindo um elemento do tamanho do heap
			heap.setTamanhoHeap(heap.getTamanhoHeap()-1);
			//organizando o novo heap
			organizaHeapDelecao(1);
			return elementoPesquisado;
		}	
	}
	//Esse metodo vai ser utilizado para rearrumar o heap apos a deleção de um elemento
	public void organizaHeapDelecao(Integer indice){
	        //Variavel utilizada para verificar os vizinhos 
		    Integer vizinho; 
	       
	        int temp = heap.getEstrutura()[indice];
	        
	        if(ajustaPosicao(indice, 1) <= heap.getTamanhoHeap()){
	        	vizinho = menorVizinho(indice);
	        	//Fazendo a troca de posição dos filhos
	        	if(heap.getEstrutura()[vizinho] < temp){
	        		temp = heap.getEstrutura()[vizinho];
	        		heap.getEstrutura()[vizinho] = heap.getEstrutura()[indice]; 
	        	}
	        	heap.getEstrutura()[indice]= temp;
	        	//Utilizando recusão para verificar todos os filhos
	        	if (vizinho <= heap.getTamanhoHeap()) {
	        		organizaHeapDelecao(vizinho);
				}
	        }
	        
		
	}
	//essa função retorna o indices indenpendente do D
	public Integer ajustaPosicao(Integer posicao,Integer tipoDeAjuste){
		if(tipoDeAjuste == 0){
	    	//Temos o valor central
	 		return (((posicao)+(D-2))/D);
		}else if(tipoDeAjuste == 1){
			//valores a esquerda  do pai
			return (D*((posicao-1)+2));			
		}else{
			//valores a direita do pai
			return (D*(posicao) +1);
		}	

	}
	
	public Integer menorVizinho(Integer indice){
		//Verificando o menor filho,metodo muito importante quando o D e maior q 2
		Integer menor = ajustaPosicao(indice, 1);
		for (int i = ajustaPosicao(indice, 1); i <= heap.getTamanhoHeap() && i <= ajustaPosicao(indice, 2); i++) {
			if (heap.getEstrutura()[i] < heap.getEstrutura()[menor]) {
				menor = i;
			}
			
		}
		return menor;
	}
	
	
	

}
