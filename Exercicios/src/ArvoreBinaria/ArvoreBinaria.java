package ArvoreBinaria;

public class ArvoreBinaria {
	static No raiz;
	
	public static void inserir(int valor)
	{
		inserir(raiz,valor);
	}

	private static void inserir(No node, int valor) 
	{
		if(node==null)
		{
			System.out.println("A raiz é de valor: "+valor);
			raiz = new No(valor);
			
		}
		else
		{
			if(valor < node.valor)
			{
				if(node.esquerda != null) {
					inserir(node.esquerda,valor);
				}
				else
				{
					System.out.println("Inserindo elemento "+valor+ " a esquerda de "+node.valor);
					node.esquerda = new No(valor);
				}	
			}
			else
			{
				if(node.direita != null) 
				{
					inserir(node.direita , valor);
				}
				else
				{
					System.out.println("Inserindo elemento "+valor+" A direita de "+node.valor);
					node.direita = new No(valor);
				}
			}
		}
	}
	public static void main(String[] args) {
		inserir(10);
		inserir(4);
		inserir(5);
		inserir(16);
		inserir(14);
	}
	
}
