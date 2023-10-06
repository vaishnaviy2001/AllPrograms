package array;

public class String8 {

	public static void main(String[] args) 
	{
		String s1="I like Java";
		String[] s2=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			m1(s2[i]);
		}

	}
	public static void m1(String s1)	
	{
		int lc=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
				lc++;
		}
		System.out.println(s1+ " lower case ="+lc);
	}

}
