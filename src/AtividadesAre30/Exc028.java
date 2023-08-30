package AtividadesAre30;

import java.util.Scanner;

public class Exc028 {
    
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


    int maiorValor = num1;

    if (num2 > maiorValor) {
        maiorValor = num2;
    }

    if (num3 > maiorValor) {
        maiorValor = num3;
    }

    System.out.println("O maior valor é: " + maiorValor);
  }
}
