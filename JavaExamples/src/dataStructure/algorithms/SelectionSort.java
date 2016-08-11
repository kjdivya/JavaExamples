package dataStructure.algorithms;

public class SelectionSort extends SortAbstractClass {

	@Override
	public void sort(int[] array) 
	{
		 int i, j, smallNumIndex, tmp;
	      int n = array.length;
	      for (i = 0; i < n - 1; i++) {
	    	  smallNumIndex = i;
	            for (j = i + 1; j < n; j++)
	                  if (array[j] < array[smallNumIndex])
	                	  smallNumIndex = j;
	            if (smallNumIndex != i) {
	                  tmp = array[i];
	                  array[i] = array[smallNumIndex];
	                  array[smallNumIndex] = tmp;
	                  printArray(array);
	            }
	      }
	}
}
