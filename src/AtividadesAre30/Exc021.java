package AtividadesAre30;

import java.util.Scanner;

public class Exc021 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        

        System.out.println("Jogo começa as ");
        int inicioJogo = Integer.parseInt(in.nextLine());
        System.out.println("Jogo acaba as  ");
        int  fimJogo =Integer.parseInt(in.nextLine());

       // int duracao = 0;

        int duracao =fimJogo - inicioJogo;  

System.out.println("duraçãp do jogo é"+duracao+" Horas");
        

        
    }
}
