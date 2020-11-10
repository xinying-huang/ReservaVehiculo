package Operacion;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import ILF.Cliente;


public class AltaCliente {
	File BBDD_Cliente;
	FileWriter fw;
	PrintWriter pw;

	public AltaCliente(){
		BBDD_Cliente=new File("base de cliente");
		try {
			this.fw=new FileWriter(BBDD_Cliente);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.pw=new PrintWriter(fw);

	}
	public void Alta(Cliente c) {
		pw.print("NOMBRE : "+c.getNombre());
		pw.print('\n');
		pw.print("DNI/CIF : " + c.getIDCliente());
		pw.print('\n');
		pw.print("TARJETA : "+c.getTarjetaBancaria());
		pw.print('\n');

		pw.print("TIPO : "+c.getTipo());
		pw.print('\n'); 
		pw.print("TELEFONO : "+c.getTelefono());
		pw.print('\n');
		if(!c.getEmail().isEmpty()) {
			pw.print("EMAIL : "+c.getEmail());
			pw.print('\n');
		}
		else {
			pw.print("EMAIL : "+"null\n");
		}
		pw.print("-\n");
	}

	public void Close() throws IOException  {
		fw.close();
		pw.close();
	}
	
//	public static void main(String [ ] args) throws IOException {
//		Cliente client= new Cliente("x123","indivial","Ana","12345678901234","600600600","a@gmail.com");
//		Cliente client1= new Cliente("y224","indivial","Maria","12345678901234","600600600","a@gmail.com");
//		AltaCliente a = new AltaCliente();		
//		a.Alta(client);	
//		a.Alta(client1);
//		a.Close();
//	}
}
