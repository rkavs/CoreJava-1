package main.java_array.array_indexoutofbounds_exception;

public class TestArrayException {
	public static void main(String args[]) {
		int arr[] = { 50, 60, 70, 80 };
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
