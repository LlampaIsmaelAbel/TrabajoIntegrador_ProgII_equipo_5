package LogicaNegocio;

import java.util.Date;

public class Producto {
	private int codProducto;
	private String descripcion;
	private Date fechaVencimiento;
    private double costoTratamiento;
    private String granjaOrigen;
    
	public Producto(int codProducto, String descripcion, Date fechaVencimiento, double costoTratamiento,
			String granjaOrigen) {
		super();
		this.codProducto = codProducto;
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
	
	@Override
	public String toString() {
		return "Producto [codProducto=" + codProducto + ", descripcion=" + descripcion + ", fechaVencimiento="
				+ fechaVencimiento + ", costoTratamiento=" + costoTratamiento + ", granjaOrigen=" + granjaOrigen + "]";
	}

   
    
    
    

}
