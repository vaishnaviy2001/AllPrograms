package array;

public class String1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      String s1 = "hello guys today mi match is there";
      String[] s2=s1.split(" ");
      for(int i=0;i<s2.length;i++)
      {
    	  System.out.println(s2[i]+":-"+s2[i].length());
    	  
      }
      
	}

}
