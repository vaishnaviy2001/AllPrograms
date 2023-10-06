import java.util.Scanner;
 class VowelCheck
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        if (isVowel(ch)) 
        {
            System.out.println("hii");
        } 
        else 
        {
            System.out.println("bye");
        }
    }

    public static boolean isVowel(char ch) 
    {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}
