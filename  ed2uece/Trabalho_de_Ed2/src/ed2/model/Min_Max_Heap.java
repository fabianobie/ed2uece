package ed2.model;

public class Min_Max_Heap {
	
	private Integer estrutura[];
	private Integer tamanhoHeap;
	
	
	
	public Min_Max_Heap(Integer tamanhoDaEstrutura){
		this.estrutura = new Integer[tamanhoDaEstrutura +1];
		this.tamanhoHeap = 0;
	}
	
	public void setEstrutura(Integer estrutura[]) {
		this.estrutura = estrutura;
	}
	public Integer[] getEstrutura() {
		return estrutura;
	}
	public void setTamanhoHeap(Integer tamanhoHeap) {
		this.tamanhoHeap = tamanhoHeap;
	}
	public Integer getTamanhoHeap() {
		return tamanhoHeap;
	}
	

}
