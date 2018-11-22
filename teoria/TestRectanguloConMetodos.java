import java.util.Scanner;

public class TestRectanguloConMetodos {

	public static void main( String[] args ) {
	
		Scanner sc = new Scanner(System.in);
		
		Rectangulo r1 = new Rectangulo();
		
		System.out.print( "Introduce la base del rectángulo 1:   " );
		r1.setBase(sc.nextInt());
		System.out.print( "Introduce la altura del rectángulo 1: " );
		r1.setAltura(sc.nextInt());
		System.out.println(" ");
				
		Rectangulo r2 = new Rectangulo();
		
		System.out.print( "Introduce la base del rectángulo 2:   " );
		r2.setBase(sc.nextInt());
		System.out.print( "Introduce la altura del rectángulo 2: " );
		r2.setAltura(sc.nextInt());
		System.out.println(" ");
		
		imprimirRectangulos(r1);
		imprimirRectangulos(r2);
	}	
	
	public static void imprimirRectangulos( Rectangulo r ) {	
		
		System.out.printf( "El rectángulo de base %d y de altura %d tiene de perímetro %d y de área %d%n%n", r.getBase(), r.getAltura(), r.getPerimetro(), r.getArea());
		
	}
}
