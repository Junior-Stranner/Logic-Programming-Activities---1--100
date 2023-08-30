package AtividadesAre30;

import java.util.Scanner;

public class Exc024 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

     double novoSalTotal = 0;

     System.out.println("Salário fixo do funcionário");
     double salFixo = Double.parseDouble(in.nextLine());

     System.out.println("Digite valor total vendido");
     double vendas = Double.parseDouble(in.nextLine());

     if(vendas > 1500){
        novoSalTotal = salFixo * 1.05;
     }else{
        novoSalTotal = salFixo * 1.03;
     }

     System.out.println("Novo Salário é : "+novoSalTotal);
    }
}
