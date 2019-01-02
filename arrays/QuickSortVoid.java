package arrays;

public class QuickSortVoid {

	public static void main(String[] args) {
	//	int arr[]= {2,34,4,4,21,0,7,11};
		int[] arr= {1,2,45,4};
		quickSortVoid(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");}
	}
	public static void quickSortVoid(int arr[],int si,int ei) {
		if(ei-si==0)
			return;
		
		int pivot=partition2(arr,si,ei);
		if(pivot!=si)
		quickSortVoid(arr, si,pivot-1);
		if(pivot!=ei)
		quickSortVoid(arr, pivot+1,ei);
		
		}
		

		
		
	public static int partition2(int arr[],int si,int ei) {
		int count=si;
		for(int i=si+1;i<=ei;i++) {
			if(arr[i]<arr[si])
				count++;
			}
		int temp;
		temp=arr[count];
		arr[count]=arr[si];
		arr[si]=temp;
		int x=si;
		int y=ei;
		temp=0;
		while(x!=count||y!=count) {
			while( arr[x]<arr[count]) {
				x++;
			if(x==count)
				break;}
			while(y!=count && arr[y]>arr[count]) {
				y--;
				if(y==count)
				break;}
			if(x==count||y==count)
				break;
			temp=arr[x];
			arr[x]=arr[y];
			arr[y]=temp;
		
			}
		
		
			return count;
			}
		
}
