import java.util.Scanner;
class prog1
{
     public static void main(String[] args)
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter number");
          int a=sc.nextInt();
          m1(a);
      }
       public static void m1(int a)
       {
          System.out.println(a*a*a);
      }
}