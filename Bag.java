import java.util.Scanner;
class Bag
{
    String color;
    double price;
    Laptop l;
    Scanner sc = new Scanner(System.in);
    public Bag (String c1,double p1)
    {
        color= c1;
        price=p1;
    }
    public void getLaptopDetails()
    {
        if(l==null)
        System.out.println("Please add Laptop");
        else
        {
            System.out.println(l.name);
            System.out.println(l.price);
        }
    }
    public void getBagDetails()
    {
        System.out.println(color);
        System.out.println(price);
    }
    public void addLaptop()
    {
        if(l==null)
        {
            System.out.println("Enter name of the Laptop");
            String name=sc.nextLine();
            System.out.println("Enter price of laptop");
            double price=sc.nextDouble();
            l=new Laptop(name,price);
            System.out.println("Laptop is Added");
        }
        else
        {
            System.out.println("Sorry!!! Already laptop is exist");
        }
    }
    public void removeLaptop()
    {
        if(l==null)
        {
            System.out.println("Please add first Laptop");
        }
        else
        {
            l=null;
            System.out.println("Laptop is removed now ba is empty");
        }
    }

}
