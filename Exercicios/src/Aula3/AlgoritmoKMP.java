package Aula3;

public class AlgoritmoKMP {
	
	public static int kmp(String padrao, String texto) {
		 
		   int t, p;
		   int tamPadrao = padrao.length();
		   int tamTexto = texto.length();
		   int next[] = new int[tamPadrao];

		   iniciar(tamPadrao, padrao, next);

		   for( t=0, p=0; p < tamPadrao && t < tamTexto; t++, p++)
			while( (p >= 0) && (texto.charAt(t) != padrao.charAt(p)))
			    p = next[p];

		   if (p==tamPadrao)
			return t - tamPadrao;
		        else return -1;
		        
		  }
	
	public static void iniciar(int tam, String padrao, int next[]) {
		   int i, j;
		       
		   next[0] = -1;

		   for( i = 0, j = -1; i < tam-1; ) 
		     {
			while( (j>= 0) && (padrao.charAt(i) != padrao.charAt(j)) )
			   j = next[j];
		       i++; j++;
		       
		       if(padrao.charAt(i) == padrao.charAt(j))
		          {next[i] = next[j];}
		       else { next[i] = j;
		     }
		   
		}
	}
	public static void main(String[] args) {
		System.out.println(kmp("mu","ola mundo"));
	}
}
