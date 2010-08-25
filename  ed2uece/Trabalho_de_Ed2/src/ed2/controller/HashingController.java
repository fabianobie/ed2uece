package ed2.controller;

import ed2.model.Hashing;

public class HashingController {
	private static final int QUANTIDADE_ELEMENTOS_DO_HASH = 7; //Tamanho do vetor inicial da Hash
	private  Hashing hash; //Hash a ser utilizada na classe
	
	//Construtor de Classe
	public HashingController(){
	  hash = new Hashing(7);	
	}
	
	
	//Insere elementos em uma Hash
	public void inserirHash(Hashing hash,int chave){
	    //    Boolean controlador;
		 int enderecoElemento = 0;
	        if(hash == null){
	            hash = new Hashing(QUANTIDADE_ELEMENTOS_DO_HASH);//O menor tamanho inicial de qualquer hashing
	            hash.setTamanhoAtual(QUANTIDADE_ELEMENTOS_DO_HASH);
	            hash.setTamanhoTemp(QUANTIDADE_ELEMENTOS_DO_HASH);   
	        }else 
	        	if(cheio(hash) == false && !verificaElemento(chave)){
	        		if(hash.getTabelaAtual().get(enderecoElemento) == null){
	        			enderecoElemento = chave%hash.getTamanhoTemp();
	        			hash.getTabelaAtual().set(enderecoElemento, chave);
	        			hash.setQtdItens(hash.getQtdItens()+1);
	        		}else{
	        			int novaPosicao = encontrarPosicao(enderecoElemento,hash,chave);
	        			if(novaPosicao != -1){
	        				hash.getTabelaAtual().set(novaPosicao, chave);
	        				hash.setQtdItens(hash.getQtdItens()+1);
	        			}else{
	        				System.out.println("Não inseriu o elemento!!!");
	        			}	        	
	        	} 
	        }
	    }
	//Essa função verifica se o arraylist está cheio
	public Boolean cheio(Hashing hash){
		int elemento = 0;
		for(int i =0;i< hash.getTamanhoAtual(); i++){
			elemento = hash.getTabelaAtual().get(i);
			if(elemento == 0){
				return false;
			}	
		}
		return true;
	}
	 //Essa função verifica se o elemento já existe
	 public Boolean verificaElemento(int elemento){
		 for (int i = 0; i < hash.getTamanhoAtual(); i++) {
			if(elemento == hash.getTabelaAtual().get(i)){
				return true;
			}
				
		}
		 return false;
	 }
	
	 public int encontrarPosicao(int enderecoElemento,Hashing hash ,int chave){
         int novaPosicao;
		 int primoAnterior;
		 try {
			 primoAnterior = anteriorPrimo(hash.getTamanhoTemp());
	         hash.setTamanhoTemp(primoAnterior);
	         novaPosicao = chave%hash.getTamanhoTemp();
	        if(hash.getTabelaTemp().get(novaPosicao) == null){
	        	return novaPosicao;
	        }else{
	        	return encontrarPosicao(novaPosicao,hash,chave);
	        }		
		} catch (ArithmeticException e) {
			// TODO: handle exception
			return -1;
		}
         
	 }
	 
	 //Função auxiliar de proximo primo para incrementar rehashing
	public Integer proximoPrimo(Integer chave){
		Integer atual,i;
		Boolean primo;
		if(chave< 3)
			return 3;
		for (i  = chave - 1; i < 3; i--) {
			primo = true;
			atual = i;
			if(atual%2==0)
				primo = false;
			for (int j = 3; j < chave; j=j+2) {
				if(chave%j == 0)
					primo = false;
			}
			if(primo)
				break;
		}
		
		return i;
	}
public Integer anteriorPrimo(Integer chave){
	Integer atual = 0,i;
	Boolean primo = null;
	
	if(chave%2 != 0)
		chave = chave+2;
	for (i = atual ; !primo ; i=i+2) {
		primo = true;
		atual = i;
		for (int j = 3; j < atual; j=j+2) {
			if(atual%j == 0)
				primo = false;
			
		}
		if(primo)
			break;
		
		
	}
		
		return i;
	}
	public void setHash(Hashing hash) {
		this.hash = hash;
	}

	public Hashing getHash() {
		return hash;
	}

}
