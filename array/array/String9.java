package array;

public class String9 {

	public static void main(String[] args) 
	{
		String s1="silent";
		String s2="listen";
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		int count=0;
		for(int i=0;i<c1.length;i++)
		{
			for(int j=0;j<c2.length;j++)
			{
				if(c1[i]==c2[j])
				{
					count++;
					c2[j]='\u0000';
				}
			}
		}
		if(count==s1.length())
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");

	}

}
