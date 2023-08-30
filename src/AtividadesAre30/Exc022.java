package AtividadesAre30;

import java.util.Scanner;

public class Exc022 {
     
    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double novoSal = 0;
    double salario = 0;

    System.out.println("horas trabalhadas do funcionário");
    double horasTrab = Double.parseDouble(in.nextLine());

    System.out.println("Salário por hora");
    double salPorHora = Double.parseDouble(in.nextLine());

    salario = (salPorHora * 4) * horasTrab;
    System.out.println("salario do funcionário é de "+salario);

    if(horasTrab > 40){
        System.out.println("============================="
        +"\n atingiu 40 horas trabalhadas na semana , Acrécimo de  50% liberado");
        novoSal = salario * 1.50;
        System.out.println("salário novo é de "+novoSal);

    } else{
        salario = salPorHora * horasTrab;
        System.out.println("salario do funcionário é de "+salario);

    }

    }
}
