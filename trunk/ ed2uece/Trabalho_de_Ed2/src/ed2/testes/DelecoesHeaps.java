package ed2.testes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import ed2.controller.ArvoreEsquerdaController;
import ed2.controller.DHeapController;
import ed2.controller.FibonacciHeapController;
import ed2.model.ArvoreEsquerda;
import ed2.model.Dheap;

public class DelecoesHeaps {
	
	public static int quantidadeDeTestes = 1;
	//Quantidade maxima de elementos e 1000000
	public static int quantidadeDeElementos = 100;
	
	public static void main(String[] args){
		//InsercoesArvores testes = new InsercoesArvores();
		
		//Testes realizados para dHeap
		DelecoesHeaps.deletarCostanteDHeap(quantidadeDeElementos, quantidadeDeTestes);
		DelecoesHeaps.deletarNormalDheap(quantidadeDeElementos, quantidadeDeTestes);
		DelecoesHeaps.deletarPoissonDheap(quantidadeDeElementos, quantidadeDeTestes);
		
		//Testes realizados para ARVORE Esquerda
		
		DelecoesHeaps.deletarCostanteArvoreEsquerda(quantidadeDeElementos, quantidadeDeTestes);
		DelecoesHeaps.deletarNormalArvoreEsquerda(quantidadeDeElementos, quantidadeDeTestes);
		DelecoesHeaps.deletarPoissonArvoreEsquerda(quantidadeDeElementos, quantidadeDeTestes);
		
		//Testes realizados para FibonacciHeap
		DelecoesHeaps.deletarCostanteFibonacciHeap(quantidadeDeElementos, quantidadeDeTestes);
		DelecoesHeaps.deletarNormalFibonacciHeap(quantidadeDeElementos, quantidadeDeTestes);
		DelecoesHeaps.deletarPoissonFibonacciHeap(quantidadeDeElementos, quantidadeDeTestes);		
		
	}
	
	
	
	
	//Função utilizada para medir o tempo da inserção da função de Insercao da Dheap com elementos de distrinbuição constante costantes.
	public static void deletarCostanteDHeap(int quantidadeDeElementos,int quantidadeDeTestes){
		long tempoInicial, tempoFinal, mediaDeTempo = 0;
		File file;
		FileInputStream fileReader;
		file = new File("C:/Users/Wellington/Desktop/WorkSpaceGalileu2/Trabalho_de_Ed2/bin/ed2/testes/constante.txt");
		try {
			fileReader = new FileInputStream(file);
			String elementosConstantes = fileReader.toString();
			//String vetorDeElementos[] =	elementosConstantes.split("/n");
			int contador =0; 
			while(contador > quantidadeDeElementos){
				tempoInicial = System.currentTimeMillis();
				DHeapController dHeapControler = new DHeapController();
				for (int i = 0; i < quantidadeDeElementos; i++) {
//					Integer chave = Integer.parseInt(vetorDeElementos[i]);
//					Dheap  dHeap = new Dheap(2,quantidadeDeElementos);
					dHeapControler.outHeap();
					
				}
				tempoFinal  = System.currentTimeMillis() - tempoInicial;
				mediaDeTempo =+ tempoFinal; 
			}
			mediaDeTempo = mediaDeTempo/quantidadeDeTestes;
			
			System.out.println("O tempo medio para 2-Heap com distribição costante "+mediaDeTempo+" para "+quantidadeDeTestes+" quantidade de testes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}
	//Função utilizada para medir o tempo da inserção da função de Insercao da Dheap com elementos na distribuição de poisson.
	public static void deletarPoissonDheap(int quantidadeDeElementos,int quantidadeDeTestes){
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
				DHeapController dHeapControler = new DHeapController();
				for (int i = 0; i < quantidadeDeElementos; i++) {
					Integer chave = Integer.parseInt(vetorDeElementos[i]);
//					Dheap  dHeap = new Dheap(2,quantidadeDeElementos);
					dHeapControler.outHeap();
				}
				tempoFinal  = System.currentTimeMillis() - tempoInicial;
				mediaDeTempo =+ tempoFinal; 
			}
			mediaDeTempo = mediaDeTempo/quantidadeDeTestes;
			
			System.out.println("O tempo medio para 2-Heap com distribição poisson "+mediaDeTempo+" para "+quantidadeDeTestes+" quantidade de testes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}
	//Função utilizada para medir o tempo da inserção da função de Insercao no Dheap com elementos na distribuição normal.
	public static void deletarNormalDheap(int quantidadeDeElementos,int quantidadeDeTestes){
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
				DHeapController dHeapControler = new DHeapController();
				for (int i = 0; i < quantidadeDeElementos; i++) {
					Integer chave = Integer.parseInt(vetorDeElementos[i]);
//					Dheap  dHeap = new Dheap(2,quantidadeDeElementos);
					dHeapControler.outHeap();
				}
				tempoFinal  = System.currentTimeMillis() - tempoInicial;
				mediaDeTempo =+ tempoFinal; 
			}
			mediaDeTempo = mediaDeTempo/quantidadeDeTestes;
			
			System.out.println("O tempo medio para 2-Heap com distribição normal "+mediaDeTempo+" para "+quantidadeDeTestes+" quantidade de testes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}
	//Função utilizada para medir o tempo da inserção da função de Insercao da ArvoreEsquerda com elementos de distrinbuição constante costantes.
	public static void deletarCostanteArvoreEsquerda(int quantidadeDeElementos,int quantidadeDeTestes){
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
				ArvoreEsquerdaController arvoreEsquerdaControler = new ArvoreEsquerdaController();
				for (int i = 0; i < quantidadeDeElementos; i++) {
					//Integer chave = Integer.parseInt(vetorDeElementos[i]);
//					ArvoreEsquerda arvoreEsquerda = new ArvoreEsquerda(chave);
					arvoreEsquerdaControler.output();
					
				}
				tempoFinal  = System.currentTimeMillis() - tempoInicial;
				mediaDeTempo =+ tempoFinal; 
			}
			mediaDeTempo = mediaDeTempo/quantidadeDeTestes;
			
			System.out.println("O tempo medio para ArvoreEsquerda com distribição costante "+mediaDeTempo+" para "+quantidadeDeTestes+" quantidade de testes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}
	//Função utilizada para medir o tempo da inserção da função de Insercao da ArvoreEsquerda com elementos na distribuição de poisson.
	public static void deletarPoissonArvoreEsquerda(int quantidadeDeElementos,int quantidadeDeTestes){
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
				ArvoreEsquerdaController arvoreEsquerdaControler = new ArvoreEsquerdaController();
				for (int i = 0; i < quantidadeDeElementos; i++) {
					//Integer chave = Integer.parseInt(vetorDeElementos[i]);
					//ArvoreEsquerda arvoreEsquerda = new ArvoreEsquerda(chave);
					arvoreEsquerdaControler.output();
				}
				tempoFinal  = System.currentTimeMillis() - tempoInicial;
				mediaDeTempo =+ tempoFinal; 
			}
			mediaDeTempo = mediaDeTempo/quantidadeDeTestes;
			
			System.out.println("O tempo medio para ArvoreEsquerda com distribição poisson "+mediaDeTempo+" para "+quantidadeDeTestes+" quantidade de testes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}
	//Função utilizada para medir o tempo da inserção da função de Insercao no ArvoreEsquerda com elementos na distribuição normal.
	public static void deletarNormalArvoreEsquerda(int quantidadeDeElementos,int quantidadeDeTestes){
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
				ArvoreEsquerdaController arvoreEsquerdaControler = new ArvoreEsquerdaController();
				for (int i = 0; i < quantidadeDeElementos; i++) {
					Integer chave = Integer.parseInt(vetorDeElementos[i]);
					//ArvoreEsquerda arvoreEsquerda = new ArvoreEsquerda(chave);
					arvoreEsquerdaControler.output();
				}
				tempoFinal  = System.currentTimeMillis() - tempoInicial;
				mediaDeTempo =+ tempoFinal; 
			}
			mediaDeTempo = mediaDeTempo/quantidadeDeTestes;
			
			System.out.println("O tempo medio para ArvoreEsquerda com distribição normal "+mediaDeTempo+" para "+quantidadeDeTestes+" quantidade de testes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}
	//Função utilizada para medir o tempo da inserção da função de Insercao da ArvoreEsquerda com elementos de distrinbuição constante costantes.
	public static void deletarCostanteFibonacciHeap(int quantidadeDeElementos,int quantidadeDeTestes){
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
				FibonacciHeapController FibonacciHeapControler = new FibonacciHeapController();
				for (int i = 0; i < quantidadeDeElementos; i++) {
					Integer chave = Integer.parseInt(vetorDeElementos[i]);
					//FibonacciHeap fibonacciHeap = new FibonacciHeap(chave);
				//	FibonacciHeapControler.inputHeap(chave);
					
				}
				tempoFinal  = System.currentTimeMillis() - tempoInicial;
				mediaDeTempo =+ tempoFinal; 
			}
			mediaDeTempo = mediaDeTempo/quantidadeDeTestes;
			
			System.out.println("O tempo medio para FibonacciHeap com distribição costante "+mediaDeTempo+" para "+quantidadeDeTestes+" quantidade de testes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}
	//Função utilizada para medir o tempo da inserção da função de Insercao da FibonacciHeap com elementos na distribuição de poisson.
	public static void deletarPoissonFibonacciHeap(int quantidadeDeElementos,int quantidadeDeTestes){
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
				FibonacciHeapController fibonacciHeapControler = new FibonacciHeapController();
				for (int i = 0; i < quantidadeDeElementos; i++) {
					Integer chave = Integer.parseInt(vetorDeElementos[i]);
					//FibonacciHeap arvoreEsquerda = new FibonacciHeap(chave);
				//	fibonacciHeapControler.inputHeap(chave);
				}
				tempoFinal  = System.currentTimeMillis() - tempoInicial;
				mediaDeTempo =+ tempoFinal; 
			}
			mediaDeTempo = mediaDeTempo/quantidadeDeTestes;
			
			System.out.println("O tempo medio para FibonacciHeap com distribição poisson "+mediaDeTempo+" para "+quantidadeDeTestes+" quantidade de testes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}
	//Função utilizada para medir o tempo da inserção da função de Insercao no ArvoreEsquerda com elementos na distribuição normal.
	public static void deletarNormalFibonacciHeap(int quantidadeDeElementos,int quantidadeDeTestes){
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
				FibonacciHeapController fibonacciHeapControler = new FibonacciHeapController();
				for (int i = 0; i < quantidadeDeElementos; i++) {
					Integer chave = Integer.parseInt(vetorDeElementos[i]);
					//FibonacciHeap arvoreEsquerda = new FibonacciHeap(chave);
					//fibonacciHeapControler.outHeap();
				}
				tempoFinal  = System.currentTimeMillis() - tempoInicial;
				mediaDeTempo =+ tempoFinal; 
			}
			mediaDeTempo = mediaDeTempo/quantidadeDeTestes;
			
			System.out.println("O tempo medio para FibonacciHeap com distribição normal "+mediaDeTempo+" para "+quantidadeDeTestes+" quantidade de testes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	}

}
