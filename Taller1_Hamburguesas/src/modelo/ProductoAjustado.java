package modelo;

import java.util.ArrayList;

public class ProductoAjustado implements Producto{
	
	
	// Atributos //
	
	private ArrayList<Ingrediente> agregados;
	
	private ArrayList<Ingrediente> eliminados;
	
	private ProductoMenu base;
	
	
	// Constructor //
	
	public ProductoAjustado() {
		
	}
	
	// Metodos //
	
	public String getNombre() {
		
		return "a";
	}
	
	public int getPrecio() {
		
		return 0;
	}
	
	public String generarTextoFactura() {
		
		return "a";	
	}

}
