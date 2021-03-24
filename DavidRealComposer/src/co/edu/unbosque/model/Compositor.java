package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Frases;
import co.edu.unbosque.model.persistence.Propiedades;

public class Compositor {
	
	public String componerCancion() {
		Propiedades prop = new Propiedades();
		String letra ="";
		int num = Integer.valueOf(prop.leerPropiedades("numeroEstrofas"));
		for (int i = 0; i < num; i++) {
			if(i!=num-1) {
				letra += armarEstrofas()+ "\n\n";
			}else if(i==num-1) {
				letra += armarEstrofas();
			}
		}
		return letra;
	} 
	
	public String armarEstrofas() {
		Propiedades prop = new Propiedades();
		int num = Integer.valueOf(prop.leerPropiedades("numeroFrases"));
		String estrofa="";
		for (int i = 0; i < num; i++) {
			if(i!=num-1) {
				estrofa +=armarFrases()+"\n";
			}else if(i==num-1) {
				estrofa +=armarFrases();
			}
		}
		return estrofa;
	}
	
	public String armarFrases() {
		Frases fr=new Frases();
		String frase="";
		int palabra;
		for (int i = 1; i < 7; i++) {
			fr.guardarFrases(i);
			palabra= (int)Math.round(Math.random()*3);
			frase += fr.getColumnas()[palabra] + " ";
		}
		return frase;
	}
	
	
}
