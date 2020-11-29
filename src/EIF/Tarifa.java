package EIF;

public class Tarifa {
	String periodo;
	double kilometraje;
	String duracion;// dia
	String tipoTarifa;
	double cuantia; // por hora o dia
	
	public Tarifa(String periodo, double kilometraje, String duracion, String tipoTarifa, double cuantia) {
		this.periodo = periodo;
		this.kilometraje = kilometraje;
		this.duracion = duracion;
		this.tipoTarifa = tipoTarifa;
		this.cuantia = cuantia;
	}
	
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public double getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getTipoTarifa() {
		return tipoTarifa;
	}
	public void setTipoTarifa(String tipoTarifa) {
		this.tipoTarifa = tipoTarifa;
	}
	public double getCuantia() {
		return cuantia;
	}
	public void setCuantia(double cuantia) {
		this.cuantia = cuantia;
	}
	
}
