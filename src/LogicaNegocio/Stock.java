package LogicaNegocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import LogicaNegocios.Lote;
import LogicaNegocios.Producto;

import java.util.Collection;

public class Stock implements Serializable{
	
	private ArrayList<Lote> lotes;

	public Stock(ArrayList<Lote> nuevoLote) {
		super();
		this.lotes = nuevoLote;
	}

	public ArrayList<Lote> getNuevoLote() {
		return lotes;
	}
	
	public void setNuevoLote(ArrayList<Lote> nuevoLote) {
		this.lotes = lotes;
	}

	@Override
	public String toString() {
		return "Stock [nuevoLote=" + lotes + "]";
	}

	public void agregarLote(Lote lote) {
		lotes.add(lote);
	}

	public void eliminarLote(int numeroLote) {
		Lote loteAEliminar = null;
		for (Lote lote : lotes) {
			if (lote.getNroLote() == numeroLote) {
				loteAEliminar = lote;
				break;
			}
		}
		if (loteAEliminar != null) {
			lotes.remove(loteAEliminar);
		}
	}

	public double calcularCostoTotalStock(Lote lote) {
		double costoTotalStock = 0.0;
		List<Producto> pro = lote.getProductos();
		for (Producto producto : pro) {
			costoTotalStock += producto.getCostoTratamiento();
		}
		return costoTotalStock;
	}

	public double calcularCostoTotalLote(int numeroLote) {
		double costoTotal = 0;
		for (Lote lote : lotes) {
			List<Producto> pro = lote.getProductos();
			if (lote.getNroLote() == numeroLote) {
				for (Producto producto : pro) {
					costoTotal += producto.getCostoTratamiento();
				}
			}
		}
		return costoTotal;
	}

	public double calcularMargenGananciaLote(int numeroLote) {
		double costoTotal = calcularCostoTotalLote(numeroLote);
		double margenGanancia = costoTotal * 0.15; // Margen de ganancia del 15%
		return margenGanancia;
	}
	 public int contarProductosEnLote(int numeroLote) {
	        int cantidadProductos = 0;
	        for (Lote lote2 : lotes) {
				if (lote2.getNroLote()== numeroLote) {
					cantidadProductos++;
				}
	        }
	        return cantidadProductos;
	    }
	
	
}