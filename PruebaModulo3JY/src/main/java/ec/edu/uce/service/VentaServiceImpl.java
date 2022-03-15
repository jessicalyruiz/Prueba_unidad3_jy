package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.uce.modelo.DetalleVenta;
import ec.edu.uce.modelo.Producto;
import ec.edu.uce.modelo.ReporteVenta;
import ec.edu.uce.modelo.Venta;
import ec.edu.uce.repository.IDetalleRepo;
import ec.edu.uce.repository.IVentaRepo;

@Service
public class VentaServiceImpl implements IVentaService{

	@Autowired
	private IVentaRepo ventaRepo;
	
	@Autowired
	private IDetalleRepo detalleRepo;

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

	@Override
	@Transactional
	public void realizarVenta(Producto producto, Integer cantidad, String cedulaCliente, String numeroVenta) {
		// TODO Auto-generated method stub
		//Se  debe  controlar  que  la  cantidad  de  venta  de  un Productosea  menor  o  igual  que  el  stock disponible
		if(producto.getStock()>=cantidad) {
			Venta venta=new Venta();
			venta.setCedulaCliente(cedulaCliente);
			venta.setFecha(LocalDateTime.now());
			venta.setNumero(numeroVenta);
			//venta.setTotalVenta(null);
			ventaRepo.create(venta);
			
			DetalleVenta detalle=new DetalleVenta();
			detalle.setCantidad(cantidad);
			detalle.setPrecioUnitario(producto.getPrecio());
			detalle.setSubtotal(null);
			detalleRepo.create(detalle);
			
		}else {
			throw new IndexOutOfBoundsException();
		}
	}

	@Override
	public Stream<Producto> reporteDeVenta(LocalDateTime fecha, String categoria, Integer cantidad) {
		// TODO Auto-generated method stub
		List<Venta> venta=this.buscarFecha(fecha);
		Stream ventaFiltrada= venta.stream().filter(v->v.getProductos());
		ReporteVenta reporte= new ReporteVenta();
		reporte.setCantidad(cantidad);
		reporte.setCategoria(categoria);
		
		
		
		return ventaFiltrada;
		
	}

	@Override
	public List<Venta> buscarFecha(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return this.ventaRepo.buscarFecha(fecha);
	}
}
