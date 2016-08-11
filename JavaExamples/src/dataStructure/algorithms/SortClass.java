package dataStructure.algorithms;

public class SortClass {

	static int[] array = null;
	
	public static void main(String[] args) {
		
//		MySort sort = new BubbleSort();
		
		SortInterface sort = new SelectionSort();
		
		array = new int[] {5, 1, 12, -5, 16, 2, 12, 14}; //{3,6,2,7,1,8,5};
		
		System.out.println("Before Sort");
		sort.printArray(array);
		
		
		sort.sort(array);
		
		System.out.println("After Sort");
		sort.printArray(array);
	}
	

}
