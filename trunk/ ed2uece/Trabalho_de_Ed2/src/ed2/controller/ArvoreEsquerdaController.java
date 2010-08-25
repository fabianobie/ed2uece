package ed2.controller;


import ed2.model.ArvoreEsquerda;

public class ArvoreEsquerdaController {
	
	private ArvoreEsquerda raiz;//primeiro elemento da arvore
	
	
	//incluir um elemento na arvore esquerda
	public void input(Integer elemento){
		ArvoreEsquerda temp = new ArvoreEsquerda(elemento);
		raiz = merge(temp, raiz);
		
	}
	//incluir um elemento na arvore esquerda
	public void input(Integer elemento, ArvoreEsquerda arvore){
	//	ArvoreEsquerda temp = new ArvoreEsquerda(elemento);
		raiz = merge(arvore, raiz);
		
	}
	//retira o elemento do topo da arvore esquerda
	public Integer output(){
		Integer elemento = raiz.getChave();
		raiz = merge(raiz.getNoEsquerdo(), raiz.getNoDireito());
		return elemento;
	}
	//Função responsavel por retornar a altura de um nó
	public static Integer getAltura(ArvoreEsquerda arvore){
		Integer alturaEsquerda =0;
		Integer alturaDireita = 0;
		if (arvore.getNoDireito() != null) {
			alturaDireita = getAltura(arvore.getNoEsquerdo());
		}
		if (arvore.getNoEsquerdo() != null) {
			alturaEsquerda = getAltura(arvore.getNoDireito());
		}
		if (alturaDireita> alturaEsquerda) {
			 return alturaDireita = alturaDireita +1;
		}else{
			return alturaEsquerda = alturaEsquerda +1;
		}
		
		
	}
	//Função que tem como objetivo unir duas arvores esquerdas
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
	
       
        
	//Retorna a raiz
    public ArvoreEsquerda getRaiz() {
		return raiz;
	}
    //Define a raiz
	public void setRaiz(ArvoreEsquerda raiz) {
		this.raiz = raiz;
	}

}
