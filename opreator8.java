import java.util.Scanner;
class opreator8
{
    public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Age:-");
     int age = sc.nextInt();
     System.out.println("Enter Gender");
     char gender = sc.next().charAt(0);
     if(age>=21&&age<=40&& gender=='m'||age>=18&&age<30&& gender=='f')
     {
         System.out.println("Eligible for marrage");
     }
      else
      {
        System.out.println("Not Eligible for marrage");
      }
   }
}