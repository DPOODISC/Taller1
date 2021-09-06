package modelo;

public class ProductoMenu implements Producto {
	
	// Atributos //
	
	private String nombre;
	
	private int precioBase;
	
	
	// Constructor //
	
	public ProductoMenu() {
		
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
