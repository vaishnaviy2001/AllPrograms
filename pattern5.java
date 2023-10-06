class pattern5
{
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
           for(int j=1;j<=5;j++)
            if(i%2==0)
            {
                 System.out.print(j*5+"  ");
            }
            else
            {
                  System.out.print(j*2+"  ");
            }
                 System.out.println(  );
        }
    }
}