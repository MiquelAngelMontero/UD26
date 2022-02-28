package UD26_Ej3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import UD26_Ej3.dto.Productos;

public class ProductosServiceIMPL implements IProductosService{

	@Autowired
	IProductosDAO iProductosDAO;
	@Override
	public List<Productos> listarProductos() {
		return iProductosDAO.findAll();
	}

	@Override
	public Productos guardarProductos(Productos Productos) {
		return iProductosDAO.save(Productos);
	}

	@Override
	public Productos ProductosXID(int id) {
		return iProductosDAO.findById(id).get();
	}

	@Override
	public Productos actualizarProductos(Productos Productos) {
		return iProductosDAO.save(Productos);
	}

	@Override
	public void eliminarProductos(int id) {
		iProductosDAO.deleteById(id);
	}

}
