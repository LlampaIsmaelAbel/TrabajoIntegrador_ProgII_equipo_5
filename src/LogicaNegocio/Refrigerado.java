package LogicaNegocio;

import java.util.Date;

public class Refrigerado {
	
	private String codigoOrganismoSupervision;
    private Date fechaEnvasado;
    private double temperaturaMantenimiento;
    private String granjaOrigen;
    private double costo;
    private double margenGanancia = 0.15;

    public Refrigerado(String codigoOrganismoSupervision, Date fechaEnvasado, double temperaturaMantenimiento, String granjaOrigen, double costo) {
        this.codigoOrganismoSupervision = codigoOrganismoSupervision;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
        this.granjaOrigen = granjaOrigen;
        this.costo = costo;
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

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
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
				+ fechaEnvasado + ", temperaturaMantenimiento=" + temperaturaMantenimiento + ", granjaOrigen="
				+ granjaOrigen + ", costo=" + costo + ", margenGanancia=" + margenGanancia + "]";
	}
    
    

}
