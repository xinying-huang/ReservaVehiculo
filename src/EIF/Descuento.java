package EIF;

public class Descuento {
	String tipoCliente;
	String descuentoAplicado;
	
	public Descuento(String tipoCliente, String descuentoAplicado) {
		this.tipoCliente = tipoCliente;
		this.descuentoAplicado = descuentoAplicado;
	}
	
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	public String getDescuentoAplicado() {
		return descuentoAplicado;
	}
	public void setDescuentoAplicado(String descuentoAplicado) {
		this.descuentoAplicado = descuentoAplicado;
	}
	
}
