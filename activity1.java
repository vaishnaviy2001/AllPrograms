import java.util.Scanner;
class activity1
{
      public static void main(String[] args)
      {
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter number:");
               int no = sc.nextInt();
               if (no%5==0)
               {
                     System.out.println("Lucky...!!!");
               }
      }
}