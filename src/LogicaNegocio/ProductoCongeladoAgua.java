package LogicaNegocio;

import java.time.LocalDate;
import java.util.Date;

public class ProductoCongeladoAgua extends ProductoCongelado {
	private double salinidadAgua;
	
	public ProductoCongeladoAgua(String descripcion, Date fechaVencimiento, double costoTratamiento,
			String granjaOrigen, Date fechaEnvasado, String codigoSupervision, double temperaturaRecomendada,
			double porcentajeGanancia, double salinidadAgua) {
		super(descripcion, fechaVencimiento, costoTratamiento, granjaOrigen, fechaEnvasado,
				codigoSupervision, temperaturaRecomendada, porcentajeGanancia);
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
