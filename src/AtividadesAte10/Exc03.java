package AtividadesAte10;

public class Exc03 {
    
    public static void main(String[] args) {
        
        int a = (4/2)+(2/4);
        int a1 = 4/2+2/4;
        System.out.println(a+","+a1);
        if(a == a1){
            System.out.println("Valores iguais");
        }else{
            System.out.println("Valores diferentes");
        }

        System.out.println("===============================");

        int  b= 4/(2+2)/4;
        int b1 = 4/2+2/4;
        System.out.println(b+","+b1);
        if(b == b1){
            System.out.println("Valores iguais");
        }else{
            System.out.println("Valores diferentes");
        }

        System.out.println("===============================");

        int c= (4+2)*2-4;
        int c1 = 4+2*2-4;
        System.out.println(c+","+c1);
        if(c == c1){
            System.out.println("Valores iguais");
        }else{
            System.out.println("Valores diferentes");
        }

        System.out.println("===============================");
    }
}
