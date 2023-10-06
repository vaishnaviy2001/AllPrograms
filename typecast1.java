import java.util.Scanner;
class typecast1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name=sc.next();
        byte age=sc.nextByte();
        String dateOfBirth=sc.next();
        long contactnumber=sc.nextLong();
        System.out.println(name);
    }
}