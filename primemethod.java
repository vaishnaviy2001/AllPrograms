import java.util.Scanner;
class primemethod
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter starting Number");
        int a=sc.nextInt();
        System.out.println("Enter ending Number");
        int b=sc.nextInt();
        for(;a<=b;a++)
        {
            isprime(a);
        }   
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
        System.out.println("Prime no is "+data);
    }
}