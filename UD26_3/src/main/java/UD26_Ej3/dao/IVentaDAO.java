package UD26_Ej3.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import UD26_Ej3.dto.Venta;

public interface IVentaDAO extends JpaRepository<Venta, String>{

	Optional<Venta> findById(int codigo);

	void deleteById(int codigo);

}
