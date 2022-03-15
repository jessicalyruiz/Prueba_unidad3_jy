package ec.edu.uce.modelo;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



/**
 * @author Jessirena
 *
 */
@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_product")
	@SequenceGenerator(sequenceName = "seq_product", name = "seq_product",allocationSize = 1)
	@Column(name = "prod_id")
	private Integer id;
	
	
	@Column(name = "prod_codigo_barras")
	private String codigoBarras;
	
	@Column(name = "prod_categoria")
	private String categoria;
	
	@Column(name = "prod_stock")
	private Integer stock;
	
	@Column(name = "prod_precio")
	private BigDecimal precio;

	@ManyToOne
	@JoinColumn(name = "prod_fk_detalle")
	private DetalleVenta detalle; 
	
	
	public DetalleVenta getDetalle() {
		return detalle;
	}

	public void setDetalle(DetalleVenta detalle) {
		this.detalle = detalle;
	}

	//GET Y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", codigoBarras=" + codigoBarras + ", categoria=" + categoria + ", stock=" + stock
				+ ", precio=" + precio + "]";
	}
	
	
}
