package one.dio.basecamp;

public class Quadrilatero {
	
	public static double area(double lado) {
		double resultado = lado * lado;
		System.out.println("A area do Quadrado é: " + resultado);
		return resultado;
	}
	

	public static double area(double lado1, double lado2) {
		double resultado = lado1 * lado2;
		System.out.println("A area do Retângulo é: " + lado1*lado2);
		return resultado;
	}
	

	public static double area(double baseMaior, double baseMenor, double altura) {
		double resultado = ((baseMaior+baseMenor)*altura)/2;
		System.out.println("A area do Trapézio é: " + ((baseMaior+baseMenor)*altura)/2);
		return resultado;
	}
	
	public static float area(float diagonal1, float diagonal2) {
		float resultado = ((diagonal1 * diagonal2)/2);
		System.out.println("A area do Losango é: " + ((diagonal1 * diagonal2)/2));
		return resultado;
	}
	
}
