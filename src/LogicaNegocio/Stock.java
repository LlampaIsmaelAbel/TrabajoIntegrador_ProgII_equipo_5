package LogicaNegocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

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
	
	
	
	
	public double calcularCostoTotalStock () {
		double costoTotalStock = 0.0;
		
		for (Lote lote : nuevoLote) {
			 //costoTotalStock += calcularCostoTotalLote(lote);
        }

        return costoTotalStock;
    }
	
	
}