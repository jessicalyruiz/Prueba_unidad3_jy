package ec.edu.uce;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Producto;
import ec.edu.uce.service.IProductoService;

@SpringBootApplication
public class PruebaModulo3JyApplication implements CommandLineRunner{
	private static final Logger LOG= LoggerFactory.getLogger(PruebaModulo3JyApplication.class);
	
	@Autowired
	IProductoService productoService;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaModulo3JyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		LOG.info("ok");
		Producto producto1=new Producto();
		producto1.setCategoria("lacteos");
		producto1.setNombre("queso");
		producto1.setCodigoBarras("123456789");
		producto1.setPrecio(new BigDecimal(2.5));
		producto1.setStock(Integer.valueOf(5));
		
		
		Producto producto2=new Producto();
		producto2.setCategoria("lacteos");
		producto2.setNombre("queso");
		producto2.setCodigoBarras("123456789");
		producto2.setPrecio(new BigDecimal(2.5));
		producto2.setStock(Integer.valueOf(10));
		
		Producto producto3=new Producto();
		producto3.setCategoria("carnes");
		producto3.setNombre("pollo");
		producto3.setCodigoBarras("987654321");
		producto3.setPrecio(new BigDecimal(5.40));
		producto3.setStock(Integer.valueOf(100));
		
		
		Producto producto4=new Producto();
		producto4.setCategoria("carnes");
		producto4.setNombre("pollo");
		producto4.setCodigoBarras("987654321");
		producto4.setPrecio(new BigDecimal(5.40));
		producto4.setStock(Integer.valueOf(100));
		
		this.productoService.ingresarProducto(producto4);
		this.productoService.ingresarProducto(producto3);
		this.productoService.ingresarProducto(producto2);
		this.productoService.ingresarProducto(producto1);
		 
		 */
		
	}

}
