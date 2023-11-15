package LogicaNegocio;

import java.util.Date;
import java.time.LocalDate;

public class ProductoCongelado extends Producto{
	
	private LocalDate fechaEnvasado;
    private String codigoSupervision;
    
    private double temperaturaRecomendada;
    
	public ProductoCongelado(int codProducto,String descripcion,Date fechaVencimiento,int numeroLote, double costoTratamiento,
			LocalDate fechaEnvasado, String codigoSupervision, String granjaOrigen, double temperaturaRecomendada) {
		super(codProducto, descripcion, fechaVencimiento, numeroLote, costoTratamiento);
		this.fechaEnvasado = fechaEnvasado;
		this.codigoSupervision = codigoSupervision;
		this.granjaOrigen = granjaOrigen;
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getCodigoSupervision() {
		return codigoSupervision;
	}

	public void setCodigoSupervision(String codigoSupervision) {
		this.codigoSupervision = codigoSupervision;
	}

	public String getGranjaOrigen() {
		return granjaOrigen;
	}

	public void setGranjaOrigen(String granjaOrigen) {
		this.granjaOrigen = granjaOrigen;
	}

	public double getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}

	public void setTemperaturaRecomendada(double temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

	@Override
	public String toString() {
		return super.toString()+"ProductoCongelado [fechaEnvasado=" + fechaEnvasado + ", codigoSupervision=" + codigoSupervision
				+ ", granjaOrigen=" + granjaOrigen + ", temperaturaRecomendada=" + temperaturaRecomendada + "]";
	}
    
	public double ganancia25() {
		double ganancia = super.getCostoTratamiento()*25/100;
		return ganancia;
	}
}
