import java.awt.List;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Banco bradesco = new Banco();
		bradesco.setNome("Bradesco");
		ArrayList<Conta> listaDeContas = new ArrayList<Conta>();
		
		Cliente cliente1	= new Cliente();
		cliente1.setNome("Diego P");
		
		
		Conta contaCorrente01 = new ContaCorrente(cliente1);
		contaCorrente01.depositar(1000);
		
		Conta contaPoupanca01 = new ContaPoupanca(cliente1);
		contaCorrente01.transferir(100, contaPoupanca01);
		
		listaDeContas.add(contaCorrente01);
		listaDeContas.add(contaPoupanca01);
		
		bradesco.setContas(listaDeContas);
		
		
		System.out.println("Os seguintes clientes tem conta no Banco " + bradesco.getNome() + ": ");
		
		for (Cliente cliente : bradesco.retornaClientes()) {
		    System.out.println(cliente.getNome());
		}
		
		
		contaCorrente01.imprimirExtrato();
		contaPoupanca01.imprimirExtrato();
		
	}
	
}
