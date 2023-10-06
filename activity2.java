import java.util.Scanner;
class activity2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Charater");
        char character = sc.next().charAt(0);
        if (character >='A' && character<='Z')
        {
            System.out.println("Alphabet");
        }
        else if(character>='a' && character<='z')
        {
            System.out.println("Alphabet");
        }
        else if (character>='0' && character<='9')
        {
           System.out.println("Number");
        }
        else
        {
           System.out.println("Special Character");
        }
    }
}