import java.util.Scanner;
class methodprime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int a=sc.nextInt();
        isprime(a);
    }
    public static void isprime(int data)
    {
        int count=0;
        int s=1;
        while(s<=data)
        {
            if(data%s==0)
            count++;
            s++;
        }
        if(count==2)
        System.out.println("Prime number");
        else
        System.out.println("Not prime number");
    }
}
