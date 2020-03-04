package src.leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ThreeSums {

	public static void main(String[] args) {

		ThreeSums sums = new ThreeSums();
		List<List<Integer>> oList = sums
				.threeSum1(new int[] { -1,0,1,2,-1,-4});
		for (List<Integer> list : oList) {
			for (Integer integer : list) {
				System.out.print(integer + ",");
			}
			System.out.println();
		}

	}

	public List<List<Integer>> threeSum1(int[] nums) {
		List<List<Integer>> oList = new ArrayList<List<Integer>>();
		List<Integer> list = null, testList, copyList;
		boolean isPresent = false;
		Set<Integer> setI = new HashSet<Integer>(), setJ = new HashSet<Integer>(), setK = new HashSet<Integer>();

		for (int i = 0; i < (nums.length - 2); i++) 
		{
			if (setI.add(nums[i])) {
				for (int j = i + 1; j < (nums.length - 1); j++) 
				{
					if (setJ.add(nums[j])) {
						for (int k = j + 1; k < nums.length; k++) {
							if (setK.add(nums[k]) ) {
								if (nums[i] + nums[j] + nums[k] == 0) {
									isPresent = false;
									for (int m = 0; m < oList.size(); m++) {
										copyList = oList.get(m);
										testList = new ArrayList<Integer>();
										testList.addAll(copyList);
										if (testList.contains(nums[i]))
											testList.remove(new Integer(nums[i]));
										if (testList.contains(nums[j]))
											testList.remove(new Integer(nums[j]));
										if (testList.contains(nums[k]))
											testList.remove(new Integer(nums[k]));
										if (testList.size() == 0) {
											isPresent = true;
											break;
										}
									}

									if (!isPresent) {
										list = new ArrayList<Integer>();
										list.add(nums[i]);
										list.add(nums[j]);
										list.add(nums[k]);
										oList.add(list);
									}
								}
							}
						}
						setK.clear();
					}
					
				}
				setJ.clear();
			}

		}
		return oList;
	}

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> oList = new LinkedList<List<Integer>>();
		List<Integer> list = null;

		for (int i = 0; i < (nums.length - 2); i++) {
			for (int j = i + 1; j < (nums.length - 1); j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						list = new LinkedList<Integer>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						if (!oList.contains(list))
							oList.add(list);
					}
				}
			}

		}
		return oList;
	}

}
