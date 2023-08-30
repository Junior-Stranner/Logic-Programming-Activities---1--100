package AtividadesAre30;

import java.util.Scanner;

public class Exc027 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Digite um umero ");
    int num = Integer.parseInt(in.nextLine());

    if(num > 0 ){
        System.out.println("è positivo");
    } else if( num < 0){
        System.out.println("è negativo");
    }else{
        System.out.println(" è zeroo");
    }
    }
}
