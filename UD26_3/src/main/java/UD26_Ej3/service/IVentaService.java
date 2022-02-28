package UD26_Ej3.service;

import java.util.List;
import UD26_Ej3.dto.Venta;

public interface IVentaService {

	public List<Venta> listarVentas();

	public Venta guardarCajeros(Venta venta);

	public Venta CajerosXID(int Codigo);

	public Venta actualizarCajeros(Venta venta);

	public void eliminarCajeros(int Codigo);
}