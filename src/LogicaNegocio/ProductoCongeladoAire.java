package LogicaNegocio;

import java.time.LocalDate;
import java.util.Date;

public class ProductoCongeladoAire extends ProductoCongelado{
	private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeDioxidoCarbono;
    private double porcentajeVaporAgua;
    

	public ProductoCongeladoAire(String descripcion, Date fechaVencimiento, double costoTratamiento,
			String granjaOrigen, Date fechaEnvasado, String codigoSupervision, double temperaturaRecomendada,
			double porcentajeGanancia, double porcentajeNitrogeno, double porcentajeOxigeno,
			double porcentajeDioxidoCarbono, double porcentajeVaporAgua) {
		super(descripcion, fechaVencimiento, costoTratamiento, granjaOrigen, fechaEnvasado,
				codigoSupervision, temperaturaRecomendada, porcentajeGanancia);
		this.porcentajeNitrogeno = porcentajeNitrogeno;
		this.porcentajeOxigeno = porcentajeOxigeno;
		this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
		this.porcentajeVaporAgua = porcentajeVaporAgua;
	}


	public double getPorcentajeNitrogeno() {
		return porcentajeNitrogeno;
	}

	public void setPorcentajeNitrogeno(double porcentajeNitrogeno) {
		this.porcentajeNitrogeno = porcentajeNitrogeno;
	}

	public double getPorcentajeOxigeno() {
		return porcentajeOxigeno;
	}

	public void setPorcentajeOxigeno(double porcentajeOxigeno) {
		this.porcentajeOxigeno = porcentajeOxigeno;
	}

	public double getPorcentajeDioxidoCarbono() {
		return porcentajeDioxidoCarbono;
	}

	public void setPorcentajeDioxidoCarbono(double porcentajeDioxidoCarbono) {
		this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
	}

	public double getPorcentajeVaporAgua() {
		return porcentajeVaporAgua;
	}

	public void setPorcentajeVaporAgua(double porcentajeVaporAgua) {
		this.porcentajeVaporAgua = porcentajeVaporAgua;
	}

	@Override
	public String toString() {
		return super.toString()+"ProductoCongeladoAire [porcentajeNitrogeno=" + porcentajeNitrogeno + ", porcentajeOxigeno="
				+ porcentajeOxigeno + ", porcentajeDioxidoCarbono=" + porcentajeDioxidoCarbono
				+ ", porcentajeVaporAgua=" + porcentajeVaporAgua + "]";
	}
    
}