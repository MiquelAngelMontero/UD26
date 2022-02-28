package UD26_Ej3.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import UD26_Ej3.dto.Productos;

public interface IProductosDAO extends JpaRepository<Productos, String>{

	Optional<Productos> findById(int codigo);

	void deleteById(int codigo);

}
