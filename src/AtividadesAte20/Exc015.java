package AtividadesAte20;

import java.util.Scanner;

public class Exc015 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor");
      int valor = Integer.parseInt(in.nextLine());

      if(valor < 0){
        System.out.println("negativo");
      }else{
        System.out.println("Positico");
      }
    }
}
