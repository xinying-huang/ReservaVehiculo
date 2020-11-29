package EIF;

public class OpcionExtra {
	boolean seguro;
	boolean cadenaDeNieve;
	boolean asientoDeBebe;
	boolean navegador;
	
	public OpcionExtra(boolean seguro, boolean cadenaDeNieve, boolean asientoDeBebe, boolean navegador) {
		this.seguro = seguro;
		this.cadenaDeNieve = cadenaDeNieve;
		this.asientoDeBebe = asientoDeBebe;
		this.navegador = navegador;
	}
	
	
	public boolean isSeguro() {
		return seguro;
	}
	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}
	public boolean isCadenaDeNieve() {
		return cadenaDeNieve;
	}
	public void setCadenaDeNieve(boolean cadenaDeNieve) {
		this.cadenaDeNieve = cadenaDeNieve;
	}
	public boolean isAsientoDeBebe() {
		return asientoDeBebe;
	}
	public void setAsientoDeBebe(boolean asientoDeBebe) {
		this.asientoDeBebe = asientoDeBebe;
	}
	public boolean isNavegador() {
		return navegador;
	}
	public void setNavegador(boolean navegador) {
		this.navegador = navegador;
	}
}
