import java.util.Scanner;
class xp
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number");
       int n=sc.nextInt();
       int fn=0;
       int mn=0;
       fn=n%10;
      n=n/10;
      while(n>9)
      {
           int rem=n%10;
           mn=mn+rem;
           n=n/10;
     }
        fn=fn+n;
        if(fn==mn)
        {
             System.out.println("it is xylem");
        }
        else
        {
          System.out.println("It is phelom");
        }
    } 
}