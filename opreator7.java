import java.util.Scanner;
class opreator7
{
       public static void main(String[] args)
       {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter Age:");
           int age = sc.nextInt();
           System.out.println("Enter Gender:");
           char gender = sc.next().charAt(0);
           if(age>=21 && age<=40)
           {
            System.out.println("ready for marrage");
           }
           else if(age>=18)
           {
             System.out.println(" ready for marrage");
           }
           else
           {
             System.out.println("Not ready for marrage");
           }
       }
}
//if(age>=21&&gender=='m'||age>=18&&gender=='f')