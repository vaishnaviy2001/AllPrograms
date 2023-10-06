import java.util.Scanner;
class opreator10
{
      public static void main(String[] args)
       {
           Scanner sc  = new Scanner(System.in);
           System.out.println("Enter Number");
           int choice = sc.nextInt();
           switch(choice)
           {
                 case 1 :
                  System.out.println("Jan");
                  break;
                  case 2 :
                  System.out.println("Feb");
                  break;
                  case 3 :
                  System.out.println("March");
                  break;
                  case 4 :
                  System.out.println("April");
                  break;
                  case 5 :
                  System.out.println("May");
                  break;
                  case 6 :
                  System.out.println("Jun");
                  break;
                  case 7 :
                  System.out.println("July");
                  break;
                  case 8 :
                  System.out.println("August");
                  break;
                  case 9 :
                  System.out.println("Sept");
                  break;
                  case 10 :
                  System.out.println("Oct");
                  break;
                  case 11 :
                  System.out.println("Nov");
                  break;
                  case 12 :
                  System.out.println("Dec");
                  break;             
           
                default :
            {
                     System.out.println("Plz enter only 1 to 12 Number");
           }
         }
       }
}