import java.util.Scanner;
class prog5
{
     public static void main(String[] args)
   { 
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter  number:");
       int num = sc.nextInt();
       sum(num);
   }
    public static void sum(int data)
    {
        int s=1;
        int sum=0;
        while(s<=data)
    {
       int rem=data%10;
       sum=sum+rem;
       data=data/10;
    }
       System.out.println(sum);
    }
}