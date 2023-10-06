import java.util.Scanner;
class prog4
{
      public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number");
      int num=sc.nextInt();
      count(num);
       System.out.println(count(num));
     }
    public static int count(int data)
    {
       int count=0;
       int s=1;
       while(s<=data)
       {
          int rem=data%10;
          count++;
           data/=10;
       }
           return count;
    }  
}