package net.codejava.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "FACCION")
public class Faccion {

	private int faccion_id;
	private String nombre_faccion;
	private String lore;
	
	@Column(name = "FACCION_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getFaccion_id() {
		return faccion_id;
	}
	public void setFaccion_id(int faccion_id) {
		this.faccion_id = faccion_id;
	}
	
	@Column(name = "NOMBRE_FACCION")
	public String getNombre_faccion() {
		return nombre_faccion;
	}
	public void setNombre_faccion(String nombre_faccion) {
		this.nombre_faccion = nombre_faccion;
	}
	
	@Column(name = "LORE")
	public String getLore() {
		return lore;
	}
	public void setLore(String lore) {
		this.lore = lore;
	}
	
}
