import java.util.Scanner;
class Arraycheck
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of an array");
        int[] a=new int[sc.nextInt()];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter data");
            a[i]=sc.nextInt();          
        }
        System.out.println("Enter data to check");
        int search=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==search)
            {
                System.out.println("Element is found");
                return;
            }
        }
        System.out.println("Element is not found");
    }
}