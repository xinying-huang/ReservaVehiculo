package Operacion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import EIF.*;
import ILF.Vehiculo;

public class AltaVehiculo {
//	ArrayList <Vehiculo>vehiculos;
//	int pos=0;
	File BBDD_Vehiculo;
	FileWriter fw;
	PrintWriter pw;
	public AltaVehiculo(){
//		vehiculos=new ArrayList<Vehiculo>();
		BBDD_Vehiculo=new File("base de vehiculo");
		try {
			this.fw=new FileWriter(BBDD_Vehiculo);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.pw=new PrintWriter(fw);
//		System.out.print("Informaci�n del vehiculo\n\n");
	}
	public void Alta(Vehiculo v) {
		if(v.getOpcionDeModelo().getCambio().isEmpty()) {
			v.getOpcionDeModelo().setCambio("cambio manual");
		}
//		vehiculos.add(v);
		
		pw.print("MATRICULA: "+v.getMatricula()+'\n');
		pw.print("MARCA: "+v.getMarca()+'\n');
		pw.print("MODELO: "+v.getModelo()+'\n');
		pw.print("GAMA: "+v.getGama().getClasificacion()+'\n');
		pw.print("ESTADO: "+v.getEstado()+'\n');
		pw.print("TECHO SOLAR: "+v.getOpcionDeModelo().getTechoSolar()+"\n");
		pw.print("CAMBIO DE MARCHA: "+v.getOpcionDeModelo().getCambio()+'\n');
		pw.print("CAPACIDAD DE AFORO: "+v.getOpcionDeModelo().getCapacidadAforo()+"\n-\n");
	}

//	public void imprimir(int pos) {		
//		System.out.print("Matricula:"+vehiculos.get(pos).getMatricula()+'\n');
//		pw.print(vehiculos.get(pos).getMatricula()+'\n');
//		
//		System.out.print("Marca:"+vehiculos.get(pos).getMarca()+'\n');
//		pw.print(vehiculos.get(pos).getMarca()+'\n');
//		
//		System.out.print("Modelo:"+vehiculos.get(pos).getModelo()+'\n');
//		pw.print(vehiculos.get(pos).getModelo()+'\n');
//		
//		System.out.print("Gama:"+vehiculos.get(pos).getGama().getClasificacion()+'\n');
//		pw.print(vehiculos.get(pos).getGama().getClasificacion()+'\n');
//		
//		System.out.print("Estado:"+vehiculos.get(pos).getEstado()+'\n');
//		pw.print(vehiculos.get(pos).getEstado()+'\n');
//		
//		System.out.print("Techo solar:"+vehiculos.get(pos).getOpcionDeModelo().getTechoSolar()+'\n');
//		pw.print(vehiculos.get(pos).getOpcionDeModelo().getTechoSolar()+"\n");
//		
//		System.out.print("Cambio de mancha:"+vehiculos.get(pos).getOpcionDeModelo().getCambio()+'\n');
//		pw.print(vehiculos.get(pos).getOpcionDeModelo().getCambio()+'\n');
//		
//		System.out.print("Capacidad de aforo:"+vehiculos.get(pos).getOpcionDeModelo().getCapacidadAforo()+"\n\n");
//		pw.print(vehiculos.get(pos).getOpcionDeModelo().getCapacidadAforo()+"\n-\n");
//	}
	
	public void close() {
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.close();
	}
//	public ArrayList<Vehiculo> getDatosVehiculos(){
//		return vehiculos;
//	}
//	public static void main(String [ ] args) throws IOException {
//		Gama gama=new Gama("Alta");
//		OpcionesModeloCoche opciones=new OpcionesModeloCoche(true, "Cambio autom�tico",3 );
//		Vehiculo vehicle= new Vehiculo("0000 ABC","Audi","A5 FSI QUATTRO 3.2",gama,"disponible",opciones);
//		AltaVehiculo a = new AltaVehiculo();		
//		a.Alta(vehicle);
////		a.imprimir(0);
//		Gama gama2=new Gama("Media");
//		OpcionesModeloCoche opciones2=new OpcionesModeloCoche(false, "",5);
//		Vehiculo vehicle2= new Vehiculo("1111 ABC","SEAT","Le�n",gama,"disponible",opciones);
//		//AltaVehiculo a = new AltaVehiculo();		
//		a.Alta(vehicle);
////		a.imprimir(0);		
//		a.close();
//	}
}
