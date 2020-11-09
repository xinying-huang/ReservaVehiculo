package EIF;

public class OpcionesModeloCoche {
private String techoSolar;
private String cambio; //puede ser manual o automático
private String capacidadAforo;

public OpcionesModeloCoche(String techoSolar, String cambio,String capacidadAforo)
{
	this.techoSolar=techoSolar;
	this.cambio=cambio;
	this.capacidadAforo=capacidadAforo;
	}
public String getTechoSolar() {
	return techoSolar;
}
public void setTechoSolar(String techoSolar) {
	this.techoSolar = techoSolar;
}
public String getCambio() {
	return cambio;
}
//puede ser manual o automático
public void setCambio(String cambio) {
	this.cambio = cambio;
}
public String getCapacidadAforo() {
	return capacidadAforo;
}
public void setCapacidadAforo(String capacidadAforo) {
	this.capacidadAforo = capacidadAforo;
}



}
