package modelo;

import java.io.File;
import java.util.ArrayList;
import java.io.*;

public class Pedido{
	
	
	// Atributos //
	
	private int numeroPedidos;
	
	private int idPedido;
	
	private String nombreCliente;

	private String direccionCliente;
	
	private ArrayList<ProductoMenu> itemsPedido;
	
	
	// Constructor //
	
	public Pedido(String nombreCliente, String direccionCliente) {
	
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		
		
		int numero = (int)(Math.random()*(1000000-100000+1)+100000);
		idPedido = numero;
		
		itemsPedido = new ArrayList<ProductoMenu>();
	}
	
	
	// Metodos //
	
	public int getIdPedido() {
		
		return idPedido;
	}
	
	public ArrayList<ProductoMenu> getItemsPedido() {
		
		return itemsPedido;
	}
	
	public void agregarProducto(ProductoMenu nuevoItem) {
		
		itemsPedido.add(nuevoItem);
	}
	
	public void eliminarProducto(ProductoMenu nuevoItem) {
		
		itemsPedido.remove(nuevoItem);
	}
	
	public void generarTextoFactura(){
			
			FileWriter fichero = null;
	        PrintWriter pw = null;
	        int totalMoney = 0;
	        int totalCalories = 0;
	        try
	        {
	            fichero = new FileWriter("./data/recibo.txt");
	            pw = new PrintWriter(fichero);
	            
				pw.println("CORRAL UNIANDES\n" );
				pw.println("La Factura de su pedido es: ");
				pw.println("________________________________________________________\n");
				pw.println("Nombre del Cliente: " + nombreCliente);
				pw.println("Direccion del Cliente: " + direccionCliente);
				pw.println("Idenficacion: " + idPedido);
				pw.println("________________________________________________________\n");

	    		for (int i = 0; i < itemsPedido.size(); i++)
	    		{
	    			pw.println(itemsPedido.get(i).getNombre() + "\tCosto Unidad: $"+ itemsPedido.get(i).getPrecio() + "k" + "\tCalorias: "+ itemsPedido.get(i).getCalorias());
	    			totalMoney = itemsPedido.get(i).getPrecio() + totalMoney;
	    			totalCalories = itemsPedido.get(i).getCalorias() + totalCalories;
	    		}
	    		pw.println("________________________________________________________\n");
	    		pw.println("Precio Total: $" + totalMoney + "k");
	    		pw.println("Calorias Totales: " + totalCalories);

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           try {
	           // Nuevamente aprovechamos el finally para 
	           // asegurarnos que se cierra el fichero.
	           if (null != fichero)
	              fichero.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	        }
	}
	
	public void generarInformacion(){
		
		FileWriter fichero = null;
        PrintWriter pw = null;
        int totalMoney = 0;
        int totalCalories = 0;
        try
        {
            fichero = new FileWriter("./data/informacion.txt");
            pw = new PrintWriter(fichero);
            
			pw.println("CORRAL UNIANDES\n" );
			pw.println("La Información de su pedido es: ");
			pw.println("________________________________________________________\n");
			pw.println("Nombre del Cliente: " + nombreCliente);
			pw.println("Direccion del Cliente: " + direccionCliente);
			pw.println("Idenficacion: " + idPedido);
			pw.println("________________________________________________________\n");

    		for (int i = 0; i < itemsPedido.size(); i++)
    		{
    			pw.println(itemsPedido.get(i).getNombre() + "\tCosto Unidad: $"+ itemsPedido.get(i).getPrecio() + "k" + "\tCalorias: "+ itemsPedido.get(i).getCalorias());
    			totalMoney = itemsPedido.get(i).getPrecio() + totalMoney;
    			totalCalories = itemsPedido.get(i).getCalorias() + totalCalories;
    		}
    		pw.println("________________________________________________________\n");
    		pw.println("Precio Total: $" + totalMoney + "k");
    		pw.println("Calorias Totales: " + totalCalories);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
}
	
}
