package LogicaNegocio;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import LogicaNegocio.Refrigerado;
import LogicaNegocio.Lote;
import LogicaNegocio.Producto;
import LogicaNegocio.ProductoCongelado;

public class Lote {
	private static int sigLote=1;
    private int nroLote;
    private Persona responsable;
    private String codigoUbicacion;
    private Date fechaCreacion;

    private List<Producto> productos;

    public Lote(Persona responsable, String codigoUbicacion, Date fechaCreacion) {
        this.nroLote = sigLote;
        this.sigLote++;
        this.responsable = responsable;
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

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	/*
	public double calcularCostoTotalLote(Lote lote) {
        double costoTotal = 0.0;
        costoTotal=sumaMargenCongelado()+sumaMargenRefrigerado();
        return costoTotal;
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
	//metodo de eliminar Producto Determinado
	public void eliminar(int codigo) {
		productos = new ArrayList<Producto>();
		for (Producto producto : productos) {
			if (producto.getCodProducto()==codigo) {
				productos.remove(producto);
			}
		}
	}
	//Metodo Verificar y eliminar productos vencidos en un lote.
	public void verificarYEliminarProductosVencidos() {
		productos = new ArrayList<Producto>();
        Date fechaActual = new Date();
        for (Producto producto : productos) {
        	if (producto.getFechaVencimiento().before(fechaActual)) {
                productos.remove(producto);
            }
		}
    }*/
	public int cantidadRefrigerado() {
		int cantidadLote = 0;
		Refrigerado refrigerado;
		for (Producto producto : productos) {
			refrigerado = (Refrigerado) producto;
			cantidadLote++;
		}
		return cantidadLote;
	}

	public int cantidadCongelado() {
		int cantidadLote = 0;
		ProductoCongelado congelado;
		for (Producto producto : productos) {
			congelado = (ProductoCongelado) producto;
			cantidadLote++;
		}
		return cantidadLote;
	}

	// metodo de eliminar Producto Determinado
	public void eliminar(int codigo) {
		productos = new ArrayList<Producto>();
		for (Producto producto : productos) {
			if (producto.getCodProducto() == codigo) {
				productos.remove(producto);
			}
		}
	}

	// Metodo Verificar y eliminar productos vencidos en un lote.
	public void verificarYEliminarProductosVencidos() {
		productos = new ArrayList<Producto>();
		Date fechaActual = new Date();
		for (Producto producto : productos) {
			if (producto.getFechaVencimiento().before(fechaActual)) {
				productos.remove(producto);
			}
		}
	}

	public void mostrarEtiquetaProducto(Lote lote) {
		for (Producto producto : productos) {
			System.out.println("Nombre del Producto: " + producto.getDescripcion());
			System.out.println("Nro de Lote: " + lote.nroLote);
			System.out.println("Fecha de Vencimiento: " + producto.getFechaVencimiento());
			break;
		}

	}
	
}
