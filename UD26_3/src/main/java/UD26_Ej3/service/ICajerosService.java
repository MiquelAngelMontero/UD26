package UD26_Ej3.service;

import java.util.List;
import UD26_Ej3.dto.Cajeros;

public interface ICajerosService {

	public List<Cajeros> listarCajeros();

	public Cajeros guardarCajeros(Cajeros Cajeros);

	public Cajeros CajerosXID(int Codigo);

	public Cajeros actualizarCajeros(Cajeros Cajeros);

	public void eliminarCajeros(int Codigo);
}