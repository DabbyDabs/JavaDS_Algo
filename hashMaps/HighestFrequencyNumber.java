package hashMaps;

import java.util.HashMap;

public class HighestFrequencyNumber {

	public static void main(String[] args) {
		
		int arr[]= {2, 12, 2 ,11 ,12 ,2 ,1 ,2 ,2 ,11, 12 ,2 ,6 ,12,12,12,12,12,12};
		System.out.println(maxFrequencyNumber(arr));

	}
	public static int maxFrequencyNumber(int[] arr){
		HashMap<Integer,Integer> map= new HashMap();
		int max=Integer.MIN_VALUE;
		int curr=1;
		for(int i=0;i< arr.length;i++) {
		 if(map.get(arr[i])!= null) {
			 curr=map.get(arr[i]);
			 curr++;
		 }
		
		map.put(arr[i],curr);
			if(map.get(arr[i])>max) {
				max=arr[i];
			}
	curr=1;
		}
		System.out.println(map.get(max));
		return max;
	}
}
