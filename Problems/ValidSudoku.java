package problem;

import java.util.HashSet;
import java.util.Set;

class ValidSudoku {
    static boolean validRow (char[][] r) {	
	for(int i = 0; i < r.length; i++) {
	    Set<Character> rowset = new HashSet<>();
	    for(int j =0; j < r[i].length; j++) {
		if(r[i][j] == '.')
		    continue;
		
		    if(rowset.contains(r[i][j]))
			return false;
		    else
			rowset.add(r[i][j]);
		}
	}
	return true;
    }
    
    static boolean validColumn (char[][] c) {
	for(int i = 0; i < c.length; i++) {
	    Set<Character> columnSet = new HashSet<>();
	    for(int j = 0; j < c.length; j++) {
		if(c[j][i] == '.')
		    continue;
		
		if(columnSet.contains(c[j][i]))
			return false;
		else
		    columnSet.add(c[j][i]);
	    }
	}
	return true;
    }
    
    static boolean validBox (char[][] b) {
	Set<Character> box1 = new HashSet<>();
	Set<Character> box2 = new HashSet<>();
	Set<Character> box3 = new HashSet<>();
	    
	for(int i = 0; i < b.length; i++) {
	    for(int j = 0; j < b.length; j++) {
		if(b[i][j] == '.')
		    continue;
		
		switch(j) {
		case 0:
		case 1:
		case 2:
		    if(box1.contains(b[i][j]))
			return false;
		    else
			box1.add(b[i][j]);
		    break;
		case 3:
		case 4:
		case 5:
		    if(box2.contains(b[i][j]))
			return false;
		    else
			box2.add(b[i][j]);
		    break;
		case 6:
		case 7:
		case 8:
		    if(box3.contains(b[i][j]))
			return false;
		    else
			box3.add(b[i][j]);
		}
	    }
	    switch(i) {
	    case 2:
	    case 5:
	    case 8:
		box1.clear();
		box2.clear();
		box3.clear();
	    }
	}
	
	return true;
    }
    static boolean isValid (char[][] board) {
	return validRow(board) && validColumn(board) && validBox(board);
    }
    public static void main(String[] args) {
	
	
    }

}
