package UD26_Ej3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import UD26_Ej3.dao.IMaquinas_RegistradorasDAO;
import UD26_Ej3.dto.Maquinas_Registradoras;

public class Maquinas_RegistradorasServiceIMPL implements IMaquinas_RegistradorasService{

	@Autowired
	IMaquinas_RegistradorasDAO iMaquinas_RegistradorasDAO;
	@Override
	public List<Maquinas_Registradoras> listarMaquinas_Registradoras() {
		return iMaquinas_RegistradorasDAO.findAll();
	}

	@Override
	public Maquinas_Registradoras guardarMaquinas_Registradoras(Maquinas_Registradoras Maquinas_Registradoras) {
		return iMaquinas_RegistradorasDAO.save(Maquinas_Registradoras);
	}

	@Override
	public Maquinas_Registradoras Maquinas_RegistradorasXID(int Codigo) {
		return iMaquinas_RegistradorasDAO.findById(Codigo).get();
	}

	@Override
	public Maquinas_Registradoras actualizarMaquinas_Registradoras(Maquinas_Registradoras Maquinas_Registradoras) {
		return iMaquinas_RegistradorasDAO.save(Maquinas_Registradoras);
	}

	@Override
	public void eliminarMaquinas_Registradoras(int Codigo) {
		iMaquinas_RegistradorasDAO.deleteById(Codigo);
	}

}
