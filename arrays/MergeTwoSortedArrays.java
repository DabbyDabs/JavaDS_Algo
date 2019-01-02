package arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
int [] arr1= {1,3,6,9};
int []arr2= {2,4,5,7,10};
PrintArray(mergeSortedArrays(arr1, arr2));
//PrintArray(arr1);
	}
public static int[] mergeSortedArrays(int[] arr1,int[]arr2) {
	int[] answer= new int[arr1.length+arr2.length];
	int x=0,y=0,k=0;
	while(x<arr1.length&&y<arr2.length) {
		if(arr1[x]<=arr2[y])
		{answer[k]=arr1[x];
		k++;
		x++;
		continue;	
		}
		if(arr1[x]>arr2[y]) {
			answer[k]=arr2[y];
			y++;
			k++;
			
		}
		
		
	}
	if(x==arr1.length) {
		for(;k<answer.length;k++)
			{answer[k]=arr2[y];
					y++;}
	}
	if(y==arr2.length) {
		for(;k<answer.length;k++)
			{answer[k]=arr1[x];
					x++;}
					 
	}
	return answer;
}
public static void PrintArray(int[] arr) {
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	
}
}
