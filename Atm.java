import java.util.Scanner;
class Atm 
{
	static Account a=new Account();
	static Scanner sc=new Scanner(System.in);
	public void withdraw()
	{
      System.out.println("enter acctno");
	  long acctno=sc.nextLong();
	  if(a.getAcctNumber()==acctno)
	  {
        System.out.println("enter pswd");
		int pswd=sc.nextInt();
		if(a.getPswd()==pswd)
		{
			System.out.println("enter money");
			double mon=sc.nextDouble();//1000
			if(a.getBalance()>=mon)
			{
               double dc=a.getBalance()-mon;
			   a.setBalance(dc);
			}
			else
			{
				System.out.println("insufficient money");
			}
		}
		else
		{
			System.out.println("invalid pswd");
		}
	  }
	  else
	  {
		  System.out.println("account number is invalid");
	  }
	}
	public void deposit()
	{
        System.out.println("enter acctno");
	  long acctno=sc.nextLong();
	  if(a.getAcctNumber()==acctno)
	  {
        System.out.println("enter pswd");
		int pswd=sc.nextInt();
		if(a.getPswd()==pswd)
		{
			System.out.println("enter money");
			double mon=sc.nextDouble();//1000
			if(a.getBalance()>=mon)
			{
               double dc1=a.getBalance()+mon;
			   a.setBalance(dc1);
			}
			else
			{
				System.out.println("insufficient money");
			}
		}
		else
		{
			System.out.println("invalid pswd");
		}
	  }
	  else
	  {
		  System.out.println("account number is invalid");
	  }
	
	}
	public void checkBalance()
	{
     System.out.println(a.getBalance());
	}
	public static void main(String[]args)
	{
		Atm a1=new Atm();
		for(;;)
		{
			System.out.println("1.withdraw 2.checkbal 3.deposit 4.exit");
           switch(sc.nextInt())
		   {
			   case 1:
				   a1.withdraw();
			   break;
			   case 2:
                  a1.checkBalance();
			   break;
			   case 3:
			      a1.deposit();
			   case 4:
				   System.exit(1);
		   }
		}
	}
}
