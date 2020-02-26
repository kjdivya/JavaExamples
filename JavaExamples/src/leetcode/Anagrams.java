package src.leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Anagrams {
	public static void main(String[] args) {

        String s2 = "abc";
        Anagrams ang = new Anagrams();
        System.out.println(ang.isAnagram("eat", "tea"));

        List<List<String>> list = ang.groupAnagrams(new String[] {"ray","cod","abe","ned","arc","jar","owl","pop","paw","sky","yup","fed","jul","woo","ado","why","ben","mys","den","dem","fat","you","eon","sui","oct","asp","ago","lea","sow","hus","fee","yup","eve","red","flo","ids","tic","pup","hag","ito","zoo"});
        for (List<String> mainList: list) {
            for (int i =0 ;i < mainList.size(); i++)
            {
                System.out.print(mainList.get(i)+", ");
            }
            System.out.println();

        }
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> list = null;
        List<List<String>> longList = new ArrayList<>();

        List<String> inputList = new ArrayList<>();
        for (String string : strs) {
        	inputList.add(string);
		}
        int count = 0;
        int index = 1;

        while(inputList.size() > 0)
        {
        	count = 0;
        	index = 0;
        	
            while (index < inputList.size())
            {
            	if(count == 0)
            	{
            		list = new ArrayList<>();
                    list.add(inputList.get(0));
                    longList.add(list);
                    inputList.remove(0);
            	}
            	if (inputList.size()>0 && isAnagram(list.get(0), inputList.get(index))) {
            		list.add(inputList.get(index));
            		inputList.remove(index);
                }
            	else
            		index++;
            	
            	count++;
            }
        }
        return longList;
    }

    public boolean isAnagram(String s1, String s2)
    {
        if(s1.length() != s2.length())
            return false;
        char[] chars = s2.toCharArray();
        int count = 0;
        while(s1.length()>0)
        {
            if(s1.indexOf(chars[count]) >= 0) 
            {
            	s1 = s1.substring(0,s1.indexOf(chars[count]))+ s1.substring(s1.indexOf(chars[count])+1);
            	count++;
            }
            else
            	return false;
           
        }
        return true;

    }
    
    public boolean isAnagram1(String s1, String s2)
    {
        if(s1.length() != s2.length())
            return false;
        char[] chars = s2.toCharArray();
        for(int i = 0; i < s1.length(); i++)
        {
            if(s1.indexOf(chars[i]) < 0) // (s2.charAt(i)))
            {
                return false;
            }
        }
        return true;

    }
}
