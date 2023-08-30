package AtividadesAte20;

import java.util.Scanner;

public class Exc019 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int soma =0;

        System.out.println("Digite um numero");
        int num1 = Integer.parseInt(in.nextLine());

        System.out.println("Digite outro numero");
        int num2 = Integer.parseInt(in.nextLine());

        
        if(num2 == num1){
        System.out.println("Não pode valores iguais !! Digite outro numero");
        num2 = Integer.parseInt(in.nextLine());
        }else{
        System.out.println("Valores Diferentes ");
        }

          soma = num1 + num2;

        System.out.println("A soma dos dois numeros è : "+soma);


    }
}
