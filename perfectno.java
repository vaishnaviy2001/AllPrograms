import java.util.Scanner;
class perfectno
{
      public static void main(String[] args)
      {
              Scanner sc = new Scanner(System.in);
               System.out.println("Enter number");
              int num=sc.nextInt();
              int s=1;
              int sum=0;
             while(s<=num)
             {
                 if(num%s==0)
                 {
                       sum=sum+s;
                 }
                 s++;
            }
             if(sum-num==num)
             {
                System.out.println("Perfectno");
            }
            else
             {
               System.out.println("not perfectNo");
             }
      }
}