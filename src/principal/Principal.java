package principal;

import estructuras.*;
import clases.*;

public class Principal {
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
		// Equipaje 1
		Equipaje e1 = new Equipaje("V296", pilaM2);
		Equipaje e2 = new Equipaje("V712", pilaM4);
		Equipaje e3 = new Equipaje("V603", pilaM5);
		Equipaje e4 = new Equipaje("V643", pilaM1);
		Equipaje e5 = new Equipaje("V746", pilaM3);
		// Lista de equipajes
		LSCircularE listaE1 = new LSCircularE();
		LSCircularE listaE2 = new LSCircularE();
		listaE1.adiFinal(e5);
		listaE1.adiFinal(e1);
		listaE2.adiFinal(e4);
		listaE2.adiFinal(e3);
		listaE2.adiFinal(e2);
		// mostrar listas
//		listaE1.mostrar();
		// Pasajeros
		Pasajero p1 = new Pasajero(9119327, "Israel", "Quenta", "V254");
		Pasajero p2 = new Pasajero(8979412, "Carlos", "Burgoa", "V278");
		Pasajero p3 = new Pasajero(6872236, "Daner", "Mamani", "V614");
		Pasajero p4 = new Pasajero(7843173, "Melissa", "Ramirez", "V915");
		Pasajero p5 = new Pasajero(1268763, "Carla", "Mendoza", "V746");
		Pasajero p6 = new Pasajero(4823463, "Pablo", "Alvarin", "V562");
		Pasajero p7 = new Pasajero(7785564, "Sergio", "Dinamo", "V456");

		Pasajero p8 = new Pasajero(9875613, "Raul", "Arce", "V597");
		Pasajero p9 = new Pasajero(9667100, "Andres", "Del rio", "V643");
		Pasajero p10 = new Pasajero(8710637, "Pablo", "Iglesias", "V603");
		Pasajero p11 = new Pasajero(6507493, "Wilson", "Martin", "V783");
		Pasajero p12 = new Pasajero(8067160, "Santos", "Martinez", "V672");
		Pasajero p13 = new Pasajero(8060706, "Noemi", "Rodriguez", "V961");
		Pasajero p14 = new Pasajero(8902808, "Reyna", "Tomas", "V712");
		Pasajero p15 = new Pasajero(6030798, "Juliana", "Flores", "V296");

		LDNormalP ListaPasajeros1 = new LDNormalP();
		LDNormalP ListaPasajeros2 = new LDNormalP();
		// Lista de Pasajeros 1
		ListaPasajeros1.adiFinal(p15);
		ListaPasajeros1.adiFinal(p14);
		ListaPasajeros1.adiFinal(p10);
		ListaPasajeros1.adiFinal(p9);
		ListaPasajeros1.adiFinal(p5);
		ListaPasajeros1.adiFinal(p7);
		ListaPasajeros1.adiFinal(p11);
		ListaPasajeros1.adiFinal(p2);
		// Lista de Pasajeros 2
		ListaPasajeros2.adiFinal(p1);
		ListaPasajeros2.adiFinal(p8);
		ListaPasajeros2.adiFinal(p12);
		ListaPasajeros2.adiFinal(p4);
		ListaPasajeros2.adiFinal(p6);
		ListaPasajeros2.adiFinal(p3);
		ListaPasajeros2.adiFinal(p13);
		// vuelo1
		Vuelo vuelo1 = new Vuelo(ListaPasajeros1, "Boliviana de Aviacion (BoA)", "SantaCruz", "LaPaz", "19:15");
		Vuelo vuelo2 = new Vuelo(ListaPasajeros2, "AuroSur", "Buenos Aires", "LaPaz", "19:20");
		// cola de vuelos
		CNormalV colaVuelos = new CNormalV();
		colaVuelos.adi(vuelo1);
		colaVuelos.adi(vuelo2);
		colaVuelos.mostrar();
	}
}
