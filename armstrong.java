import java.util.Scanner;
class armstrong
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter number");
            int a = sc.nextInt();
            int temp=a;
            int sum=0;
            int power=iscount(a);
            while(a>0)
            {
                sum=sum+isvalue(a%10,power);
                a=a/10;
            }
            if(temp==sum)
            System.out.println("Armstrong number");
            else
            System.out.println("It is not Armstrong number");     
        }
        
      }
        public static int iscount(int num)
        {
            int count=0;
            while(num>0)
            {
                count++;
                num=num/10;
            }
            return count;
        }
        public static int isvalue(int num,int power)
        {
            int data=1;
            for(int i=1;i<=power;i++)
            {
                data=data*num;
            }
            return data;    
        }       
}
