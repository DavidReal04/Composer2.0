package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.ManejoArchivo;
import co.edu.unbosque.model.persistence.Propiedades;

public class RealRecords {

	public void gestionarPropiedades() {
		Propiedades prop = new Propiedades();
		prop.escribirPropiedades();
	}
	
	public String seleccionarCantante(int numero) {
		Propiedades prop = new Propiedades();
		String cantante="";
		if(numero==1) {
			cantante = prop.leerPropiedades("cantanteUno");
		}else if(numero==2) {
			cantante = prop.leerPropiedades("cantanteDos");
		}
		return cantante;
	}
	
	public String presentarCancion() {
		Compositor comp = new Compositor();
		String cancion = comp.componerCancion();
		return cancion;
	}
	
	public String guardarCancion(String cancion) {
		ManejoArchivo archivo = new ManejoArchivo();
		archivo.escribirArchivo(cancion);
		return "Guardado exitoso";
	}
	
	public String verCancion() {
		ManejoArchivo archivo = new ManejoArchivo();
		return "La canción guardada es: \n\n" + archivo.leerArchivo();
	}
}
