package AtividadesAte20;

import java.util.Scanner;

public class Exc016 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maca;
     //   double precoMaca = 0;
        double precoTotalMaca =0;
        double  precoMacaDuzia = 0;
         double  precoMacaUnitario =0;

        System.out.println("Digite a quantidade de maças desejadas");
        maca = Integer.parseInt(in.nextLine());

    //    for(int x = 1; x <= maca; x++){

            if(maca < 12){
                precoMacaUnitario = 1.30;
                precoTotalMaca = maca * precoMacaUnitario;

            }else{
                precoMacaDuzia = 1.00;
                precoTotalMaca = maca * precoMacaDuzia;

            }
            
    //    }

          if(maca < 12){
                System.out.println("Quantidade de maças compradas foram : "+maca
                +"\n preço total de : "+precoTotalMaca
                +"\n preço individual das maças é de : "+precoMacaUnitario);
            }else{
                System.out.println("Quantidade de maças compradas foram : "+maca
                +"\n preço total de : "+precoTotalMaca
                +"\n preço individual das maças é de : "+precoMacaDuzia);
            }
    }
}
