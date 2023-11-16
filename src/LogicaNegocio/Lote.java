package LogicaNegocio;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Vista.ProductoRefrigerado;

public class Lote {
	private static int sigLote=1;
    private int nroLote;
    private Persona responsable;
    private String codigoUbicacion;
    private String fechaCreacion;

    private List<Producto> productos;

    
    public Lote(String codigoUbicacion, String fechaCreacion) {
        this.nroLote = sigLote;
        this.sigLote++;
        this.codigoUbicacion = codigoUbicacion;
        this.fechaCreacion = fechaCreacion;

        this.productos = new ArrayList<>();
    }

	public static int getSigLote() {
		return sigLote;
	}

	public static void setSigLote(int sigLote) {
		Lote.sigLote = sigLote;
	}

	public int getNroLote() {
		return nroLote;
	}

	public Persona getResponsable() {
		return responsable;
	}

	public void setResponsable(Persona responsable) {
		this.responsable = responsable;
	}

	public String getCodigoUbicacion() {
		return codigoUbicacion;
	}

	public void setCodigoUbicacion(String codigoUbicacion) {
		this.codigoUbicacion = codigoUbicacion;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	//Metodos de margen de ganancia por cada Lote
	public double sumaMargenCongelado() {
		double sumaLote = 0;
		ProductoCongelado congelado;
		for (Producto producto : productos) {
			congelado = (ProductoCongelado)producto;
			sumaLote += congelado.ganancia25();
		}
		return sumaLote;
	}
	public double sumaMargenRefrigerado() {
		double sumaLote = 0;
		Refrigerado refrigerado;
		for (Producto producto : productos) {
			refrigerado = (Refrigerado)producto;
			sumaLote += refrigerado.calcularPrecioVenta();
		}
		return sumaLote;
	}
	//Metodos de cantidad de producto por Lote
	public int cantidadRefrigerado() {
		int cantidadLote = 0;
		Refrigerado refrigerado;
		for (Producto producto : productos) {
			refrigerado = (Refrigerado)producto;
			cantidadLote++;
		}
		return cantidadLote;
	}
	public int cantidadCongelado() {
		int cantidadLote = 0;
		ProductoCongelado congelado;
		for (Producto producto : productos) {
			congelado = (ProductoCongelado)producto;
			cantidadLote++;
		}
		return cantidadLote;
	}
    
}
