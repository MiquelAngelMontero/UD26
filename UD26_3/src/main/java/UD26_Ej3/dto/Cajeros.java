package UD26_Ej3.dto;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Cajeros {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Codigo;
	@Column(name = "NomApels")
	private String nomApels;
}
