package LogicaNegocio;

import Vista.MostrarEtiqueta;
import Vista.Principal;
import Vista.ProductoCongelado;
import Vista.ProductoRefrigerado;;

public class Main {

	public static void main(String[] args) {
		
		Principal ventanaPrincipal= new Principal();
		ventanaPrincipal.setVisible(true);
		
		ProductoRefrigerado ventanaRefrigerado=new ProductoRefrigerado();
		MostrarEtiqueta ventanaEtiqueta=new MostrarEtiqueta();
		ProductoCongelado ventanaCongelado=new ProductoCongelado();
		
		ventanaPrincipal.setVentanaRefrig(ventanaRefrigerado);
		ventanaRefrigerado.setVentanaPrincipal(ventanaPrincipal);
		ventanaPrincipal.setVentanaMostrarDatos(ventanaEtiqueta);
		ventanaEtiqueta.setVentanaPrincipal(ventanaPrincipal);
		ventanaPrincipal.setVentanaCongelado(ventanaCongelado);
		

	}

}
