package UD26_Ej3.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import UD26_Ej3.dto.Maquinas_Registradoras;

public interface IMaquinas_RegistradorasDAO extends JpaRepository<Maquinas_Registradoras, String>{

	Optional<Maquinas_Registradoras> findById(int codigo);

	void deleteById(int codigo);

}
