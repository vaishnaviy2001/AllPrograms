import java.util.Scanner;
class Activity6
{
      public static void main(String[] args)
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("1.add 2.sub 3.multi 4.quo 5.rem");
          switch(sc.nextInt())
          {
            case1 :
             {
                  System.out.println("enter two no");
                  System.out.println(sc.nextInt() + sc.nextInt());
                  break;
             }
             case2 :
             {
                    System.out.println("enter two no");
                    System.out.println(sc.nextInt() - sc.nextInt());
                    break;
             }
          }          
      }
}