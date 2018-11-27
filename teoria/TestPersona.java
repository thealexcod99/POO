public class TestPersona {

	public static void main(String [] args) {
		
		Persona p = new Persona("Alejandro", "Álvarez Serrano", 19, "696511723", "50625264X");
		System.out.println(p);
		
		if (p.esMayorEdad()) 
			System.out.println( "Es mayor de edad" );
		else
			System.out.println( "Es menor de edad" );
		
		
	}
}
