package on.digitalinnovation.desafios;

public class Main {
    public static void main(String[] args) {
        //Digite o seu código aqui
        for (int i = 1; i <= 38; i++){
            System.out.print("-");
            if(i==38){
                System.out.println("-");
            }
        }

        for(int j = 1; j <= 5; j++){
            for (int i = 1; i <= 39; i++){
                if(i==1){
                    System.out.print("|");
                }
                if(i==39){
                    System.out.println("|");
                }
                if(2<=i && i<=38){
                    System.out.print(" ");
                }
            }
        }
        for (int i = 1; i <= 39; i++){
            System.out.print("-");
        }

    }
}