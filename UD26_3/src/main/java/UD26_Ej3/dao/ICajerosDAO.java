package UD26_Ej3.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import UD26_Ej3.dto.Cajeros;

public interface ICajerosDAO extends JpaRepository<Cajeros, String>{

	Optional<Cajeros> findById(int codigo);

	void deleteById(int codigo);

}
