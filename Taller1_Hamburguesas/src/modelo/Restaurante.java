package modelo;

import java.io.File;
import java.util.ArrayList;

public class Restaurante {
	
	
	// Atributos //
	
	private ArrayList<Combo> combos;
	
	private ArrayList<Pedido> pedidos;
	
	private ArrayList<ProductoMenu> menuBase;
	
	private ArrayList<Ingrediente> ingredientes;
	
	
	// Constructor //
	
	public Restaurante() {
		
	}
	
	
	// Metodos //
	
	public void iniciarPedido(String nombreCliente, String direccionCliente) {
		
	}
	
	public void cerrarYGuardarPedido() {
		
	}
	
	public Pedido getPedidoEnCurso() {
		
		return null;
	}
	
	public ArrayList<Producto> getMenuBase() {
		
		return null;
	}
	
	public ArrayList<Ingrediente> getIngredientes() {
		
		return null;
	}
	
	public void cargarInformacionRestaurante(File archivoIngredientes, File archivoMenu, File archivoCombos) {

	}
	
	
	private void cargarIngredientes(File archivoIngredientes) {
		
	}
	
	private void cargarMenu(File archivoMenu) {
		
	}
	
	private void cargarCombos(File archivoCombos) {
		
	}


}
