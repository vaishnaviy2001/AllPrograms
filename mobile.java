class mobile
{
    String mobilename="oneplus";
    double price=30000;
    Sim s;
    public void addsim()
    {
        if(s==null)
        {
            s=new Sim();
            System.out.println("Sim is inserted");           
        }
        else
        {
            System.out.println("Already sim is existing");
        }
    }
        public void removeSim()
        {
            if(s==null)
            {
                System.out.println("Plz first add sim");
            }
            else
            {
                s=null;
                System.out.println("sim is removed");
            }
        }
    
}