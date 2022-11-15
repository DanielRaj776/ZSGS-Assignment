package interviewpreparation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindAllOccurrences {
    private void findOccurrences (char[][] grid, String word){
	if(word.length() == 0)
	    return;
	LinkedList<List<List<Integer>>> list = new LinkedList<>();
	for(int i = 0; i < grid.length; i++) {
	    for(int j = 0; j < grid[0].length; j++) {
		if(word.charAt(0) == grid[i][j]) {    
			List<List<Integer>> temp = new LinkedList<>();
			temp.add(Arrays.asList(i,j));
			list.add(temp);
		}
	    }
	}
	if(word.length() > 1) {
	    int index = 1;
	    int[][] diractions = {{-1, - 1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
	    while(index < word.length()) {
		int size = list.size();
		for(int num = 0; num < size; num++) {
		    List<List<Integer>> temp = list.poll();
			List<Integer> lastPostion = temp.get(temp.size() - 1);
			for(int i = 0; i < 8; i++) {
			    int nextRow = lastPostion.get(0) + diractions[i][0];
			    int nextColumn = lastPostion.get(1) + diractions[i][1];
			    if((nextRow < grid.length && nextRow >= 0) && (nextColumn < grid[0].length && nextColumn >= 0) && grid[nextRow][nextColumn] == word.charAt(index)) {
				List<List<Integer>> copy = new LinkedList<>(temp);
				copy.add(Arrays.asList(nextRow,nextColumn));
				list.add(copy);
			    }
			}
		}
		index++;
	    }
	}
	System.out.println(list.toString());
    }
    private void getInput () {
	char[][] grid = {{'B', 'N', 'E', 'Y', 'S'}, {'H', 'E','D','E','S'}, {'S', 'G', 'N', 'D','E'}};
	String word = "BNEGSHBN";
	findOccurrences(grid, word);
    }
    public static void main(String[] args) {
	FindAllOccurrences ob = new FindAllOccurrences();
	ob.getInput();
    }

}
