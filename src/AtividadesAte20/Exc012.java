package AtividadesAte20;

import java.util.Scanner;

public class Exc012 {
    
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);

        final double fator = 5.0/ 9.0;
		final double ajuste = 32;
		double fahrenheit = 150;
		double celcius =(fahrenheit - ajuste) * fator;
		
		System.out.println("O resultado é "+celcius+" C.");
	
		fahrenheit = 0;
		celcius = (fahrenheit - ajuste) * fator;
		
		System.out.println("O resultado é "+celcius+" C.");
	

    }
}
