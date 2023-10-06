class excp1
{
    public static void main(String[] args)
    {
        System.out.println("main starts");
        try 
        {
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("AE");
        }
        System.out.println("Main ends");
    }
}
