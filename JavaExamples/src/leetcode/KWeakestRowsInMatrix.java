package src.leetcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class KWeakestRowsInMatrix {

	public static void main(String[] args) {
		KWeakestRowsInMatrix week = new KWeakestRowsInMatrix();
		
		int[][] mat = {{1,1,0,0,0},
				 	{1,1,1,1,0},
				 	{1,0,0,0,0},
				 	{1,1,0,0,0},
				 	{1,1,1,1,1}};
		int k = 3;
		
		int[] output = week.kWeakestRows(mat, k);
		/*for (int i : output) {
			System.out.println(i);
		}*/
	}
	
	public int[] kWeakestRows(int[][] mat, int k) {
        
		int[] arr = new int[mat.length];
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for(int i = 0; i < mat.length; i++)
		{
			count = 0; 
			for (int j = 0; j<mat[i].length; j++)
			{
				if(mat[i][j] == 1)
				{
					count++;
				}
			}
			arr[i] = count;
			map.put(arr[i], count);
		}
		for (int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		int[] oldArray = arr.clone();
		Arrays.sort(arr);
		
		System.out.println("Old array");
		for (int i = 0; i <oldArray.length; i++) {
			System.out.println(i+":"+oldArray[i]);
		}
		
		System.out.println("sorted array");
		for (int i = 0; i <arr.length; i++) {
			System.out.println(i+":"+arr[i]);
		}
		
		/*while(map.keySet().iterator().hasNext())
		{
			while(map.values().iterator().hasNext())
			{
				System.out.println(map.values().re);
			}
		}*/
		
		return new int[]{1,2};
    }

		

}
