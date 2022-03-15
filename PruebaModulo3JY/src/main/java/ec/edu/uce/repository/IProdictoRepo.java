package ec.edu.uce.repository;


import ec.edu.uce.modelo.Producto;

public interface IProdictoRepo {

	public void create(Producto producto);
	public Producto read(Integer id); 
	public void update(Producto producto); 
	public void delete(Integer id); 
	
	public Producto encontrarPorNombre(String nombre); 
	public Producto encontrarPorCodigoBarras(String codigo); 
	
}
