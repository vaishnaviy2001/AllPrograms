import java.util.Scanner;
class Arraycheck3
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of an array A");
        int[] a=new int[sc.nextInt()];
        System.out.println("Enter size of an array B");
        int[] b=new int[sc.nextInt()];
       System.out.println("Enter number in array A");
       for(int i=0;i<a.length;i++)
       {
        a[i]=sc.nextInt();
       }
       System.out.println("Enter number in array B");
       for(int i=0;i<b.length;i++)
       {
        b[i]=sc.nextInt();
       }
       System.out.println("Merged array A and B");
        int c[] =new int[a.length+b.length];
        int index =0;
        for(int i=0;i<a.length;i++)
        {
            c[index++]=a[i];
        }
        for(int i=0;i<b.length;i++)
        {
            c[index++]=b[i];
        }
        for(int i=0;i<c.length;i++)
        {
           System.out.print(c[i]+" ");           
        }      
    }
}