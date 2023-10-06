import java.util.Scanner;
class Activity5
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter 2 int");
       int a = sc.nextInt();
       int b = sc.nextInt();
       String choice = sc.next();
       switch(choice)
      {
         case"Addition" :
         System.out.println("addition is "+(a+b));
         break;

         case"Substraction" :
         System.out.println("substraction is "+(a-b));
         break;

          case"Multiplication" :
          System.out.println("multiplication is "+(a*b));
          break;

          case"division" :
          System.out.println("division is "+(a/b));
          break;

           default:
          {
               System.out.println("Please enter valid input");
         }
      } 
   }
}