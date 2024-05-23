package estructuras;

import clases.Equipaje;

public class NodoE {
	private Equipaje e;
	protected NodoE sig;

	public NodoE() {
		// TODO Auto-generated constructor stub
		this.sig = null;
	}
	

	public Equipaje getE() {
		return e;
	}

	public void setE(Equipaje e) {
		this.e = e;
	}

	public NodoE getSig() {
		return sig;
	}

	public void setSig(NodoE sig) {
		this.sig = sig;
	}

}
