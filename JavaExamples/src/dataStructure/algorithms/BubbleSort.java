package dataStructure.algorithms;

public class BubbleSort implements MySort
{
	static int[] array = null;
	public static void main(String[] args) 
	{
		MySort sort = new BubbleSort();
		
		array = new int[] {3,6,2,7,1,8,5};
		
		System.out.println("Before Sort");
		sort.printArray(array);
		
		
		sort.sort(array);
		
		System.out.println("Before Sort");
		sort.printArray(array);
	}
	
	public void printArray(int[] array)
	{
		int size = array.length;
		
		for(int i = 0 ; i < size; i++)
		{
			System.out.print(" "+ array[i]);
		}
		System.out.println();
		System.out.println("****************");
	}

	@Override
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
