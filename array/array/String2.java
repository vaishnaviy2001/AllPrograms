package array;

import java.util.Scanner;
public class String2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       System.out.println("Enter String");
       String s1= new Scanner(System.in).next();
       int vowels=0;
       int consonents=0;
       int uc=0;
       int lc=0;     
       char []ch =s1.toCharArray();
       for(int i=0;i<ch.length;i++)
       {
    	   if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
    	   {
    		   vowels++;
    	   }
    	   else if(ch[i]!='a'&& ch[i]!='e'&& ch[i]!='i'&& ch[i]!='o'&& ch[i]!=0pu'u')
    	   {
    		   consonents++;
    	   }
    	   else if(ch[i]>='A' && ch[i]<='Z')
    	   {
    		   uc++;
    	   }
    	   
    	   else if(ch[i]>='a' && ch[i]<='z')
    	   {
    		   lc++;
    	   }
    	   
       }
       System.out.println("vowels= "+ vowels);
       System.out.println("consonents="+ consonents);
       System.out.println("upper case ="+ uc);
       System.out.println("lower case ="+ lc);
      
       
	}

}
