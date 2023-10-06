import java.util.Scanner;
class Arraycheck2
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of an array");
        String[] a=new String[sc.nextInt()];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter data");
            a[i]=sc.next();          
        }
        System.out.println("Enter data to check");
        String search=sc.next();
        for(int i=0;i<a.length;i++)
        {
            if(a[i].equals(search))
            {
                System.out.println("Element is found");
                return;
            }
        }
        System.out.println("Element is not found");
    }
}