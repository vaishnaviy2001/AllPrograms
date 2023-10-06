package array;

public class String4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1 = "123";//1+2+3--->6
		char[] ch=s1.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			int a=ch[i]-48;//51-48-->3
			sum=sum+a;//0+1,1+2,3+3
		}
		System.out.println(sum);
	}

}
