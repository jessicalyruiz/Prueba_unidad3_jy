package ec.edu.uce.repository;

import ec.edu.uce.modelo.DetalleVenta;

public interface IDetalleRepo {

	public void create(DetalleVenta detalleVenta);
	public DetalleVenta read(Integer id); 
	public void update(DetalleVenta detalleVenta); 
	public void delete(Integer id); 
}
