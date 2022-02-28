package UD26_Ej3.dto;

import javax.persistence.*;

@Entity
@Table(name="Venta")
public class Venta {

	@ManyToOne
	@JoinColumn(name = "cajero")
	Cajeros cajeros;
	
	@ManyToOne
	@JoinColumn(name = "Maquinas_Registradoras")
	Maquinas_Registradoras maquinas_Registradoras;
	
	@ManyToOne
	@JoinColumn(name = "Productos")
	Productos productos;

	public Venta() {
		
	}
	
	public Venta(Cajeros cajeros, Maquinas_Registradoras maquinas_Registradoras, Productos productos) {
		this.cajeros = cajeros;
		this.maquinas_Registradoras = maquinas_Registradoras;
		this.productos = productos;
	}

	public Cajeros getCajeros() {
		return cajeros;
	}

	public void setCajeros(Cajeros cajeros) {
		this.cajeros = cajeros;
	}

	public Maquinas_Registradoras getMaquinas_Registradoras() {
		return maquinas_Registradoras;
	}

	public void setMaquinas_Registradoras(Maquinas_Registradoras maquinas_Registradoras) {
		this.maquinas_Registradoras = maquinas_Registradoras;
	}

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Venta [cajeros=" + cajeros + ", maquinas_Registradoras=" + maquinas_Registradoras + ", productos="
				+ productos + "]";
	}
	
}
