package arrays;

public class MergeSortVoid {

	public static void main(String[] args) {
		int arr[]= {4,12,6,7,8,1,9};
		mergeSortVoid(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	public static void mergeSortVoid(int [] arr,int begin,int end) {
		if(end-begin==0)
			return;
		int mid=(end-begin)/2;
		 mergeSortVoid(arr,begin,begin+mid);
		 mergeSortVoid(arr,begin+mid+1,end);
		int[]duplicate= new int[arr.length];
		int k=begin;
		int i=begin,j=begin+mid+1;
		for(;i<=begin+mid&&j<=end;) {
			if(arr[i]>arr[j])
			{duplicate[k]=arr[j];
			k++;
			j++;
			continue;
				}
			if(arr[i]<arr[j]) {
				duplicate[k]=arr[i];
				i++;
				k++;
			}
			
		}
		if(i>begin+mid) {
			while(j<=end) {
				duplicate[k]=arr[j];
			j++;
			k++;
			}
		
		}
		if(j>end) {
			while(i<=begin+mid) {
				duplicate[k]=arr[i];
			i++;
			k++;
		}
	   
	}
		int x=0;
		while(x!=arr.length) {
			if(duplicate[x]==0)
				{x++;continue;}
			arr[x]=duplicate[x];
			x++;
		}
		}
}
