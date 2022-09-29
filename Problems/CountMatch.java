package problem;

import java.util.Arrays;
import java.util.List;

class CountMatch {
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
	int roleIndex = 0;
	switch(ruleKey) {
	case "type":
	    roleIndex = 0;
	    break;
	case "color":
	    roleIndex = 1;
	    break;
	case "name":
	    roleIndex = 2;
	    break;
	}
	int count = 0;
	for(List<String> x : items) {
	    if(x.get(roleIndex).equals(ruleValue))
		count++;
	}
	return count;
    }
    public static void main(String[] args) {
	
	List<List<String>> listOfList = Arrays.asList(
		Arrays.asList("Phone", "Red", "Samsung"),
		Arrays.asList("Computer", "Blue", "Acer"),
		Arrays.asList("phone", "Blue", "Realme")
		);
	int num = countMatches(listOfList, "color", "Blue");
	System.out.println(num);
    }

}
