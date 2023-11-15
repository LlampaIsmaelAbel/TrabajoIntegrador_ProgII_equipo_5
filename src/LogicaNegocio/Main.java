package LogicaNegocio;

import Vista.Principal;
import Vista.ProductoRefrigerado;;

public class Main {

	public static void main(String[] args) {
		
		Principal ventana1= new Principal();
		ventana1.setVisible(true);
		ProductoRefrigerado ventanaRefrigerado=new ProductoRefrigerado();
		
		ventana1.setVentanaRefrig(ventanaRefrigerado);
		ventanaRefrigerado.setVentanaPrincipal(ventana1);

	}

}
