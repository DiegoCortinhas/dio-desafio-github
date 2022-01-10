package one.dio.basecamp;

public class Calculadora {

	public static void soma(double num1, double num2) {
		double resultado = num1 + num2;
		System.out.println("A soma do numero " + num1 + " com o numero " + num2 + 
				" é igual a " + resultado);
	}
	
	public static void subtracao(double num1, double num2) {
		double resultado = num1 - num2;
		System.out.println("A subtracao do numero " + num1 + " com o numero " + num2 + 
				" é igual a " + resultado);
	}

	public static void multiplicacao(double num1, double num2) {
		double resultado = num1 * num2;
		System.out.println("A multiplicação do numero " + num1 + " com o numero " + num2 + 
				" é igual a " + resultado);
	}
	
	public static void divisao(double num1, double num2) {
		double resultado = num1 / num2;
		System.out.println("A soma do numero " + num1 + " com o numero " + num2 + 
				" é igual a " + resultado);
	}
}

