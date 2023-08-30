package AtividadesAte10;

import java.util.Scanner;

public class Exc07 {
    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

        
        System.out.println("Digite a idade da Pessoa ");
        int idade = Integer.parseInt(in.nextLine());

        int ano  = idade;
        int mes = 12 * ano;
        int dias =  365 * ano;
       

        System.out.println("idade : "+idade
        +"\n anos : "+ano
        +"\n mes : "+mes
        +"\n dias : "+dias);
    }
}
