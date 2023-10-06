import java.util.Scanner;
class prog8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        lastdigit(num);
        System.out.println(lastdigit(num));
    }
     public static int lastdigit(int data)
     {
          int a = data%10;  
          return a;       
     }
}