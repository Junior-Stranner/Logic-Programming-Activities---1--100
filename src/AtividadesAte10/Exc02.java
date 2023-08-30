package AtividadesAte10;

public class Exc02 {
    public static void main(String[] args) {
        
        int a1 = 10;
        int b1 = 20;
        System.out.println("b"+b1);

        b1 += 5;
        //b1 = b1 + 5;

        System.out.println(" a"+a1 +","+ " b"+b1);

      System.out.println("=================================");

        int a2 = 30;
        int b2 = 20;

        int c2 = a2 + b2;
        System.out.println("c"+c2);

        b2 += 10;

        System.out.println("b"+b2 +","+"c"+c2);

        c2 = a2 + b2;

        System.out.println("a"+a2 +","+ "b"+b2 +","+"c"+c2);

      System.out.println("=================================");

      int a3 = 10;
      int b3 = 20;
      int c3 = 10;

       c3 += a3;

       b3 += c3;
       //b3 = b3 + c3
       a3 += b3;
       //a3 = a3 + b3

       System.out.println("a"+a3 +","+ "b"+b3 +","+"c"+c3);

      System.out.println("=================================");

      int a4 = 10;
      int b4 = a4 + 1;
      a4 = b4 + 1;
      b4 = a4 + 1;
      System.out.println("a"+a4);
      a4 = b4 + 1;
      System.out.println("a"+a4 + ","+"b"+b4);

    System.out.println("=================================");

    int a5 = 10;
    int b5 = 5;
    int c5 = a5 + b5;
    b5 += 20;
    a5 += 10;

     System.out.println("a"+a5 +","+ " b"+b5 +","+ " c"+c5);

    System.out.println("=================================");

    int x = 1;
    int y = 2;
    int z = y - x;
   System.out.println(z);

   x += 5;
   y = x + z;
   System.out.println("x"+x +","+" y"+y+","+" z"+z);

    }
    
}
