package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.DetalleVenta;
import ec.edu.uce.repository.IDetalleRepo;



@Service
public class DetalleServiceImpl implements IDetalleService{

	@Autowired
	private IDetalleRepo detalleRepo;

	@Override
	public void create(DetalleVenta detalleVenta) {
		// TODO Auto-generated method stub
		this.detalleRepo.create(detalleVenta);
	}

	@Override
	public DetalleVenta read(Integer id) {
		// TODO Auto-generated method stub
		return this.detalleRepo.read(id);
	}

	@Override
	public void update(DetalleVenta detalleVenta) {
		// TODO Auto-generated method stub
		this.detalleRepo.update(detalleVenta);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.detalleRepo.delete(id);
	}
}
