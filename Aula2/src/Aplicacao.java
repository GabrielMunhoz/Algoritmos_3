
public class Aplicacao {

	 public static void main(String args[]) {
		 
	        Pilha p = new Pilha();
	        p.empilhar(1);
	        p.empilhar(2);
	        p.empilhar(3);
	        p.empilhar(4);
	        p.empilhar(10);
	        
	        while (p.pilhaVazia() == false) {
	            System.out.println(p.desempilhar());
	        }
	    }

}
