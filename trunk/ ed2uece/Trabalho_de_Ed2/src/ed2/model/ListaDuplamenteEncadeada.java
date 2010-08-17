package ed2.model;

public class ListaDuplamenteEncadeada {
	
	private Integer dado;
	private ListaDuplamenteEncadeada proximoNo;
	private ListaDuplamenteEncadeada anteriorNo;
	private Integer numElementos;
	
	public ListaDuplamenteEncadeada(){
		
	}
	public ListaDuplamenteEncadeada(Integer dado){
		this.dado= dado;
		this.numElementos = 0;
	}
	public ListaDuplamenteEncadeada(Integer dado,ListaDuplamenteEncadeada lista){
		this.dado = dado;
		this.proximoNo = lista;
		this.numElementos = 0;
      
	}
	
	public void adicionar(Integer no,ListaDuplamenteEncadeada lista){
		ListaDuplamenteEncadeada temp = new ListaDuplamenteEncadeada();
		temp.setDado(no);
		temp.setProximoNo(lista.getProximoNo());
		lista.setProximoNo(temp);
		lista.setNumElementos(lista.getNumElementos()+1);
	}
	
	
	
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
