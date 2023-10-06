import java.util.Scanner;
class Array1//even numbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int[]box=new int[sc.nextInt()];
        System.out.println("Enter no. of array");
        for(int i=0;i<box.length;i++)
        {
            box[i]=sc.nextInt();
        }
        System.out.println("Even numbers:-");
        for(int i=0;i<box.length;i++)
        {
            if(box[i]%2==0)
            {
                System.out.println(box[i]);
            }
        }
    }
}