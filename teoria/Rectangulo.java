/**Definición del objeto Rectángulo.
 * 
 * @author "Alejandro A."
 * */

public class Rectangulo {

	private int base;
	private int altura;
	
	/**Método que devuelve el valor de la base del Rectángulo.
	 * 
	 * @return base
	 * */
	public int getBase() {
		
		return base;
	}
	
	/**Método que devuelve el valor de la altura del Rectángulo.
	 * 
	 * @return altura
	 * */
	public int getAltura() {
		
		return altura;
	}
	
	/**Método que da valor a la base del Rectángulo.
	 * 
	 * @param base
	 * */
	public void setBase(int base) {
		
		this.base = base;
	}
	
	/**Método que da valor a la altura del Rectángulo.
	 * 
	 * @param altura
	 * */
	public void setAltura(int altura) {
		
		this.altura = altura;
	}
	
	/**Método que calcula el perímetro del Rectángulo.
	 * 
	 * @return perimetro es el perímetro del rectángulo
	 * */
	public int getPerimetro() {
		
		return base * 2 + altura * 2;
	}
	
	/**Método que calcula el área del Rectángulo.
	 * 
	 * @return area es el área del rectángulo
	 * */
	public int getArea() {
		
		return base * altura;
	}
}
