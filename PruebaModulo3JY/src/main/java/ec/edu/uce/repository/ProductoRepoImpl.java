package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Producto;

@Repository
@Transactional
public class ProductoRepoImpl implements IProdictoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void create(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public Producto read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Producto.class, id);
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(producto);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}

	@Override
	public Producto encontrarPorNombre(String nombre) {
		TypedQuery<Producto> myQuery=this.entityManager.createQuery("Select p from Producto p where p.nombre=:valor", Producto.class);
		myQuery.setParameter("valor", nombre);
		return myQuery.getSingleResult();
	}

	@Override
	public Producto encontrarPorCodigoBarras(String codigo) {
		TypedQuery<Producto> myQuery=this.entityManager.createQuery("Select p from Producto p where p.codigoBarras=:valor", Producto.class);
		myQuery.setParameter("valor", codigo);
		return myQuery.getSingleResult();
	}
}
