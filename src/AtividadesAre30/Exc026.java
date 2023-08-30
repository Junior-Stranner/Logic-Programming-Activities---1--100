package AtividadesAre30;

import java.util.Scanner;

public class Exc026 {
    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

 
      System.out.println("Quanridade máxima no estoque ");
      int qtdMaxima = Integer.parseInt(in.nextLine());

      System.out.println("Quantidade minimo no estoque ");
      int qtdMinimo = Integer.parseInt(in.nextLine());

       System.out.println("Quantidade Atual no estoque ");
      int qtdAtual = Integer.parseInt(in.nextLine());

      int qtdMedia = (qtdMaxima + qtdMinimo)/2;

      if(qtdMedia > qtdAtual){

        System.out.println("Não efetuar compra ");
      } else{
        System.out.println("Efetura compra ");
      }

    }
}
