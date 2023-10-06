import java.util.Scanner;
public class StudentApplication
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		StudentDriver sd=new StudentDriver();
		for(;;)
		{
			System.out.println("1.create student 2.remove student 3. display 4.search 5.dynamic 6.exit");
		     switch(sc.nextInt())	
		     {
		     case 1:
		     {
		    	 sd.addStudent();
		    	break; 
		     }
		     case 2:
		     {
		    	 sd.removeStudent();
		    	break; 
		     }
		     case 3:
		     {
		    	 sd.displayStudent();
		    	break; 
		     }
		     case 4:
		     {
		    	 sd.searchStudent();
		    	break; 
		     }
		     case 5:
		     {
		    	 sd.dynamic();
		    	break; 
		     }
		     case 6:
		     {
		    	 System.err.println("Appication is closed");
		    	return; 
		     }
		     
		     }
		}
	}
}