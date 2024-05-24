package principal;

import estructuras.*;
import clases.*;

public class Principal {
	// 1) Ordenar los vuelos por numero de maletas
	public static int nroMaletas(String ticket, LSCircularE lista) {
		NodoE re = lista.getP();
		int c = 0;
		while (re.getSig() != lista.getP()) {
			if (re.getE().getTicketEquiaje().equalsIgnoreCase(ticket)) {
				return re.getE().getM().nroElem();
			}
			re = re.getSig();
		}
		if (re.getE().getTicketEquiaje().equalsIgnoreCase(ticket)) {
			return re.getE().getM().nroElem();
		}
		return c;
	}

	public static int sumarMaletas(LDNormalP lp, LSCircularE x) {
		NodoP rp = lp.getP();
		int s = 0;
		while (rp != null) {
			s = s + nroMaletas(rp.getPasajero().getTickecEquipaje(), x);
			rp = rp.getSig();
		}
		return s;
	}

	public static int cantidadMaletasVuelo(Vuelo v, LSCircularE e) {
		int cant = sumarMaletas(v.getP(), e);
		return cant;
	}

	public static void ordernarVuelos(CNormalV c, LSCircularE e) {
		CNormalV ord = new CNormalV();
		CNormalV aux = new CNormalV();
		while (!c.esVacia()) {
			int men = Integer.MAX_VALUE;
			while (!c.esVacia()) {
				Vuelo elem = c.eli();
				aux.adi(elem);
				int cant = cantidadMaletasVuelo(elem, e);
				if (cant < men) {
					men = cant;
				}
			}
			c.vaciar(aux);
			while (!c.esVacia()) {
				Vuelo elem = c.eli();
				if (cantidadMaletasVuelo(elem, e) == men) {
					ord.adi(elem); // ordenando
				} else {
					aux.adi(elem);
				}
			}
			c.vaciar(aux);
		}
		c.vaciar(ord);
	}

	// 2) Buscar maleta perdida por ticketX y mover al final de la cinta
	public static void buscarYMoverMaleta(LSCircularE lista, CNormalV colaVuelos, String ticketX) {
		NodoE aux = null;
		NodoE r = lista.getP();

		if (r != null) {
			while (r != null) {
				if (r.getE().getTicketEquiaje().equals(ticketX)) {
					aux = r;
					break;
				}
				r = r.getSig();
				if (r == lista.getP())
					break;
			}
		}
		if (aux != null) {
			Equipaje eq = aux.getE();
			NodoE ant = lista.getP();
			while (ant.getSig() != aux) {
				ant = ant.getSig();
			}
			ant.setSig(aux.getSig());
			if (aux == lista.getP()) {
				lista.setP(aux.getSig());
			}
			lista.adiFinal(eq);
			System.out.println("Maleta con ticket " + ticketX + " encontrada y removida");
			CNormalV aux2 = new CNormalV();
			while (!colaVuelos.esVacia()) {
				Vuelo v = colaVuelos.eli();
				LDNormalP ld = v.getP();
				NodoP rr = ld.getP();
				while (rr != null) {
					if (rr.getPasajero().getTickecEquipaje().equalsIgnoreCase(ticketX)) {
						rr.getPasajero().mostrar();
					}
					rr = rr.getSig();
				}
				aux2.adi(v);
			}
			colaVuelos.vaciar(aux2);
		} else {
			System.out.println("Maleta con ticket " + ticketX + " no no fue encontrada");
		}
	}

	public static void main(String[] args) {
		// Maleta
		//
		PilaMaleta pilaM1 = new PilaMaleta();
		PilaMaleta pilaM2 = new PilaMaleta();
		PilaMaleta pilaM3 = new PilaMaleta();
		PilaMaleta pilaM4 = new PilaMaleta();
		PilaMaleta pilaM5 = new PilaMaleta();
		pilaM1.adi(new Maleta(12, 20));
		pilaM1.adi(new Maleta(12, 20));
		pilaM1.adi(new Maleta(12, 20));
		pilaM2.adi(new Maleta(12, 20));
		pilaM2.adi(new Maleta(12, 20));
		pilaM2.adi(new Maleta(12, 20));
		pilaM3.adi(new Maleta(12, 20));
		pilaM3.adi(new Maleta(12, 20));
		pilaM4.adi(new Maleta(12, 20));
		pilaM4.adi(new Maleta(12, 20));
		pilaM4.adi(new Maleta(12, 20));
		pilaM5.adi(new Maleta(12, 20));
		// Equipaje V1 total = 9
		Equipaje e5 = new Equipaje("V746", pilaM3);// Carla Mendoza v1 Maletas: 2
		Equipaje e4 = new Equipaje("V643", pilaM1);// Andres Del rio v1 Maletas: 3
		Equipaje e6 = new Equipaje("V562", pilaM5);// Pablo Alvarazin v1 Maletas: 1
		Equipaje e8 = new Equipaje("V915", pilaM5);// Melissa Ramirez v1 Maletas: 1
		Equipaje e9 = new Equipaje("V254", pilaM3);// Israel Quenta v1 Maletas: 2
		Equipaje e11 = new Equipaje("V597", pilaM3);// Israel Quenta v1 Maletas: 2
		// Equiaje V2 total = 11
		Equipaje e1 = new Equipaje("V296", pilaM2);// Juliana Flores v2 Maletas: 3
		Equipaje e2 = new Equipaje("V712", pilaM4);// Reyna Carvajal v2 Maletas: 3
		Equipaje e3 = new Equipaje("V603", pilaM5);// Pablo iglesias v2 Maletas: 1
		Equipaje e7 = new Equipaje("V783", pilaM3);// Wilson Martin v2 Maletas: 2
		Equipaje e10 = new Equipaje("V961", pilaM3);// Noemi Rodriguez v2 Maletas: 2
		// Lista de equipajes
		LSCircularE listaE1 = new LSCircularE();
		// cinta 1
		listaE1.adiFinal(e5);
		listaE1.adiFinal(e4);
		listaE1.adiFinal(e6);
		listaE1.adiFinal(e8);
		listaE1.adiFinal(e9);
		// ***********/
		listaE1.adiFinal(e1);
		listaE1.adiFinal(e2);
		listaE1.adiFinal(e3);
		listaE1.adiFinal(e7);
		listaE1.adiFinal(e10);
		listaE1.adiFinal(e11);
		// cinta 2
//		listaE2.adiFinal(e1);
//		listaE2.adiFinal(e2);
//		listaE2.adiFinal(e3);
//		listaE2.adiFinal(e7);
//		listaE2.adiFinal(e10);
		// mostrar listas
//		listaE1.mostrar();
		// Pasajeros
		Pasajero p1 = new Pasajero(9119327, "Israel", "Quenta", "V254");// maletas: 2
		Pasajero p2 = new Pasajero(8979412, "Carlos", "Burgoa", "V278");// maletas: 0
		Pasajero p3 = new Pasajero(6872236, "Daner", "Mamani", "V614");// maletas: 0

		Pasajero p4 = new Pasajero(7843173, "Melissa", "Ramirez", "V915");// maletas: 1
		Pasajero p5 = new Pasajero(1268763, "Carla", "Mendoza", "V746");// maletas: 2
		Pasajero p6 = new Pasajero(4823463, "Pablo", "Alvarazin", "V562");// maletas: 1

		Pasajero p7 = new Pasajero(7785564, "Sergio", "Dinamo", "V456");// maletas: 0
		Pasajero p8 = new Pasajero(9875613, "Raul", "Arce", "V597");// maletas: 2

		Pasajero p9 = new Pasajero(9667100, "Andres", "Del rio", "V643");// maletas: 3
		Pasajero p10 = new Pasajero(8710637, "Pablo", "Iglesias", "V603");// maletas: 1
		Pasajero p11 = new Pasajero(6507493, "Wilson", "Martin", "V783");// maletas: 2
		Pasajero p12 = new Pasajero(8067160, "Santos", "Martinez", "V672");// maletas: 0

		Pasajero p13 = new Pasajero(8060706, "Noemi", "Rodriguez", "V961");// maletas: 2
		Pasajero p14 = new Pasajero(8902808, "Reyna", "Carvajal", "V712");// maletas: 3
		Pasajero p15 = new Pasajero(6030798, "Juliana", "Flores", "V296");// maletas: 3

		LDNormalP ListaPasajeros1 = new LDNormalP();
		LDNormalP ListaPasajeros2 = new LDNormalP();
		LDNormalP ListaPasajeros3 = new LDNormalP();
		LDNormalP ListaPasajeros4 = new LDNormalP();
		LDNormalP ListaPasajeros5 = new LDNormalP();
		// Lista de Pasajeros 1
		ListaPasajeros1.adiFinal(p1);
		ListaPasajeros1.adiFinal(p2);
		ListaPasajeros1.adiFinal(p3);
		// Lista de Pasajeros 2
		ListaPasajeros2.adiFinal(p4);
		ListaPasajeros2.adiFinal(p5);
		ListaPasajeros2.adiFinal(p6);
		// Lista de Pasajeros 3
		ListaPasajeros3.adiFinal(p7);
		ListaPasajeros3.adiFinal(p8);
		// Lista de Pasajeros 4
		ListaPasajeros4.adiFinal(p9);
		ListaPasajeros4.adiFinal(p10);
		ListaPasajeros4.adiFinal(p11);
		ListaPasajeros4.adiFinal(p12);
		// Lista de Pasajeros 5
		ListaPasajeros5.adiFinal(p13);
		ListaPasajeros5.adiFinal(p14);
		ListaPasajeros5.adiFinal(p15);
		// vuelo1
		Vuelo vuelo1 = new Vuelo(ListaPasajeros2, "Boliviana de Aviacion (BoA)", "SantaCruz", "LaPaz", "19:15");// Maletas=4
		Vuelo vuelo2 = new Vuelo(ListaPasajeros1, "AuroSur", "Buenos Aires", "LaPaz", "19:20");// Maletas=2
		Vuelo vuelo3 = new Vuelo(ListaPasajeros3, "Boliviana de Aviacion (BoA)", "Bogota", "LaPaz", "19:25");// Maletas=2
		Vuelo vuelo4 = new Vuelo(ListaPasajeros5, "Transporte Aereo Militar(TAM)", "Oruro", "LaPaz", "19:30");// Maletas=8
		Vuelo vuelo5 = new Vuelo(ListaPasajeros4, "Boliviana de Aviacion (BoA)", "Santiago", "LaPaz", "19:10");// Maletas=6
		// cola de vuelos
		CNormalV colaVuelos = new CNormalV();
		colaVuelos.adi(vuelo1);
		colaVuelos.adi(vuelo2);
		colaVuelos.adi(vuelo3);
		colaVuelos.adi(vuelo4);
		colaVuelos.adi(vuelo5);
		colaVuelos.mostrar();

		// Ejercicios
		System.out.println("---------------- 1)Vuelos ordenados por Cantidad de maletas --------------");
		ordernarVuelos(colaVuelos, listaE1);
		colaVuelos.mostrar();
		System.out.println("----------- 2)Buscar maleta perdida por ticketX y mover al final de la cinta ---------");
		buscarYMoverMaleta(listaE1, colaVuelos, "V643");
		listaE1.mostrar();

	}
}
