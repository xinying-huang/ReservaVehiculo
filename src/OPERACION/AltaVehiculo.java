package OPERACION;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import EIF.*;
import ILF.Vehiculo;

public class AltaVehiculo {

	File BBDD_Vehiculo;
	FileWriter fw;
	PrintWriter pw;
	public AltaVehiculo(){

		BBDD_Vehiculo=new File("base de vehiculo");
		try {
			this.fw=new FileWriter(BBDD_Vehiculo);			
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.pw=new PrintWriter(fw);
	}
	public void Alta(Vehiculo v) {
		if(v.getOpcionDeModelo().getCambio().isEmpty()) {
			v.getOpcionDeModelo().setCambio("cambio manual");
		}

		pw.print("MATRICULA: "+v.getMatricula()+'\n');
		pw.print("MARCA: "+v.getMarca()+'\n');
		pw.print("MODELO: "+v.getModelo()+'\n');
		pw.print("GAMA: "+v.getGama().getClasificacion()+'\n');
		pw.print("ESTADO: "+v.getEstado()+'\n');
		pw.print("TECHO SOLAR: "+v.getOpcionDeModelo().getTechoSolar()+"\n");
		pw.print("CAMBIO DE MARCHA: "+v.getOpcionDeModelo().getCambio()+'\n');
		pw.print("CAPACIDAD DE AFORO: "+v.getOpcionDeModelo().getCapacidadAforo()+"\n-\n");
	}


	public void close() {
		try {
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		pw.close();
	}

}
