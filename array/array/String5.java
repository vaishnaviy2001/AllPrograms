package array;

public class String5 {

	public static void main(String[] args) 
	     {
		// TODO Auto-generated method stub
		        String sentence = "This is a sentence with five words";
		        int count = 0;
		        for(int i=0;i<sentence.length();i++) 
		        {
		            if(sentence.charAt(i) == ' ' || sentence.charAt(i) == '.') {
		                count++;
		            }
		        }
		        System.out.println("Number of words in the sentence " + (count));
		    }
	}
	
