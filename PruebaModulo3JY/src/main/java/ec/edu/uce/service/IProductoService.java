package ec.edu.uce.service;

import ec.edu.uce.modelo.Producto;

public interface IProductoService {

	public void create(Producto producto);
	public Producto read(Integer id); 
	public void update(Producto producto); 
	public void delete(Integer id); 
	
	public Producto encontrarPorNombre(String nombre);
	public Producto encontrarPorCodigoBarras(String codigo);
	public void ingresarProducto(Producto producto);
}
