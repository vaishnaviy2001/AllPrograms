import java.util.Scanner;
class methodevenodd
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter staring number");
         int s=sc.nextInt();
         System.out.println("Enter ending number");
         int e=sc.nextInt();
         iseven(s);
    }
    public static void iseven(int data)
    {
        for(int s=1;s<=100;s++)
        if(s%2==0)
           System.out.println(s+ " is even no");
        else
           System.out.println(s+ " is odd no");
    }
}