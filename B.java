class B extends A
{
    //a=10;
    int b=20;
    public static void main(String[] args)
    {
        A a=new A();
        System.out.println(a.a);

        B b=new B();
        System.out.println(b.a);
        System.out.println(b.b);

    }


}