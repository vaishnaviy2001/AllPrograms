class Thiskeyword1 extends Thiskeyword
{
    int a=20;
    public void m1()
    {
        int a=30;
        System.out.println(super.a);
        System.out.println(this.a);
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        Thiskeyword1 t1=new Thiskeyword1();
        t1.m1();
    }
}