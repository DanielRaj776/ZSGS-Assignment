package problem;

import java.util.ArrayList;
import java.util.List;

class LetterCombination {
    static List<String> letterCombinations(String digits){
	if(digits.length() == 0)
	    return new ArrayList<>();
	
	int[] index = new int[digits.length()];
	final int[] end = new int[digits.length()];
	int loop = 1; 
	List<String> combination = new ArrayList<>();
	for(int i = 0; i < digits.length(); i++) {
	    char ch = digits.charAt(i);
	    if(ch == '7' || ch == '9') {
		end[i] = 3;
	    }else
		end[i] = 2;
	}
	
	for(int i = 0; i < end.length; i++) {
	    loop *= (end[i] + 1);
	}
	
	for(int i = 0; i < loop; i++) {
	    String temp = "";
	    for(int j = 0; j < digits.length(); j++) {
		switch(digits.charAt(j)) {
		case '2':
		    switch(index[j]) {
		    case 0:
			temp += 'a';
			break;
		    case 1:
			temp += 'b';
			break;
		    case 2:
			temp += 'c';
			break;
		    }
		    break;
		case '3':
		    switch(index[j]) {
		    case 0:
			temp += 'd';
			break;
		    case 1:
			temp += 'e';
			break;
		    case 2:
			temp += 'f';
			break;
		    }
		    break;
		case '4':
		    switch(index[j]) {
		    case 0:
			temp += 'g';
			break;
		    case 1:
			temp += 'h';
			break;
		    case 2:
			temp += 'i';
			break;
		    }
		    break;
		case '5':
		    switch(index[j]) {
		    case 0:
			temp += 'j';
			break;
		    case 1:
			temp += 'k';
			break;
		    case 2:
			temp += 'l';
			break;
		    }
		    break;
		case '6':
		    switch(index[j]) {
		    case 0:
			temp += 'm';
			break;
		    case 1:
			temp += 'n';
			break;
		    case 2:
			temp += 'o';
			break;
		    }
		    break;
		case '7':
		    switch(index[j]) {
		    case 0:
			temp += 'p';
			break;
		    case 1:
			temp += 'q';
			break;
		    case 2:
			temp += 'r';
			break;
		    case 3:
			temp += 's';
			break;
		    }
		    break;
		case '8':
		    switch(index[j]) {
		    case 0:
			temp += 't';
			break;
		    case 1:
			temp += 'u';
			break;
		    case 2:
			temp += 'v';
			break;
		    }
		    break;
		case '9':
		    switch(index[j]) {
		    case 0:
			temp += 'w';
			break;
		    case 1:
			temp += 'x';
			break;
		    case 2:
			temp += 'y';
			break;
		    case 3:
			temp += 'z';
			break;
		    }
		    break;
		}
	    }
	    for(int k = index.length-1; k > -1 ; k--) {
		    if(k != 0 && index[k] >= end[k]) {
			index[k] = 0;
			index[k-1] += 1;
			if(index[k-1] > end[k-1]) {   
			}else
			    break;
		    }else {
			index[k] += 1;
			break;
		    }
		}
	    combination.add(temp);
	}
	return combination;
    }
    public static void main(String[] args) {
	String s = "237";
	List<String> output =  letterCombinations(s);
	for (int i = 0; i < output.size(); i++) {
	    System.out.print(output.get(i) + " ");
	}
	
    }

}
