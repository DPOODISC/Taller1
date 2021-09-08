package consola;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.*;
import modelo.Restaurante;
import modelo.Pedido;

public class Aplicacion {
	
	//Atributos//
	private static Restaurante restaurante;
	
	
	//Metodo main//
	
	public static void main(String[] args) {
		Aplicacion consola = new Aplicacion();
		restaurante = new Restaurante();
		consola.ejecutarCargaRestaurante();
		consola.ejecutarAplicacion();
	}
	
	public void ejecutarAplicacion() {
		int seleccion;
		boolean continuar = true;
		
		while (continuar)
		{
			try
			{
				menuOpciones();
				seleccion = Integer.parseInt(input("Por favor seleccione una opción"));
				if (seleccion == 1)
					menu();
				else if (seleccion == 2)
					ejecutarIniciarPedido();
				else if (seleccion == 3)
					System.out.println("3");
					//ejecutarAgregarElementoAPedido();
				else if (seleccion == 4)
					ejecutarCerrarYGuardarPedido();
				else if (seleccion == 5)
					System.out.println("5");
					//ejecutarBusquedaAtleta();
				else if (seleccion == 6)
				{
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}
				else
				{
					System.out.println("Por favor seleccione una opción válida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
	}
	
	private void ejecutarCerrarYGuardarPedido() {
		// TODO Auto-generated method stub
		
	}

	private void ejecutarIniciarPedido() {
		
		System.out.println("\n" + "Iniciando nuevo pedido" + "\n");

		String nombreCliente = input("Por favor ingrese su nombre");
		String direccionCliente = input("Por favor ingrese su dirección");
		
		Pedido pedido = restaurante.iniciarPedido(nombreCliente, direccionCliente);
		
		ejecutarPedidoEnCurso(pedido);
		

	}

	private void ejecutarPedidoEnCurso(Pedido pedido) {
		int seleccion;
		boolean continuar = true;
		
		while (continuar)
		{
			try
			{
				menuPedido();
				seleccion = Integer.parseInt(input("Por favor seleccione una opción"));
				if (seleccion < 3 && seleccion > 0) {
					
					String producto = input("Por favor diga un producto");
					restaurante.pedidoEnCurso(seleccion, producto, pedido);
				}
				else if (seleccion == 3)
				{
					System.out.println("Volviendo al menu...");
					continuar = false;
				}
				else
				{
					System.out.println("Por favor seleccione una opción válida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
	}

	private void menuPedido() {
        System.out.println("\nMenu de Ordenes\n");
        System.out.println("1. Agregar producto");
        System.out.println("2. Eliminar producto");
        System.out.println("3. Volver al menu");
		
	}

	private void menuOpciones() {
        System.out.println("\nMenu de Opciones\n");
        System.out.println("1. Mostrar el menú");
        System.out.println("2. Iniciar un nuevo pedido");
        System.out.println("3. Agregar un elemento a un pedido");
        System.out.println("4. Cerrar un pedido y guardar la factura");
        System.out.println("5. Consultar la información de un pedido");
	}
	
	public void menu()
    {
		boolean habemus = true;
		
		while (habemus)
		{
			try
			{
		        System.out.println("\nMenu de Ordenes\n");
		        System.out.println("1. Mostrar el menú de productos");
		        System.out.println("2. Mostrar el menú de combos");
		        System.out.println("3. Mostrar el menú de ingredientes");
		        System.out.println("4. Volver al menu de opciones");
				int seleccion = Integer.parseInt(input("Por favor seleccione una opción"));
				
				if (seleccion == 1)
					mostrarMenuPrincipal();
				
				else if (seleccion == 2)
					mostrarMenuCombos();
				
				else if (seleccion == 3)
					mostrarMenuIngredientes();
				
				else if (seleccion == 4)
				{
					habemus = false;
				}
		
				else
				{
					System.out.println("Por favor seleccione una opción válida.");
					
				}	
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
    }
	
	
	
	private void mostrarMenuPrincipal() {

        System.out.println("\nMenu del Corral\n");
        System.out.println("1. Corral - 14000k");
        System.out.println("2. corral queso - 16000k");
        System.out.println("3. corral pollo - 15000k");
        System.out.println("4. corralita - 13000k");
        System.out.println("5. todoterreno - 25000k");
        System.out.println("6. 1/2 libra - 25000k");
        System.out.println("7. especial - 24000k");
        System.out.println("8. casera - 23000k");
        System.out.println("9. mexicana - 22000k");
        System.out.println("10. criolla - 22000k");
        System.out.println("11. costeÃ±a - 20000k");
        System.out.println("12. hawaiana - 20000k");
        System.out.println("13. wrap de pollo - 15000k");
        System.out.println("14. wrap de lomo - 22000k");
        System.out.println("15. ensalada mexicana - 20900k");
        System.out.println("16. papas medianas - 5500k");
        System.out.println("17. papas grandes - 6900k");
        System.out.println("18. papas en casco medianas - 5500k");
        System.out.println("19. papas en casco grandes - 6900k");
        System.out.println("20. agua cristal sin gas - 5000k");
        System.out.println("21. agua cristal con gas - 5000k");
        System.out.println("22. gaseosa - 5000k");
	}
	
	private void mostrarMenuCombos() {
		
        System.out.println("\nMenu del Corral\n");
        System.out.println("1. Combo Corral - 14000k");
        System.out.println("2. Combo Corral Queso - 14000k");
        System.out.println("3. Combo Todoterreno - 14000k");
        System.out.println("4. Combo Especial - 14000k");

	}
	
	private void mostrarMenuIngredientes() {
		
        System.out.println("\nMenu del Corral\n");
        System.out.println("1. Lechuga - 1000k");
        System.out.println("2. Tomate - 1000k");
        System.out.println("3. Cebolla - 1000k");
        System.out.println("4. Queso Mozzarella - 2500k");
        System.out.println("5. Huevo - 2500k");
        System.out.println("6. Queso Americano - 2500k");
        System.out.println("7. Tocineta Express - 2500k");
        System.out.println("8. Papa Callejera - 2000k");
        System.out.println("9. Pepinillos - 2500k");
        System.out.println("10. Cebolla Grille - 2500k");
        System.out.println("11. suero costeño - 3000k");
        System.out.println("12. frijol refrito - 4500k");
        System.out.println("13. queso fundido - 4500k");
        System.out.println("14. tocineta picada - 6000k");
        System.out.println("15. piña - 2500k");
	}
	
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
	
	private void ejecutarCargaRestaurante()
	{
	      File archivoMenu = null;
	      File archivoIngredientes = null;
	      File archivoCombos = null;
	      
	      archivoMenu = new File ("./data/menu.txt");
	      archivoIngredientes = new File ("./data/ingredientes.txt");
	      archivoCombos = new File ("./data/combos.txt");
	      
	      restaurante.cargarInformacionRestaurante(archivoIngredientes, archivoMenu, archivoCombos);

	}
	
}