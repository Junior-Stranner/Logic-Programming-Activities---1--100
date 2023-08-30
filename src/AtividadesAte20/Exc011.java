package AtividadesAte20;

import java.util.Scanner;

public class Exc011 {
    
    public static void main(String[] args) {
       Scanner in =new Scanner (System.in);

       double novoSal = 0;
       double valorCarro = 0;
       double valorTotalCarro = 0;

       System.out.println("Digite o salário do vendedor");
       double salFixo = Double.parseDouble(in.nextLine());
       System.out.println("Digite a quantidade de Carros vendidos pelo vendedor");
       double qtdCarrosVendidos =  Double.parseDouble(in.nextLine());


       for(int x = 1; x <= qtdCarrosVendidos; x++ ){

         System.out.println("valor de cada carro ");
         valorCarro = Double.parseDouble(in.nextLine());

      //   valorCarro += valorCarro;
          valorTotalCarro += valorCarro;

       } 
      double comissaoFixaPorCarroVendido = qtdCarrosVendidos * 0.03;
      double comissaoValorVendas = 0.05 * valorTotalCarro;
       
         
       System.out.println(" Valor total dos Carros  Vendidos: "+valorTotalCarro);
        System.out.println("Novo Salário é de : "+salFixo
        +"\n ======================================================="
        +"\n Comissão por carros vendidos é : "+comissaoFixaPorCarroVendido
        +"\n comissão por valor das Vendas é de : "+comissaoValorVendas);

         novoSal = salFixo + (comissaoValorVendas + comissaoFixaPorCarroVendido); 
            System.out.println("Novo Salário é de : "+novoSal); 
    }
}
