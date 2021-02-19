import java.util.Scanner;
/**

 * Esta clase implementar� todos los m�todos que est�n relacionados con la resta de la calculadora.
 * @author: David lara gonzalez

 * @version: 03/02/2021
 
 */
public class Resta {

	/**
	 * Esta clase contiene los atributos y metodos de la resta
	 * @author David lara
	 * @version 1.0
	 * 
	 */
	double numeroReal1;
	
	double numeroReal2;

	
	//	1- Resta de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	//	2- Resta de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	//	3- Resta de tres n�meros reales, tendr� 3 par�metros de entrada y uno de salida que ser� la soluci�n.
	//	4- Resta con valor acumulado, tendr� un par�metro de entrada y la clase deber� de guardar el valor acumulado.
		
		
		//punto 1 Resta de dos n�meros reales
		
		
		// METODO restar numeros reales

		public double resultadoNumeroreal() {
			return this.numeroReal1 -  this.numeroReal2;

		}
		
				
		/**
		* Proceso para probar los comentarios.
		*
		* @param numero
		* Valor numerico entero.
		* @param fecha
		* Valor fecha.
		* @return Cadena devuelta.
		*/
		
		/**
		 * recogida de datos: numeros reales por consola
		 */
		Scanner parametroEntrada1 = new Scanner(System.in);
		
		