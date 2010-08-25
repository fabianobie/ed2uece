package ed2.controller;

import ed2.model.Avl;

public class AvlController {
	private Avl avlInicial;//Nó inicial
	private Boolean verifica;
    
	public AvlController(){//Construtor da Classe
		avlInicial = new Avl();
	}
	//Função utilizada para rotação para esquerda

	public void rotEsquerda(Avl avlInicial){
	  Avl avlRotacaoEsq = avlInicial.getNo_esq();
	  
	  if(avlRotacaoEsq.getBal() == -1){
		  avlInicial.setNo_esq(avlRotacaoEsq.getNo_dir());
		  avlRotacaoEsq.setNo_dir(avlInicial);
		  avlInicial.setBal(0);
		  avlInicial = avlRotacaoEsq;
	  }else{
		  Avl avlAuxiliar = avlRotacaoEsq.getNo_dir();
		  if (avlAuxiliar != null) {
			  //Fazendo as rotações
			  avlRotacaoEsq.setNo_dir(avlAuxiliar.getNo_esq());
			  avlAuxiliar.setNo_esq(avlRotacaoEsq);
			  avlInicial.setNo_esq(avlAuxiliar.getNo_dir());
			  avlAuxiliar.setNo_dir(avlInicial);
			  if(avlAuxiliar.getBal() == -1){//Fazendo a atualização da variavel de balanceamento
				  avlAuxiliar.setBal(1);
			  }else {
				  avlAuxiliar.setBal(0);
			  }if(avlAuxiliar.getBal() == 1){
				  avlRotacaoEsq.setBal(-1);
			  }else{
				  avlRotacaoEsq.setBal(0);
				  
			  }
			  avlRotacaoEsq = avlAuxiliar;
		}
		  
	  }
	  avlRotacaoEsq.setBal(0);
	  verifica = false;

	}
	//Função utilizada para medir a altura da AVL
	public Integer alturaAvl(Avl arvore){
	    int noEsq = 0;
	    int noDir = 0;
		if(arvore.getNo_esq() !=null){
			noEsq = alturaAvl(arvore.getNo_esq());
		}
		if (arvore.getNo_dir() !=null) {
			noDir = alturaAvl(arvore.getNo_dir());
		}
		if (noEsq > noDir)
			return noEsq + 1;
		else
			return noDir + 1;
		 
	}
	//Função utilizada para rotação para direita
	public void rotDireita(Avl avlInicial){
		 Avl avlRotacaoDir = avlInicial.getNo_dir();
		 if(avlRotacaoDir.getBal() == 1){
			 avlInicial.setNo_dir(avlRotacaoDir.getNo_esq());
			 avlRotacaoDir.setNo_esq(avlInicial);
			 avlInicial.setBal(0);
			 avlInicial = avlRotacaoDir;
			 
		 }else{
			 Avl avlAux = avlRotacaoDir.getNo_esq();
			 if(avlAux != null){
				 avlRotacaoDir.setNo_esq(avlAux.getNo_dir());
				 avlAux.setNo_dir(avlRotacaoDir);
				 avlInicial.setNo_dir(avlAux.getNo_esq());
				 avlAux.setNo_esq(avlInicial);
				 //Verificações dos Bal
				 if(avlAux.getBal() == 1)
					 avlInicial.setBal(-1);
				 else	 
					 avlInicial.setBal(0);
				 
				 if(avlAux.getBal() == -1)
					 avlRotacaoDir.setBal(1);
					 
				 else
					 avlRotacaoDir.setBal(0);
				 avlInicial = avlAux;
				 
			 }
			 
		 }
		 avlInicial.setBal(0);
		 verifica = false;
		
	}
	public void inserirAvl(Avl noInserido, Integer chave){//Feito em 03/12
		//Caso o nó não seja encontrado ele cria o no
		if(noInserido == null){
			noInserido = new  Avl(chave);
			verifica = true;
		}else{
			if(chave == noInserido.getChave()){
				return;
			}else if(chave < noInserido.getChave()){// caso ao contrario insere um valor a esquerda
				inserirAvl(noInserido.getNo_esq(),chave);
				if(verifica){
					switch (noInserido.getBal()) {
					case 1:
						noInserido.setBal(0);
						verifica = false;
					break;
					case 0:
						noInserido.setBal(-1);
					break;
					case -1:
						rotEsquerda(noInserido);
					break;
					
					}
					
				}
			}else{//insere um no na parte direita
				inserirAvl(noInserido.getNo_dir(), chave);
				if(verifica){
					switch (noInserido.getBal()) {
					case 1:
						noInserido.setBal(0);
						verifica = false;
					break;
					case 0:
						noInserido.setBal(1);
					break;
					case -1:
						rotDireita(noInserido);
					break;
					
					}
				}
			}
		}
		
	} 
	public void removerAvl(Avl noRemovido ,Integer chave){
		if(noRemovido == null){//Caso não encontre a chave
			return;
			//NAO TEM ESSA CHAVE NESTA ARVORE
		}else if(noRemovido.getBal() == chave){//Encontrar o nó que deseja remover
			noRemovido = new Avl();
		}else if(noRemovido.getBal() > chave){
			removerAvl(noRemovido.getNo_esq(), chave);
			if(verifica){
				switch (noRemovido.getBal()) {
				case -1:
					noRemovido.setBal(0);
					verifica = false;
				break;
				case 0:
					noRemovido.setBal(1);
				break;
				case 1:
					rotDireita(noRemovido);
				break;
				
				}
		}
	  }else if(noRemovido.getBal() < chave){
		  removerAvl(noRemovido.getNo_dir(), chave);
			if(verifica){
				switch (noRemovido.getBal()) {
				case 1:
					noRemovido.setBal(0);
					verifica = false;
				break;
				case 0:
					noRemovido.setBal(-1);
				break;
				case -1:
					rotEsquerda(noRemovido);
				break;
				
				}
		  
			}			
	  }
		
	}
	
	//Os metodos seguintes recebem ou estabelecem os elementos das estruturas
	public void setAvlInicial(Avl avlInicial) {
		this.avlInicial = avlInicial;
	}

	public Avl getAvlInicial() {
		return avlInicial;
	}

	public void setVerifica(Boolean verifica) {
		this.verifica = verifica;
	}

	public Boolean getVerifica() {
		return verifica;
	}

}
