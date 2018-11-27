public class Cuadrado {
	
	//atributos
	private int lado;// = 1; a veces se inicializa con un valor por defecto ya que si llamamos al constructor vacío nos de un cuadrado real y no de lado 0.
	
	//constructor/es
	//constructor para crear cuadrado dado el lado
	
	public Cuadrado() {
	
		lado = 1; //o this.lado = 1; para inicializarlo en el constructor. 
	}
	
	public Cuadrado( int lado ) {
		
		this.lado = lado;
	}
	
	//getters y setters
	//getter para obtener el valor del lado
	public int getLado() {
		
		return lado;
	}
	
	//setter para modificar el valor del lado
	public void setLado( int lado ) {
		
		this.lado = lado;
	}
	
	@Override //etiqueta para modificar el método toString() de la clase padre.
	public String toString() { //si no se creara imprimiria por defecto al llamar al objeto "Clase"@"código de memoria".
	
		return "Cuadrado de lado " + lado;
	}
		
}
