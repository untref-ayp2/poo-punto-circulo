package ejercicio;
import java.lang.Math;

public class Punto {
	// atributos
	private int x;
	private int y;
	
	// Constructor con parametros
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Constructor sin parametros
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	
	// coordenada x
	public int obtener_x() {
		return x;
	}

	// coordenada y
	public int obtener_y() {
		return y;
	}

	// distancia a otro punto
	public double distancia(Punto p) {

		return Math.sqrt((p.x - x)*(p.x - x) + (p.y - y)*(p.y - y));
	}
	
	// devuelve un String con los datos
	public String toString() {
		
		return " (" + this.x + "," + this.y + ")";
	}
	
}
