package ed2.model;



public class HashMeioAberto {

	private Avl[] hashMeioAberto;
	private int tamanho;
	private int fatorCarga;
	private int elementos;

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
