import java.util.Scanner;
class prog9
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter number");
       int num = sc.nextInt();
       fldigit(num);
       System.out.println(fldigit(num));
    }
    public static int fldigit(int data)
     {
        int fl =0;
        int mn=0;
        fl=data%10;
        data=data/10;
         while(data>9)
       {
         int rem = data%10;
         mn=mn+rem;
         data=data/10;
         fl=fl+data;
        
        }
         
           return fl=mn;     
     }
}
