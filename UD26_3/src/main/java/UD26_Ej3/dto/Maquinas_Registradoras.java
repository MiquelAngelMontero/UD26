package UD26_Ej3.dto;

import javax.persistence.*;

@Entity
@Table(name = "maquinas_tegistradoras")
public class Maquinas_Registradoras {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Codigo;
	@Column(name = "Piso")
	private int piso;
}
