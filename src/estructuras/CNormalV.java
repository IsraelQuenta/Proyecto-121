package estructuras;

import clases.Vuelo;

public class CNormalV extends ColaVuelo {
	public CNormalV() {
		super();
	}

	public boolean esVacia() {
		if (fr == fi) {
			return true;
		}
		return false;

	}

	public boolean esLlena() {
		if (fi == max - 1) {
			return true;
		}
		return false;
	}

	public void adi(Vuelo elem) {
		if (esLlena()) {
			System.out.println("cola simple llena!!!");
		} else {
			fi++;
			v[fi] = elem;
		}
	}

	public Vuelo eli() {
		Vuelo elem = null;
		if (esVacia()) {
			System.out.println("Cola simple vacia!!");
		} else {
			fr++;
			elem = v[fr];
			if (fr == fi) {
				fr = fi = -1;
			}
		}
		return elem;
	}

	public int nroElem() {
		return (fi - fr);
	}

	public void vaciar(CNormalV z) {
		while (!z.esVacia()) {
			adi(z.eli());
		}
	}

//	public void llenar(int n) {
//		Scanner lee = new Scanner(System.in);
//
//		for (int i = 1; i <= n; i++) {
//			System.out.println("Intr. nombre, materia, nota");
//			String nom = lee.next();
//			String materia = lee.next();
//			double nota = lee.nextDouble();
//
//			Estudiante x = new Estudiante(nom, materia, nota);
//			adi(x);
//		}
//	}

	public void mostrar() {
		CNormalV aux = new CNormalV();
		Vuelo x;
		while (!esVacia()) {
			x = eli();
			x.mostrar();
			aux.adi(x);
		}
		vaciar(aux);
	}
}
