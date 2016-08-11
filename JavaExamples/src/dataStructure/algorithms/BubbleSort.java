package dataStructure.algorithms;

public class BubbleSort extends SortAbstractClass
{
	public void sort(int[] array)
	{
		int temp = -1;
		boolean isSorted = false;
		
		while(!isSorted)
		{
			for (int i = 0; i < array.length-1; i++)
			{
				if(array[i] >= array[i+1])
				{
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					
					isSorted = true;
					printArray(array);
				}
			}
			if(isSorted)
				isSorted = false;
		}
	}

}
