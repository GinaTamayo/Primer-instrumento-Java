import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;


/*¬1. Haga un algoritmo que solicite el nombre, documento, edad y profesión de n personas e imprima la siguiente información:
- Total personas registradas
- Cantidad de personas ingresadas
- Cantidad de personas mayores de edad
- Cantidad de personas menores de edad. 
*/



public class Problema1 {
	static HashMap<String, ArrayList<String>> datosPersona;
	static int mayoresEdad = 0, menoresEdad = 0;
	public static void main(String args[]) {
		datosPersona = new HashMap<String, ArrayList<String>>();
		ingresoNuevo();
	}
	
	
	public static void ingresoNuevo() {
		String continuar;
          do {
        	  int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar cantidad de personas a registrar"));
    		  for (int i = 0; i < cantidad; i++) {
    				solicitdDatos();
    		 }
    		  continuar = continuidad();
    		  
		} while (continuar.equalsIgnoreCase("si"));
          imprimirResultados();
	} 
	public static String continuidad() {
		return JOptionPane.showInputDialog("Ingrese si para seguir registrando");
	}
	
	
	public static void solicitdDatos() {
		String documento = JOptionPane.showInputDialog("Ingresar documento de identidad");
		String nombre = JOptionPane.showInputDialog("Ingresar nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad"));
		String profesion = JOptionPane.showInputDialog("Ingresar profesion");
		
		ArrayList<String> datosPersonales = new ArrayList<String>();
		datosPersonales.add(nombre);
	    datosPersonales.add(Integer.toUnsignedString(edad));
		datosPersonales.add(profesion);
		
		datosPersona.put(documento, datosPersonales);
		mayorEdad(edad);
		menorEdad(edad);
		
	}
	public static void mayorEdad(int edad) {
		if (edad >= 18) {
			mayoresEdad++;
		}
	}
	public static void menorEdad(int edad) {
		if (edad <= 18) {
			menoresEdad++;
		}
	}
	public static void imprimirResultados() {
		
		System.out.println("Cantidad total personas: "+ datosPersona.size());
		System.out.println("cantidad mayores de edad:"+ mayoresEdad);
		System.out.println("cantidad menores de edad:"+ menoresEdad);
		
		}
}
