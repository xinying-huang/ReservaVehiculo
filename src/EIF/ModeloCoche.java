package EIF;

public class ModeloCoche {
	private String nombreMarca;
	private String nombreModelo;
	
	
	public ModeloCoche(String nombreMarca,String nombreModelo) {
		this.nombreMarca=nombreMarca;
		this.nombreModelo=nombreModelo;
		
	}
	public String getNombreMarca() {
		return nombreMarca;
	}
	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}
	public String getNombreModelo() {
		return nombreModelo;
	}
	public void setNombreModelo(String nombreModelo) {
		this.nombreModelo = nombreModelo;
	}
	

}
