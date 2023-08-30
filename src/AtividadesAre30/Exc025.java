package AtividadesAre30;

import java.util.Scanner;

import javax.sound.midi.Sequencer.SyncMode;

public class Exc025 {
    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double debito = 0;
    double credito = 0;
    double saldoAtual = 0;
    String continuar = "";



    System.out.println("Digite o numero da conta ");
    int conta = Integer.parseInt(in.nextLine());

    System.out.println("Deposite um valor : ");
    double saldo  = Double.parseDouble(in.nextLine());

     while (!continuar.equalsIgnoreCase("Não")) {
        System.out.println("VC deseja continuar o processo ?");
        continuar = in.nextLine();
  

    System.out.println("seu valor disponivel é de : "+saldo
    +"\n=================================="
    +"\n Escolha aonde vc queira o seu dinheiro "
    +"\n 1 - Débito "
    +"\n 2 - Crédito");
    int op = Integer.parseInt(in.nextLine());
    

    if(op == 1){
        System.out.println("Débito"
        +"\n ======================"
        +"\n Digite quanto vc quer depositar no Débito ?");
        debito = Double.parseDouble(in.nextLine());
        if(debito > saldo ){
            System.out.println("Saldo insuficiente ....");

            System.out.println("Digite um valor que vc tenha como saldo");
            debito = Double.parseDouble(in.nextLine());
        }

        saldo -= debito;
        
        System.out.println("saldo atual é de : "+saldo );
    
        System.out.println(" dinheiro no débito : "+debito);


    }else if (op == 2){
         System.out.println("Crédito"
        +"\n ======================"
        +"\n Digite quanto vc quer depositar no Crédito ?");
        credito = Double.parseDouble(in.nextLine());
        if(credito > saldo ){
            System.out.println("Saldo insuficiente ....");

            System.out.println("Digite um valor que vc tenha como saldo");
            credito = Double.parseDouble(in.nextLine());
        }

        saldo -= credito;

        System.out.println("saldo atual é de : "+saldo 
        +"\n no crédito : "+credito);
        
       }
   
     }
   }

}
