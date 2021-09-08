package modelo;

import java.util.ArrayList;
import modelo.ProductoMenu;

public class Combo implements Producto {
	
	//Atributos//
	private double descuento;
	
	private String nombreCombo;
	
	private ArrayList<Producto> itemsCombo;
	
	
	// Constructor //
	
	public Combo(String nombre, double descuento, ArrayList<Producto> itemsCombo) {
		
		this.nombreCombo = nombre;
		this.descuento = descuento;
		this.itemsCombo = itemsCombo;
	}
	
	
	// Metodos //
	
	public void agregarItemACombo(Producto itemCombo){
		
	}
	
	public String getNombre() {
		
		return nombreCombo;
	}
	
	public int getPrecio() {
		
		return 0;
	}
	
	public String generarTextoFactura() {
		
		return "a";	
	}
	

	
	
	
	
	
	
	
	
}
