import java.util.Scanner;
class String1
{
    public static void main(String[] args)
    {
      String s1="How vexingly quick daft zebras jump!";;//helo
	  s1=s1.toLowerCase(); 
	  char[]c1=s1.toCharArray();//[h,e,l,l,o];
	   String s2="";
	   
	   for(int i=0;i<c1.length;i++)
	   {
		   int c=0;//1
		   
		   for(int j=i+1;j<c1.length;j++)
		   {
			  if(c1[i]==c1[j]) 
			  {
				  c++;
			  }
		   }
		   if(c==0)
		   {
			   s2=s2+c1[i];
			   
		   }
	   }
	   char[]c2=s2.toCharArray();
	   Arrays.sort(c2);
	   for(int i=0;i<c2.length;i++)
	   {
		   System.out.print(c2[i]);
	   }
	   
    }
}