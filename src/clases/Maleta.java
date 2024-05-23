package clases;

public class Maleta {
	private int tamano, peso;

	public Maleta(int tamano, int peso) {
		this.tamano = tamano;
		this.peso = peso;
	}

	public void mostrar() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Maleta [tamano=" + tamano + ", peso=" + peso + "]";
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
}
