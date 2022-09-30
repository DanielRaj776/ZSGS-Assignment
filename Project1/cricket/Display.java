package cricket;


class Display {
    void displayStartMenu() {
	System.out.println("\nSelect Your Option. (use the number before options to select.\n");
	System.out.println(" 1. Play");
	System.out.println(" 2. Exit");
    }
    void displayTeams(Teams teams) {
	System.out.println("\nSelect Your Team. (use the number before options to select.\n ");
	teams.showTeams();
    }
    void displayMatch(Match match) {
	String[][] teamAndPlayers = match.getTeams();
	System.out.printf("\n%20s          %35s\n", teamAndPlayers[0][0], teamAndPlayers[0][1]);
	for(int i = 0; i < teamAndPlayers[1].length; i++) {
	    System.out.printf("%30s            %s\n", teamAndPlayers[1][i], teamAndPlayers[2][i]);
	}
    }
    void displayOverOptions(Match match) {
	int[] overs = match.getOversOptions();
	System.out.println("\nSelect Number Overs In The Game (use the number before options to select.\n");
	for(int i = 0; i < overs.length; i++) {
	    System.out.printf("\t%2d. %2d\n", (i + 1), overs[i]);
	}
    }
    void displayTossOptions() {
	System.out.println("\nSelect Your Side\n");
	System.out.println("\t1. Heads");
	System.out.println("\t2. Tails");
    }
    void displayBattingBowling() {
	System.out.println("\nSelect\n");
	System.out.println("\t1. Batting");
	System.out.println("\t2. Bowling");
    }
    void displayTarget (Match match) throws InterruptedException {
	System.out.println("\tTarget : " + match.getTarget());
	Thread.sleep(600);
    }
    void displayResults (Match match) {
	System.out.printf("%25s\tScore\tFour\tSix\tBall\t%25s\tScore\tFour\tSix\tBall\n", "Player", "Player");
	String[][] players = match.getTeams();
	int[][] teamOnePlayerScore = match.getTeamOnePlayersScors();
	int[][] teamTwoPlayerScore = match.getTeamTwoPlayersScors();
	for(int i = 0; i < teamOnePlayerScore.length; i++) {
	  System.out.printf("%25s\t %4d\t %3d \t%2d \t%3d\t%25s \t %4d\t %3d \t%2d \t%3d\n",players[1][i],teamOnePlayerScore[i][0], teamOnePlayerScore[i][1], teamOnePlayerScore[i][2], teamOnePlayerScore[i][3], players[2][i], teamTwoPlayerScore[i][0], teamTwoPlayerScore[i][1], teamTwoPlayerScore[i][2], teamTwoPlayerScore[i][3]);
	}
    }
}
