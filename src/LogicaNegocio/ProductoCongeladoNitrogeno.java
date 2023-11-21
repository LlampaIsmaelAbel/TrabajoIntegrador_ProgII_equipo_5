package LogicaNegocio;

import java.time.LocalDate;
import java.util.Date;

public class ProductoCongeladoNitrogeno extends ProductoCongelado {
	private String metodoCongelacion;
	private int tiempoExposicionNitrogeno;
	
	public ProductoCongeladoNitrogeno(String descripcion, Date fechaVencimiento,
			double costoTratamiento, String granjaOrigen, Date fechaEnvasado, String codigoSupervision,
			double temperaturaRecomendada, String metodoCongelacion,
			int tiempoExposicionNitrogeno) {
		super(descripcion, fechaVencimiento, costoTratamiento, granjaOrigen, fechaEnvasado,
				codigoSupervision, temperaturaRecomendada);
		this.metodoCongelacion = metodoCongelacion;
		this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
	}

	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}

	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}

	public int getTiempoExposicionNitrogeno() {
		return tiempoExposicionNitrogeno;
	}

	public void setTiempoExposicionNitrogeno(int tiempoExposicionNitrogeno) {
		this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
	}

	@Override
	public String toString() {
		return "ProductoCongeladoNitrogeno [metodoCongelacion=" + metodoCongelacion + ", tiempoExposicionNitrogeno="
				+ tiempoExposicionNitrogeno + "]";
	}


}
