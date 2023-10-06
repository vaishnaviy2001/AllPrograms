import java.util.Scanner;
class Actor
{
    String name;
    int no_ofmovies;
    Actor(String s1,int n1)
    {
        name=s1;
        no_ofmovies=n1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String a1=sc.next();
        System.out.println("Enter no.of movies");
        int a2=sc.nextInt();
        Actor a=new Actor(a1,a2);
        System.out.println(a.name);
        System.out.println(a.no_ofmovies);

    }

}