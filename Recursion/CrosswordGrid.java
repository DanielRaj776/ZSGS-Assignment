package Recirsion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CrosswordGrid {
    private enum Table{
	ROW, COLUMN;
    }
    private class Space{
	Table type;
	int index;
	int start;
	int end;
	int length;
	public Space(Table table) {
	    this.type = table;
	}
	public String toString() {
	    String string = "[" + type +", " + index + ", " + start + ", " + end + ", " + length + " ]";
	    return string;
	}
    }
    private Map<Space, String> fillRow (Map<Space, String> result, List<String> words, List<Space> rowSpaces, List<Space> columnSpaces){
	if(words.size() == 0)
	    return result;
	for(Space rowSpace : rowSpaces) {
	    for(String word : words) {
		if(rowSpace.length == word.length()) {
		    List<String> tempWords = new LinkedList<>(words);
		    Map<Space, String> tempResult = new HashMap<>(result);
		    boolean found = true;
		    for(Map.Entry<Space, String> entry : result.entrySet()) {
			if(entry.getKey().type == Table.COLUMN) {
			    if((rowSpace.index >= entry.getKey().start && rowSpace.index <= entry.getKey().end) && (entry.getKey().index >= rowSpace.start && entry.getKey().index <= rowSpace.end)) {
				found = false;
				if(word.charAt(entry.getKey().index - rowSpace.start) == entry.getValue().charAt(rowSpace.index - entry.getKey().start)) {
				    found = true;
				}
			    }
			}
		    }
		    if(found) {
			tempWords.remove(word);
			 tempResult.put(rowSpace, word);
			 tempResult = fillColumn(tempResult,rowSpace, tempWords, rowSpaces, columnSpaces);
			 if(tempResult.size() == rowSpaces.size() + columnSpaces.size()) {
			     return tempResult;
			 }
		    }
		}
	    }
	}
	return result;
    }
    private Map<Space, String> fillColumn (Map<Space, String> result, Space key, List<String> words, List<Space> rowSpaces, List<Space> columnSpaces){
	if(words.size() == 0)
	    return result;
	Space rowSpace = key;
	String rowString = result.get(key);
	Map<Space, String> tempResult = new HashMap<CrosswordGrid.Space, String>(result);
	List<String> tempWords = new LinkedList<>(words);
	Set<Space> addedColumns = new HashSet<>();
	boolean found = true;;
	for(Space columSpace : columnSpaces) {
	    if(result.containsKey(columSpace)) {
		continue;
	    }else {
		if((rowSpace.index >= columSpace.start && rowSpace.index <= columSpace.end) && (columSpace.index >= rowSpace.start && columSpace.index <= rowSpace.end)) {
		    found = false;
		    for(String word : words) {
			if(word.length() == columSpace.length) {
			    if(word.charAt(rowSpace.index - columSpace.start) == rowString.charAt(columSpace.index - rowSpace.start)) {
				found = true;
				tempWords.remove(word);
				tempResult.put(columSpace, word);
				addedColumns.add(columSpace);
			    }
			}
		    }
		}
	    }
	}
	if(found) {
	    tempResult = fillRow(tempResult, tempWords, rowSpaces, columnSpaces);
	    if(tempResult.size() == rowSpaces.size() + columnSpaces.size()) {
		return tempResult;
	    }
	}
	return result;
    }
    public char[][] findPosition (char[][] grid, List<String> words){
	List<Space> rowSpaces = new LinkedList<>();
	List<Space> columnSpaces = new LinkedList<>();
	for(int i = 0; i < grid.length; i++) {
	    boolean foundStart = false;
	    int count = 0;
	    Space rowSpace = null;
	    for(int j = 0; j < grid[i].length; j++) {
		if(!foundStart && grid[i][j] == '-') {
		    foundStart = true;
		    rowSpace = new Space(Table.ROW);
		    rowSpace.start = j;
		    rowSpace.index = i;
		}
		if(foundStart && grid[i][j] == '+' && count == 1) {
		    foundStart = false;
		    rowSpace = null;
		    count = 0;   
		}else if(foundStart && (grid[i][j] == '+' || (grid[i][j] == '-' && grid[i].length - 1 == j))) {
		    foundStart = false;
		    if(grid[i][j] == '-' && grid[i].length - 1 == j) {
			rowSpace.end = j;
			rowSpace.length = ++count;
		    }else {
			rowSpace.end = j - 1;
			rowSpace.length = count;
		    } 
		    rowSpaces.add(rowSpace);
		    count = 0;
		}else if (foundStart)
		    count++;
	    }
	}
	for(int i = 0; i < grid[0].length; i++) {
	    boolean foundStart = false;
	    int count = 0;
	    Space columnSpace = null;
	    for(int j = 0; j < grid.length; j++) {
		if(!foundStart && grid[j][i] == '-') {
		    foundStart = true;
		    columnSpace = new Space(Table.COLUMN);
		    columnSpace.start = j;
		    columnSpace.index = i;
		}
		if(foundStart && grid[j][i] == '+' && count <= 1) {
		    foundStart = false;
		    columnSpace = null;
		    count = 0;
		}else if(foundStart && (grid[j][i] == '+' || (grid[j][i] == '-' && grid.length - 1 == j))) {
		    foundStart = false;
		    if(grid[j][i] == '-' && grid.length - 1 == j) {
			columnSpace.end= j;
			columnSpace.length = ++count;
		    }else {
			columnSpace.end = j - 1;
			columnSpace.length = count;
		    }
		    columnSpaces.add(columnSpace);
		    count = 0;
		}else if (foundStart)
		    count++;
	    }
	}
	Map<Space, String> map = fillRow(new HashMap<Space, String>(), words, rowSpaces, columnSpaces);
	for(Map.Entry<Space, String> entry : map.entrySet()) {
	    if(entry.getKey().type == Table.ROW) {
		int row = entry.getKey().index;
		int column = entry.getKey().start;
		for(char ch : entry.getValue().toCharArray()) {
		    grid[row][column] = ch;
		    column++;
		}
	    }else {
		int column = entry.getKey().index;
		int row = entry.getKey().start;
		for(char ch : entry.getValue().toCharArray()) {
		    grid[row][column] = ch;
		    row++;
		}
	    }
	}
	return grid;
    }
    public static void main(String[] args) {
	char[][] gird = new char[10][];
	gird[0] = new char[] {'+', '-', '+', '+', '+', '+', '+', '+', '+', '+'};
	gird[1] = new char[] {'+', '-', '+', '+', '+', '+', '+', '+', '+', '+'};
	gird[2] = new char[] {'+', '-', '-', '-', '-', '-', '-', '-', '+', '+'};
	gird[3] = new char[] {'+', '-', '+', '+', '+', '+', '+', '+', '+', '+'};
	gird[4] = new char[] {'+', '-', '+', '+', '+', '+', '+', '+', '+', '+'};
	gird[5] = new char[] {'+', '-', '-', '-', '-', '-', '-', '+', '+', '+'};
	gird[6] = new char[] {'+', '-', '+', '+', '+', '-', '+', '+', '+', '+'};
	gird[7] = new char[] {'+', '+', '+', '+', '+', '-', '+', '+', '+', '+'};
	gird[8] = new char[] {'+', '+', '+', '+', '+', '-', '+', '+', '+', '+'};
	gird[9] = new char[] {'+', '+', '+', '+', '+', '+', '+', '+', '+', '+'};
	List<String> list = new LinkedList<>(Arrays.asList("AGRA", "NORWAY", "ENGLAND", "GWALIOR"));
	CrosswordGrid ob = new CrosswordGrid();
	gird = ob.findPosition(gird, list);
	for(char[] x : gird) {
	    for(char ch : x) {
		System.out.printf( "%1c  ", ch);
	    }
	    System.out.println();
	}
    }
}