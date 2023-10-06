import java.util.Scanner;
class Emp
{
    int id;
    String empname;
    int salary;
    int deptno;
    String job;
    Scanner sc = new Scanner(System.in);
    public Emp(int id, String empname)
    {
        this.id=id;
        this.empname=empname;
        this.salary =salary;
        this.deptno=deptno;
        this.job=job;
    }
    public void isStore()
	{
		System.out.println("enter salary");
		for(int i=0;i<salary.length;i++)
		{
			salary[i]=sc.nextInt();
		}
	}
	public String toString()
	{
		return id+"  "+name;
		
	}

}