import java.util.Scanner;
class divisible
{                       
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");    
        int a = sc.nextInt();
        if(a%3==0 && a%5==0)
        {
           System.out.println("Hii");
           System.exit(0);
        }
           System.out.println("Bye");
    }
}