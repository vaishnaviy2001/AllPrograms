import java.util.Scanner;
class prog3
{
     public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter number:");//1234
          int a = sc.nextInt();
          count(a);
     }
      public static void count(int a)
      {
           int s=1;
           int count=0;
           while(s<=a)
           {
             int rem=a%10;
             count++;
             a/=10;
           }
            System.out.println(count);
      }
}