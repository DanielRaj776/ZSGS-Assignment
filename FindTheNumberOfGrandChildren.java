package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class FindTheNumberOfGrandChildren {
    static int numOfGrandChildren (String[][] familyRelation, String name) {
	int numOfGrandChildren  = 0;
	List<String> children = new ArrayList<>();
	for(int i = 0; i < familyRelation.length; i++) {
	    if(name.equals(familyRelation[i][1]))
		children.add(familyRelation[i][0]);
	}
	for(String x : children) {
	    for(int i = 0; i < familyRelation.length; i++){
		if(x.equals(familyRelation[i][1]))
		    numOfGrandChildren++;
	    }
	}
	return numOfGrandChildren;
    }
    public static void main(String[] args) {
	String[][] familyRelation = {{"lukr", "shaw"}, {"wayne", "rooney"}, {"rooney", "ronaldo"}, {"shaw", "rooney"}};
	System.out.println(numOfGrandChildren(familyRelation, "ronaldo"));
    }
}
