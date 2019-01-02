package arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 5, 12, 3, 56, 1 };
		Insertionsort(arr);
	}

	public static void Insertionsort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			
			int ptr = 0;
			while (arr[ptr] <= arr[i] && ptr < i) {
				ptr++;
			}
			if (ptr == i) {
				continue;
			}

			int temp = arr[i];
			int temp1 = arr[ptr];

			for (int j = ptr; j < i; j++) {
				int temp2=arr[j+1];
				arr[j + 1] = temp1;
				temp1=temp2;
			}
			arr[ptr] = temp;
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
