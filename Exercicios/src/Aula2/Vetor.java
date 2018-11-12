package Aula2;
import java.lang.ArrayIndexOutOfBoundsException;
public class Vetor{
	
	private int valores [];
	 
	private int contador;
	
	public Vetor() {
		valores = new int[1];
		contador = 0;
	}
	
	public void insereFinal(int valor) {
		//insere proxima posicao livre
		criarEspaco();
		valores[this.contador] = valor;
		contador++;
	}

	
	public void insereInicio(int valor) {
		//insere no inicio do vetor
		inserePosicao(0,valor); 
	}

	
	public void inserePosicao(int ind, int valor)  {
		//insere na posicao descrita  na 
		
			if(isIndexValid(ind)) {
				
				criarEspaco();
				
				moveFrente(ind);
				
				valores[ind] = valor;
				
				contador++;
			}
		
		
	}

	
	 
	public void get(int ind) {
		if(isIndexValid(ind)) {
			System.out.println("int: "+valores[ind]);
		}
		
	}

	 
	public void set(int ind, int valor) {
		if(isIndexValid(ind)) {
			valores[ind] = valor;
		}
		
	}

	 
	public void removeFinal() {
		contador--;
	}

	private void moveTras(int index) {
		
		if ( isIndexValid ( index ) ) {
	        for (int i = index + 1; i < contador; i++) {
	            valores[i - 1] = valores[i];
	        }
		}
	}

	 
	public void removeInicio() {
		int ini = 0;
		moveTras(ini);
		
		
	}

	 
	public void remove(int indice) {
		if(isIndexValid(indice)) {
			moveTras(indice);
			contador--;
			
		}
		
	}

	 
	public int size() {
		//retorna o numero de elementos armazenados no vetor
		return contador;
		
	}

	 
	public int capacity() {
		// retorna a capacidade de armazenamento do vetor.
		return (valores.length-1);
		
	}

	 
	public boolean isEmpty() {
		// retorna "true" se o número de elementos for 0 (zero).
		return (contador == 0 );
	}

	 
	public void criarEspaco() {
		//Duplica o tamanho do array. 
		if(contador == valores.length -1) {
			int aux[] = new int[valores.length*2];
			for(int i =0 ; i< valores.length; i++) {
				aux[i]=valores[i];
			}
			valores = aux;
			
		}
		
	}
	
	public void moveFrente(int index) {
	    if ( isIndexValid ( index ) ) {
	    	
	        for (int i = contador; i > index; i = i- 1) {
	            valores[i] = valores[i - 1];
	        }    		
	    }
	   }
	
	public boolean isIndexValid ( int index ) {
		try {
			if(index<0) {throw new ArrayIndexOutOfBoundsException();}
			
			return ( index >= 0  ) &&  ( index < valores.length );    		
			
		}catch( ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Erro: " + e);
			
			return false;
		}
	}   		
}