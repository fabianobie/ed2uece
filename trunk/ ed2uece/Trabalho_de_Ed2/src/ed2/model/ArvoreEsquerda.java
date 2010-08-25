package ed2.model;

public class ArvoreEsquerda {
	

	private Integer chave;//O valor a ser inserido na arvore esquerda
	private Integer altura;//A altura da arvore esquerda
	private Integer npl;//O comprimento nulo da arvore
	private ArvoreEsquerda noEsquerdo;//Filho Esquerdo
	private ArvoreEsquerda noDireito;//Filho direito no
	
	//Construtor da Arvore Esquerda
	public ArvoreEsquerda(Integer chave,Integer altura,Integer npl,ArvoreEsquerda noEsquerdo,ArvoreEsquerda noDireiro){
		this.altura = 0;
		this.chave = chave;
		this.npl = 0;
		this.noDireito = null;
		this.noEsquerdo= null;
	}
	
	//Construtor da Arvore Esquerda
	public ArvoreEsquerda(Integer chave){
		this.altura = 0;
		this.chave = chave;
		this.npl = 0;
		this.noDireito = null;
		this.noEsquerdo= null;
	}
	public ArvoreEsquerda(){
		
	}
	@Override
	public String toString() {
		return "N [ valor"+chave+"-"+"FD"+noDireito.getChave()+"-"+"FE"+noEsquerdo.getChave()+"]";
		
		
	};
	
	//Os metodos seguintes retornam ou estabelecem as propriedades da estrutura
	public Integer getChave() {
		return chave;
	}

	public void setChave(Integer chave) {
		this.chave = chave;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Integer getNpl() {
		return npl;
	}

	public void setNpl(Integer npl) {
		this.npl = npl;
	}

	public ArvoreEsquerda getNoEsquerdo() {
		return noEsquerdo;
	}

	public void setNoEsquerdo(ArvoreEsquerda noEsquerdo) {
		this.noEsquerdo = noEsquerdo;
	}

	public ArvoreEsquerda getNoDireito() {
		return noDireito;
	}

	public void setNoDireito(ArvoreEsquerda noDireito) {
		this.noDireito = noDireito;
	}

}
