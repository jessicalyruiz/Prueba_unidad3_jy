package ec.edu.uce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Producto;

@SpringBootApplication
public class PruebaModulo3JyApplication implements CommandLineRunner{
	private static final Logger LOG= LoggerFactory.getLogger(PruebaModulo3JyApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaModulo3JyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("ok");
		Producto producto1=new Producto();
		producto1.setCategoria("lacteos");
		producto1.setCodigoBarras("123456789");
		producto1.setDetalle("leche en carton");
		
	}

}
