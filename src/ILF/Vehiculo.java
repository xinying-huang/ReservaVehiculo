package ILF;
import EIF.*;
public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	private Gama gama;
	private int cantidad;
	private String estado;
	private OpcionesModeloCoche opcionDeModelo;
	
	
	public Vehiculo(String matricula,String marca,String modelo,Gama gama,int cantidad,String estado,OpcionesModeloCoche opcionDeModelo) {
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

	public Gama getGama() {
		return gama;
	}

	public void setGama(Gama gama) {
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

	public OpcionesModeloCoche getOpcionDeModelo() {
		return opcionDeModelo;
	}

	public void setOpcionDeModelo(OpcionesModeloCoche opcionDeModelo) {
		this.opcionDeModelo = opcionDeModelo;
	}
	

}
