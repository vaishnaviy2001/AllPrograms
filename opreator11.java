import java.util.Scanner;
class opreator11
{
      public static void main(String[] args)
       {
           Scanner sc  = new Scanner(System.in);
           System.out.println("Enter Days");
           String days = sc.next();
           switch(days)
           {
                 case "monday" :
                  System.out.println("volley ball");
                  break;
                  case "tuesday" :
                  System.out.println("cricket");
                  break;
                  case "wed" :
                  System.out.println("kho-kho");
                  break;
                  case "thursday" :
                  System.out.println("gilli");
                  break;
                  case "friday" :
                  System.out.println("movies");
                  break;
                  case "saturday" :
                  System.out.println("football");
                  break;
                  case "sunday":
                  System.out.println("Sleeping");
                  break;
                   
                default :
            {
                     System.out.println("Plz enter only days");
           }
         }
       }
}