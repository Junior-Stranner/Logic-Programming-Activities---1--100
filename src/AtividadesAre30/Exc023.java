package AtividadesAre30;

import java.util.Scanner;

public class Exc023 {
    
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

    
     double f = 62.1;
     double m = 72.7;
     double alturaM = 1.80;
     double alturaF = 1.58;

     System.out.println("Digite sexo M ou F");
     String sexo =in.nextLine() ;

     if(sexo.equals("m")){
        double peso_idealM= (m * alturaM) - 58;
        System.out.println("Peso ideal do Masculino é de "+peso_idealM);
     }else{
        double peso_idealF= (f * alturaF) - 44.7;
        System.out.println("Peso ideal do Masculino é de "+peso_idealF);

     }
    }
}
