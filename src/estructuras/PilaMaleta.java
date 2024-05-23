package estructuras;

import clases.Maleta;

//import java.util.Scanner;

public class PilaMaleta extends VectorMaleta {
	private int tope;

	public PilaMaleta() {
		this.tope = -1;
	}

	public boolean esVacia() {
		if (this.tope == -1) {
			return true; // pila vacia
		} else {
			return false; // pila no es vacia
		}
	}

	public boolean esLlena() {
		if (this.tope == max - 1) {
			return true; // pila llena
		} else {
			return false; // pila no es llena
		}
	}

	public void adi(Maleta elem) {
		if (!esLlena()) { // si la pila no es llena
			this.tope++; // incrementa en una unidad tope = tope + 1
			this.v[this.tope] = elem;
		} else {
			System.out.println("Pila Llena!!!");
		}
	}

	public Maleta eli() {
		Maleta elem = null;
		if (!esVacia()) { // si la pila no es vacia
			elem = this.v[this.tope];
			this.tope--; // decrementamos en una unidad
		} else {
			System.out.println("Pila es vacia!!!!");
		}
		return elem;
	}

	public void mostrar() {
		PilaMaleta aux = new PilaMaleta();
		System.out.println("Datos de la pila: ");
		while (!esVacia()) {
			Maleta elem = eli();
			// System.out.println(elem);
			elem.mostrar();
			aux.adi(elem);
		}
		vaciar(aux);
	}

	public void vaciar(PilaMaleta p) {
		while (!p.esVacia()) { // mientras la pila p NO es vacia
			this.adi(p.eli());
		}
	}

//	public void llenar(int n) {
//		Scanner lee = new Scanner(System.in);
//		System.out.println("Intr datos cod, modelo, marca y precio: ");
//		for (int i = 1; i <= n; i++) {
//			String cod = lee.next();
//			String modelo = lee.next();
//			String marca = lee.next();
//			double precio = lee.nextDouble();
//
//			Laptop elem = new Laptop(cod, modelo, marca, precio);
//			// char elem = lee.next().charAt(0);
//			this.adi(elem);
//		}
//	}

	public int nroElem() {
		return tope + 1;
	}
}
