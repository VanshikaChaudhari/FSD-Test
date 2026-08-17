package test1;

public class FrequencyCountOfFour {

	public static int countFourFrequency(int[] arr) {
		int count =0;
		for (int num: arr) {
			if (num == 4) {
				count++;
				}
		  }
		return count;
		
	}
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 4, 4, 3, 2, 4};
		
		int frequency = countFourFrequency(numbers);
		System.out.println("Frequency of 4 in the array : "+ frequency);
		
		
	}

}
