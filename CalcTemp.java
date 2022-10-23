package CursoJava;

//conversor de temperatura com base em Graus Celsius
public class CalcTemp {
	
	
	//Declaração de Variaveis de classe - (c) = Celsius, (k) = Kelvin, (f) = Fahrenheit, (re) = Reaumur, (ra) = Rankine.  
	static double c = 2.43;
	double k;
	double f;
	double re;
	double ra;

	//Metodo Main da Classe CalcTemp
	public static void main(String [] Args) {
		
		//inicialização e execução das variaveis;	
		double f = (c * 1.8) + 32; 
		double k = c + 273.15;
		double re = c * 0.8;
		double ra = c * 1.8 + 32 + 459.67;
		
		//Comando de impressao para saída de dados. 
		System.out.println("o valor de f é \n" + f + "\r\n");
		System.out.println("o valor de k é \n" + k + "\r\n");
		System.out.println("o valor de re é \n" + re + "\r\n");
		System.out.println("o valor de ra é \n" + ra + "r\n");
	}
}
