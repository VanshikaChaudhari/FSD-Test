package test1;

public class DigitSum {
	
	public static int getDigitSum(int num) {
		int sum = 0;
		while (num > 0) {
			sum+= num % 10;
			num /= 10;
		}
		return sum;
	}
	
	public static void  main(String[] args) {
		int input = 123;
		
		int result = getDigitSum(input);
		System.out.println("Input : " + input);
		System.out.println("Output : " + result);
	}

}
