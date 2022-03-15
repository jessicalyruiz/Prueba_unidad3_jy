package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

import ec.edu.uce.modelo.Producto;
import ec.edu.uce.modelo.Venta;

public interface IVentaService {

	public void create(Venta venta);
	public Venta read(Integer id); 
	public void update(Venta venta); 
	public void delete(Integer id); 
	public List<Venta> buscarFecha(LocalDateTime fecha);
	void realizarVenta(Producto producto, Integer cantidad, String cedulaCliente, String numeroVenta);
	
	Stream<Producto> reporteDeVenta(LocalDateTime fecha, String categoria, Integer cantidad);
}
