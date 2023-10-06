import java.util.Scanner;
class method8
{
       public static void main(String[] args)
       {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter no.");
         int a = sc.nextInt();
         isperfect(a);//       
      }
       public static void  isperfect(int data)
       {
          int s=1;
          int sum=0;
          while(s<=data)
          {
            if(data%s==0)
            {
                 sum=sum+s;
            } 
             s++;          
           }
            if(data==sum-data)
                 System.out.println("perfect number");
            else
                  System.out.println("not perfect number");           
      }
}