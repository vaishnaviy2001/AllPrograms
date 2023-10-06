import java.util.Scanner;
class EmpApplication
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         EmpDriver ed=new EmpDriver();
         for(;;)
         {
            System.out.println("1.addEmployee 2.removeEmployee 3.displayEmployee 4.searchEmployee 5.exit");
            switch(sc.nextInt())	
		    {
		     case 1:
		     {
		    	 ed.addEmployee();
		    	break; 
		     }
		     case 2:
		     {
		    	 ed.removeEmployee();
		    	break; 
		     }
		     case 3:
		     {
		    	 ed.displayEmployee();
		    	break; 
		     }
		     case 4:
		     {
		    	 ed.searchEmployee();
		    	break; 
		     }
		     
		     case 5:
		     {
		    	 System.err.println("Appication is closed");
		    	return; 
		     }
		     
		     }
		}
	}
}