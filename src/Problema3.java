import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

/*3. En la nómina de una empresa se le hace descuento a los empleados por concepto de ahorro, de acuerdo
 *  al estrato social en que vive, y según la tabla 7. Solicite el nombre de cada empleado y Calcule e imprima el valor a descontar.
Use estructuras de datos para almacenar todos los descuentos realizados e imprímalos.
*/


public class Problema3 {
	static double descuentoEstrato = 0;
	static HashMap<String, ArrayList<Double>> mapDescuento; 
	public static void main(String args[]) {
		mapDescuento = new HashMap<String, ArrayList<Double>>();
		ingresarDatos();
		imprimirDatos();
	}
	
	/*crea una lista temporal llamada datosGuardados y se le agregan los datos infgresados menos nombre que es la clave de mapDescuento,*/
	public static void solicitarDatos() {
		String nombre = JOptionPane.showInputDialog("Ingresar nombre");
		int estrato = Integer.parseInt(JOptionPane.showInputDialog("Ingresar estrato"));
		double salario =  Double.parseDouble(JOptionPane.showInputDialog("Ingresar salario"));
		
		descuento(estrato);

		ArrayList<Double> datosGuardados = new ArrayList<Double>();
		datosGuardados.add((double) estrato);
		datosGuardados.add(salario);
		datosGuardados.add(descuentoEstrato * salario);
		datosGuardados.add(salario-(descuentoEstrato * salario));

		mapDescuento.put(nombre, datosGuardados);
	}
	public static void ingresarDatos() {
		String continuar;
		do {
			int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar cantidad de trabajadores"));
			for (int i = 0; i < cantidad; i++) {
				solicitarDatos();
			}
			continuar = continuidad();
		} while (continuar.equalsIgnoreCase("si") );
	}
	
	/*solicita si desea seguir ingresando enpleados*/
	public static String continuidad() {
		return JOptionPane.showInputDialog("Ingrese si para seguir registrando");
	}
	
	
	public static void descuento(int estrato) {
		if (estrato == 1 || estrato == 2) {
			descuentoEstrato = 0.2;
		} else if (estrato == 3 || estrato == 4) {
			descuentoEstrato = 0.4;
		} else if (estrato == 5) {
			descuentoEstrato = 0.8;
		} else if (estrato == 6) {
			descuentoEstrato = 0.10;
		}
	}

/*crea una lista temporal llamada datosGuardados la cual contiene los datos guardados en mapDescuento */
	public static void imprimirDatos() {
		for (String nombre: mapDescuento.keySet()) {
			ArrayList<Double> datosGuardados = mapDescuento.get(nombre);
			int estrato = datosGuardados.get(0).intValue();
			double salario = datosGuardados.get(1);
			double descuento = datosGuardados.get(2);
			double salarioTotal = datosGuardados.get(3);
			
			System.out.println("Nombre: " + nombre);
			System.out.println("Estrato: " + estrato);
			System.out.println("Salario: " + salario);
			System.out.println("Descuento: " + descuento);
			System.out.println("Salario Total: " + salarioTotal);
			System.out.println("------------------------------------------");

		}
	}
}

//Nota: perdón por los nombres que no tienen nada que ver con la funcionalidad de los metodos pero no se me ocurrio nada más
