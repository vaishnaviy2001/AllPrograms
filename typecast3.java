import java.util.Scanner;
class typecast3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        byte b=(byte)a;
        short c=(short)a;
        long d=a;
        float e=a;
        double f=a;
        char g=(char)a;
        System.out.println(a);

    }
}