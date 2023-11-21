package LogicaNegocio;

import java.util.Date;

public class Refrigerado extends Producto{
	
	private String codigoOrganismoSupervision;
    private Date fechaEnvasado;
    private double temperaturaMantenimiento;
    private double margenGanancia = 0.15;

    
    public Refrigerado(String descripcion, Date fechaVencimiento, double costoTratamiento, String granjaOrigen,
			String codigoOrganismoSupervision, Date fechaEnvasado, double temperaturaMantenimiento) {
		super(descripcion, fechaVencimiento, costoTratamiento, granjaOrigen);
		this.codigoOrganismoSupervision = codigoOrganismoSupervision;
		this.fechaEnvasado = fechaEnvasado;
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}


	public double calcularPrecioVenta() {
        double precioVenta = super.getCostoTratamiento() + (super.getCostoTratamiento() * margenGanancia);
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

    public double getMargenGanancia() {
        return margenGanancia;
    }

    public void setMargenGanancia(double margenGanancia) {
        this.margenGanancia = margenGanancia;
    }

	@Override
	public String toString() {
		return "Refrigerado [codigoOrganismoSupervision=" + codigoOrganismoSupervision + ", fechaEnvasado="
				+ fechaEnvasado + ", temperaturaMantenimiento=" + temperaturaMantenimiento +  ", margenGanancia=" + margenGanancia + "]";
	}
    
    

}
