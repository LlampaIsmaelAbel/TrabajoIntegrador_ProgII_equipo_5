package LogicaNegocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static Scanner sc = new Scanner(System.in);
	public static Date fechaActual = new Date();
	public static Lote lote1;
	public static Lote lote2;

	public static Stock stock;
	public static List<Producto> ListaProductos = new ArrayList<Producto>();
	public static ArrayList<Lote> lotes = new ArrayList<Lote>();

	public static void main(String[] args) {
		Persona hol = new Persona(1, 432524, "pedro");
		Producto pro = new ProductoCongelado("pollo", fechaActual, 1000, "pipa", fechaActual, "13", -10);
		Producto pro1 = new ProductoCongelado("paty", fechaActual, 1030, "pipa", fechaActual, "14", -10);
		Producto pro2 = new ProductoCongelado("loco", fechaActual, 1020, "pipa", fechaActual, "15", -10);
		Producto pro3 = new ProductoCongelado("helado", fechaActual, 1200, "pipa", fechaActual, "16", -10);
		Producto pro4 = new ProductoCongelado("paty", fechaActual, 1000, "pipa", fechaActual, "17", -10);
		ListaProductos.add(pro);
		ListaProductos.add(pro1);
		ListaProductos.add(pro2);
		ListaProductos.add(pro3);
		ListaProductos.add(pro4);

		lote1 = new Lote(hol, "A1", fechaActual);
		lote1.setProductos(ListaProductos);
		lotes.add(lote1);

		Persona hola = new Persona(2, 432524, "juanito");
		Producto proo = new ProductoCongelado("pollo", fechaActual, 10, "pipa", fechaActual, "13", -10);
		Producto proo1 = new ProductoCongelado("paty", fechaActual, 10, "pipa", fechaActual, "14", -10);
		Producto proo2 = new ProductoCongelado("loco", fechaActual, 10, "pipa", fechaActual, "15", -10);
		Producto proo3 = new ProductoCongelado("helado", fechaActual, 12, "pipa", fechaActual, "16", -10);
		Producto proo4 = new ProductoCongelado("paty", fechaActual, 10, "pipa", fechaActual, "17", -10);
		ListaProductos.add(proo);
		ListaProductos.add(proo1);
		ListaProductos.add(proo2);
		ListaProductos.add(proo3);
		ListaProductos.add(proo4);

		lote2 = new Lote(hola, "A2", fechaActual);
		lote2.setProductos(ListaProductos);
		lotes.add(lote2);

		stock = new Stock(lotes);
		for (Lote stg : lotes) {
			System.out.println(stg);
		}
		// lotes.add(lote1);
		// lote1.setProductos(productos);

		/*
		 * Persona hol1 = new Persona(1, 432525, "juana"); lote1 = new Lote(hol1, "A2",
		 * fechaActual);
		 * 
		 * lotes.add(lote1); lote1.setProductos(productos); Persona hol2 = new
		 * Persona(1, 432526, "messi"); lote1 = new Lote(hol2, "A3", fechaActual);
		 * lotes.add(lote1); lote1.setProductos(productos);
		 */

		int opcion;
		do {
			opcion = menu();
			int nroLote;
			switch (opcion) {
			case 1:
				Persona nuevoPers = registrarPersona();

				String siNO = "s";

				while (siNO.equalsIgnoreCase("s")) {

					System.out.println("1)Producto Resfrigerado\n2)Producto Congelado");
					System.out.print("Selecione una opcion: ");
					int opcion1 = sc.nextInt();
					sc.nextLine();
					if (opcion1 == 1) {
						Refrigerado refrigerado = CreacionProductoRefrigerado();// creando un producto refri
						ListaProductos.add(refrigerado);
					} else if (opcion1 == 2) {
						System.out.println(
								"1)Producto Congelado Aire\n2)Producto Congelado Agua\n3)Producto Congelado Nitrogeno");
						System.out.println("Seleccione una opcion: ");
						int opcion2 = sc.nextInt();
						sc.nextLine();
						switch (opcion2) {
						case 1:
							ProductoCongeladoAire congeladoAire = CreacionProductoCongeladoAire();
							ListaProductos.add(congeladoAire);
							break;
						case 2:
							ProductoCongeladoAgua congeladoAgua = CreacionProductoCongeladoAgua();
							ListaProductos.add(congeladoAgua);
							break;
						case 3:
							CreacionProductoCongeladoNitrogeno();
							ProductoCongeladoNitrogeno congeladoNitrogeno = CreacionProductoCongeladoNitrogeno();
							ListaProductos.add(congeladoNitrogeno);
							break;
						default:
							System.out.println("Error en el ingreso!!!");
							break;
						}

					} else {
						System.out.println("Error de Ingreso");
					}

					System.out.print("Ingrese codigo de ubicacion: ");
					String codigoUbi = sc.nextLine();
					lote1 = new Lote(nuevoPers, codigoUbi, fechaActual);
					System.out.println("¿Continuar ingresado libros? s/n");
					siNO = sc.nextLine();
				}
				lote1.setProductos(ListaProductos);
				lotes.add(lote1);
//				stock=new Stock(lotes);

				break;
			case 2:
				System.out.println("Ingrese el Codigo del producto");
				int num = Integer.parseInt(sc.nextLine());
				ArrayList<Lote> listaLote = stock.getNuevoLote();
				for (Lote lote : listaLote) {
					List<Producto> prod = lote.getProductos();
					for (Producto product : prod) {
						if (product.getCodProducto() == num) {
							
						}
					}
				}

				break;
			case 3:
				List<Producto> refri = lote1.getProductos();
				for (Producto finoli : refri) {
					System.out.println(finoli);
				}
				System.out.print("Ingrese codigo producto: ");
				int codigo = sc.nextInt();
				lote1.eliminar(codigo);
				List<Producto> refri1 = lote1.getProductos();
				for (Producto finoli : refri1) {
					if (refri1.size()<=0) {
						System.out.println("NO ELEMENTOS");
					}else {
						System.out.println(finoli);
					}
				}
				break;
			case 4:
				double costoTotalStock = stock.calcularCostoTotalStock(lote1);
				System.out.println("El costo total en stock es: " + costoTotalStock);
				break;
			case 5:
				System.out.print("Ingrese Nro Lote: ");
				nroLote = sc.nextInt();
				double costoTotalLoteDeterminado = stock.calcularCostoTotalLote(nroLote);
				System.out.println("El costo total de un lote determinado es: " + costoTotalLoteDeterminado);
				break;
			case 6:
				System.out.println("Ingrese Nro Lote: ");
				nroLote = sc.nextInt();
				stock.calcularMargenGananciaLote(nroLote);
				break;
			case 7:

				break;
			case 8:
				break;
			case 9:
				lote1.verificarYEliminarProductosVencidos();
				break;
			case 10:
				lote1.mostrarEtiquetaProducto(lote1);
				break;
			case 11:
				System.out.println("A salido del programa");
				break;
			default:
				System.out.println("Opcion invalida");

			}
		} while (opcion != 11);
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
		// falta poner la fecha de envasado
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
		ProductoCongeladoAire congeladoAire1 = new ProductoCongeladoAire(descripcion, fechaActual, costoTratamiento,
				granjaOrigen, fechaActual, codigoOrganimo, temperaturaMantenimiento, nitrogeno, oxigeno, dioxidoCarbono,
				vaporAgua);
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
		ProductoCongeladoAgua congeladoAgua1 = new ProductoCongeladoAgua(descripcion, fechaActual, costoTratamiento,
				granjaOrigen, fechaActual, codigoOrganimo, temperaturaMantenimiento, salinidadAgua);
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
		ProductoCongeladoNitrogeno congeladoNitrogeno1 = new ProductoCongeladoNitrogeno(descripcion, fechaActual,
				costoTratamiento, granjaOrigen, fechaActual, codigoOrganimo, temperaturaMantenimiento,
				metodoCongelacion, tiempoExposicion);
		return congeladoNitrogeno1;
	}

	public static int menu() {
		int opc = 0;
		do {
			System.out.println("----------Menu de opciones----------");
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
			System.out.print("Seleccione una opcion: ");
			opc = sc.nextInt();

			if (opc > 11 || opc < 1) {
				System.out.println("Ingrese una opcion del Menu");

			}

		} while (opc > 11 || opc < 1);

		return opc;
	}

	public static Persona registrarPersona() {
		System.out.print("Ingrese Nro Legajo: ");
		int nroLegajo = sc.nextInt();
		System.out.print("Ingrese DNI: ");
		int dni = sc.nextInt();
		sc.nextLine();
		System.out.print("Ingrese nombre Responsable: ");
		String nombreResponsable = sc.nextLine();
		Persona persona1 = new Persona(nroLegajo, dni, nombreResponsable);
		return persona1;
	}
}
