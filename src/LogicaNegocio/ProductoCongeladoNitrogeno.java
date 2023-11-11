package LogicaNegocio;

import java.time.LocalDate;
import java.util.Date;

public class ProductoCongeladoNitrogeno extends ProductoCongelado {
	private String metodoCongelacion;
	private int tiempoExposicionNitrogeno;
	
	public ProductoCongeladoNitrogeno(Date fechaVencimiento, String numeroLote, double costoTratamiento,
			LocalDate fechaEnvasado, String codigoSupervision, String granjaOrigen, double temperaturaRecomendada,
			String metodoCongelacion, int tiempoExposicionNitrogeno) {
		super(fechaVencimiento, numeroLote, costoTratamiento, fechaEnvasado, codigoSupervision, granjaOrigen,
				temperaturaRecomendada);
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
