import java.util.Scanner;
class opreator9
{
        public static void main(String[] args)
        {               
              int accno= 123;
              int pwrd=111;
              double balance=1000;            
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter Accno:");
             int accno1= sc.nextInt();

                if(accno==accno1)
                   {
                     System.out.println("Enter Password:");
                      int pass=sc.nextInt();
                      if(pwrd==pass)
                      {
                            System.out.println("Enter Money to withdraw:");
                            double money=sc.nextInt();
                             if(money<=balance)
                             {
                                     System.out.println("Collect Cash...!");
                                     System.out.println("Balance is"+(balance=balance-money));
                             }
                            else
                            {
                              System.out.println("Insufficient money");
                             }
                          }
                       else
                        {
                            System.out.println("Enter correct Password:");
                        }
                        }
                      else
                      {
                     System.out.println("Invalid accno");
                       }
        }
}
