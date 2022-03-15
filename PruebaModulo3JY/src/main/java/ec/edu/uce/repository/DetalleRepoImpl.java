package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.DetalleVenta;

@Repository
@Transactional
public class DetalleRepoImpl implements IDetalleRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void create(DetalleVenta detalleVenta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(detalleVenta);
	}

	@Override
	public DetalleVenta read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(DetalleVenta.class, id);
	}

	@Override
	public void update(DetalleVenta detalleVenta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(detalleVenta);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}

}
