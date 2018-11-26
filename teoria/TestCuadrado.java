public class TestCuadrado {

	public static void main(String ... args) {
		
		Cuadrado c1 = new Cuadrado(5);
		System.out.printf( "Cuadrado de lado %d%n", c1.getLado() );
		
		c1.setLaado(15);
		System.out.printf( "Cuadrado de lado %d%n", c1.getLado() );
		
		//Cuadrado c2 = new Cuadrado(); no se puede definir de esta forma porque yo he creado el constructor por lo que hay que pasarle el argumento
		//Si no fuera creado el constructor si podría porque java lo crearía por defecto sin argumentos
		Cuadrado c2 = new Cuadrado(8);
		
	}
}
