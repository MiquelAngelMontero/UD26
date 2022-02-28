package UD26_Ej3.dto;

import java.util.List;
import javax.persistence.*;


@Entity
@Table(name = "cajeros")
public class Cajeros {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Codigo;
	@Column(name = "NomApels")
	private String nomApels;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Cajeros> cajeors;
	
	public Cajeros() {
		
	}
	
	public Cajeros(int codigo, String nomApels, List<Cajeros> cajeors) {
		Codigo = codigo;
		this.nomApels = nomApels;
		this.cajeors = cajeors;
	}
	
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getNomApels() {
		return nomApels;
	}
	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}
	@Override
	public String toString() {
		return "Cajeros [Codigo=" + Codigo + ", nomApels=" + nomApels + "]";
	}
	
}
