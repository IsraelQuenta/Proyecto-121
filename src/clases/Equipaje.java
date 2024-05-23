package clases;

import estructuras.PilaMaleta;

public class Equipaje {
	private String ticketEquiaje;
	private PilaMaleta m;

	public Equipaje(String ticketEquiaje, PilaMaleta m) {
		this.ticketEquiaje = ticketEquiaje;
		this.m = m;
	}

	public void mostrar() {
		System.out.println(toString());
		this.m.mostrar();
	}

	@Override
	public String toString() {
		return "Equipaje [ticketEquiaje=" + ticketEquiaje + "]";
	}

	public String getTicketEquiaje() {
		return ticketEquiaje;
	}

	public void setTicketEquiaje(String ticketEquiaje) {
		this.ticketEquiaje = ticketEquiaje;
	}

	public PilaMaleta getM() {
		return m;
	}

	public void setM(PilaMaleta m) {
		this.m = m;
	}

}
