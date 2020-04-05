package ejercicio;

public class Principal {

	public static void main(String[] args) {
		
		Circulo c = new Circulo(0, 0, 2);
		Punto A = new Punto(1,3);
		
		if (c.pertenece(A))
			System.out.println(A + " pertenece al circulo de " + c);
		else
			System.out.println(A + " no pertenece al circulo de " + c);
			
	}

}
