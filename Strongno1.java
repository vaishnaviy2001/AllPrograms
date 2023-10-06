import java.util.Scanner;
class Strongno1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(num>0)
        {
            sum+=isfact(num%10);
            num/=10;
        }
        if(temp==sum)
        System.out.println("Strong number");
        else
        System.out.println("not strong number");
    }
    public static int isfact(int a)
    {
        int pro=1;
        for(int i=1;i<=a;i++)
        {
            pro=pro*i;
        }
        return pro;
    }
}