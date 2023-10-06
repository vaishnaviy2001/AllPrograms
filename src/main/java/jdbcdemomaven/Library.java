package jdbcdemomaven;

import java.util.Scanner;

public class Library {

	public static void main(String[] args)
	{
		System.out.println("1.admin 2.user");
		Scanner sc=new Scanner(System.in);
		int id =sc.nextInt();
		
		switch(id) {
		case 1:
			System.out.println("1.Add book 2.view book 3.display book");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: {
				// add book in database
				
			}
			}
		}
	}	
}
        
         
