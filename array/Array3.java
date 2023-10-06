import java.util.Scanner;
class Array3
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of an array");
       int[] box= new int[sc.nextInt()];
       System.out.println("Enter number in array");
       for(int i=0;i<box.length;i++)
       {
         box[i] = sc.nextInt();
       }
       System.out.println("numbers in asending order");
       for(int i=0;i<box.length;i++)
       {       
         for(int j=i+1;j<box.length;j++)
         {
            if(box[i]>box[j])
            {
                int temp=box[i];
                box[i]=box[j];
                box[j]=temp;
            }
         }
       }
       for(int i=0;i<box.length;i++)
       {
        System.out.println(box[i]);
       }
    }
}