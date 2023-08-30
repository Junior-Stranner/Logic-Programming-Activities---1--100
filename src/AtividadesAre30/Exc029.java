package AtividadesAre30;

import java.util.Scanner;

public class Exc029 {
    public static void main(String[] args) {
        
         Scanner in = new Scanner(System.in);

         int soma = 0;

    System.out.println("Digite um numero ");
    int num1 = Integer.parseInt(in.nextLine());

    System.out.println("Digite um  segundo numero ");
    int num2 = Integer.parseInt(in.nextLine());

    System.out.println("Digite um terceiro numero ");
    int num3 = Integer.parseInt(in.nextLine());

    if(num1 == num2 || num2 == num3){
        System.out.println("Não pode ter valores iguais execute novamente com valores diferentes");
    }

    
    if(num1 > num3 && num2 > num3){
           System.out.println("Esses são os dois maiores valores : "+num1+ " e "+num2);

           soma = num1 + num2;
          System.out.println("Soma dos numeros 1 e 2 são : "+soma);
    }else if(num2 > num1 &&  num3 > num1){
          System.out.println("Esses são os dois maiores valores : "+num3+ " e "+num2);
            soma = num3 + num2;
          System.out.println("Soma dos numeros 3 e 2 são : "+soma);

    }else if( num3 > num2 && num1 > num2 ){
         System.out.println("Esses são os dois maiores valores : "+num3+ " e "+num1);
           soma = num3 + num1;
          System.out.println("Soma dos numeros 3 e 1 são : "+soma);

    }

    }
}
