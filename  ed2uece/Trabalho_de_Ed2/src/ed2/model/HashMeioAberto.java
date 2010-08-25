package ed2.model;



public class HashMeioAberto {

	private Avl[] hashMeioAberto; //Vetor de AVLs
	private int tamanho; //Tamanho da hash
	private int fatorCarga; //Fator de Carga
	private int elementos; //Quantidade de Elementos

//Construtor da Estrutura
public HashMeioAberto(int tamanho, int fatorCarga){
	this.tamanho = tamanho;
	this.fatorCarga = fatorCarga;
	hashMeioAberto = new Avl[tamanho];
	for(int i = 0; i < tamanho; i++){
		hashMeioAberto[i] = new Avl();
	}	
}

//@Override
//public String toString() {
//	String hashingMeioAberto ="HMA [";
//	for (int i = 0; i < hashMeioAberto.length; i++) {
//		hashingMeioAberto +="valor"","; 
//	}
//	return "";
//}

//Os metodos seguintes recebem ou estabelecem as propriedades das estruturas
public void setTamanho(int tam){
	this.tamanho=tam;
}

public int getTamanho(){
	return tamanho;
}

public void setFatorCarga(int fatcarga){
	this.fatorCarga = fatcarga;
}

public int getFatorCarga(){
	return fatorCarga;
}

public void setElementos(int elem){
	this.elementos = elem;
}

public int getElementos(){
	return elementos;
}

public Avl getAvl(int posicao){
	return hashMeioAberto[posicao];
}

}
