package AtividadesAte10;

import java.util.Scanner;

public class Exce09 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o Salário do Funcionário");
        double salario = Double.parseDouble(in.nextLine());

        System.out.println("Digite o seu novo Salário");
        double novoSalario = Double.parseDouble(in.nextLine());


    double percentualSalario = (novoSalario/salario) *100;

    System.out.println("Seu novo Slário é de : "+novoSalario
    +"\n com aumento de : "+percentualSalario+"%");
    }
}
