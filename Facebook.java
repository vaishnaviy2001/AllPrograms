import java.util.Scanner;
class Facebook
{
    String name;
    int pswd;
    public static void main(String[] args)
    {
        Facebook F1 = new Facebook();
        F1.name="raj";
        F1.pswd=123;
        Facebook F2=new Facebook();
        F2.name="raja";
        F2.pswd=111;
        System.out.println("name"+"  "+"pswd");
        System.out.println(F1.name+"  "+F1.pswd);
        System.out.println(F2.name+"  "+F2.pswd);   
    }
    
}