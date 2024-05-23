package estructuras;

import clases.Pasajero;

public class NodoP {
	private Pasajero pasajero;
	private NodoP sig, ant;

	public NodoP() {
		// TODO Auto-generated constructor stub
		this.ant = this.sig = null;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public NodoP getSig() {
		return sig;
	}

	public void setSig(NodoP sig) {
		this.sig = sig;
	}

	public NodoP getAnt() {
		return ant;
	}

	public void setAnt(NodoP ant) {
		this.ant = ant;
	}

}
