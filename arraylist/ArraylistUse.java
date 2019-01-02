package arraylist;

import java.util.ArrayList;

public class ArraylistUse {

	public static void main(String[] args) {	
understandingRecursion(7,0);
	}
	static void increment(int i) {
		i++;
	}
public static int understandingRecursion(int k,int count) {
	if(k==1) {
		System.out.println(count);
	count=3;
	return count;
	}
count=understandingRecursion(--k, count);
	System.out.println(count);
	return 0;
}
}
//s=s+"abv";
//System.out.println(s);
//for(int i=0;i<args.length;i++) {
//System.out.println("I am trying");
//System.out.println("args[" + i + "]: " +
//        args[i]);
//}




//ArrayList<Integer> list1 = new ArrayList<>();
//ArrayList<Integer> list2 = new ArrayList<>(45);
//ArrayList<String> list3 = new ArrayList<>();
//list3.add("mayank");
//list3.get(0);
//System.out.println(list3.get(0));
//System.out.println(list3.size());
//list1.add(2);
//list1.add(11);
//list1.add(3);
//list1.add(9);
//for(int i=0;i<list1.size();i++)
//System.out.print(list1.get(i)+" ");
//list1.add(1,8);
//System.out.println();
//for(int i=0;i<list1.size();i++)
//System.out.print(list1.get(i)+" ");
//list1.set(1,4);
//System.out.println();
//for(int i=0;i<list1.size();i++)
//System.out.print(list1.get(i)+" ");
//System.out.println();
//list1.remove(3);
//for(int i=0;i<list1.size();i++)
//System.out.print(list1.get(i)+" ");
//increment(i);
//System.out.println(i);}
