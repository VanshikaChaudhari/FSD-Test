package test1;

import java.util.Scanner;

public class YoungestPerson {

	public static String findYoungest(int ram, int shyam, int ajay) {
		if (ram <= shyam && ram <= ajay) {
			return "Ram";
		}
		else if (shyam <= ram && shyam <= ajay) {
			return "Shyam";
		}
		else {
			return "Ajay";
		}
	}
	public static void main (String[] ars) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter Ram's age: ");
		int ram = scanner.nextInt();
		System.out.println("Enter Shyam's age: ");
		int shyam = scanner.nextInt();
		System.out.println("Enter Ajay's age: ");
		int ajay = scanner.nextInt();
		
		String youngest = findYoungest(ram, shyam, ajay);
		System.out.println("The Youngest is " + youngest);
		
		
		
	}

}
