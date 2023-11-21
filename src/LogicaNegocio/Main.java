package LogicaNegocio;

import Vista.MostrarEtiqueta;
import Vista.Principal;
import Vista.VentanaProductoCongelado;
import Vista.VentanaProductoRefrigerado;

import java.util.Date;
import java.util.Scanner;

import LogicaNegocio.Lote;
import LogicaNegocio.Persona;
import LogicaNegocio.ProductoCongeladoAgua;
import LogicaNegocio.ProductoCongeladoAire;
import LogicaNegocio.ProductoCongeladoNitrogeno;
import LogicaNegocio.Refrigerado;

public class Main {
	public static Scanner sc= new Scanner(System.in);
	public static Date fechaActual = new Date();
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
		int opcion;
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
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.print("Ingrese Nro Legajo: ");
				int nroLegajo = sc.nextInt();
				System.out.print("Ingrese DNI: ");
				int dni = sc.nextInt();
				sc.nextLine();
				System.out.print("Ingrese nombre Responsable: ");
				String nombreResponsable = sc.nextLine();
				System.out.print("Ingrese codigo de ubicacion: ");
				String codigoUbi = sc.nextLine();
				Persona persona1 = new Persona(nroLegajo, dni, codigoUbi);
				Lote lote1 = new Lote(persona1, nombreResponsable, fechaActual);
				System.out.println("1)Producto Resfrigerado\n2)Producto Congelado");
				System.out.print("Selecione una opcion: ");
				int opcion1 = sc.nextInt();
				sc.nextLine();
				if (opcion1 == 1) {
					CreacionProductoRefrigerado();
				} else if (opcion1 == 2) {
					System.out.println(
							"1)Producto Congelado Aire\n2)Producto Congelado Agua Producto Congelado Nitrogeno");
					int opcion2 = sc.nextInt();
					switch (opcion2) {
					case 1:
						CreacionProductoCongeladoAire();
						break;
					case 2:
						CreacionProductoCongeladoAgua();
						break;
					case 3:
						CreacionProductoCongeladoNitrogeno();
						break;
					default:
						System.out.println("Error en el ingreso!!!");
						break;
					}
				}
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
	public static Refrigerado CreacionProductoRefrigerado() {
		System.out.print("Ingrese Descripcion: ");
		String descripcion = sc.nextLine();
		System.out.print("Ingrese costo de tratamiento: ");
		double costoTratamiento = sc.nextDouble();
		sc.nextLine();
		System.out.print("Ingrese granja origen: ");
		String granjaOrigen = sc.nextLine();
		System.out.print("Ingrese Codigo de organismo supervicion(numerico): ");
		String codigoOrganimo = sc.nextLine();
		//falta poner la fecha de envasado
		System.out.print("Ingrese temperatura de mantenimiento recomendada: ");
		double temperaturaMantenimiento = sc.nextDouble();
		Refrigerado refri1 = new Refrigerado(descripcion, fechaActual, costoTratamiento, granjaOrigen, codigoOrganimo,
				fechaActual, temperaturaMantenimiento);
		return refri1;
	}
	public static ProductoCongeladoAire CreacionProductoCongeladoAire() {
		System.out.print("Ingrese Descripcion: ");
		String descripcion = sc.nextLine();
		System.out.print("Ingrese costo de tratamiento: ");
		double costoTratamiento = sc.nextDouble();
		sc.nextLine();
		System.out.print("Ingrese granja origen: ");
		String granjaOrigen = sc.nextLine();
		System.out.print("Ingrese Codigo de organismo supervicion(numerico): ");
		String codigoOrganimo = sc.nextLine();
		System.out.print("Ingrese temperatura de mantenimiento recomendada: ");
		double temperaturaMantenimiento = sc.nextDouble();
		System.out.print("Ingrese % de nitrogeno: ");
		double nitrogeno = sc.nextDouble();
		System.out.print("Ingrese % de nitrogeno: ");
		double oxigeno = sc.nextDouble();
		System.out.print("Ingrese % de nitrogeno: ");
		double dioxidoCarbono = sc.nextDouble();
		System.out.print("Ingrese % de nitrogeno: ");
		double vaporAgua = sc.nextDouble();
		ProductoCongeladoAire congeladoAire1 = new ProductoCongeladoAire(descripcion, fechaActual, costoTratamiento, granjaOrigen, fechaActual, codigoOrganimo, temperaturaMantenimiento, nitrogeno, oxigeno, dioxidoCarbono, vaporAgua);
		return congeladoAire1;
	
	}
	public static ProductoCongeladoAgua CreacionProductoCongeladoAgua() {
		System.out.print("Ingrese Descripcion: ");
		String descripcion = sc.nextLine();
		System.out.print("Ingrese costo de tratamiento: ");
		double costoTratamiento = sc.nextDouble();
		sc.nextLine();
		System.out.print("Ingrese granja origen: ");
		String granjaOrigen = sc.nextLine();
		System.out.print("Ingrese Codigo de organismo supervicion(numerico): ");
		String codigoOrganimo = sc.nextLine();
		System.out.print("Ingrese temperatura de mantenimiento recomendada: ");
		double temperaturaMantenimiento = sc.nextDouble();
		System.out.print("Ingrese salinidad del agua(gramo*litro): ");
		double salinidadAgua = sc.nextDouble();
		ProductoCongeladoAgua congeladoAgua1 = new ProductoCongeladoAgua(descripcion, fechaActual, costoTratamiento, granjaOrigen, fechaActual, codigoOrganimo, temperaturaMantenimiento, salinidadAgua);
		return congeladoAgua1;
	
	}
	public static ProductoCongeladoNitrogeno CreacionProductoCongeladoNitrogeno() {
		System.out.print("Ingrese Descripcion: ");
		String descripcion = sc.nextLine();
		System.out.print("Ingrese costo de tratamiento: ");
		double costoTratamiento = sc.nextDouble();
		sc.nextLine();
		System.out.print("Ingrese granja origen: ");
		String granjaOrigen = sc.nextLine();
		System.out.print("Ingrese Codigo de organismo supervicion(numerico): ");
		String codigoOrganimo = sc.nextLine();
		System.out.print("Ingrese temperatura de mantenimiento recomendada: ");
		double temperaturaMantenimiento = sc.nextDouble();
		System.out.print("Ingrese metodo de congelacion: ");
		String metodoCongelacion = sc.nextLine();
		System.out.print("Ingrese tiempo de exposicion al nitrogeno ");
		int tiempoExposicion = sc.nextInt();
		ProductoCongeladoNitrogeno congeladoNitrogeno1 = new ProductoCongeladoNitrogeno(descripcion, fechaActual, costoTratamiento, granjaOrigen, fechaActual, codigoOrganimo, temperaturaMantenimiento, metodoCongelacion, tiempoExposicion);
		return congeladoNitrogeno1;
	}

	
}
