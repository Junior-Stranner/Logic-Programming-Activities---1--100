package AtividadesAte20;

import java.util.Scanner;

public class Exc014 {
    
    public static void main(String[] args) {
        
          Scanner in =new Scanner (System.in);

          System.out.println("Digite um valor ");
          int valor = Integer.parseInt(in.nextLine());

          valor += 5 - 2 - 6;
          if(valor > 10){
              System.out.println("é maior que 10 ");
          }else{
              System.out.println("é menor que 10 ");

          }
          System.out.println("Valor é : "+valor);
    }
}
