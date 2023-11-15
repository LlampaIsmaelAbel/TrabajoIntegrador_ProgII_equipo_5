package LogicaNegocio;

import java.util.Date;

public class Producto {
	private static int siguienteCodProd=1;
	private int codProducto;
	private String descripcion;
	private Date fechaVencimiento;
    private double costoTratamiento;
    private String granjaOrigen;
    
    
    
	public Producto() {
		super();
		this.codProducto = siguienteCodProd;
		this.siguienteCodProd++;
	}

	public Producto(String descripcion, Date fechaVencimiento, double costoTratamiento,
			String granjaOrigen) {
		super();
		this.codProducto = siguienteCodProd;
		this.siguienteCodProd++;
		this.descripcion = descripcion;
		this.fechaVencimiento = fechaVencimiento;
		this.costoTratamiento = costoTratamiento;
		this.granjaOrigen = granjaOrigen;
	}
	
	public int getCodProducto() {
		return codProducto;
	}
	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public double getCostoTratamiento() {
		return costoTratamiento;
	}
	public void setCostoTratamiento(double costoTratamiento) {
		this.costoTratamiento = costoTratamiento;
	}
	public String getGranjaOrigen() {
		return granjaOrigen;
	}
	public void setGranjaOrigen(String granjaOrigen) {
		this.granjaOrigen = granjaOrigen;
	}
	
	

	// estos metodos no lo vamos a utilizar solo es para que los numeros de codProducto sean consecutivos
	public static int getSiguienteCodProd() {
		return siguienteCodProd;
	}

	public static void setSiguienteCodProd(int siguienteCodProd) {
		Producto.siguienteCodProd = siguienteCodProd;
	}

	@Override
	public String toString() {
		return "Producto [codProducto=" + codProducto + ", descripcion=" + descripcion + ", fechaVencimiento="
				+ fechaVencimiento + ", costoTratamiento=" + costoTratamiento + ", granjaOrigen=" + granjaOrigen + "]";
	}

   
    
    
    

}
