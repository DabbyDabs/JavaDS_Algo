package arrays;

public class MergeSort {

	public static void main(String[] args) {
int[] arr= {2,34,5,6,77,11,23,4};
PrintArray(MergeSort(arr));
	}
public static int[] MergeSort(int[] arr) {
	if(arr.length<=1)
		return arr;
	int x= arr.length/2;
	int y=arr.length-x;
	int[] smallleft=new int[x];
	int[]smallright= new int[y];
	int k=0;
	for(int i=0;i<arr.length;i++) {
		if(i<arr.length/2) {
			smallleft[i]=arr[i];
		}
		else {
			smallright[k]=arr[i];
			k++;
		}
	}
	
	
	int[] ans1=MergeSort(smallleft);
	int[] ans2=MergeSort(smallright);
	int[] answer=mergeSortedArrays(ans1,ans2);
	return answer;
	
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
