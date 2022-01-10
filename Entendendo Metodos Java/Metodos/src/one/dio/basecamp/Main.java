package one.dio.basecamp;
import one.dio.basecamp.Mensagem;
public class Main {
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		calc.soma(2, 3);
		calc.multiplicacao(2, 3);
		calc.divisao(6,3);
		calc.subtracao(6, 4);
	
		System.out.println("Mensagem");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1);
		
		System.out.println("Exercicio Emprestimo");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);
	
	
		System.out.println("Exercicio Area Quadrilatero");
		Quadrilatero.area(5.0);
		Quadrilatero.area(5.0,5.0);
		Quadrilatero.area(5.0,5.0,5.0);
		Quadrilatero.area(5f, 5f);
	}
	
	
	
}
