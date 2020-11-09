package ILF;

public class Cliente {
private String IDCliente;
private String tipo;
private String nombre;
private String tarjetaBancaria;
private String telefono;
private String email;



public Cliente(String IDCliente,String tipo,String nombre,String tarjetaBancaria,String telefono,String email) {
	this.IDCliente= IDCliente;
	this.tipo=tipo;
	this.nombre=nombre;
	this.tarjetaBancaria=tarjetaBancaria;
	this.telefono=telefono;
	this.email=email;
}
public String getIDCliente() {
	return IDCliente;
}

public void setIDCliente(String iDCliente) {
	IDCliente = iDCliente;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getTarjetaBancaria() {
	return tarjetaBancaria;
}

public void setTarjetaBancaria(String tarjetaBancaria) {
	this.tarjetaBancaria = tarjetaBancaria;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

}
