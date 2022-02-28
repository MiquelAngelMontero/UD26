package UD26_Ej3.dto;

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
}