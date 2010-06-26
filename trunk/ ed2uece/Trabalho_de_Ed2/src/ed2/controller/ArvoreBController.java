package ed2.controller;


import ed2.model.ArvoreB;

public class ArvoreBController {
	public static int ORDEM = 2;//A ordem que será utilizada nos teste
	
	public ArvoreBController(){
		
	}
	
	public Integer buscaArvoreB(ArvoreB raiz, Integer noPesquisado){
		if(raiz != null){
			for (int i = 1; i <= raiz.getElementos()[i-1]; i++) {
				if (raiz.getElementos()[i-1] > noPesquisado) 
					return buscaArvoreB(raiz.getFilhos()[i-1], noPesquisado);	
				else
					return noPesquisado;
				}
		}else
			return -1;
		
		return 1;//ver isso amanhã
	}
	public void InserirB(ArvoreB raiz,Integer chave){
		if(raiz == null){
			//O valor padrão utilizado para a arvores será 2
			raiz = new ArvoreB(ORDEM, chave);
			raiz.setQuantidadeElementos(1);
		}else if(buscaArvoreB(raiz, chave)!= -1){
			System.out.println("O elemento já se encontra na arvore ");
		}else{
			int contador;
			for ( contador = 0; contador < raiz.getQuantidadeElementos(); contador++) {
				if(raiz.getElementos()[contador] > chave){
					break;
				}
			}
			organizaPagina(contador,raiz);
			raiz.getElementos()[contador] = new Integer(chave);
			raiz.getFilhos()[contador+1] = raiz;
			if (raiz.getQuantidadeElementos() > ORDEM * 2) {
				split(raiz);
			}
		}
	}
	
	
	public void organizaPagina(Integer indice,ArvoreB raiz){
		for (int i = raiz.getQuantidadeElementos(); i > indice; i--) {
			raiz.getElementos()[i] = raiz.getElementos()[i-1];
			raiz.getFilhos()[i+1] = raiz.getFilhos()[i+1];
			}
		}
	public  void split(ArvoreB raiz){
		ArvoreB novaPagina = new ArvoreB(ORDEM, 0);
		
		int i = 0;
		for (; i < ORDEM; i++) {
			novaPagina.getElementos()[i] = raiz.getElementos()[i + 1+ORDEM];
			raiz.getElementos()[i+1+ ORDEM]=null;
			novaPagina.getFilhos()[i] = raiz.getFilhos()[i+1+ORDEM];
			if (novaPagina.getFilhos()[i] != null) {
				//acho aqui vai dar erro tenho q ver como arrumar
				novaPagina.getFilhos()[i] = novaPagina;			
				}
			raiz.getFilhos()[i+1+ORDEM] = null; 
			raiz.setQuantidadeElementos(ORDEM+1);
			novaPagina.setQuantidadeElementos(ORDEM);
			if (raiz.getPai()== null) {
				raiz.setPai(new ArvoreB(ORDEM,0));
				raiz.getPai().getFilhos()[0] = raiz;
			}
			novaPagina.setPai(raiz.getPai());
			Integer elelmentoCentral = raiz.getElementos()[ORDEM];
			raiz.getElementos()[ORDEM]=null;
			raiz.setQuantidadeElementos(raiz.getQuantidadeElementos()-1);
			InserirB(raiz.getPai(),elelmentoCentral);
			}
		
		
	}
	
			
	
	
	
}
