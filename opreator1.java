import java.util.Scanner;
class opreator1
{
     public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int a = sc.nextInt();
       System.out.println(a%2==0?"Even":"Odd");      
       System.out.println(a%2==0?"Hii":"Bye");
     }
}