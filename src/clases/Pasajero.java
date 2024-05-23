package clases;

public class Pasajero {
	private int ci;
	private String nombre, paterno, tickecEquipaje;

	public Pasajero(int ci, String nombre, String paterno, String tickecEquipaje) {
		this.ci = ci;
		this.nombre = nombre;
		this.paterno = paterno;
		this.tickecEquipaje = tickecEquipaje;
	}

	public void mostrar() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Pasajero [ci=" + ci + ", nombre=" + nombre + ", paterno=" + paterno + ", tickecEquipaje="
				+ tickecEquipaje + "]";
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getTickecEquipaje() {
		return tickecEquipaje;
	}

	public void setTickecEquipaje(String tickecEquipaje) {
		this.tickecEquipaje = tickecEquipaje;
	}

}
