package OPERACION;

import java.util.ArrayList;

import EIF.Gama;
import EIF.OpcionesModeloCoche;
import ILF.Vehiculo;

public class ConsultaVehiculo {
	ArrayList <Vehiculo>vehiculos;
	int pos=0;

	public ConsultaVehiculo() {
		vehiculos=new ArrayList<Vehiculo>();
	}

	public void addBasededato() {
		//------v1
		Gama gama=new Gama("Alta");
		OpcionesModeloCoche opciones=new OpcionesModeloCoche(true, "Cambio automático",3 );
		Vehiculo vehicle= new Vehiculo("0000 ABC","Audi","A5",gama,"disponible",opciones);
		//------v2
		Gama gama2=new Gama("Media");
		OpcionesModeloCoche opciones2=new OpcionesModeloCoche(false, "cambio manual",5);
		Vehiculo vehicle2= new Vehiculo("1111 ABC","SEAT","S1",gama2,"disponible",opciones2);
		//------v3
		OpcionesModeloCoche opciones3=new OpcionesModeloCoche(true, "cambio automático",2);
		Vehiculo vehicle3= new Vehiculo("2222 ABC","SEAT","S1",gama2,"en mantenimiento",opciones3);
		//------v4
		Gama gama4=new Gama("Baja");
		OpcionesModeloCoche opciones4=new OpcionesModeloCoche(true, "cambio manual",2);
		Vehiculo vehicle4= new Vehiculo("3333 ABC","BMW","X3",gama4,"estropeado",opciones4);
		//------
		addArray(vehicle3);
		addArray(vehicle2);
		addArray(vehicle);
		addArray(vehicle4);
	}

	public void addArray(Vehiculo v) {
		vehiculos.add(v);
	}
	public ArrayList<Vehiculo> getDatosVehiculos(){
		return vehiculos;
	}
	public String consulta(String marca, String modelo, String gama){
		ArrayList<Vehiculo> filtro3=new ArrayList<Vehiculo>();	
		//filtrar
		for(int i=0;i<vehiculos.size();i++) {
			if(vehiculos.get(i).getMarca().equals(marca) && vehiculos.get(i).getModelo().equals(modelo) && vehiculos.get(i).getGama().getClasificacion().equals(gama)) {
				filtro3.add(vehiculos.get(i));
			}
		}			

		//imprimir
		String res="";
		for(int i = 0; i < filtro3.size(); i++)
		{
			res=res +"Matricula" + filtro3.get(i).getMatricula()
					+"\nMarca : "+filtro3.get(i).getMarca()
					+"\nModelo : "+filtro3.get(i).getModelo()
					+"\nGama : "+filtro3.get(i).getGama().getClasificacion()
					+"\nEstado : "+filtro3.get(i).getEstado()
					+"\nTecho solar : " + filtro3.get(i).getOpcionDeModelo().getTechoSolar()
					+"\nCambio de marcha : "+ filtro3.get(i).getOpcionDeModelo().getCambio()
					+"\nCapacidad de aforo : " + filtro3.get(i).getOpcionDeModelo().getCapacidadAforo() 
					+"\n----------------------------------\n"; 	
		} 
		return res;
	}

}
