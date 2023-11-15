package LogicaNegocio;

import java.util.Date;

public class Refrigerado extends Producto{
	
	private String codigoOrganismoSupervision;
    private Date fechaEnvasado;
    private double temperaturaMantenimiento;
    private double costo;
    private double margenGanancia = 0.15;

    
    public Refrigerado(String descripcion, Date fechaVencimiento, double costoTratamiento, String granjaOrigen,
			String codigoOrganismoSupervision, Date fechaEnvasado, double temperaturaMantenimiento, double costo,
			double margenGanancia) {
		super(descripcion, fechaVencimiento, costoTratamiento, granjaOrigen);
		this.codigoOrganismoSupervision = codigoOrganismoSupervision;
		this.fechaEnvasado = fechaEnvasado;
		this.temperaturaMantenimiento = temperaturaMantenimiento;
		this.costo = costo;
		this.margenGanancia = margenGanancia;
	}



	public double calcularPrecioVenta() {
        double precioVenta = costo + (costo * margenGanancia);
        return precioVenta;
    }


    public String getCodigoOrganismoSupervision() {
        return codigoOrganismoSupervision;
    }

    public void setCodigoOrganismoSupervision(String codigoOrganismoSupervision) {
        this.codigoOrganismoSupervision = codigoOrganismoSupervision;
    }

    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(Date fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public double getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }


    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getMargenGanancia() {
        return margenGanancia;
    }

    public void setMargenGanancia(double margenGanancia) {
        this.margenGanancia = margenGanancia;
    }

	@Override
	public String toString() {
		return "Refrigerado [codigoOrganismoSupervision=" + codigoOrganismoSupervision + ", fechaEnvasado="
				+ fechaEnvasado + ", temperaturaMantenimiento=" + temperaturaMantenimiento + ", costo=" + costo + ", margenGanancia=" + margenGanancia + "]";
	}
    
    

}
