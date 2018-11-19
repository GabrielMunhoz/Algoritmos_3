package Aula4;

public class BuscaBinaria {
	public static final int NOT_FOUND = -1;
	
	public static int binarySearch( Comparable [ ] a, Comparable x )
    {
        int baixo = 0;
        int alto = a.length - 1;
        int meio;

        while( baixo <= alto )
        {
            meio = ( baixo + alto ) / 2;

            if( a[ meio ].compareTo( x ) < 0 )
                baixo = meio + 1;
            else if( a[ meio ].compareTo( x ) > 0 )
                alto = meio - 1;
            else
                return meio;
        }

        return NOT_FOUND;     // NOT_FOUND = -1
    }

    // Testando o programa
    public static void main( String [ ] args )
    {
        int Tamanho = 8;
        Comparable [ ] a = new Integer [ Tamanho ];
        for( int i = 0; i < Tamanho; i++ )
            a[ i ] = new Integer( i * 2 );

        for( int i = 0; i < Tamanho * 2; i++ )
            System.out.println( "Encontrado " + i + " em " +
                                 binarySearch( a, new Integer( i ) ) );

    }
}

