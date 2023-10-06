import java.util.Scanner;
class Automorphicnumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int count=0;
        int square=num*num;
        int temp=num;
        while(temp>0)
        {
            count++;
            temp=temp/10;
        }
        int lastdigit=(int)(square% 
        .(Math.pow(10,count)));
        if(num==lastdigit)
        System.out.println(num+"is an Automorphic number");
        else
        System.out.println(num+"is not an Automorphic number");
    }
}
