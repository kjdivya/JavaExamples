package src.leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RankTeamsByVotes {

	public static void main(String[] args) {
		RankTeamsByVotes r = new RankTeamsByVotes();
		System.out.println(r.rankTeams(new String[]{"FVSHJIEMNGYPTQOURLWCZKAX","AITFQORCEHPVJMXGKSLNZWUY","OTERVXFZUMHNIYSCQAWGPKJL","VMSERIJYLZNWCPQTOKFUHAXG","VNHOZWKQCEFYPSGLAMXJIUTR","ANPHQIJMXCWOSKTYGULFVERZ","RFYUXJEWCKQOMGATHZVILNSP","SCPYUMQJTVEXKRNLIOWGHAFZ","VIKTSJCEYQGLOMPZWAHFXURN","SVJICLXKHQZTFWNPYRGMEUAO","JRCTHYKIGSXPOZLUQAVNEWFM","NGMSWJITREHFZVQCUKXYAPOL","WUXJOQKGNSYLHEZAFIPMRCVT","PKYQIOLXFCRGHZNAMJVUTWES","FERSGNMJVZXWAYLIKCPUQHTO","HPLRIUQMTSGYJVAXWNOCZEKF","JUVWPTEGCOFYSKXNRMHQALIZ","MWPIAZCNSLEYRTHFKQXUOVGJ","EZXLUNFVCMORSIWKTYHJAQPG","HRQNLTKJFIEGMCSXAZPYOVUW","LOHXVYGWRIJMCPSQENUAKTZF","XKUTWPRGHOAQFLVYMJSNEIZC","WTCRQMVKPHOSLGAXZUEFYNJI"}));;
	}
	
	public String rankTeams(String[] votes) 
	{
		int[][] input = new int[votes.length][votes.length];
		return "";
	}
	
	public String rankTeams1(String[] votes) 
	{
		char[] charArr;
		int val = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (String vote : votes) {
			charArr = vote.toCharArray();
			val = 0;
			for(int i=0; i<charArr.length; i++)
			{
				if(map.containsKey(charArr[i]))
				{
					val = i + map.get(charArr[i]);
					map.put(charArr[i], val);
				}
				else
				{				
					map.put(charArr[i], i);
				}
			}
		}
		String str = "";
		Map<Character, Integer> sortedMap = sortByValue((HashMap<Character, Integer>) map);
		Iterator<Character> it = sortedMap.keySet().iterator();
		while (it.hasNext()) {
			str = str+it.next();
			
		}
        return str;
    }
	
	public static HashMap<Character, Integer> sortByValue(HashMap<Character, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<Character, Integer> > list = 
               new LinkedList<Map.Entry<Character, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() { 
            public int compare(Map.Entry<Character, Integer> o1,  
                               Map.Entry<Character, Integer> o2) 
            { 
            	/*if(o1.getValue() > o2.getValue())
            		return o1.getValue();
            	else
            		if(o1.getValue() < o2.getValue())
            			return o2.getValue();
            		else
            		{
            			if (o1.getKey() > o2.getKey())
            				return o1.getValue();
            			else
            				return o2.getValue();
            		}*/
            	
            	
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>(); 
        for (Map.Entry<Character, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
}
