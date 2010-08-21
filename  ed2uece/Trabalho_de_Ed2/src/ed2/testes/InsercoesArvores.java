package ed2.testes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import ed2.controller.AvlController;
import ed2.controller.SplayController;
import ed2.model.Avl;
import ed2.model.Splay;

public class InsercoesArvores {
	
//	private long tempoInicial,tempoFinal,mediaDeTempo;
	public static int quantidadeDeTestes = 1;
	//Quantidade maxima de elementos e 1000000
	public static int quantidadeDeElementos = 100;
	
	public static void main(String[] args){
		//InsercoesArvores testes = new InsercoesArvores();
		
		//Testes realizados para AVL
		InsercoesArvores.insereCostanteAvl(quantidadeDeElementos, quantidadeDeTestes);
		InsercoesArvores.insereNormalAvl(quantidadeDeElementos, quantidadeDeTestes);
		InsercoesArvores.inserePoissonAvl(quantidadeDeElementos, quantidadeDeTestes);
		//Testes realizados para Splay
		InsercoesArvores.insereCostanteSplay(quantidadeDeElementos, quantidadeDeTestes);
		InsercoesArvores.insereNormalSplay(quantidadeDeElementos, quantidadeDeTestes);
		InsercoesArvores.inserePoissonSplay(quantidadeDeElementos, quantidadeDeTestes);		
		
	}
	
	//Fun��o utilizada para medir o tempo da inser��o da fun��o de Insercao da AVL com elementos de distrinbui��o constante costantes.
	public static void insereCostanteAvl(int quantidadeDeElementos,int quantidadeDeTestes){
		long tempoInicial, tempoFinal, mediaDeTempo = 0;
		File file;
		FileInputStream fileReader;
		file = new File("C:/Users/Wellington/Desktop/WorkSpaceGalileu2/Trabalho_de_Ed2/bin/ed2/testes/constante.txt");
		try {
			fileReader = new FileInputStream(file);
			String elementosConstantes = fileReader.toString();
			String vetorDeElementos[] =	elementosConstantes.split("/n");
			int contador =0; 
			while(contador > quantidadeDeElementos){
				tempoInicial = System.currentTimeMillis();
				AvlController avlControler = new AvlController();
				for (int i = 0; i < quantidadeDeElementos; i++) {
					Integer chave = Integer.parseInt(vetorDeElementos[i]);
					Avl avl = new Avl(chave);
					avlControler.inserirAvl(avl,chave);
				}
				tempoFinal  = System.currentTimeMillis() - tempoInicial;
				mediaDeTempo =+ tempoFinal; 
			}
			mediaDeTempo = mediaDeTempo/quantidadeDeTestes;
			
			System.out.println("O tempo medio para AVL com distribi��o costante "+mediaDeTempo+" para "+quantidadeDeTestes+" quantidade de testes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}
	//Fun��o utilizada para medir o tempo da inser��o da fun��o de Insercao da AVL com elementos na distribui��o de poisson.
	public static void inserePoissonAvl(int quantidadeDeElementos,int quantidadeDeTestes){
		long tempoInicial, tempoFinal, mediaDeTempo = 0;
		File file;
		FileInputStream fileReader;
		file = new File("C:/Users/Wellington/Desktop/WorkSpaceGalileu2/Trabalho_de_Ed2/bin/ed2/testes/poisson.txt");
		try {
			fileReader = new FileInputStream(file);
			String elementosConstantes = fileReader.toString();
			String vetorDeElementos[] =	elementosConstantes.split("/n");
			int contador =0; 
			while(contador > quantidadeDeElementos){
				tempoInicial = System.currentTimeMillis();
				AvlController avlControler = new AvlController();
				for (int i = 0; i < quantidadeDeElementos; i++) {
					Integer chave = Integer.parseInt(vetorDeElementos[i]);
					Avl avl = new Avl(chave);
					avlControler.inserirAvl(avl,chave);
				}
				tempoFinal  = System.currentTimeMillis() - tempoInicial;
				mediaDeTempo =+ tempoFinal; 
			}
			mediaDeTempo = mediaDeTempo/quantidadeDeTestes;
			
			System.out.println("O tempo medio para AVL com distribi��o poisson "+mediaDeTempo+" para "+quantidadeDeTestes+" quantidade de testes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}
	//Fun��o utilizada para medir o tempo da inser��o da fun��o de Insercao da AVL com elementos na distribui��o normal.
	public static void insereNormalAvl(int quantidadeDeElementos,int quantidadeDeTestes){
		long tempoInicial, tempoFinal, mediaDeTempo = 0;
		File file;
		FileInputStream fileReader;
		file = new File("C:/Users/Wellington/Desktop/WorkSpaceGalileu2/Trabalho_de_Ed2/bin/ed2/testes/normal.txt");
		try {
			fileReader = new FileInputStream(file);
			String elementosConstantes = fileReader.toString();
			String vetorDeElementos[] =	elementosConstantes.split("/n");
			int contador =0; 
			while(contador > quantidadeDeElementos){
				tempoInicial = System.currentTimeMillis();
				AvlController avlControler = new AvlController();
				for (int i = 0; i < quantidadeDeElementos; i++) {
					Integer chave = Integer.parseInt(vetorDeElementos[i]);
					Avl avl = new Avl(chave);
					avlControler.inserirAvl(avl,chave);
				}
				tempoFinal  = System.currentTimeMillis() - tempoInicial;
				mediaDeTempo =+ tempoFinal; 
			}
			mediaDeTempo = mediaDeTempo/quantidadeDeTestes;
			
			System.out.println("O tempo medio para AVL com distribi��o normal "+mediaDeTempo+" para "+quantidadeDeTestes+" quantidade de testes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}
	//Fun��o utilizada para medir o tempo da inser��o da fun��o de Insercao da Splay com elementos costantes.
	public static void insereCostanteSplay(int quantidadeDeElementos,int quantidadeDeTestes){
		long tempoInicial, tempoFinal, mediaDeTempo = 0;
		File file;
		FileInputStream fileReader;
		file = new File("C:/Users/Wellington/Desktop/WorkSpaceGalileu2/Trabalho_de_Ed2/bin/ed2/testes/constante.txt");
		try {
			fileReader = new FileInputStream(file);
			String elementosConstantes = fileReader.toString();
			String vetorDeElementos[] =	elementosConstantes.split("/n");
			int contador =0; 
			while(contador > quantidadeDeElementos){
				tempoInicial = System.currentTimeMillis();
				SplayController splayControler = new SplayController();
				for (int i = 0; i < quantidadeDeElementos; i++) {
					Integer chave = Integer.parseInt(vetorDeElementos[i]);
					Splay splay = new Splay(chave);
					splayControler.inserirSplay(splay, chave);
				}
				tempoFinal  = System.currentTimeMillis() - tempoInicial;
				mediaDeTempo =+ tempoFinal; 
			}
			mediaDeTempo = mediaDeTempo/quantidadeDeTestes;
			
			System.out.println("O tempo m�dio para a inser�ao na Splay com distribi��o costante "+mediaDeTempo+" para "+quantidadeDeTestes+" quantidade de testes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}
	
	//Fun��o utilizada para medir o tempo da inser��o da fun��o de Insercao da Splay com elementos em distribui��o Poisson.
	public static void inserePoissonSplay(int quantidadeDeElementos,int quantidadeDeTestes){
		long tempoInicial, tempoFinal, mediaDeTempo = 0;
		File file;
		FileInputStream fileReader;
		file = new File("C:/Users/Wellington/Desktop/WorkSpaceGalileu2/Trabalho_de_Ed2/bin/ed2/testes/poisson.txt");
		try {
			fileReader = new FileInputStream(file);
			String elementosConstantes = fileReader.toString();
			String vetorDeElementos[] =	elementosConstantes.split("/n");
			int contador =0; 
			while(contador > quantidadeDeElementos){
				tempoInicial = System.currentTimeMillis();
				SplayController splayControler = new SplayController();
				for (int i = 0; i < quantidadeDeElementos; i++) {
					Integer chave = Integer.parseInt(vetorDeElementos[i]);
					Splay splay = new Splay(chave);
					splayControler.inserirSplay(splay, chave);
				}
				tempoFinal  = System.currentTimeMillis() - tempoInicial;
				mediaDeTempo =+ tempoFinal; 
			}
			mediaDeTempo = mediaDeTempo/quantidadeDeTestes;
			
			System.out.println("O tempo m�dio para a inser�ao na Splay com distribui��o poisson "+mediaDeTempo+" para "+quantidadeDeTestes+" quantidade de testes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}
	//Fun��o utilizada para medir o tempo da inser��o da fun��o de Insercao da Splay com elementos em distribui��o Normal.
	public static void insereNormalSplay(int quantidadeDeElementos,int quantidadeDeTestes){
		long tempoInicial, tempoFinal, mediaDeTempo = 0;
		File file;
		FileInputStream fileReader;
		file = new File("C:/Users/Wellington/Desktop/WorkSpaceGalileu2/Trabalho_de_Ed2/bin/ed2/testes/normal.txt");
		try {
			fileReader = new FileInputStream(file);
			String elementosConstantes = fileReader.toString();
			String vetorDeElementos[] =	elementosConstantes.split("/n");
			int contador =0; 
			while(contador > quantidadeDeElementos){
				tempoInicial = System.currentTimeMillis();
				SplayController splayControler = new SplayController();
				for (int i = 0; i < quantidadeDeElementos; i++) {
					Integer chave = Integer.parseInt(vetorDeElementos[i]);
					Splay splay = new Splay(chave);
					splayControler.inserirSplay(splay, chave);
				}
				tempoFinal  = System.currentTimeMillis() - tempoInicial;
				mediaDeTempo =+ tempoFinal; 
			}
			mediaDeTempo = mediaDeTempo/quantidadeDeTestes;
			
			System.out.println("O tempo m�dio para a inser�ao na Splay com distribi��o normal "+mediaDeTempo+" para "+quantidadeDeTestes+" quantidade de testes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}

//	public void setTempoInicial(long tempoInicial) {
//		this.tempoInicial = tempoInicial;
//	}
//
//	public long getTempoInicial() {
//		return tempoInicial;
//	}
//
//	public void setMediaDeTempo(long mediaDeTempo) {
//		this.mediaDeTempo = mediaDeTempo;
//	}
//
//	public long getMediaDeTempo() {
//		return mediaDeTempo;
//	}
//
//	public void setTempoFinal(long tempoFinal) {
//		this.tempoFinal = tempoFinal;
//	}
//
//	public long getTempoFinal() {
//		return tempoFinal;
//	}

}
