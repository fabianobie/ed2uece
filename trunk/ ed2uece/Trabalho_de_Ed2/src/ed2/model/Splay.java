package ed2.model;

public class Splay {
	
	private Integer chave;
	private Splay noDir;
	private Splay noEsq;
	private Splay noPai;
	
	

	public Splay(){
		
	}
	public Splay(Integer chave){
		this.chave = chave;
		
	}
	//A estrutura da Splay e a mesma de uma de uma arvore binaria comum.
	
	
	public void setChave(Integer chave) {
		this.chave = chave;
	}
	public Integer getChave() {
		return chave;
	}
	public void setNoDir(Splay noDir) {
		this.noDir = noDir;
	}
	public Splay getNoDir() {
		return noDir;
	}
	public void setNoEsq(Splay noEsq) {
		this.noEsq = noEsq;
	}
	public Splay getNoEsq() {
		return noEsq;
	}
	//Sobre escrevendo a função de igualdade.Para o critetio de comparação do objeto seja a chave.
	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Avl)) {
			return false;
		} else {
			Splay splay = (Splay) obj;
			return splay.getChave().equals(this.getChave());
		}

	}
	public void setNoPai(Splay noPai) {
		this.noPai = noPai;
	}
	public Splay getNoPai() {
		return noPai;
	}
	

}
