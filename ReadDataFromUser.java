import java.util.Scanner;
class ReadDataFromUser
{
    public static void main(String[] args)
     {   
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter byte type Data");
         byte v1=sc.nextByte();
         System.out.println("Enter short type Data");
         short v2=sc.nextShort();
         System.out.println("Enter int type Data");
         int v3=sc.nextInt();
         System.out.println("Enter float type Data");
         float v4=sc.nextFloat();
         System.out.println("Enter double type Data");
         double v5=sc.nextDouble();
         System.out.println("Enter character type Data");
         char ch=sc.next().charAt(0);
         System.out.println("Enter boolean type Data");
         boolean b = sc.nextBoolean();
         System.out.println("Enter String type Data");
         String s1= sc.next();
         

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
        System.out.println(ch);
        System.out.println(b);
        System.out.println(s1);
     }
}