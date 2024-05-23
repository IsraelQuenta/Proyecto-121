package clases;

import estructuras.LDNormalP;

public class Vuelo {
	private LDNormalP p;
	private String origen, destino;
	private String HoraLlegada;

	public Vuelo(LDNormalP p, String origen, String destino, String horaLlegada) {
		this.p = p;
		this.origen = origen;
		this.destino = destino;
		HoraLlegada = horaLlegada;
	}

	public void mostrar() {
		System.out.println("\t Vuelo");
		System.out.println("Hora de llegada: " + HoraLlegada + "\nOrigen: " + origen + "\nDestino:" + destino);
		System.out.println("Pasajeros: \n\t");
		this.p.mostrar();
	}

	public LDNormalP getP() {
		return p;
	}

	public void setP(LDNormalP p) {
		this.p = p;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getHoraLlegada() {
		return HoraLlegada;
	}

	public void setHoraLlegada(String horaLlegada) {
		HoraLlegada = horaLlegada;
	}

}
