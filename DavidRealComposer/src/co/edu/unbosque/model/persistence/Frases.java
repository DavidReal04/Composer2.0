package co.edu.unbosque.model.persistence;

public class Frases {
	private String columnas[];
	
	public Frases() {
		columnas = new String[4];
	}
	
	public void guardarFrases(int columna) {
		if (columna==1) {
			columnas[0] = "Mami";
			columnas[1] = "Bebé";
			columnas[2] = "Princess";
			columnas[3] = "Mami";
		}else if(columna==2) {
			columnas[0] = "yo quiero";
			columnas[1] = "yo puedo";
			columnas[2] = "yo vengo a";
			columnas[3] = "voy a";
		}else if(columna==3) {
			columnas[0] = "encenderte";
			columnas[1] = "amarte";
			columnas[2] = "ligar";
			columnas[3] = "jugar";
		}else if(columna==4) {
			columnas[0] = "suave";
			columnas[1] = "lento";
			columnas[2] = "rápido";
			columnas[3] = "fuerte";
		}else if(columna==5) {
			columnas[0] = "hasta que salga el sol";
			columnas[1] = "toda la noche";
			columnas[2] = "hasta el amanecer";
			columnas[3] = "todo el dia";
		}else if(columna==6) {
			columnas[0] = "sin anestesia";
			columnas[1] = "sin compromiso";
			columnas[2] = "feis to feis";
			columnas[3] = "sin miedo";
		}
		
	}
	public String devolverArreglo() {
		String texto="";
		for (int i = 0; i < getColumnas().length; i++) {
			if(i==getColumnas().length-1) {
				texto += getColumnas()[i];
			}else {
				texto += getColumnas()[i] + "\n";
			}
		}
		return texto;
	}

	
	public String[] getColumnas() {
		return columnas;
	}

	public void setColumnas(String columnas[]) {
		this.columnas = columnas;
	}
}
