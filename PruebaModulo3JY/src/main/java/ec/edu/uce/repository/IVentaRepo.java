package ec.edu.uce.repository;


import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.Venta;

public interface IVentaRepo {

	public void create(Venta venta);
	public Venta read(Integer id); 
	public void update(Venta venta); 
	public void delete(Integer id); 
	
	public List<Venta> buscarFecha(LocalDateTime fecha);
}
