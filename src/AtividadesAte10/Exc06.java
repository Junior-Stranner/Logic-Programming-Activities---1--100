package AtividadesAte10;

import java.util.Scanner;

public class Exc06 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.println("Digite o tamanho da base ");
        double base = Double.parseDouble(in.nextLine());

        System.out.println("Digite o tamanho da altura ");
        double altura = Double.parseDouble(in.nextLine());

        double retangulo = (altura * base)/2 ;
    
       System.out.println("tamanho do Retángulo é de : "+retangulo+"cm");
    }
}
