package AtividadesAte10;

import java.util.Scanner;

public class Exc05 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um valor ");
        int valorX = Integer.parseInt(in.nextLine());

        valorX -= 1;
        System.out.println("Número antecessor "+valorX);
    }
}
