package ArvoreBinaria;

import java.io.*;
import java.util.*;

public class Kruskal {

	static Aresta[] aresta = new Aresta[3];
	static int vs,as;
	static int[] ciclo= new int[22];	
	public static void main(String[] args) 
	{
		for(int i = 0;i < 3; i++){
			aresta[i] = new Aresta(teclado("Digite o valor do vertice v1"),
					teclado("Digite o valor do vertice v2"),
					teclado("Digite o valor do peso da aresta"));
		}
		Arrays.sort(aresta);
		
		for(int i = 0;i < 3; i++){
			ciclo[i] = i;
		}
		for(Aresta a : aresta){ //percorrendo todas as arestas
			//detectando se com esta aresta forma ciclo:
			if ( pai(a.verA) != pai(a.verB) ){ 
	 
				//imprimindo a aresta que está na arvore geradora minima em ordem crescente de vertices
				if(a.verA < a.verB){
					System.out.print(a.verA+" "+ a.verB);
				}
				else{
					System.out.print(a.verB+" "+a.verA);
				}
	 
				unir(a.verA, a.verB);
			}
	 
		}
		System.out.print("\n");
	}
	
	public static void unir(int v1, int v2){
	    ciclo[pai(v1)] = pai(v2);
	}
	public static int pai(int v){
		 
	    if (ciclo[v] == v){
	        return v;
		}
	 
	    ciclo[v] = pai(ciclo[v]);
	 
	    return ciclo[v];
	}

	private static int teclado(String string) {
		System.out.println(string);
		return new Scanner(System.in).nextInt();
	}
}













//	public static void inicia()
//	{		
//		int count = 0;
//		try 
//		{
//			FileReader arq = new FileReader("ArvoreMinima.txt");
//			BufferedReader lerArq = new BufferedReader(arq);
//
//			String linha = lerArq.readLine();
//			
//			String[] v = linha.split(" ");
//			vs= Integer.parseInt(v[0]);
//			as = Integer.parseInt(v[1]);
//			
//			while (linha != null) {
//				/*System.out.printf("%s\n", linha);
//*/
//				linha = lerArq.readLine(); // lê da segunda até a última linha
//				
//				String[] arrOfStr = linha.split(" ", -2);
//				
//				a[count++]  = new Aresta(arrOfStr[0],arrOfStr[1],arrOfStr[2]); 
//		}
//
//			arq.close();
//		} catch (IOException e) {
//			System.err.printf("Erro na abertura do arquivo: %s.\n",
//					e.getMessage());
//		}
//		bubbleSort(a);
//
//	}
//	public static void bubbleSort(Aresta[] a2) 
//	    { 
//	        int n = a2.length; 
//	        for (int i = 0; i < n-1; i++) 
//	            for (int j = 0; j < n-i-1; j++) 
//	                if (a2[j].peso > a2[j+1].peso) 
//	                { 
//	                    // swap temp and arr[i] 
//	                    Aresta temp = a2[j]; 
//	                    a2[j] = a2[j+1]; 
//	                    a2[j+1] = temp; 
//	                } 
//	        for (Aresta a1 : aresta) {
//				System.out.println(a1.peso);
//			}
//	    }
	 
