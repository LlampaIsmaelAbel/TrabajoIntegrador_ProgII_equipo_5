package LogicaNegocio;

import java.time.LocalDate;
import java.util.Date;

public class ProductoCongeladoAgua extends ProductoCongelado {
	private double salinidadAgua;

	public ProductoCongeladoAgua(Date fechaVencimiento, String numeroLote, double costoTratamiento,
			LocalDate fechaEnvasado, String codigoSupervision, String granjaOrigen, double temperaturaRecomendada,
			double salinidadAgua) {
		super(fechaVencimiento, numeroLote, costoTratamiento, fechaEnvasado, codigoSupervision, granjaOrigen,
				temperaturaRecomendada);
		this.salinidadAgua = salinidadAgua;
	}

	public double getSalinidadAgua() {
		return salinidadAgua;
	}

	public void setSalinidadAgua(double salinidadAgua) {
		this.salinidadAgua = salinidadAgua;
	}

	@Override
	public String toString() {
		return "ProductoCongeladoAgua [salinidadAgua=" + salinidadAgua + "]";
	}
	
	

}
