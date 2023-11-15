package LogicaNegocio;

import java.util.Date;
import java.time.LocalDate;

public class ProductoCongelado extends Producto{
	
	private Date fechaEnvasado;
    private String codigoSupervision;
    private double temperaturaRecomendada;
    private double porcentajeGanancia;
    
	public ProductoCongelado(int codProducto, String descripcion, Date fechaVencimiento, double costoTratamiento,
			String granjaOrigen, Date fechaEnvasado, String codigoSupervision, double temperaturaRecomendada,
			double porcentajeGanancia) {
		super(codProducto, descripcion, fechaVencimiento, costoTratamiento, granjaOrigen);
		this.fechaEnvasado = fechaEnvasado;
		this.codigoSupervision = codigoSupervision;
		this.temperaturaRecomendada = temperaturaRecomendada;
		this.porcentajeGanancia = 0.25;
	}

	public Date getFechaEnvasado() {
		return fechaEnvasado;
	}
	
	public void setFechaEnvasado(Date fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	
	public String getCodigoSupervision() {
		return codigoSupervision;
	}
	
	public void setCodigoSupervision(String codigoSupervision) {
		this.codigoSupervision = codigoSupervision;
	}

	public double getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}

	public void setTemperaturaRecomendada(double temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

	public double getPorcentajeGanancia() {
		return porcentajeGanancia;
	}

	public void setPorcentajeGanancia(double porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public double ganancia25() {
		double ganancia = super.getCostoTratamiento()*25/100;
		return ganancia;
	}
}
