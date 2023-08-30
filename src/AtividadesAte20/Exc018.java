package AtividadesAte20;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exc018 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

         System.out.println("digite o ano atual");
         int anoAtual = Integer.parseInt(in.nextLine());

         System.out.println("digite o ano de Nascimento ");
         int anoNascimento = Integer.parseInt(in.nextLine());

         int idade = anoAtual - anoNascimento;
         
           System.out.println("Idade da Pessoa é : "+idade);
         if(idade >= 18){
            System.out.println("Voçê pode votar !!");
         }else{
            System.out.println("Voçê não tem idade para votar");
         }

        //=====================================================================
       long anos = ChronoUnit.YEARS.between(LocalDate.parse("2001-02-21"),LocalDate.now());

      System.out.println(" Possui : "+anos+" anos entre a faixa de data ");

        if(anos >= 18){
            System.out.println("Voçê pode votar !!");
         }else{
            System.out.println("Voçê não tem idade para votar");
         }

    }
}
