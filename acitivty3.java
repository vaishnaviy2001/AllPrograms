import java.util.Scanner;
class activity3
{
      public static void main(String[] args)
      {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter 3 number:");
           int a  = sc.nextInt();
           int b = sc.nextInt();
           int c =sc.nextInt();
           if(a>=b && a>=c)
           {
              System.out.println(a+"is largest no");
           }
           else if(b>=c && b>=a)
           {
                   System.out.println(b+"is largest no");
           }
           else
            {
                    System.out.println(c+"is largest no");
            }
      }
}