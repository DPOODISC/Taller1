package modelo;

import java.util.ArrayList;

public class ProductoAjustado implements Producto{
	
	private ArrayList<Ingrediente> agregados;
	
	private ArrayList<Ingrediente> eliminados;
	
	private ProductoMenu base;
	
	
	public int getPrecio() {
		
		return 0;
	}
	
	public String getNombre() {
		
		return "a";
	}
	
	public String generarTextoFactura() {
		
		return "a";	
	}

}
