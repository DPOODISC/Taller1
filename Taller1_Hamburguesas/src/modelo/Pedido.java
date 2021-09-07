package modelo;

import java.io.File;
import java.util.ArrayList;

public class Pedido{
	
	
	// Atributos //
	
	private int numeroPedidos;
	
	private int idPedido;
	
	private String nombreCliente;

	private String direccionCliente;
	
	private ArrayList<Producto> itemsPedido;
	
	
	// Constructor //
	
	public Pedido(String nombreCliente, String direccionCliente) {
	
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		
		
		int numero = (int)(Math.random()*(1000000-100000+1)+100000);
		idPedido = numero;
		
		itemsPedido = new ArrayList<Producto>();
	}
	
	
	// Metodos //
	
	public int getIdPedido() {
		
		return idPedido;
	}
	
	public void agregarProducto(Producto nuevoItem) {
		
		itemsPedido.add(nuevoItem);
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
	
	private String generarTextoFactura() {
		
		return null;
	}
	
	public void guardarFactura(File archivo) {
		
	}
	
}
