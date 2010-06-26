package ed2.controller;

import ed2.model.Splay;

public class SplayController {
	private Splay splayInicial;
	boolean verifica;
	
	public SplayController(){
		splayInicial = new Splay();
	}
	
	public void inserirSplay(Splay splayInserida ,Integer chave){
		if(splayInserida == null){
			splayInserida = new Splay(chave);
			
		}else if(chave == splayInserida.getChave()){
			return;
		}else if(chave < splayInserida.getChave()){
			
			inserirSplay(splayInserida.getNoEsq(), chave);
			
		}else if(chave > splayInserida.getChave()){
			inserirSplay(splayInserida.getNoDir(), chave);
		}
		
			
	}
	//função Splay leva o ele mento pra a raiz da arvore
	public void splay(Splay splayInserida){//Função responsavel pela função de desdobramento
		while(splayInserida != splayInicial && splayInserida.getNoPai() != null ){
			//O primeiro caso verificado vai ser quando a função splay acende de um nó raiz
			if(splayInserida.getNoPai().getNoPai() == null){
				if(splayInserida.getNoEsq()==splayInserida){
					rotacaoDir(splayInserida);
				}
				else{
					rotacaoEsq(splayInserida);
				}
					
			}
			//O segundo caso analisado e quando a função splay e utilizada para um filho a direita
			else if(splayInserida.getNoPai().getNoEsq()== splayInserida){
				if(splayInserida.getNoPai().getNoPai().getNoEsq() == splayInserida.getNoPai()){
					
					rotacaoDir(splayInserida.getNoPai());
					splayInserida= splayInserida.getNoPai();
					
				}else{//Realiza desdrobamento chamado Zig-Zag
					rotacaoDir(splayInserida);
					rotacaoEsq(splayInserida);
				}
			}
			else{//O terceiro e ultimo caso analizado e quando a função splay e utilizada para um filho a esquerda
				if(splayInserida.getNoPai().getNoPai().getNoDir() == splayInserida.getNoPai()){
					rotacaoEsq(splayInserida.getNoPai());
					splayInserida = splayInserida.getNoPai();
					
				}else{//Operação chamada de zag-zig
					rotacaoEsq(splayInserida);
					rotacaoDir(splayInserida);
				}
			}
		}
		//Ver essa verificação.
		if (splayInserida == null) {
			splayInserida = splayInicial;
		}
		
	}
	//Rotações do Tipo Zig
	public void rotacaoDir(Splay splayInserida){
		
		splayInserida.getNoPai().setNoEsq(splayInserida.getNoDir()) ;
		splayInserida.setNoDir(splayInserida.getNoPai());
		if (splayInserida.getNoPai().getNoPai() != null)//Verifica se p tem avo
		{
			if (splayInserida.getNoPai().getNoPai().getNoDir() == splayInserida.getNoPai()){
				splayInserida.getNoPai().getNoPai().setNoDir(splayInserida);
			}else{
				splayInserida.getNoPai().getNoPai().setNoEsq(splayInserida);
			}
							
		} else{//Caso não tenha avó o nó procurado e a raiz.
			splayInicial = splayInserida;//Foi observado que o no e a raiz fim do primeiro if
		}

		if (splayInserida.getNoDir().getNoEsq()!=null)
			splayInserida.getNoDir().getNoEsq().setNoPai(splayInserida.getNoEsq());
		splayInserida.getNoEsq().setNoPai(splayInserida);
		splayInserida.setNoPai(splayInserida.getNoPai().getNoPai());
				
	}
	//Rotações do Tipo Zag
	public void rotacaoEsq(Splay splayInserida){
		
		splayInserida.getNoPai().setNoDir(splayInserida.getNoEsq()) ;
		splayInserida.setNoEsq(splayInserida.getNoPai());
		
		if (splayInserida.getNoPai().getNoPai() != null)//Verifica se p tem avo
		{
			if (splayInserida.getNoPai().getNoPai().getNoDir() == splayInserida.getNoPai()){
				splayInserida.getNoPai().getNoPai().setNoDir(splayInserida);
			}else{
				splayInserida.getNoPai().getNoPai().setNoEsq(splayInserida);
			}
							
		} else{//Caso não tenha avó o nó procurado e a raiz.
			splayInicial = splayInserida; //Foi observado que o no e a raiz fim do primeiro if
		}

		if (splayInserida.getNoEsq().getNoDir()!=null)
			splayInserida.getNoEsq().getNoDir().setNoPai(splayInserida.getNoDir());
		splayInserida.getNoDir().setNoPai(splayInserida);
		splayInserida.setNoPai(splayInserida.getNoPai().getNoPai());
	}
	
	
	public void buscaSplay(Splay splayBusca, Integer chave){
		if(chave < splayBusca.getChave()){
			deletaSplay(splayBusca.getNoEsq(), chave);
		}else if(chave > splayBusca.getChave()){
			deletaSplay(splayBusca.getNoEsq(), chave);
		}else if(chave == splayBusca.getChave()){
			splay(splayBusca);
		}else{
			return;
		}
	}
	
	
	public void deletaSplay(Splay splayDelete,Integer chave){
		//Caso tenha chegado ao  fim retorna falso
		if(splayDelete == null){
			return;
		}else if(chave < splayDelete.getChave()){
			deletaSplay(splayDelete.getNoEsq(), chave);
		}else if(chave > splayDelete.getChave()){
			deletaSplay(splayDelete.getNoDir(), chave);
		}else{
			splayDelete = new Splay();
		}
		
	}
	
	public void setSplayInicial(Splay splayInicial) {
		this.splayInicial = splayInicial;
	}
	public Splay getSplayInicial() {
		return splayInicial;
	}
	

}
