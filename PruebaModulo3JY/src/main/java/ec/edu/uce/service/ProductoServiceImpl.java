package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Producto;
import ec.edu.uce.repository.IProdictoRepo;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProdictoRepo productoRepo;

	@Override
	public void create(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepo.create(producto);
	}

	@Override
	public Producto read(Integer id) {
		// TODO Auto-generated method stub
		return this.productoRepo.read(id);
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepo.update(producto);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.productoRepo.delete(id);
	}
}
