package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.io.*;

public class Restaurante {
	
	
	// Atributos //
	
	private ArrayList<Combo> combos;
	
	private ArrayList<Pedido> pedidos;
	
	private ArrayList<ProductoMenu> menuBase;
	
	private ArrayList<Ingrediente> ingredientes;
	
	
	// Constructor //
	
	public Restaurante() {
		
		menuBase = new ArrayList<ProductoMenu>();
		ingredientes = new ArrayList<Ingrediente>();
		combos = new ArrayList<Combo>();
		
	}
	
	
	// Metodos //
	
	public Pedido iniciarPedido(String nombreCliente, String direccionCliente) {
		
		pedidos = new ArrayList<Pedido>();
		
		Pedido pedido = new Pedido(nombreCliente, direccionCliente);
		
		pedidos.add(pedido);
		
		return pedido;
	}
	
	public Pedido pedidoEnCurso(int seleccion, String producto, Pedido pedido, ArrayList<ProductoMenu> menuBase) {
		
		if (seleccion == 1)
			pedido.agregarProducto(getProducto(producto, menuBase));
		
		else if (seleccion == 2)
			pedido.eliminarProducto(getProducto(producto, menuBase));
		
		return pedido;
	}
	
	public void cerrarYGuardarPedido(Pedido pedido) {
		
		pedido.generarTextoFactura();
	}
	
	public Pedido getPedidoEnCurso(int id) {
		
		Pedido curso = null;

		for (int i = pedidos.size() - 1; i >= 0 && curso == null; i--)
		{
			Pedido pedido = pedidos.get(i);
			if (Integer.toString(pedido.getIdPedido()).equals(Integer.toString(id)))
			{
				curso = pedido;
			}
		}
		
		return curso;
	}
	
	public ProductoMenu getProducto(String elemento, ArrayList<ProductoMenu> menuBase) {
		
		ProductoMenu producto = null;

		for (int i = menuBase.size() - 1; i >= 0 && producto == null; i--)
		{
			ProductoMenu product = menuBase.get(i);
			if (product.getNombre().equals(elemento))
			{
				producto = product;
			}
		}
		
		return producto;
	}
	
	public ArrayList<ProductoMenu> getMenuBase() {
		
		return menuBase;
	}
	
	public ArrayList<Ingrediente> getIngredientes() {
		
		return ingredientes;
	}
	
	public static ArrayList<ProductoMenu> cargarInformacionRestaurante(File archivoIngredientes, File archivoMenu, File archivoCombos, ArrayList<ProductoMenu> menuBase) {
		
		menuBase = cargarMenu(archivoMenu);
		cargarIngredientes(archivoIngredientes);
		cargarCombos(archivoCombos, menuBase);
		
		return menuBase;
	}
	
	
	private static void cargarIngredientes(File archivoIngredientes){
		  ArrayList<Ingrediente> ingredientes = new ArrayList<>();
	      FileReader fr = null;
	      BufferedReader br = null;

	      try {
	    	 // Abrir el archivo y leerlo línea por línea usando un BufferedReader
	         fr = new FileReader (archivoIngredientes);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea = br.readLine();
	    	 while (linea != null)
	    	 {
	    		  String[] partes = linea.split(";");
	    		  String nombre = partes[0];
	    		  int precio = Integer.parseInt(partes[1]);
	    		  Ingrediente ingrediente = new Ingrediente(nombre, precio);
	    		  ingredientes.add(ingrediente);
	    		  linea = br.readLine();
	    	 }
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }
	      finally{
	         // En el finally cerramos el fichero, para asegurarnos que se cierra tanto si todo va bien
	    	 //como si salta una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();
	            }                  
	         }
	         catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	}
	
	private static ArrayList<ProductoMenu> cargarMenu(File archivoMenu){
		  ArrayList<ProductoMenu> menuBase = new ArrayList<>();
	      FileReader fr = null;
	      BufferedReader br = null;

	      try {
	    	 // Abrir el archivo y leerlo línea por línea usando un BufferedReader
	         fr = new FileReader (archivoMenu);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea = br.readLine();
	         while (linea != null)
	    	 {
	    		  String[] partes = linea.split(";");
	    		  String nombre = partes[0];
	    		  int precioBase = Integer.parseInt(partes[1]);
	    		  ProductoMenu producto = new ProductoMenu(nombre, precioBase);
	    		  menuBase.add(producto);
	    		  linea = br.readLine();
	    	 }
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }
	      finally{
	         // En el finally cerramos el fichero, para asegurarnos que se cierra tanto si todo va bien
	    	 //como si salta una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }
	         catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		return menuBase;
	}
	
	private static void cargarCombos(File archivoCombos, ArrayList<ProductoMenu> menuBase){
		  ArrayList<Combo> combos = new ArrayList<>();
		  ArrayList<ProductoMenu> itemsCombo = new ArrayList<>();
	      FileReader fr = null;
	      BufferedReader br = null;

	      try {
	    	 // Abrir el archivo y leerlo línea por línea usando un BufferedReader
	         fr = new FileReader (archivoCombos);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea = br.readLine();
	         while (linea != null)
	    	 {
	    		  String[] partes = linea.split(";");
	    		  String nombreCombo = partes[0];
	    		  String descuento = partes[1];
	    		  String producto1 = partes[2];
	    		  String producto2 = partes[3];
	    		  String producto3 = partes[4];
	    		  
	    		  ProductoMenu product1 = buscarProducto(producto1, menuBase);
	    		  ProductoMenu product2 = buscarProducto(producto2, menuBase);
	    		  ProductoMenu product3 = buscarProducto(producto3, menuBase);
	    		  
	    		  itemsCombo.add(product1);
	    		  itemsCombo.add(product2);
	    		  itemsCombo.add(product3);

	    		  Combo combo = new Combo(nombreCombo, descuento, itemsCombo);
	    		  combos.add(combo);
	    		  linea = br.readLine();
	    	 }
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }
	      finally{
	         // En el finally cerramos el fichero, para asegurarnos que se cierra tanto si todo va bien
	    	 //como si salta una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }
	         catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	}

	private static ProductoMenu buscarProducto(String nombreProducto, ArrayList<ProductoMenu> menuBase)
	{
		ProductoMenu producto = null;

		for (int i = menuBase.size() - 1; i >= 0 && producto == null; i--)
		{
			ProductoMenu product = menuBase.get(i);
			if (product.getNombre().equals(nombreProducto))
			{
				producto = product;
			}
		}

		return producto;
	}
}
