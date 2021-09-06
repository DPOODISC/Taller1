package modelo;

import java.util.ArrayList;

public class Combo implements Producto {
	
	//Atributos//
	private double descuento;
	
	private String nombreCombo;
	
	private ArrayList<ProductoMenu> itemsCombo;
	
	
	// Constructor //
	
	public Combo(String nombre, double descuento) {
		
	}
	
	
	// Metodos //
	
	public void agregarItemACombo(Producto itemCombo){
		
	}
	
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
