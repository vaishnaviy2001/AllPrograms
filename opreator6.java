import java.util.Scanner;
class opreator6
{
     public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);
          char ch = sc.next().charAt(0);
          if(ch >= 'A' && ch<='Z')
           {
                   System.out.println("is an Upper case");
           }
           else if(ch>='a' && ch<='z')
           {
                    System.out.println("is an lower case");
           }
           else if(ch>='0' && ch<='9')
           {
                    System.out.println("is an Number");
           }
           else
           {
                     System.out.println("is an Symbol");
           }
     }
}