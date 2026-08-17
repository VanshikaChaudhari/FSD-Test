package test1;

public class ReverseArrayElement {

	public static void printReverse(int[] arr) {
		System.out.print("Aray in reverse order :");
		for (int i = arr.length -1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
			
		}
		
		System.out.println();
	}
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		
		printReverse(numbers);
		
	}
	

}
