package exemplos;

public class JavaShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //Para n�meros positivos, >> e >>> funcionam da mesma forma  
	    System.out.println( 20 >> 2 );  
	    System.out.println( 20 >>> 2 );  
	    //Para n�mero negativo, >>> altera o bit de paridade (MSB) para 0  
	    System.out.println(- 20 >> 2 );  
	    System.out.println(- 20 >>> 2 );  
	}

}
