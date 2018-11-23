import java.util.Scanner;

public class TestCirculo {
	
	public static void main( String [] args ) {
		
		Scanner sc = new Scanner( System.in );
		//creamos un nuevo objeto Circulo
		Circulo c = new Circulo();
		//vamos a inicializar el valor del atributo radio
		System.out.print( "Introduce el valor del radio del Círculo: " );
		double radio = sc.nextDouble();
		
		c.setRadio(radio);
				
		System.out.printf( "%n El círculo de radio %f tiene de perímetro %.2f y de área %.2f%n", c.getRadio(), c.getPerimetro(), c.getArea() );
	}
}
