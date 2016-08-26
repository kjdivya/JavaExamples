package mycollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MyComparableInterfaceTest 
{
	public static void main(String[] args) 
	{
		MyComparableInterfaceTest compare = new MyComparableInterfaceTest();
		List<MyComparableInterfaceTest.MyStudent> studendList = new ArrayList<MyComparableInterfaceTest.MyStudent>();
		studendList.add(compare.new MyStudent("rrrr", 43, 23));
		studendList.add(compare.new MyStudent("Divya", 10, 123));
		studendList.add(compare.new MyStudent("Saras", 67, 2345));
		studendList.add(compare.new MyStudent("sdf", 34, 23545));
		System.out.println("Before Sort");
		for (MyStudent myStudent : studendList) {
			System.out.println(myStudent.toString());
		}
		Collections.sort(studendList);
		
		System.out.println("After Sort");
		for (MyStudent myStudent : studendList) {
			System.out.println(myStudent.toString());
		}
	}
	
	
	class MyStudent implements Comparable<MyStudent>
	{
		String name;
		int age;
		int rollNum;
		
		public MyStudent(String name, int age, int rollNum)
		{
			this.name = name;
			this.age = age;
			this.rollNum = rollNum;
		}
		
		
		@Override
		public int compareTo(MyStudent student) {
			if(this.age == student.age)
				return 0;
			else
				if(this.age > student.age)
					return 1;
				else
			return -1;
		}
		
		public String toString()
		{
			return this.name+", "+ this.age+ ", "+ this.rollNum ;
		}
		
	}

}
