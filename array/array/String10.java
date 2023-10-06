package array;

import java.util.Scanner;
public class String10 {

	public static void main(String[] args) 
	{
      String s1=new Scanner(System.in).nextLine();
      String[]s2=s1.split(" ");
      for(int i=0;i<s2.length;i++)
      {
    	  System.out.print(s2[i]);
      }
	}

}
