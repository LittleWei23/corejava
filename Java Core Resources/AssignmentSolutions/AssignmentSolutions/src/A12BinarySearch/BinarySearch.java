package A12BinarySearch;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		String arr[] = {"V","A","Z","P"};
		int result = Arrays.binarySearch(arr, "Z");
		System.out.println("Z is found at index "+result);
	}

}
