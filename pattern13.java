class pattern13
{
   public static void main(String[] args)
   {
      int a=0;
      for(int i=1;i<=5;i++)
      {
          for(int j=1;j<=i;j++)
          {
             System.out.print(a++%3+" ");
          }
            System.out.println( );        
      }
   }
}