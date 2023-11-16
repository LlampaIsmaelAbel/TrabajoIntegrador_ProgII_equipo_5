package LogicaNegocio;

public class Persona {
	private int nroLegajo;
	private int dni;
	private String nombreResponsable;
	
	
	
	public Persona() {
		super();
	}

	public Persona(int nroLegajo, int dni, String nombreResponsable) {
		super();
		this.nroLegajo = nroLegajo;
		this.dni = dni;
		this.nombreResponsable = nombreResponsable;
	}

	public int getNroLegajo() {
		return nroLegajo;
	}

	public void setNroLegajo(int nroLegajo) {
		this.nroLegajo = nroLegajo;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombreResponsable() {
		return nombreResponsable;
	}

	public void setNombreResponsable(String nombreResponsable) {
		this.nombreResponsable = nombreResponsable;
	}

	@Override
	public String toString() {
		return "Persona [nroLegajo=" + nroLegajo + ", dni=" + dni + ", nombreResponsable=" + nombreResponsable + "]";
	}
	
	

}
