package modelo;

import java.util.ArrayList;
import modelo.ProductoMenu;

public class Combo implements Producto {
	
	//Atributos//
	private String descuento;
	
	private String nombreCombo;
	
	private ArrayList<ProductoMenu> itemsCombo;
	
	
	// Constructor //
	
	public Combo(String nombre, String descuento, ArrayList<ProductoMenu> itemsCombo) {
		
		this.nombreCombo = nombre;
		this.descuento = descuento;
		this.itemsCombo = itemsCombo;
	}
	
	
	// Metodos //
	
	public void agregarItemACombo(ProductoMenu itemCombo){
		
	}
	
	public String getNombre() {
		
		return nombreCombo;
	}
	
	public int getPrecio() {
		
		return 0;
	}
	
	public String generarTextoFactura() {
		
		return null;	
	}
	

	
	
	
	
	
	
	
	
}
