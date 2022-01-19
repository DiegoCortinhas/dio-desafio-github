package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> carroList = new ArrayList<>();
        carroList.add(new Carro("Ford"));
        carroList.add(new Carro("Chevrolet"));
        carroList.add(new Carro("Fiat"));
        carroList.add(new Carro("Peugeout"));

        System.out.println(carroList.contains(new Carro("Ford")));

        System.out.println(carroList.get(2));

        System.out.println(carroList.indexOf(new Carro("Fiat")));

        System.out.println(carroList.remove(2));

        System.out.print(carroList);



    }
}
