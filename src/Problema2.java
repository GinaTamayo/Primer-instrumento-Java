import java.util.Arrays;

import javax.swing.JOptionPane;

/*2. Haga un algoritmo donde se construya un arreglo resultante de la suma de 2 arreglos del mismo tamaño,
 *  el nuevo arreglo mostrará en cada posición el resultado de la suma de las mismas posiciones de los otros 2,
 *   para el llenado de los 2 arreglos, solicite el ingreso al usuario, adicionalmente debe mostrar el contenido 
 *   de los 3 arreglos, tanto los iniciales como el resultante. */
public class Problema2 {
	static int []primerArreglo = {2,4,6,8,10};
	static int []segundoArreglo = {3,6,9,12,15};
	static int []resultado = new int[primerArreglo.length];
	public static void main(String arg[]) {
		sumaDeLosArreglos(primerArreglo, segundoArreglo);
		imprimir();
	}
	public static int[] sumaDeLosArreglos (int[]x, int[]y) {
		for (int i = 0; i < x.length; i++) {
				resultado[i] = x[i] + y[i];
		}
		
		return resultado;
	}
	public static void imprimir() {
		System.out.println(Arrays.toString(primerArreglo));
		System.out.println(Arrays.toString(segundoArreglo));
		System.out.println(Arrays.toString(resultado));
	}
}
