package hashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import binaryTrees.BinaryTreeNode;

public class VerticalOrder {

	public static void main(String[] args) {
 
 BinaryTreeNode<Integer>root= new BinaryTreeNode<>(1);
 BinaryTreeNode<Integer> node2= new BinaryTreeNode(2);
 BinaryTreeNode<Integer> node3= new BinaryTreeNode(3);
 BinaryTreeNode<Integer> node4= new BinaryTreeNode(4);
 BinaryTreeNode<Integer> node5= new BinaryTreeNode(5);
 BinaryTreeNode<Integer> node6= new BinaryTreeNode(6);
 BinaryTreeNode<Integer> node7= new BinaryTreeNode(7);
 BinaryTreeNode<Integer> node8= new BinaryTreeNode(8);
 root.left=node2;
 root.right=node3;
 node2.left=node4;
 node2.right=node5;
 node4.right=node8;
 node3.left=node6;
 node3.right=node7;
 printBinaryTreeVerticalOrder(root);
 
 
		
	}  
	public static void printBinaryTreeVerticalOrder(BinaryTreeNode<Integer> root){
		HashMap<Integer,ArrayList<Integer>> map= new HashMap();
		map=PrintVerticallyHelper(root,0,map);
		Set<Integer> keys= map.keySet();
		for(Integer i:keys) {
			ArrayList temp= map.get(i);
			for(int j=0;j<temp.size();j++) {
				System.out.print(temp.get(j)+" ");
			}
			System.out.println();
		}
		
	}

	public static HashMap<Integer, ArrayList<Integer>> PrintVerticallyHelper(BinaryTreeNode<Integer> root, int key,
			HashMap<Integer, ArrayList<Integer>> map) {
		if(map.get(key)==null) {
			ArrayList<Integer> list= new ArrayList(5);
			list.add(root.data);
			map.put(key,list );
			if(root.left!=null) {
				map=PrintVerticallyHelper(root.left,key-1,map);
			}
			if(root.right!=null) {
				map=PrintVerticallyHelper(root.right,key+1,map);
			}
			return map;
			}
		ArrayList<Integer> temp=map.get(key);
		temp.add(root.data);
		if(root.left!=null) {
			map=PrintVerticallyHelper(root.left,key-1,map);
		}
		if(root.right!=null) {
			map=PrintVerticallyHelper(root.right,key+1,map);
		}
		return map;
		
		}
}
