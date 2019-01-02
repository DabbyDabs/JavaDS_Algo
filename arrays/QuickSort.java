package arrays;


public class QuickSort {

	public static void main(String[] args) {
int arr[]= {2,34,4,4,21,0,0,7,11};
quickSort(arr);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}

	}
public static int[] quickSort(int arr[]) {
	if(arr.length==1||arr.length==0) {
		return arr;
	}
	int count=partition(arr);
	int temp;
	temp=arr[count];
	arr[count]=arr[0];
	arr[0]=temp;
	int x=0;
	int y=arr.length-1;
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
	int[]leftarray=new int[count];
	for(int i=0;i<leftarray.length;i++) {
		leftarray[i]=arr[i];
	}
	int[]rightarray=new int[arr.length-count-1];
	for(int i=0;i<rightarray.length;i++) {
		rightarray[i]=arr[count+1+i];
	}
	leftarray=quickSort(leftarray);
	rightarray=quickSort(rightarray);
	int k=0;
	for(int i=0;i<arr.length;i++) {
		if(i<leftarray.length)
			{arr[i]=leftarray[i];
		continue;}
		if(i==count) {
			arr[i]=arr[count];
		}
		if(i>count) {
			arr[i]=rightarray[k];
			k++;
		}
	}
	return arr;
}
	

	
	
public static int partition(int arr[]) {
	int count=0;
	for(int i=1;i<arr.length;i++) {
		if(arr[i]<arr[0])
			count++;
		}
	
		return count;
		}
	
}

