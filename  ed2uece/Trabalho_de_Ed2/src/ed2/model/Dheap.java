package ed2.model;

public class Dheap {
	private Integer d;  //valor q vai se modificar apartir do valor inserido
	private Integer estrutura[]; //estrutura que receber os valores
	private Integer tamanhoHeap; //quantidade de elemntos do heap
	
	
	
	public Dheap(Integer d,Integer tamanhoDaEstrutura){
		this.d =d;
		this.estrutura = new Integer[tamanhoDaEstrutura+1];//temos que adicionar uma casa no tamanho do vetor pois comercamos apartir da posição 1
	    this.tamanhoHeap = 0;
	}
	@Override
	public String toString() {
	    String retornoDaFuncao = "";
		for (int i = 0; i < estrutura.length; i++) {
			retornoDaFuncao +="," + estrutura[i].toString();
		}
		return "T ["+retornoDaFuncao+"]";
		
		
	};
	public Integer getD() {
		return d;
	}
	public void setD(Integer d) {
		this.d = d;
	}
	public Integer[] getEstrutura() {
		return estrutura;
	}
	public void setEstrutura(Integer[] estrutura) {
		this.estrutura = estrutura;
	}
	public void setTamanhoHeap(Integer tamanhoHeap) {
		this.tamanhoHeap = tamanhoHeap;
	}
	public Integer getTamanhoHeap() {
		return tamanhoHeap;
	}
	

}
