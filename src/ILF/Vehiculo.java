package ILF;

public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	private String gama;
	private int cantidad;
	private String estado;
	private String opcionDeModelo;
	
	
	public Vehiculo(String matricula,String marca,String modelo,String gama,int cantidad,String estado,String opcionDeModelo) {
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
		this.gama=gama;
		this.cantidad=cantidad;
		this.estado=estado;
		this.opcionDeModelo=opcionDeModelo;
		
	}
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getOpcionDeModelo() {
		return opcionDeModelo;
	}

	public void setOpcionDeModelo(String opcionDeModelo) {
		this.opcionDeModelo = opcionDeModelo;
	}
	

}
