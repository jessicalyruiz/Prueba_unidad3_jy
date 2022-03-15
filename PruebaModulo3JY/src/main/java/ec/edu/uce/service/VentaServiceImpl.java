package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Venta;
import ec.edu.uce.repository.IVentaRepo;

@Service
public class VentaServiceImpl implements IVentaService{

	@Autowired
	private IVentaRepo ventaRepo;

	@Override
	public void create(Venta venta) {
		// TODO Auto-generated method stub
		this.ventaRepo.create(venta);
	}

	@Override
	public Venta read(Integer id) {
		// TODO Auto-generated method stub
		return this.ventaRepo.read(id);
	}

	@Override
	public void update(Venta venta) {
		// TODO Auto-generated method stub
		this.ventaRepo.update(venta);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.ventaRepo.delete(id);
	}
}
