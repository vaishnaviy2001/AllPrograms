class pattern16
{
    public  static void main(String[] args)
    {
     
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
               if(j+i>=5)
                 System.out.print("*");
               else
                 System.out.print(" ");
           }
           -
            for(int k=1;k<i;k++)
            {
                     System.out.print("*");
            }
                System.out.println( );
       }
    }
}