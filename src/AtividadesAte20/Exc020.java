package AtividadesAte20;

import java.util.Scanner;

public class Exc020 {
    public static void main(String[] args) {
        
         Scanner in = new Scanner(System.in);

        int soma =0;

        System.out.println("Digite um numero");
        int num1 = Integer.parseInt(in.nextLine());

        System.out.println("Digite outro numero");
        int num2 = Integer.parseInt(in.nextLine());

        
        if(num2 > num1){
          System.out.println(num1 + "," +num2);
        }else{
        System.out.println(num2 + "," +num1);
        }
    }
}
