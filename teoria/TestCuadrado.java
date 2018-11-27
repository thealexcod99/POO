public class TestCuadrado {

	public static void main(String ... args) {
				
		Cuadrado c1 = new Cuadrado(5);
		System.out.printf( "Cuadrado uno, de lado %d%n%n", c1.getLado() );
		
		c1.setLado(15);
		System.out.printf( "Cuadrado uno, de lado %d%n%n", c1.getLado() );
		
		//Cuadrado c2 = new Cuadrado(); no se puede definir de esta forma porque ya se ha creado el constructor por lo que hay que pasarle el argumento.
		//Si no se hubiese creado el constructor si podría porque java lo crearía por defecto sin argumentos.
		Cuadrado c2 = new Cuadrado();
		System.out.printf( "Cuadrado dos, de lado %d%n%n", c2.getLado() );
		
		Cuadrado c3 = new Cuadrado();
		c3.setLado(7);
		System.out.printf( "Cuadrado tres, de lado %d%n%n", c3.getLado() );

		Cuadrado c4 = new Cuadrado();
		c4.setLado(16);
		System.out.printf( "Cuadrado cuatro, de lado %d%n%n", c4.getLado() );
		
		Cuadrado c5 = c4;
		c5.setLado(4);
		System.out.printf( "Cuadrado cuatro, de lado %d%n%n", c4.getLado() );
		System.out.printf( "Cuadrado cinco, de lado %d%n%n", c5.getLado() );
		
		System.out.println( c1 == c4 ); //debe dar false, posiciones de memoria diferentes.
		System.out.println( c5 == c4 ); //debe dar true, posiciones de memoria iguales.
		
		System.out.println(c1); // se llama al método toString() de la clase padre por defecto o al que hayamos creado en la clase Cuadrado.
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		c5 = null; //se elimina la referencia de c5 por lo que no puede ser usada de nuevo.
	}
}
