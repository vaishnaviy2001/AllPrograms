class pattern17
{
    public  static void main(String[] args)
    {
        int row=7,col=7;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
               if(j>=i)
                 System.out.print("*");
               else
                  System.out.print(" ");
            }
           col--;
            for(int k=1;k>i;k++)
            {
                     System.out.print("*");
            }
                System.out.println( );
       }
    }
}