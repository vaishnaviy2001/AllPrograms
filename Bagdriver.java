import java.util.Scanner;
class Bagdriver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bagcolor");
        String color=sc.next();
        System.out.println("Enter price of Bag");
        double price=sc.nextDouble();
        Bag b=new Bag(color,price);
        for(; ;)
        {
            System.out.println("1.Addlaptop 2.removeLaptop 3.getLaptopDetails 4.getBagDetails 5.exit");
            switch(sc.nextInt())
            {
                case 1:
                b.addLaptop();
                break;
                case 2:
                b.removeLaptop();
                break;
                case 3:
                b.getLaptopDetails();
                break;
                case 4:
                b.getBagDetails();
                break;
                case 5:
                System.out.println("Application is closed");
                System.exit(1);
            
            }
        }
    }
}