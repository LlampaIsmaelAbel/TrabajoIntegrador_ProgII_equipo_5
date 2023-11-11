package LogicaNegocio;

import java.util.Date;

public class Producto {
	private int codProducto;
	private String descripcion;
	private Date fechaVencimiento;
    private int numLote;
    private double costoTratamiento;

   
    public Producto(int codProducto, String descripcion, Date fechaVencimiento, int numLote, double costoTratamiento) {
		super();
		this.codProducto = codProducto;
		this.descripcion = descripcion;
		this.fechaVencimiento = fechaVencimiento;
		this.numLote = numLote;
		this.costoTratamiento = costoTratamiento;
	}

    
    
	public int getCodProducto() {
		return codProducto;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getNumLote() {
        return numLote;
    }

    public double getCostoTratamiento() {
        return costoTratamiento;
    }
    
    public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}
    
    public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public void setCostoTratamiento(double costoTratamiento) {
        this.costoTratamiento = costoTratamiento;
    }



	@Override
	public String toString() {
		return "Producto [codProducto=" + codProducto + ", descripcion=" + descripcion + ", fechaVencimiento="
				+ fechaVencimiento + ", numLote=" + numLote + ", costoTratamiento=" + costoTratamiento + "]";
	}
    
    

}
