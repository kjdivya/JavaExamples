package mycollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import mycollections.MyHashSet.Student;

/**
 *  uses hashtable to store the elements.It extends AbstractSet class and implements Set interface.
	contains unique elements only.
 * @author divya.j
 *
 */
public class MyHashSet {

	HashSet<String> namesSet;
	HashSet<Student> studentList;
	
	public static void main(String[] args) {

		MyHashSet mySet = new MyHashSet();
		mySet.createHashSet();
		
		System.out.println("******************");
		mySet.complexListCreation();
	}
	public void createHashSet()
	{
		namesSet = new HashSet<>();
		namesSet.add("Divya");
		namesSet.add("Santhosh");
		namesSet.add("Darshan");
		namesSet.add("Rashmi");
		namesSet.add("Nandhini");
		namesSet.add("Divya");
		namesSet.add("Divya1");
		
		Iterator<String> itr = namesSet.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public void complexListCreation()
	{
		Student s1 = new Student("Roopa",2, "98809944");
		Student s2 = new Student("Hema", 20,"534043856");
		Student s3 = new Student("dgjh", 3,"0349860");
		Student s4 = new Student("Hema", 20,"534043856");
		Student s5 = new Student("Hema", 30,"534043856");
		
		studentList = new HashSet<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
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
		
		 public int hashCode()
		 {
		        System.out.println("In hashcode");
		        int hashcode = 0;
		        hashcode += name.hashCode()+rollNumber+mobileNum.hashCode();
		        return hashcode;
		    }
		
		@Override
		public boolean equals(Object obj)
		{
			System.out.println( "In Equals");
			if(obj instanceof Student)
			{
				Student s = (Student) obj;
				return (s.name.equals(this.name) && s.rollNumber == this.rollNumber && s.mobileNum.equals(this.mobileNum));
			}
			else
				return false;
			
		}
		
		@Override
		public String toString()
		{
			return this.name + ", " + this.rollNumber + ", "+ this.mobileNum;
		}
	}
	

}
