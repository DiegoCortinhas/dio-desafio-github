package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));


        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty());



//        List<Carro> listaCarros = new ArrayList<Carro>();
//        listaCarros.add(new Carro("Ford"));
//        listaCarros.add(new Carro("Chevrolet"));
//        listaCarros.add(new Carro("Volkswagen"));
//
//        System.out.println(listaCarros.contains(new Carro("Ford")));
//
//        System.out.println(new Carro("Ford").hashCode());
//        System.out.println(new Carro("Ford2").hashCode());
//
//        Carro carro1 = new Carro("Ford");
//        Carro carro2 = new Carro("Chevrolet");
//
//        System.out.println(carro1.equals(carro2));

    }
}
