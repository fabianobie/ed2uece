package ed2.model;

public class Splay {
	
	private Integer chave; //Elemento da estrutura
	private Splay noDir; //No direito
	private Splay noEsq; //No esquerdo
	private Splay noPai; //No pai
	
	
	//Construtor da Estrutura
	public Splay(){
		
	}
	
	//Construtor da Estrutura
	public Splay(Integer chave){
		this.chave = chave;
		
	}
	//A estrutura da Splay e a mesma de uma de uma arvore binaria comum.
	
	@Override
	public String toString() {
		return "N [ valor"+chave+"-"+"FD"+ noDir.getChave()+"-"+"FE"+noEsq.getChave()+"]";
		
		
	};
	//Os metodos seguintes recebem ou estabelecem as propriedades das estruturas
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
	//Sobre escrevendo a fun��o de igualdade.Para o critetio de compara��o do objeto seja a chave.
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
