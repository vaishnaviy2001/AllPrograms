import java.util.Scanner;
class Actor2
{
    String name;
    int no_ofmovies;
    Actor2(String S1,int n1)
    { 
        System.out.println(S1);
        System.out.println(n1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String a1=sc.next();
        System.out.println("enter no_of movies");
        int a2=sc.nextInt();
        Actor a= new Actor(a1,a2);
        System.out.println(a.name);
        System.out.println(a.no_ofmovies);

    }
}