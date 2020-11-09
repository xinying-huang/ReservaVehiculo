package ILF;

public class Cliente {
private int IDCliente;
private String tipo;
private String nombre;
private int tarjetaBancaria;
private int telefono;
private String email;




public double getIDCliente() {
	return IDCliente;
}

public void setIDCliente(int iDCliente) {
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

public int getTarjetaBancaria() {
	return tarjetaBancaria;
}

public void setTarjetaBancaria(int tarjetaBancaria) {
	this.tarjetaBancaria = tarjetaBancaria;
}

public int getTelefono() {
	return telefono;
}

public void setTelefono(int telefono) {
	this.telefono = telefono;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

}
