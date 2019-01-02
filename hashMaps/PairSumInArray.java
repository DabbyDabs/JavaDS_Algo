package hashMaps;

import java.util.HashMap;

public class PairSumInArray {

	public static void main(String[] args) {
int arr[]= {1 ,3, 6 ,2 ,5, 4 ,3 ,2 ,4};
PairSumInArray(arr, 7);
	}
	public static void PairSumInArray(int[] input, int N) {
		   HashMap<Integer,Integer> map= new HashMap<>();
		   int curr=0;
				for(int i=0;i<input.length;i++) {
					curr= N-input[i];
				 if(map.containsKey(curr)==true) {
					 
					 if(curr < input[i]) {
						 for(int k=0;k<map.get(curr);k++){
						 System.out.println(curr+" "+input[i]);
						 }
					 }
					 else {
						 for(int k=0;k<map.get(curr);k++){
							 System.out.println(input+" "+curr);
							 }					 }
					 int x= map.get(curr);
					 map.put(curr,x+1);
					 continue;
				 }
					map.put(input[i],1);
				}
			}
}
