import java.util.Scanner;
class Bike
{
    String bikename;
    double price;
    int mileage;
    Engine e;
    Bike(String s1,double p1,int m1,Engine e1)
    {
        bikename=s1;
        price=p1;
        mileage=m1;
        e=e1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bikename");
        String bikename=sc.next();
        System.out.println("Enter price");
        double price=sc.nextDouble();
        System.out.println("Enter mileage");
        int mileage=sc.nextInt();
        Bike b1=new Bike(bikename,price,mileage,new Engine());
        System.out.println(b1.bikename);
        System.out.println(b1.e.engineNumber);
    } 

}