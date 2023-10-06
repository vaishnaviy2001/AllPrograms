import java.util.Scanner;
class Activity4
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter year");
       int year = sc.nextInt();
       if(year%4==0)
       {
              System.out.println(year+"is leap year");
       }
    }
}