package CursoJava;

import java.util.Scanner;

	// TODO: Auto-generated Javadoc
/**
	 * Class that converts temperature based on degrees celsius 
	 * Classe que converte temperatura com base em Graus Celsius.
	 * 
	 * @author Dinarte Santos de Melo
	 */

public class CalcTemp {
		
	/**Declaração de Variaveis de classe - (c) = Celsius, 
	 * (k) = Kelvin, (f) = Fahrenheit, (re) = Reaumur, 
	 * (ra) = Rankine. 
	 */
	double c;
	
	/** The k. */
	double k;
	
	/** The f. */
	double f;
	
	/** The re. */
	double re;
	
	/** The ra. */
	double ra;
	
	/**
	 * Metodo Main da Classe CalcTemp.
	 *
	 * @param Args the arguments
	 */
	public static void main(String [] Args) {
		
		/**
		 * Instanciando a Classe Scanner
		 */
		Scanner ler = new Scanner(System.in);
		
		/**
		 * Input a Real value for Degrees Celsius.
		 * Entrada de um valor Real para Graus Celsius.
		 */
		System.out.printf("Informe a Temperatura em Graus Celsius \n");
		
		/**
		 * Reading the Actual value informed by the user.
		 * Lendo o valor Real informado pelo usuário.
		 */
		double c = ler.nextDouble();
		
		/**
		 * initialization and execution of variables;
		 * inicialização e execução das variaveis;	
		 */
		double f = (c * 1.8) + 32; 
		double k = c + 273.15;
		double re = c * 0.8;
		double ra = c * 1.8 + 32 + 459.67;
		
		/**
		 * Data Output Command.
		 * Comando de Saida de dados. 
		 */
		System.out.println("o valor de f é \n" + f + "\r\n");
		System.out.println("o valor de k é \n" + k + "\r\n");
		System.out.println("o valor de re é \n" + re + "\r\n");
		System.out.println("o valor de ra é \n" + ra + "r\n");
	}
}
