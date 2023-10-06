import java.util.Scanner;
class prog7
{
     public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter number");
          int num = sc.nextInt();
          reverse(num);
    }
       public static void reverse(int data)
       {
          int sum=0;
          while(data>0)
          {
               int rem = data%10;
               sum = (sum*10)+rem;
               data=data/10;
          }
               System.out.println(sum);
       }
}