class BookDriver
{
    public static void main(String[] args)
    {
        Book d = new Book();
        System.out.println(d.getBook1());
        d.setBook1("cartoon stories");
        System.out.println(d.getBook1());
    }
}