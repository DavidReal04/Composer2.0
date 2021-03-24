package co.edu.unbosque.controller;

import co.edu.unbosque.model.RealRecords;
import co.edu.unbosque.view.View;

public class Controller {
	
	private RealRecords RR;
	private View gui;
	
	public Controller() {
		RR = new RealRecords();
		gui = new View();
		funcionar();
	}
	
	public void funcionar() {
		boolean valido=false;
		RR.gestionarPropiedades();
		do {
			String opcion=gui.pedirDato("Gestor de canciones de RealRecords \nSeleccione un cantante: \n\n"
					+ "1. "+RR.seleccionarCantante(1)+"\n2. "+RR.seleccionarCantante(2));
			switch (opcion) {
			case "1": {
				RR.seleccionarCantante(1);
				valido=true;
				break;
			}case "2":{
				RR.seleccionarCantante(2);
				valido=true;
				break;
			}
			default:
				gui.mostrarResultados("Ingrese una opción valida");
			}
		}while(!valido);
		
		valido=false;
		
		do {
			String opcion=gui.pedirDato("Gestor de canciones de RealRecords \nSeleccione una opción: \n\n"
					+ "1. Generar y guardar una canción\n2. Ver una canción guardada");
			switch (opcion) {
			case "1": {
				generaryGuardarCancion();
				verCancionGuardada();
				valido=true;
				break;
			}case "2":{
				verCancionGuardada();
				valido=true;
				break;
			}
			default:
				gui.mostrarResultados("Ingrese una opción valida");
			}
		}while(!valido);
	}
	
	public void generaryGuardarCancion() {
		String cancion="";
		String guardar="";
		boolean guardado=false;
		cancion=RR.presentarCancion();
		do {
			gui.mostrarResultados("Se ha compuesto esta letra:\n\n"+cancion);
			guardar= gui.pedirDato("¿Quiere guardar el resultado? \nEscriba: \n\n1. Si\n2. No");
			switch (guardar) {
			case "1": {
				gui.mostrarResultados(RR.guardarCancion(cancion));
				guardado = true;
				break;
			}case "2": {
				gui.mostrarResultados("Se compondrá otra canción");
				cancion=RR.presentarCancion();
				break;
			}
			default:
				gui.mostrarResultados("Ingrese una opción valida");
			}
		}while(!guardado);
	}
	public void verCancionGuardada() {
		boolean bandera;
		do {
			bandera=true;
			String ver= gui.pedirDato("¿Quiere ver la canción guardada? \nEscriba: \n\n1. Si\n2. No");
			switch (ver) {
			case "1": {
				gui.mostrarResultados(RR.verCancion());
				break;
			}case "2": {
				gui.mostrarResultados("Entendible, que tenga buen día");
				break;
			}
			default:
				gui.mostrarResultados("Ingrese una opción valida");
				bandera=false;
			}
		}while(!bandera);
	}
	
}
