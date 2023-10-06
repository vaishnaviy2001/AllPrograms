import java.util.Scanner;
class method9
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting point:");
        int a = sc.nextInt();
       System.out.println("Enter ending point:");
       int e = sc.nextInt();
       for(;a<=e;a++)
       {
             isperfect(a);
       }
}
        public static void  isperfect(int data)
        {
          int count=0;
          int s=1;
          while(s<=data)
          {
             if (data%s==0)
            {
                  count++;
            }
          s++;
          
          }
              if (data==count-data)
             System.out.println("prime no is"+data);
         }
   }
   
