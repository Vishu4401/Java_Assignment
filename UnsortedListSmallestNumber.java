package program.java.AssistedPractice_02_08_2022;

import java.util.Arrays;
public class UnsortedListSmallestNumber {
	public static int kthSmallest(Integer[] arr, int k)
	{
		Arrays.sort(arr);
		return arr[k - 1];
	}

	public static void main(String[] args)
	{
		Integer arr[] = new Integer[] { 7, 45, 9, 3, 56, 45, 98, 100, 24, 30, 75, 20};
		int k = 4;
		System.out.print("K'th smallest element is " + kthSmallest(arr, k));
	}
}
