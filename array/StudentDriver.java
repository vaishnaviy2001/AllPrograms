import java.util.Scanner;
public class StudentDriver 
{
	
	Student[]s1=new Student[2];
	Student s;
	Scanner sc=new Scanner(System.in);
	public void addStudent()
	{
	for(int i=0;i<s1.length;i++)	
	{
		if(s1[i]==null)
		{
		    System.out.println("enter id");
		    int id=sc.nextInt();
		    System.out.println("enter name");
		    String name=sc.next();
			s=new Student(id,name);
			s1[i]=s;
			System.out.println("student is added");
			return;
		}
	}
	System.out.println("database is full ");
	
   }
	public void removeStudent()
	{
		System.out.println("enter id");
		int id=sc.nextInt();
		for(int i=0;i<s1.length;i++)
		{
			Student s=s1[i];
			if(s.id==id)
			{
				s1[i]=null;
				System.out.println("student is removed");
			   return;
			}
		}
		System.out.println("id is not found");
	}
	public void displayStudent()
	{
		for(int i=0;i<s1.length;i++)
		{
			
			if(s1[i]!=null)
			{
				System.out.println(s1[i]);
			}
		}
		
	}
	public void searchStudent()
    {
		System.out.println("enter id");
		int id=sc.nextInt();//
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]!=null)
			{
				Student s=s1[i];
				if(s.id==id)
				{
					System.out.println(s.name);
					int[]marks=s.marks;
					for(int j=0;j<marks.length;j++)
					{
						System.out.println(marks[j]);
					}
					return;
				}
			}			
		}
		System.out.println("id is not found");
	}
	public void dynamic()
	{
		
	}
}