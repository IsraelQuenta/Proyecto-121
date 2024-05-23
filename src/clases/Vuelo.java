package clases;

import estructuras.LDNormalP;

public class Vuelo {
	private LDNormalP p;
	private String aerolinea;
	private String origen, destino;
	private String horaLlegada;

	public Vuelo(LDNormalP p, String origen, String destino, String horaLlegada) {
		this.p = p;
		this.origen = origen;
		this.destino = destino;
		this.horaLlegada = horaLlegada;
	}

	public void mostrar() {
		System.out.println("\t Vuelo");
		System.out.println("Aerolinea: " + aerolinea);
		System.out.println("Hora de llegada: " + horaLlegada + "\nOrigen: " + origen + "\nDestino:" + destino);
		System.out.println("Pasajeros: \n\t");
		this.p.mostrar();
	}

	public LDNormalP getP() {
		return p;
	}

	public void setP(LDNormalP p) {
		this.p = p;
	}

	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
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
		return horaLlegada;
	}

	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

}
