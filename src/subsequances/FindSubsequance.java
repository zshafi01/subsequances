package subsequances;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class FindSubsequance {
	public static void main(String[] args) {
		
	
	
	Integer [] myarray = {2,4,6,8,3,9,1};
	Integer[] copyOfMyArray = Arrays.copyOf(myarray, myarray.length);
	
	//
	List<Integer> myList = Arrays.asList(myarray);
	System.out.println(myList);
	HashMap<Integer, List<Integer>> groups= new HashMap<>();
	
	Collections.sort(myList);
	System.out.println(myList);
	List<Integer> group= new ArrayList<>();
	int i=0;
	
	//to group of sequances {1=[6], 2=[8, 9], 4=[1, 2, 3, 4]}
	for (Integer element:myList) {
		
		if(myList.contains(element+1)) {
			group.add(element);
		}else
		{
			group.add(element);
			groups.put(group.size(), group);
			group= new ArrayList<>();
		}
	}
System.out.println(groups);
Set<Integer> keySet = groups.keySet();
Integer maxkey=0;
//to get maximum key
for(Integer key:keySet) {
	if (key>maxkey) {
		maxkey=key;
	}
	System.out.println(key);
}

List<Integer> maxSequanceList = groups.get(maxkey);
List<Integer> resultList=new ArrayList<>();
System.out.println(maxSequanceList);

System.out.println(copyOfMyArray);
for(int v=0; v<copyOfMyArray.length; v++) {
	if (maxSequanceList.contains(copyOfMyArray[v])) {
		resultList.add(copyOfMyArray[v]);
	}
	
}
System.out.println(resultList);






	}
}
