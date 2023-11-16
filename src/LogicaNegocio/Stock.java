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
	
	
	public double calcularCostoTotalLote(Lote lote) {
        double costoTotal = 0.0;

        if (nuevoLote.contains(lote)) {
            ArrayList<Producto> productosEnLote = (ArrayList<Producto>) lote.getProductos();

            for (Producto producto : productosEnLote) {
                costoTotal += producto.getCostoTratamiento();
            }
        } else {
            System.out.println("El lote no se encuentra en el stock.");
        }

        return costoTotal;
    }
	
	
}