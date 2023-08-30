package AtividadesAte10;

import java.util.Scanner;

public class Exc08 {
    
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

        System.out.println("Número de eleitores ");
        double eleitores = Double.parseDouble(in.nextLine());

        int op = 0;
        int votosBrancos = 0;
        int votosNulos = 0;
        int votosValidos =0;

        for(int x = 1 ; x <= eleitores ;x++){

            System.out.println("escolha os votos"
            +"\n 1 - votos Brancos"
            +"\n 2 - nulos "
            +"\n 3 - válidos");
            op = Integer.parseInt(in.nextLine());

     if(op ==1 ){
         votosBrancos ++;
    }else if(op == 2){
             votosNulos ++;
    }else {
      votosValidos ++;
    }
}  

if(eleitores >= 10){
     
}

double percentual_brancos = (votosBrancos / eleitores) * 100;
double percentual_nulos = (votosNulos / eleitores) * 100;
double percentual_validos = (votosValidos / eleitores) * 100;

   System.out.println("Número total de eleitores são : "+eleitores
   +"\n ========================================");
 
    System.out.println("quantidade de Votos Brancos : "+votosBrancos
    +"\n Quantidade de votos nulos : "+votosNulos
    +"\n Quantidade de votos válidos  : "+votosValidos
    +"\n=========================================");

    System.out.println("Percentual Votos Branco : "+percentual_brancos+"%"
    +"\n Percentual votos nulos : "+percentual_nulos+"%"
    +"\n Percentual votos Válidos : "+percentual_validos+"%");
  }
}
