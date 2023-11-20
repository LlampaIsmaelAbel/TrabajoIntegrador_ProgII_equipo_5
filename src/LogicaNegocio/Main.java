package LogicaNegocio;

import Vista.MostrarEtiqueta;
import Vista.Principal;
import Vista.VentanaProductoCongelado;
import Vista.VentanaProductoRefrigerado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Principal ventanaPrincipal= new Principal();
		ventanaPrincipal.setVisible(true);
		
		VentanaProductoRefrigerado ventanaRefrigerado=new VentanaProductoRefrigerado();
		MostrarEtiqueta ventanaEtiqueta=new MostrarEtiqueta();
		VentanaProductoCongelado ventanaCongelado=new VentanaProductoCongelado();
		
		ventanaPrincipal.setVentanaRefrig(ventanaRefrigerado);
		ventanaRefrigerado.setVentanaPrincipal(ventanaPrincipal);
		ventanaPrincipal.setVentanaMostrarDatos(ventanaEtiqueta);
		ventanaEtiqueta.setVentanaPrincipal(ventanaPrincipal);
		ventanaPrincipal.setVentanaCongelado(ventanaCongelado);
		ventanaCongelado.setVentanaPrincipal(ventanaPrincipal);*/
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		int opcion = scanner.nextInt();
		
		do {
			System.out.println("Menu de opciones");
			System.out.println("1. Grabar un Nuevo Producto");
			System.out.println("2. Modificar los datos de un Producto determinado");
			System.out.println("3. Eliminar un Producto determinado");
			System.out.println("4. Costo Total en Stock");
			System.out.println("5. Costo Total de un lote determinado");
			System.out.println("6. Margen de Ganancia total por cada lote");
			System.out.println("7. Cantidad de productos en cada lote");
			System.out.println("8. Cantidad de productos de un determinado tipo en cada lote");
			System.out.println("9. Verificar y eliminar productos vencidos en un lote");
			System.out.println("10. Mostrar la etiqueta del producto");
			System.out.println("11. Salir");
			
			System.out.println("Ingrese la opcion");
			opcion = scanner.nextInt();
			switch (opcion) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				break;
			default:
				System.out.println("Opcion invalida");
			
			}
		}while(opcion!=11);

	}
	
}
