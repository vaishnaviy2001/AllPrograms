import java.util.Scanner;
class evenoddsum
{
      public static void main(String[] args)
      {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter number");
           int n=sc.nextInt();
           int sum=0;//even
           int sum1=0;//odd
           while(n>0)
           {
                int rem=n%10;
                n/=10;
                if(rem%2==0)
                sum=sum+rem;
               else
                sum1=sum1+rem;
           }
              System.out.println(sum);//sumofevenno
              System.out.println(sum1);//sumofoddno
       }
}