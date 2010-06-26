package ed2.model;


public class Avl {

	private Integer chave;//Conteudo do n� da AVL	
	private Avl no_dir;//Liga��o com o n� direito
	private Avl no_esq;//Liga��o com o n� esquerdo
	private Integer bal;//Variavel utilizada no balanceamento da arvore
	private Integer altura;
	
	public Avl(){//Construtor da classe
		
	}
	public Avl(Integer chave){//Construtor da classe
		this.chave = chave;
	}
	
	//Get�s e Set�s da classe
	public void setChave(Integer chave) {
		this.chave = chave;
	}

	public Integer getChave() {
		return chave;
	}

	public void setBal(Integer bal) {
		this.bal = bal;
	}

	public Integer getBal() {
		return bal;
	}

	public void setNo_dir(Avl no_dir) {
		this.no_dir = no_dir;
	}

	public Avl getNo_dir() {
		return no_dir;
	}

	public void setNo_esq(Avl no_esq) {
		this.no_esq = no_esq;
	}

	public Avl getNo_esq() {
		return no_esq;
	}
	//Sobre escrevendo a fun��o de igualdade.Para o critetio de compara��o do objeto seja a chave.
	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Avl)) {
			return false;
		} else {
			Avl avl = (Avl) obj;
			return avl.getChave().equals(this.getChave());
		}

	}
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	public Integer getAltura() {
		return altura;
	}
}
