package dataStructure.algorithms;

public abstract class SortAbstractClass implements MySort {

	@Override
	public abstract void sort(int[] array);

	@Override
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

}
