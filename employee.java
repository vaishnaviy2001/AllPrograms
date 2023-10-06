import java.util.Scanner;
class employee
{
    String name;
    int id;
    int contactno;
    employee(String s1, int i1,int c1)
    {
        name=s1;
        id=i1;
        contactno=c1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name");
        String a1=sc.next();
        System.out.println("Enter Employee id");
        int a2=sc.nextInt();
        System.out.println("Enter employee Contactno");
        int a3=sc.nextInt();
        employee a=new employee(a1,a2,a3);
        System.out.println(a.name);
        System.out.println(a.id);
        System.out.println(a.contactno);
    }

}