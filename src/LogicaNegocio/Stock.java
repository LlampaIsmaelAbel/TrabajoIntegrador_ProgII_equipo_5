package LogicaNegocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Stock implements Serializable{
	
	private ArrayList<Lote> nuevoLote;

	public Stock(ArrayList<Lote> nuevoLote) {
		super();
		this.nuevoLote = nuevoLote;
	}

	public ArrayList<Lote> getNuevoLote() {
		return nuevoLote;
	}

	public void setNuevoLote(ArrayList<Lote> nuevoLote) {
		this.nuevoLote = nuevoLote;
	}

	@Override
	public String toString() {
		return "Stock [nuevoLote=" + nuevoLote + "]";
	}
	
	
}