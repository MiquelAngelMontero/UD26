package UD26_Ej3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import UD26_Ej3.dto.Cajeros;

public class CajerosServiceIMPL implements ICajerosService{

	@Autowired
	ICajerosDAO iCajerosDAO;
	@Override
	public List<Cajeros> listarCajeros() {
		return iCajerosDAO.findAll();
	}

	@Override
	public Cajeros guardarCajeros(Cajeros Cajeros) {
		return iCajerosDAO.save(Cajeros);
	}

	@Override
	public Cajeros CajerosXID(int id) {
		return iCajerosDAO.findById(id).get();
	}

	@Override
	public Cajeros actualizarCajeros(Cajeros Cajeros) {
		return iCajerosDAO.save(Cajeros);
	}

	@Override
	public void eliminarCajeros(int id) {
		iCajerosDAO.deleteById(id);
	}

}
