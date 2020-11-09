package interfaz;
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
	private String BBDD;
	String nombreCompleto;
	static int tarjetaBancaria;//Tarjeta 13-19
	String telefono;//9 digito
	static String email;//contiene @
	String tipoCliente;
	String ID;
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
		pw.print(c.getNombre());
		pw.print('\n');
		pw.print(c.getIDCliente());
		pw.print('\n');
		if(c.getTarjetaBancaria().length()>=13 && c.getTarjetaBancaria().length()<=19) {
			pw.print(c.getTarjetaBancaria());
			pw.print('\n');
		}
		else {
			pw.print("null\n");
		}
		pw.print(c.getTipo());
		pw.print('\n'); 
		if(c.getTelefono().length()==9) {
			pw.print(c.getTelefono());
			pw.print('\n');
		}
		else {
			pw.print("null\n");
		}
		if(!c.getEmail().isEmpty() && emailCorrecto(c.getEmail())) {
			pw.print(c.getEmail());
			pw.print('\n');
		}
		else {
			pw.print("null\n");
		}
		pw.print("-\n");
	}
	
	public void Close() throws IOException  {
		fw.close();
		pw.close();
		
	}
	
	public static boolean emailCorrecto(String email) {
		boolean encontrado=false;
		for(int i=0; i<email.length()&&!encontrado;i++) {
			encontrado=(email.charAt(i)=='@');
		}
		return encontrado;
	}
	public static void main(String [ ] args) throws IOException {
		Cliente client= new Cliente("x123","indivial","Ana","12345678901234","600600600","a@gmail.com");
		Cliente client1= new Cliente("y224","indivial","Maria","12345678901234","600600600","a@gmail.com");
		AltaCliente a = new AltaCliente();		
		a.Alta(client);	
		a.Alta(client1);
		a.Close();
	}
}
