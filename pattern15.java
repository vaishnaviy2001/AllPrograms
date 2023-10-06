class pattern15
{
     public static void main(String[] args)
     {
          char a='A';
          char b='Z';
          for(int i=1;i<=5;i++)
          { 
                 for(int j=1;j<=i;j++)
                  if(i%2==1)
                 {0
                     System.out.print(a++ + "  ");
                 }
                  else
                {
                   System.out.print(b-- +"  ");
                }
                  System.out.println();
                  a='A';
                  b='Z';
          }
     }
}