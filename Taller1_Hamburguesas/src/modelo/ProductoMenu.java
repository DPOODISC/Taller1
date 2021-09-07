package modelo;

public class ProductoMenu implements Producto {
	
	// Atributos //
	
	private String nombre;
	
	private int precioBase;
	
	
	// Constructor //
	
	public ProductoMenu(String nombre, int precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		
	}
	
	// Metodos //
	
	public String getNombre() {
		
		return nombre;
	}
	
	public int getPrecio() {
		
		return precioBase;
	}
	
	public String generarTextoFactura() {
		
		return "a";	
	}

}
