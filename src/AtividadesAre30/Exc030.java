package AtividadesAre30;

import java.util.Scanner;

public class Exc030 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.println("Digite um numero ");
        int num1 = Integer.parseInt(in.nextLine());
    
        System.out.println("Digite um  segundo numero ");
        int num2 = Integer.parseInt(in.nextLine());
    
        System.out.println("Digite um terceiro numero ");
        int num3 = Integer.parseInt(in.nextLine());
    

        if(num1 == num2 || num2 == num3){
            System.out.println("Não pode ter valores iguais execute novamente com valores diferentes");
        }

        if(num1 < num2 && num2 < num3 && num2 < num3){
            System.out.println(num1 +","+num2 +","+num3);

        }else if( num2 < num1 && num2 < num3 && num1 < num3){
             System.out.println(num2 +","+num1 +","+num3);
               
        }else if ( num3 < num1 && num3 < num2 && num2 < num1){
             System.out.println(num3 +","+num2 +","+num1);
      }
   } 
}
