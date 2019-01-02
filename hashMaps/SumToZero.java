package hashMaps;
import java.util.HashMap;
public class SumToZero {

	public static void main(String[] args) {
	int arr[]= {1,2,3,-3,4,-3,-9,8,7,-6,6,7,9};
	PairSum(arr, arr.length);

	}
public static void PairSum(int[] input, int size) {
   HashMap<Integer,Integer> map= new HashMap<>();
   int curr=0;
		for(int i=0;i<input.length;i++) {
			curr=(-1)*(input[i]);
		 if(map.containsKey(curr)==true) {
			 if(curr < input[i]) {
				 System.out.println(curr+" "+input[i]);
			 }
			 else {
			 System.out.println(input[i]+" "+curr);
			 }
		 }
			map.put(input[i],1);
		}
	}
}
