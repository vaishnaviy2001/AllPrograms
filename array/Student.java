import java.util.Scanner;
public class Student
{
	int id;
	String name;
	int[]marks=new int[5];
	Scanner sc=new Scanner(System.in);
     public Student(int id, String name) 
    {
		
		this.id = id;
		this.name = name;
		isStore();
	}
	public void isStore()
	{
		System.out.println("enter marks");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
	}
	public String toString()
	{
		return id+"  "+name;
	}

}