import java.util.Scanner;

public class TestRectangulo {

	public static void main( String[] args ) {
	
		Scanner sc = new Scanner(System.in);
		
		Rectangulo r = new Rectangulo();
		
		System.out.print( "Introduce la base del rectángulo 1:   " );
		int base1 = sc.nextInt();
		r.setBase(base1);
		System.out.print( "Introduce la altura del rectángulo 1: " );
		int altura1 = sc.nextInt();
		r.setAltura(altura1);
		System.out.println(" ");
		
		int perimetro1 = r.getPerimetro();
		int area1 = r.getArea();
		
		System.out.print( "Introduce la base del rectángulo 2:   " );
		int base2 = sc.nextInt();
		r.setBase(base2);
		System.out.print( "Introduce la altura del rectángulo 2: " );
		int altura2 = sc.nextInt();
		r.setAltura(altura2);
		System.out.println(" ");
		
		int perimetro2 = r.getPerimetro();
		int area2 = r.getArea();
		
		System.out.printf( "El rectángulo de base %d y de altura %d tiene de perímetro %d y de área %d%n%n", base1, altura1, perimetro1, area1);
		System.out.printf( "El rectángulo de base %d y de altura %d tiene de perímetro %d y de área %d%n", base2, altura2, perimetro2, area2);
	}
}
