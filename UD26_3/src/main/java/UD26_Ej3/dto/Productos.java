package UD26_Ej3.dto;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Productos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Codigo;
	@Column(name = "Nombre")
	private String nombre;
	@Column(name = "Precio")
	private int precio;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Productos> productos;
	
	public Productos() {
		
	}
	
	public Productos(int codigo, String nombre, int precio, List<Productos> productos) {
		Codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.productos = productos;
	}
	
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Productos [Codigo=" + Codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
}