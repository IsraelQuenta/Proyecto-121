package estructuras;

import clases.Equipaje;

//import java.util.Scanner;

public class LSCircularE extends ListaSimpleE {
	public LSCircularE() {
		super(); // constructor de la clase padre ListaSimplePer
	}

	public boolean esVacia() {
		if (P == null)
			return true; // lista vacia
		return false; // lista NO vacia
	}

	public int nroNodos() {
		int c = 0;
		if (P != null) {
			NodoE R = P;
			while (R.getSig() != P) {
				c++;
				R = R.getSig();
			}
			c++; // para contar el ultimo nodo
		}
		return c;
	}

	public void adiFinal(Equipaje e) {
		NodoE nuevo = new NodoE();
		nuevo.setE(e);

		if (P == null) {
			P = nuevo; // p apunta a nuevo
			P.setSig(P);
		} else {
			NodoE R = P;
			while (R.getSig() != P) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setSig(P);
		}
	}

	public void adiPrincipio(Equipaje e) {
		NodoE nuevo = new NodoE();
		nuevo.setE(e);
		if (P == null) {
			P = nuevo;
			P.setSig(P);
		} else {
			NodoE R = P;
			while (R.getSig() != P) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setSig(P);
			P = nuevo;
		}
	}

	public void mostrar() {
		NodoE R = P; // R apunta a la raiz P
		while (R.getSig() != P) {
			R.getE().mostrar();
			R = R.getSig();
		}
		R.getE().mostrar();
	}

	public NodoE eliPrincipio() {
		NodoE x = null;
		if (!esVacia()) {
			if (P.getSig() == P) {
				x = P;
				x.setSig(null);
				P = null;
			} else {
				x = P; // x apunta a la raiz P
				NodoE R = P;
				while (R.getSig() != P) {
					R = R.getSig();
				}
				P = P.getSig();
				R.setSig(P);
				x.setSig(null);
			}
		}
		return x;
	}

	public NodoE eliFinal() {
		NodoE x = new NodoE();
		if (P != null) {
			if (P.getSig() == P) {
				x = P;
				x.setSig(null);
				P = null;
			} else {
				NodoE S = new NodoE();
				NodoE R = P;
				while (R.getSig() != P) {
					S = R; // S apunta a R
					R = R.getSig(); // R apunta al siguiente de R
				}
				x = R;
				x.setSig(null);
				S.setSig(P);
			}
		}
		return x;
	}

//	public void llenar1(int n) {
//		Scanner lee = new Scanner(System.in);
//		for (int i = 1; i <= n; i++) {
//			System.out.println("nom - edad");
//			String nom = lee.next();
//			int edad = lee.nextInt();
//			adiFinal(nom, edad);
//		}
//		lee.close();
//	}
//
//	public void llenar2(int n) {
//		Scanner lee = new Scanner(System.in);
//		for (int i = 1; i <= n; i++) {
//			System.out.println("nom - edad");
//			String nom = lee.next();
//			int edad = lee.nextInt();
//			adiPrincipio(nom, edad);
//		}
//		lee.close();
//	}
}
