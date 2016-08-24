package mycollections;

import java.util.ArrayList;
import java.util.Iterator;

import mycollections.MyArrayList.Student;

/**
 *	Java ArrayList class uses a dynamic array for storing the elements.It extends AbstractList class and implements List interface.
	Java ArrayList class can contain duplicate elements.
	Java ArrayList class maintains insertion order.
	Java ArrayList class is non synchronized.
	Java ArrayList allows random access because array works at the index basis.
	In Java ArrayList class, manipulation is slow because a lot of shifting needs to be occurred if any element is removed from the array list.

 * @author divya.j
 *
 */
public class MyArrayList {

	ArrayList<String> namesList;
	ArrayList<Student> studentList;
	
	public static void main(String[] args) 
	{
		MyArrayList al = new MyArrayList();
//		al.simpleListCreation();
		al.complexListCreation();

	}
	
	public void simpleListCreation()
	{
		
		namesList = new ArrayList<>();
		namesList.add("Divya");
		namesList.add("Santhosh");
		namesList.add("Darshan");
		namesList.add("Rashmi");
		namesList.add("Nandhini");
		
		Iterator<String> itr = namesList.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	
	public void complexListCreation()
	{
		Student s1 = new Student("Roopa",2,"9880995844");
		Student s2 = new Student("Hema", 20, "534043856");
		Student s3 = new Student("dgjh", 3, "0349860");
		
		studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		Iterator<Student> studentItr = studentList.iterator();
		while(studentItr.hasNext())
		{
			System.out.println(studentItr.next().toString());
		}
	}
	
	class Student
	{
		String name;
		int rollNumber;
		String mobileNum;
		
		public Student(String name, int rollNum, String mobileNum)
		{
			this.name = name;
			this.rollNumber = rollNum;
			this.mobileNum = mobileNum;
		}
		@Override
		public String toString()
		{
			return this.name + ", " + this.rollNumber + ", "+ this.mobileNum;
		}
	}

}
