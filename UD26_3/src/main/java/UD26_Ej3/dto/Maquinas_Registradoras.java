package UD26_Ej3.dto;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "maquinas_tegistradoras")
public class Maquinas_Registradoras {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Codigo;
	@Column(name = "Piso")
	private int piso;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Maquinas_Registradoras> maquinas_Registradoras;
	
	public Maquinas_Registradoras() {
		
	}
	
	public Maquinas_Registradoras(int codigo, int piso, List<Maquinas_Registradoras> maquinas_Registradoras) {
		super();
		Codigo = codigo;
		this.piso = piso;
		this.maquinas_Registradoras = maquinas_Registradoras;
	}
	
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	@Override
	public String toString() {
		return "Maquinas_Registradoras [Codigo=" + Codigo + ", piso=" + piso + "]";
	}
	
}
