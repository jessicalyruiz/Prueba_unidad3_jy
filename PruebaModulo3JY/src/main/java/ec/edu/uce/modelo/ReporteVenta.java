package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ReporteVenta {

	 private LocalDateTime fecha;
	 private String categoria;
	 private String  CodigoBarras;
	 private Integer cantidad;
	 private  BigDecimal  precioUnitario;
	 private BigDecimal subtotal;
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCodigoBarras() {
		return CodigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		CodigoBarras = codigoBarras;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	@Override
	public String toString() {
		return "ReporteVenta [fecha=" + fecha + ", categoria=" + categoria + ", CodigoBarras=" + CodigoBarras
				+ ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", subtotal=" + subtotal + "]";
	}
	 
	 
	 
}
