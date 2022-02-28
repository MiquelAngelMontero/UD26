package UD26_Ej3.service;

import java.util.List;
import UD26_Ej3.dto.Productos;

public interface IProductosService {

	public List<Productos> listarProductos();

	public Productos guardarProductos(Productos Productos);

	public Productos ProductosXID(int id);

	public Productos actualizarProductos(Productos Productos);

	public void eliminarProductos(int id);
}
