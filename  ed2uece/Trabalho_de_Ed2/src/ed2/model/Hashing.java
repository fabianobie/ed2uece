package ed2.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hashing {
	
	private Integer tamanhoAtual; //tamanho atual da tabela 
	private Integer tamanhoTemp; //Tamanho da tabela para hashing
	private ArrayList<Integer> tabelaAtual; //Tabela de hashing
	

	private ArrayList<Integer> tabelaTemp;//Tabela temporaria utilizada para Tratamentos
	private Integer qtdItens;
	
	//Construtor da estrutura
	public Hashing(int tamanho){
		tabelaAtual = new ArrayList<Integer>(tamanho);
		tabelaTemp = new ArrayList<Integer>(tamanho);
	} 
	//Construtor da estrutura
	public Hashing(Integer chave){
		tabelaAtual.add(chave);
		
	}
	
	//Construtora da Estrutura
	public Hashing(Integer chave,Integer tamanho){
		this.tamanhoAtual = tamanho;
		tabelaAtual = new ArrayList<Integer>(tamanho);
		tabelaAtual.add(chave);
		
		
	}
	@Override
	public String toString() {
		String vetor ="H"; 
		for (int i = 0; i < tabelaAtual.size(); i++) {
			vetor +="[Valor"+ tabelaAtual.get(i)+",";
		}
		vetor = " ]";
		return vetor;
	}
	
	//Os metodos seguintes recebem ou estabelecem as propriedades das estruturas
	public void setTamanhoAtual(Integer tamanhoAtual) {
		this.tamanhoAtual = tamanhoAtual;
	}
	public Integer getTamanhoAtual() {
		return tamanhoAtual;
	}
	public void setTamanhoTemp(Integer tamanhoTemp) {
		this.tamanhoTemp = tamanhoTemp;
	}
	public Integer getTamanhoTemp() {
		return tamanhoTemp;
	}

	public void setQtdItens(Integer qtdItens) {
		this.qtdItens = qtdItens;
	}

	public Integer getQtdItens() {
		return qtdItens;
	}
	
	public ArrayList<Integer> getTabelaAtual() {
		return tabelaAtual;
	}

	public void setTabelaAtual(ArrayList<Integer> tabelaAtual) {
		this.tabelaAtual = tabelaAtual;
	}

	public ArrayList<Integer> getTabelaTemp() {
		return tabelaTemp;
	}

	public void setTabelaTemp(ArrayList<Integer> tabelaTemp) {
		this.tabelaTemp = tabelaTemp;
	}
}
