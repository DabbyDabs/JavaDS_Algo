package hashMaps;
import java.util.HashMap;
public class PrintArrayIntersection {

	public static void main(String[] args) {
int arr1[]= {1,2,3,4,5,6,6,2,1,1,7,8,9,10};
int arr2[]= {9,7,5,3,2,2,7,7};
intersection(arr1, arr2);
	}
	public static void intersection(int[] arr1, int[] arr2){
		HashMap<Integer,Integer> map= new HashMap();
	if(arr1.length > arr2.length) {
		for(int i=0;i< arr1.length;i++) {
			map.put(arr1[i],1);
		}
		for(int i=0;i<arr2.length;i++) {
			if(map.get(arr2[i])!=null) {
				System.out.println(arr2[i]);
				map.put(arr2[i],null);
			}
		}
	return;
	}
	for(int i=0;i< arr2.length;i++) {
		map.put(arr2[i],1);
	}
	for(int i=0;i<arr1.length;i++) {
		if(map.get(arr1[i])!=null) {
			System.out.println(arr1[i]);
			map.put(arr1[i],null);
		}
	}

	}
}
