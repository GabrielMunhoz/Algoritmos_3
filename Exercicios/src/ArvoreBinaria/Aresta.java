package ArvoreBinaria;

public class Aresta implements Comparable<Aresta> {
	int verA;
	int verB;
	Integer peso;
	
	public Aresta(int va, int vb, int peso)
	{
		this.verA = va;
		this.verB = vb;
		this.peso = peso;
		
	}

	@Override
	public int compareTo(Aresta o) {
		
		return this.peso.compareTo(o.peso);
		
		
		
		
//		public int pai(int v)
//		{
//			if(ciclo[v] == v) 
//			{
//				return v;
//			}
//			ciclo[v] = pai(ciclo[v]);
//			
//			return ciclo[v];
//		}
//		public void unir(int va, int vb)
//		{
//			ciclo[pai(va)] = pai(vb);
//		}
//        if (this.peso < o.peso) {
//            return -1;
//        }
//        if (this.peso > o.peso) {
//            return 1;
//        }
//        return 0;
    }
	
}

