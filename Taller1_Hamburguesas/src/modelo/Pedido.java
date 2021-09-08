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
	
	private int getPrecioNetoPedido() {
		
		return 0;
	}
	
	private int getPrecioTotalPedido() {
		
		return 0;
	}
	
	private int getPrecioIVAPedido() {
		
		return 0;
	}
	
	public void generarTextoFactura(){
			
			FileWriter fichero = null;
	        PrintWriter pw = null;
	        try
	        {
	            fichero = new FileWriter("./data/recibo.txt");
	            pw = new PrintWriter(fichero);

        		for (int i = 0; i < itemsPedido.size(); i++)
        		{
        			pw.println(itemsPedido.get(i).getNombre());
        			pw.println(idPedido);
        		}

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
        try
        {
            fichero = new FileWriter("./data/informacion.txt");
            pw = new PrintWriter(fichero);

    		for (int i = 0; i < itemsPedido.size(); i++)
    		{
    			pw.println(itemsPedido.get(i).getNombre());
    			pw.println(idPedido);
    		}

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
