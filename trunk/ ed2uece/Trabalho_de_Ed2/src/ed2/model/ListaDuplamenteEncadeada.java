package ed2.model;

public class ListaDuplamenteEncadeada {
	
	private Integer dado; //Elemento
	private ListaDuplamenteEncadeada proximoNo; //No seguinte
	private ListaDuplamenteEncadeada anteriorNo;//No anterior 
	private Integer numElementos;//Total de elementos
	
	//Construtor da Estrutura
	public ListaDuplamenteEncadeada(){
		
	}
	//Construtor da Estrutura
	public ListaDuplamenteEncadeada(Integer dado){
		this.dado= dado;
		this.numElementos = 0;
	}
	//Construtor da Estrutura
	public ListaDuplamenteEncadeada(Integer dado,ListaDuplamenteEncadeada lista){
		this.dado = dado;
		this.proximoNo = lista;
		this.numElementos = 0;
      
	}
	
	//Adiciona um elemento a lista
	public void adicionar(Integer no,ListaDuplamenteEncadeada lista){
		ListaDuplamenteEncadeada temp = new ListaDuplamenteEncadeada();
		temp.setDado(no);
		temp.setProximoNo(lista.getProximoNo());
		lista.setProximoNo(temp);
		lista.setNumElementos(lista.getNumElementos()+1);
	}
	
	//Os metodos seguintes recebem ou estabelecem as propriedades das estruturas
	
	public void setDado(Integer dado) {
		this.dado = dado;
	}
	public Integer getDado() {
		return dado;
	}
	public void setProximoNo(ListaDuplamenteEncadeada proximoNo) {
		this.proximoNo = proximoNo;
	}
	public ListaDuplamenteEncadeada getProximoNo() {
		return proximoNo;
	}
	public void setNumElementos(Integer numElementos) {
		this.numElementos = numElementos;
	}
	public Integer getNumElementos() {
		return numElementos;
	}
	public void setAnteriorNo(ListaDuplamenteEncadeada anteriorNo) {
		this.anteriorNo = anteriorNo;
	}
	public ListaDuplamenteEncadeada getAnteriorNo() {
		return anteriorNo;
	}

}
