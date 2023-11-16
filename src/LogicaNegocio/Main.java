package LogicaNegocio;

import Vista.MostrarEtiqueta;
import Vista.Principal;
import Vista.VentanaProductoCongelado;
import Vista.VentanaProductoRefrigerado;;

public class Main {

	public static void main(String[] args) {
		
		Principal ventanaPrincipal= new Principal();
		ventanaPrincipal.setVisible(true);
		
		VentanaProductoRefrigerado ventanaRefrigerado=new VentanaProductoRefrigerado();
		MostrarEtiqueta ventanaEtiqueta=new MostrarEtiqueta();
		VentanaProductoCongelado ventanaCongelado=new VentanaProductoCongelado();
		
		ventanaPrincipal.setVentanaRefrig(ventanaRefrigerado);
		ventanaRefrigerado.setVentanaPrincipal(ventanaPrincipal);
		ventanaPrincipal.setVentanaMostrarDatos(ventanaEtiqueta);
		ventanaEtiqueta.setVentanaPrincipal(ventanaPrincipal);
		ventanaPrincipal.setVentanaCongelado(ventanaCongelado);
		

	}

}
