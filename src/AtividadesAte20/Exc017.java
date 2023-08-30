package AtividadesAte20;

import java.util.Scanner;

public class Exc017 {
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       double media = 0;
       double av1,av2;

       System.out.println("Digite a nota da Primeira Avaliação");
       av1 = Double.parseDouble(in.nextLine());

       System.out.println("Digite a nota da Segunda Avaliação");
       av2 = Double.parseDouble(in.nextLine());

       media = (av1 + av2) /2;

       if(media >= 6){
        System.out.println("Aluno Aprovado ");
       }else{ 
        System.out.println("Aluno Recuperação ");

       }
       System.out.println("Media : "+media);
    }
}
