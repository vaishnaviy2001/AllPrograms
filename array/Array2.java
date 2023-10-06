import java.util.Scanner;
class Array2//odd numbers
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int []box=new int[sc.nextInt()];
    System.out.println("Enter number of an array");
    for(int i=0;i<box.length;i++)
    {
        box[i]=sc.nextInt();
    }
    System.out.println("Odd Numbers:-");
    for(int i=0;i<box.length;i++)
    {
        if(box[i]%2==1)
        {
            System.out.println(box[i]);
        }
    }
   }
}