class pendriver
{
        public static void main(String [] args)
        {
            pen p1= new pen();
            p1.pname="pentonic";
            p1.price=10;
            pen p2= new pen();
            p2.pname="technotip";
            p2.price=15;
            pen p3= new pen();
            p3.pname="cello";
            p3.price=10;
            pen p4= new pen();
            p4.pname="Trimax";
            p4.price=50;
            pen p5= new pen();
            p5.pname="Butterflow";
            p5.price=15;
           System.out.println(p1.pname+" "+p1.price);
           System.out.println(p2.pname+" "+p2.price);
           System.out.println(p3.pname+" "+p3.price);
           System.out.println(p4.pname+"  "+p4.price);
          System.out.println(p5.pname+"  "+p5.price);

        }
}