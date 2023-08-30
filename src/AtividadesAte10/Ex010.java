package AtividadesAte10;

import java.util.Scanner;

public class Ex010 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double custoFabrica = 55000;
        double custoTotalCarro;
        double imposto = 1.45;
        

          custoTotalCarro = (custoFabrica * 1.28 * imposto);

        System.out.println("O custo Total do carro é de : "+custoTotalCarro);

    }
}
