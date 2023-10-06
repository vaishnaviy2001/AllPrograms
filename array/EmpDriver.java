import java.util.Scanner;
class EmpDriver
{
    Emp[]E1 = new Emp[2];
    Emp E;
	Scanner sc=new Scanner(System.in);
    public void addEmployee()
    {
        for(int i=0;i<E1.length;i++)
        {
            if(E1[i]==null)
            {
                System.out.println("Enter id");
                int id=sc.nextInt();
		        System.out.println("Enter Empname");
		        String empname=sc.next();
		        System.out.println("Enter employee salary");
		        int salary=sc.nextInt();
		        System.out.println("Enter deptno.");
		        int deptno=sc.nextInt();
		        System.out.println("Enter employee job");
		        String job= sc.next();
			    E=new Emp(id,empname);
			    E1[i]=E;
			    System.out.println("Employee is added");
			    return;
            }
        }
        System.out.println("database is full ");
	
   }
	public void removeEmployee()
	{
		System.out.println("enter id");
		int id=sc.nextInt();
		for(int i=0;i<E1.length;i++)
		{
			Emp E=E1[i];
			if(E.id==id)
			{
				E1[i]=null;
				System.out.println("Employee is removed");
			   return;
			}
		}
		System.out.println("id is not found");
	}
	public void displayEmployee()
	{
		for(int i=0;i<E1.length;i++)
		{
			
			if(E1[i]!=null)
			{
				System.out.println(E1[i]);
			}
		}
		
		
	}
    public void searchEmployee()
    {
		System.out.println("enter id");
		int id=sc.nextInt();//
		for(int i=0;i<E1.length;i++)
		{
			if(E1[i]!=null)
			{
				Emp E=E1[i];
				if(E.id==id)
				{
					System.out.println(E.empname);
					System.out.println(E.salary);
					return;
				}
			}			
		}
		System.out.println("id is not found");
	}
}
