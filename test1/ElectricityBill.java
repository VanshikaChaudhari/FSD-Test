package test1;

import java.util.Scanner;

public class ElectricityBill {

	public static double  calculateBill(double units) {
		double amount = 0;
		
		if (units <= 100) {
			amount = units * 5.5;
			}
		else if (units <= 200) {
			amount = (100 * 5.5) + ((units - 100) * 6.5);
			}
		else if (units <= 300) {
			amount = (100 * 5.5) + (100 * 6.5) + ((units - 200) * 7.5);
		   }
		else {
			amount = (100 * 5.5) + (100 * 6.5) + (100 * 7.5) + ((units - 300) * 8.5);
		}
		
		return amount + 100;

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter monthly electricity consumption (units):");
		 double units = sc.nextDouble();
		 
		 double totalBill = calculateBill(units);
		 System.out.println("Total Electricity Bill: Rs " + totalBill);
	 }  
}


