public class Circulo {
	// atributos
	private double radio;
	
	public double getRadio() {
		
		return radio;
	}
	
	public void setRadio(double radio) {
		
		this.radio = radio; // this es una referencia al objeto.
	}
	
	public double getPerimetro() {
		
		return 2 * Math.PI * radio;
	}
	
	public double getArea() {
		
		return Math.PI * radio * radio;
	}
	
}
