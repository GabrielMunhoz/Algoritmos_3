package Aula3;
import java.util.*;
public class BuscaLinear<T> {
	public static int procura(Object[] vetor, Object elementoProcurado) {
		   int tamanhoVetor = vetor.length; /* o for, não precisa verificar o tamanho do vetor toda 
		 vez que for comparar. */
		     for (int i = 0; i < tamanhoVetor; i++)
		         if (vetor[i].equals(elementoProcurado))
		             return i;
		     return -1; // Não achou, retorna -1
		 }
	
	public static void main(String[] args) {
		Object[] a = new Integer[10];
		for(int i = 0; i<10 ; i++) {
			a[i]= i;
		}
		if(procura(a,7)== -1) {
			System.out.println("Nao encontrado:");
		}
		else {
			System.out.println("Achei: "+ procura(a,7));
		}
		
	}
	
}
