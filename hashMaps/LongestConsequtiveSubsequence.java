package hashMaps;

import java.util.HashMap;

public class LongestConsequtiveSubsequence {

	public static void main(String[] args) {
		int arr[] = { 0, 2, 1, 56, 43, 42, 41, 39, 40 };
		HashMap<TwoIntObj, Integer> map = new HashMap();
		TwoIntObj test= new TwoIntObj(2,7);
		map.put(test, 6);
	}
//public static HashMap<TwoIntObj,Integer> processArrayIntoMap( HashMap<TwoIntObj,Integer> map, int[] arr){
//	if(arr.length==0) {
//		return map;
//	}
//	TwoIntObj first= new TwoIntObj(arr[0]);
//	map.put(first,1);
//	
//	
//}
}
