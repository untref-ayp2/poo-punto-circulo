package ejercicio;

public class Circulo {
	// atributos
	private Punto centro;
	private double radio;
	
	// Constructor
	public Circulo(int x, int y, double r) {
		centro = new Punto(x,y);
		radio = r;
	}
	
	// Devuelve el area del circulo
	public double area() {
		return Math.PI * radio * radio;
	}
	
	// Devuelve verdadero si el punto pertenece al circulo
	// falso de lo contrario
	public boolean pertenece(Punto p) {
		
		return (p.distancia(centro) < radio);
	}

	// devuelve un String con los datos
	public String toString() {
		
		return "radio = " + radio + " con centro = " + centro;
	}
	
}
