import java.util.Scanner;
class p5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int a= sc.nextInt();
        if(a%4==0)
        {
            System.out.println(a+"is leap Year");
        }
    }
}