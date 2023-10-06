package COM.JSP.bILLS;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Taj {

	static int billno = 1;
	User u;
	static Scanner sc = new Scanner(System.in);
	String food1 = "briyani";
	String food2 = "veg briyani";
	String food3 = "roti";
	String food4 = "chapati";
	String food5 = "rice";
	String food6 = "idly";
	String food7 = "poratta";
	String food8 = "medu vada";
	String food9 = "samosa";
	String food10 = "veg gravy";
	String food11 = "chicken gravy";
	String food12 = "aloo jeera";
	String food13 = "jeera rice";
	String food14 = "panner masala";
	String food15 = "dhal dhadka";
	String food16 = "bislery";
	String food17 = "ice cream";
	String food18 = "pani puri";
	String food19 = "pav bhaji";
	String food20 = "misal pav";
	double price1 = 120;
	double price2 = 80;
	double price3 = 15;
	double price4 = 12;
	double price5 = 35;
	double price6 = 3;
	double price7 = 7;
	double price8 = 5;
	double price9 = 5;
	double price10 = 60;
	double price11 = 80;
	double price12 = 65;
	double price13 = 45;
	double price14 = 120;
	double price15 = 60;
	double price16 = 20;
	double price17 = 20;
	double price18 = 10;
	double price19 = 100;
	double price20 = 100;
	int qty1 = 0;
	int qty2 = 0;
	int qty3 = 0;
	int qty4 = 0;
	int qty5 = 0;
	int qty6 = 0;
	int qty7 = 0;
	int qty8 = 0;
	int qty9 = 0;
	int qty10 = 0;
	int qty11 = 0;
	int qty12 = 0;
	int qty13 = 0;
	int qty14 = 0;
	int qty15 = 0;
	int qty16 = 0;
	int qty17 = 0;
	int qty18 = 0;
	int qty19 = 0;
	int qty20 = 0;

	public void addUser() {
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter address");
		String address = sc.next();
		System.out.println("enter cno");
		long cno = sc.nextLong();
		u = new User(name, address, cno);
		makeOrder();

	}

	public void makeOrder() {
		boolean b = true;

		do {
			int sno = 1;
			System.out.println(sno++ + " " + food1 + "             " + price1);
			System.out.println(sno++ + " " + food2 + "    " + price2);
			System.out.println(sno++ + " " + food3 + "    " + price3);
			System.out.println(sno++ + " " + food4 + "    " + price4);
			System.out.println(sno++ + " " + food5 + "    " + price5);
			System.out.println(sno++ + " " + food6 + "    " + price6);
			System.out.println(sno++ + " " + food7 + "    " + price7);
			System.out.println(sno++ + " " + food8 + "    " + price8);
			System.out.println(sno++ + " " + food9 + "    " + price9);
			System.out.println(sno++ + " " + food10 + "    " + price10);
			System.out.println(sno++ + " " + food11 + "    " + price11);
			System.out.println(sno++ + " " + food12 + "    " + price12);
			System.out.println(sno++ + " " + food13 + "    " + price13);
			System.out.println(sno++ + " " + food14 + "    " + price14);
			System.out.println(sno++ + " " + food15 + "    " + price15);
			System.out.println(sno++ + " " + food16 + "    " + price16);
			System.out.println(sno++ + " " + food17 + "    " + price17);
			System.out.println(sno++ + " " + food18 + "    " + price18);
			System.out.println(sno++ + " " + food19 + "    " + price19);
			System.out.println(sno++ + " " + food20 + "    " + price20);

			switch (sc.nextInt()) {

			case 1: {
				System.out.println("enter quantity");
				qty1 += sc.nextInt();
				break;
			}
			case 2: {
				System.out.println("enter quantity");
				qty2 += sc.nextInt();
				break;
			}
			case 3: {
				qty3 += sc.nextInt();
				break;
			}
			case 4: {
				System.out.println("enter quantity");
				qty4 += sc.nextInt();
				break;
			}
			case 5: {
				System.out.println("enter quantity");
				qty5 += sc.nextInt();
				break;
			}
			case 6: {
				System.out.println("enter quantity");
				qty6 += sc.nextInt();
				break;
			}
			case 7: {
				System.out.println("enter quantity");
				qty7 += sc.nextInt();
				break;
			}
			case 8: {
				System.out.println("enter quantity");
				qty8 += sc.nextInt();
				break;
			}
			case 9: {
				System.out.println("enter quantity");
				qty9 += sc.nextInt();
				break;
			}
			case 10: {
				System.out.println("enter quantity");
				qty10 += sc.nextInt();
				break;
			}
			case 11: {
				System.out.println("enter quantity");
				qty11 += sc.nextInt();
				break;
			}
			case 12: {
				System.out.println("enter quantity");
				qty12 += sc.nextInt();
				break;
			}
			case 13: {
				System.out.println("enter quantity");
				qty13 += sc.nextInt();
				break;
			}
			case 14: {
				System.out.println("enter quantity");
				qty14 += sc.nextInt();
				break;
			}
			case 15: {
				System.out.println("enter quantity");
				qty15 += sc.nextInt();
				break;
			}
			case 16: {
				System.out.println("enter quantity");
				qty16 += sc.nextInt();
				break;
			}
			case 17: {
				System.out.println("enter quantity");
				qty17 += sc.nextInt();
				break;
			}
			case 18: {
				System.out.println("enter quantity");
				qty18 += sc.nextInt();
				break;
			}
			case 19: {
				System.out.println("enter quantity");
				qty19 += sc.nextInt();
				break;
			}

			case 20: {
				System.out.println("enter quantity");
				qty20 += sc.nextInt();
				break;
			}
			}
			System.out.println("1.if u want choose 2.generte bill ");
			if (sc.nextInt() == 2)
				b = false;
		} while (b);
		bill();
	}

	public void bill() {
		int sno = 1;
		int sum = 0;
		if (qty1 != 0) {
			System.out.println(sno++ + " " + food1 + " " + qty1 + " " + price1 + "  = " + qty1 * price1);
			sum += qty1 * price1;

		}

		if (qty2 != 0) {
			System.out.println(sno++ + " " + food2 + " " + qty2 + " " + price2 + "  = " + qty2 * price2);
			sum += qty2 * price2;

		}
		if (qty3 != 0) {
			System.out.println(sno++ + " " + food3 + " " + qty3 + " " + price3 + "  = " + qty3 * price3);
			sum += qty3 * price3;

		}
		if (qty4 != 0) {
			System.out.println(sno++ + " " + food4 + " " + qty4 + " " + price4 + "  = " + qty4 * price4);
			sum += qty4 * price4;

		}
		if (qty5 != 0) {
			System.out.println(sno++ + " " + food5 + " " + qty5 + " " + price5 + "  = " + qty5 * price5);
			sum += qty5 * price5;

		}
		if (qty6 != 0) {
			System.out.println(sno++ + " " + food6 + " " + qty6 + " " + price6 + "  = " + qty6 * price6);
			sum += qty6 * price6;

		}
		if (qty7 != 0) {
			System.out.println(sno++ + " " + food7 + " " + qty7 + " " + price7 + "  = " + qty7 * price7);
			sum += qty7 * price7;

		}
		if (qty8 != 0) {
			System.out.println(sno++ + " " + food8 + " " + qty8 + " " + price8 + "  = " + qty8 * price8);
			sum += qty8 * price8;

		}
		if (qty9 != 0) {
			System.out.println(sno++ + " " + food9 + " " + qty9 + " " + price9 + "  = " + qty9 * price9);
			sum += qty9 * price9;

		}
		if (qty10 != 0) {
			System.out.println(sno++ + " " + food10 + " " + qty10 + " " + price10 + "  = " + qty10 * price10);
			sum += qty10 * price10;

		}
		if (qty11 != 0) {
			System.out.println(sno++ + " " + food11 + " " + qty11 + " " + price11 + "  = " + qty11 * price11);
			sum += qty11 * price11;

		}
		if (qty12 != 0) {
			System.out.println(sno++ + " " + food12 + " " + qty12 + " " + price12 + "  = " + qty12 * price12);
			sum += qty12 * price12;

		}
		if (qty13 != 0) {
			System.out.println(sno++ + " " + food13 + " " + qty13 + " " + price13 + "  = " + qty13 * price13);
			sum += qty13 * price13;

		}
		if (qty14 != 0) {
			System.out.println(sno++ + " " + food14 + " " + qty14 + " " + price14 + "  = " + qty14 * price14);
			sum += qty14 * price14;

		}
		if (qty15 != 0) {
			System.out.println(sno++ + " " + food15 + " " + qty15 + " " + price15 + "  = " + qty15 * price15);
			sum += qty15 * price15;

		}
		if (qty16 != 0) {
			System.out.println(sno++ + " " + food16 + " " + qty16 + " " + price16 + "  = " + qty16 * price16);
			sum += qty16 * price16;

		}
		if (qty17 != 0) {
			System.out.println(sno++ + " " + food17 + " " + qty17 + " " + price17 + "  = " + qty17 * price17);
			sum += qty17 * price17;

		}
		if (qty18 != 0) {
			System.out.println(sno++ + " " + food18 + " " + qty18 + " " + price18 + "  = " + qty18 * price18);
			sum += qty18 * price18;

		}
		if (qty19 != 0) {
			System.out.println(sno++ + " " + food19 + " " + qty19 + " " + price19 + "  = " + qty19 * price19);
			sum += qty19 * price19;

		}
		if (qty20 != 0) {
			System.out.println(sno++ + " " + food20 + " " + qty20 + " " + price20 + "  = " + qty20 * price20);
			sum += qty20 * price20;

		}
		System.out.println("                      " +sum);
		if (sc.nextInt() >=sum) {
			System.out.println("payment successfull !!!");
			try {
				writeinfile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		else {
			System.out.println("payment not successfull....");
			bill();
		}

	}

	public void writeinfile() throws IOException {

		File f1 = new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\vaishnavi");
		if (!(f1.exists())) {
			f1.mkdir();
			System.out.println("folder is created");
		}
		File f2 = new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\vaishnavi\\bill.txt");
		if (!(f2.exists())) {
			try {
				f2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("file is created");
		}
		FileWriter fw = new FileWriter(f2, true);
		PrintWriter pw = new PrintWriter(fw);
		BufferedWriter bw = new BufferedWriter(pw);
		try {
			bw.write("Bill number          " + billno++);
			bw.newLine();
			bw.write("Date         " + getDate());
			bw.newLine();
			bw.write("Time         :" + getTime());
			bw.newLine();
			bw.write("customer name : " + u.name);
			bw.newLine();
			bw.write("________________________________________________");
			bw.newLine();
			int sno = 1;
			int sum = 0;
			if (qty1 != 0) {
				bw.write(sno++ + " " + food1 + " " + qty1 + " " + price1 + "  = " + qty1 * price1);
				bw.newLine();
				sum += qty1 * price1;

			}

			if (qty2 != 0) {
				bw.write(sno++ + " " + food2 + " " + qty2 + " " + price2 + "  = " + qty2 * price2);
				sum += qty2 * price2;
				bw.newLine();

			}
			if (qty3 != 0) {
				bw.write(sno++ + " " + food3 + " " + qty3 + " " + price3 + "  = " + qty3 * price3);
				sum += qty3 * price3;
				bw.newLine();

			}
			if (qty4 != 0) {
				bw.write(sno++ + " " + food4 + " " + qty4 + " " + price4 + "  = " + qty4 * price4);
				sum += qty4 * price4;
				bw.newLine();

			}
			if (qty5 != 0) {
				bw.write(sno++ + " " + food5 + " " + qty5 + " " + price5 + "  = " + qty5 * price5);
				sum += qty5 * price5;
				bw.newLine();

			}
			if (qty6 != 0) {
				bw.write(sno++ + " " + food6 + " " + qty6 + " " + price6 + "  = " + qty6 * price6);
				sum += qty6 * price6;
				bw.newLine();

			}
			if (qty7 != 0) {
				bw.write(sno++ + " " + food7 + " " + qty7 + " " + price7 + "  = " + qty7 * price7);
				sum += qty7 * price7;
				bw.newLine();

			}
			if (qty8 != 0) {
				bw.write(sno++ + " " + food8 + " " + qty8 + " " + price8 + "  = " + qty8 * price8);
				sum += qty8 * price8;
				bw.newLine();

			}
			if (qty9 != 0) {
				bw.write(sno++ + " " + food9 + " " + qty9 + " " + price9 + "  = " + qty9 * price9);
				sum += qty9 * price9;
				bw.newLine();

			}
			if (qty10 != 0) {
				bw.write(sno++ + " " + food10 + " " + qty10 + " " + price10 + "  = " + qty10 * price10);
				sum += qty10 * price10;
				bw.newLine();

			}
			if (qty11 != 0) {
				bw.write(sno++ + " " + food11 + " " + qty11 + " " + price11 + "  = " + qty11 * price11);
				sum += qty11 * price11;
				bw.newLine();

			}
			if (qty12 != 0) {
				bw.write(sno++ + " " + food12 + " " + qty12 + " " + price12 + "  = " + qty12 * price12);
				sum += qty12 * price12;
				bw.newLine();

			}
			if (qty13 != 0) {
				bw.write(sno++ + " " + food13 + " " + qty13 + " " + price13 + "  = " + qty13 * price13);
				sum += qty13 * price13;
				bw.newLine();

			}
			if (qty14 != 0) {
				bw.write(sno++ + " " + food14 + " " + qty14 + " " + price14 + "  = " + qty14 * price14);
				sum += qty14 * price14;
				bw.newLine();

			}
			if (qty15 != 0) {
				bw.write(sno++ + " " + food15 + " " + qty15 + " " + price15 + "  = " + qty15 * price15);
				sum += qty15 * price15;
				bw.newLine();

			}
			if (qty16 != 0) {
				bw.write(sno++ + " " + food16 + " " + qty16 + " " + price16 + "  = " + qty16 * price16);
				sum += qty16 * price16;
				bw.newLine();

			}
			if (qty17 != 0) {
				bw.write(sno++ + " " + food17 + " " + qty17 + " " + price17 + "  = " + qty17 * price17);
				sum += qty17 * price17;
				bw.newLine();

			}
			if (qty18 != 0) {
				bw.write(sno++ + " " + food18 + " " + qty18 + " " + price18 + "  = " + qty18 * price18);
				sum += qty18 * price18;
				bw.newLine();

			}
			if (qty19 != 0) {
				bw.write(sno++ + " " + food19 + " " + qty19 + " " + price19 + "  = " + qty19 * price19);
				sum += qty19 * price19;
				bw.newLine();

			}
			if (qty20 != 0) {
				bw.write(sno++ + " " + food20 + " " + qty20 + " " + price20 + "  = " + qty20 * price20);
				sum += qty20 * price20;
				bw.newLine();

			}
			bw.newLine();
			bw.write("_____________________________________________________");
			bw.newLine();
			bw.write("total  =    " + sum);
			bw.newLine();
			bw.write("thanks please visit again " + (char) 2);
			bw.newLine();
			bw.write("_____________________________________________________");
			bw.newLine();

			bw.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getDate() {
		String date = "";
		LocalDate ld = LocalDate.now();
		date += ld.getDayOfMonth();
		date += ld.getMonth();
		date += ld.getYear();
		return date;
	}

	public String getTime() {
		String time = "";
		LocalTime lt = LocalTime.now();
		time += lt.getHour() + " : ";
		time += lt.getMinute() + " : ";
		time += lt.getSecond();
		return time;
	}

	public static void main(String[] args) {

		for (;;) {
			Taj t = new Taj();
			System.out.println("1.add user  4.exit");
			switch (sc.nextInt()) {
			case 1: {
				t.addUser();
				break;
			}
			case 2: {
				t.makeOrder();
				break;
			}
			case 3: {

				t.bill();
				break;
			}
			case 4: {
				System.out.println("application stopped");
				System.exit(10);
			}
			}
		}
	}

}
