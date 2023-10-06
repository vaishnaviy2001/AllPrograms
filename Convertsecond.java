import java.util.Scanner;
class Convertsecond
{
   public static void main(String[] args)
   {
  Scanner sc = new Scanner(System.in); 
  System.out.println("Enter the no");
  int a=sc.nextInt();
  System.out.println(a*60*60);
  System.out.println(+a+"hours="+(a*60*60)+"seconds");
   }
}