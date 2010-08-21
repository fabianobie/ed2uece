package ed2.testes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import ed2.controller.AvlController;
import ed2.model.Avl;

public class InsercoesHashing {
	//Para os testes dos hashing foi utilizado apenas o open hashing meio aberto
	
	
	
	public static void insereCostanteHashingComAvl(int quantidadeDeElementos,int quantidadeDeTestes){
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
			
			System.out.println("O tempo medio para AVL com distribição costante "+mediaDeTempo+" para "+quantidadeDeTestes+" quantidade de testes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}
	//Função utilizada para medir o tempo da inserção da função de Insercao da AVL com elementos na distribuição de poisson.
	public static void inserePoissonHashingComAvl(int quantidadeDeElementos,int quantidadeDeTestes){
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
			
			System.out.println("O tempo medio para AVL com distribição poisson "+mediaDeTempo+" para "+quantidadeDeTestes+" quantidade de testes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}
	//Função utilizada para medir o tempo da inserção da função de Insercao da AVL com elementos na distribuição normal.
	public static void insereNormalHashingComAvl(int quantidadeDeElementos,int quantidadeDeTestes){
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
			
			System.out.println("O tempo medio para AVL com distribição normal "+mediaDeTempo+" para "+quantidadeDeTestes+" quantidade de testes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}

}
