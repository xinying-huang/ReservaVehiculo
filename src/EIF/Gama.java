package EIF;

public class Gama {
private String clasificacion;
private double rango;

public Gama(String clasificacion, double rango) {
	this.clasificacion=clasificacion;
	this.rango=rango;
}
public String getClasificacion() {
	return clasificacion;
}
public void setClasificacion(String clasificacion) {
	this.clasificacion = clasificacion;
}
public double getRango() {
	return rango;
}
public void setRango(double rango) {
	this.rango = rango;
}
}