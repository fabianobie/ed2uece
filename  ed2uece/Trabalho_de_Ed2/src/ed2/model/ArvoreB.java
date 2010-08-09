package ed2.model;

import javax.swing.text.StyledEditorKit.BoldAction;
 
public class ArvoreB {
	private Integer numChaves;
	private Boolean folha;
	private ArvoreB filhos[];
	private Integer elementos[];
	private Integer quantidadeElementos;
    private ArvoreB pai;

	public ArvoreB(Integer Ordem,Integer elementoInserido){
		this.numChaves = Ordem;
	    elementos = new Integer[2*Ordem];//Numero de elementos em uma pagina de uma arvore B e igual a 2 vezes a ordem
	    filhos = new ArvoreB[2*Ordem +1];//Numero de ponteiros em uma pagina de uma arvore B e igual a 2 vezes a ordem mais 1
	    setPai(null);
	    for (int i = 1; i < 2; i++) {
			elementos[i] = elementoInserido;
	    }
	}
	
	
	
	public void setNumChaves(Integer numChaves) {
		this.numChaves = numChaves;
	}
	public Integer getNumChaves() {
		return numChaves;
	}
	public void setFolha(Boolean folha) {
		this.folha = folha;
	}
	public Boolean getFolha() {
		return folha;
	}
	public void setFilhos(ArvoreB filhos[]) {
		this.filhos = filhos;
	}
	public ArvoreB[] getFilhos() {
		return filhos;
	}
	public Integer[] getElementos() {
		return elementos;
	}
    public void setElementos(Integer[] elementos) {
		this.elementos = elementos;
	}

	public void setQuantidadeElementos(Integer quantidadeElementos) {
		this.quantidadeElementos = quantidadeElementos;
	}
	public Integer getQuantidadeElementos() {
		return quantidadeElementos;
	}



	public void setPai(ArvoreB pai) {
		this.pai = pai;
	}



	public ArvoreB getPai() {
		return pai;
	}



	


	

	
	
	

}
