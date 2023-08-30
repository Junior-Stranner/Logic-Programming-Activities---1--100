package AtividadesAte20;

import java.util.Scanner;

public class Exc013 {
    
    public static void main(String[] args) {
        
               Scanner in =new Scanner (System.in);

               double media , n1,n2,n3;

            System.out.println("Digite nota 1");
            n1 = Double.parseDouble(in.nextLine());

             System.out.println("Digite nota 2");
            n2 = Double.parseDouble(in.nextLine());

             System.out.println("Digite nota 3");
            n3 = Double.parseDouble(in.nextLine());

            double soma  = (n1*2) + (n2*3) + (n3*5);
           media = soma /10;

            System.out.println("Média do aluno é : "+media);

            System.out.println("=================================");
    }
}
