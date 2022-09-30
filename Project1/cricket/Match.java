package cricket;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Match {
    private int teamOneScore;
    private int teamTwoScore;
    private int teamOneWicketCount;
    private int teamTwoWicketCount;
    private int target;
    private final int OVER;
    private int[] overs;
    private int totalNumOfBalls ;
    private int finesedNumOfBalls;
    private String teamOne;
    private String teamTwo;
    private String[] teamOnePlayers;
    private String[] teamTwoPlayers;
    private int[][] teamOnePlayersScors;
    private int[][] teamTwoPlayersScors;
    Match(){
	teamOneScore = 0;
	teamTwoScore = 0;
	teamOneWicketCount = 0;
	teamTwoWicketCount = 0;
	OVER = 6;
	overs = new int[] {5, 10, 20, 50};
	target = 0;
	finesedNumOfBalls = 1;
	teamOnePlayersScors = new int[11][4];
	teamTwoPlayersScors = new int[11][4];
    }
    void setNumOfBalls (int numOfOvers) {
	totalNumOfBalls = numOfOvers * OVER;
    }
    void setTeam (int selectedTeam, int randomTeam, Teams teams) {
	teamOne = teams.getTeam(selectedTeam - 1); 
	teamOnePlayers = teams.getTeamPlayers(selectedTeam - 1);
	teamTwo = teams.getTeam(randomTeam - 1);
	teamTwoPlayers = teams.getTeamPlayers(randomTeam - 1);
    }
    void Bowling() {
	for(int i = 1, playedBalles = 1; i <= totalNumOfBalls && teamTwoWicketCount < 10; i++) {
	    if(target > 0 && teamTwoScore > target)
		break;
	    int batter = (int)(Math.random() * 7);
	    int bowler = (int)(Math.random() * 7);
	    if(batter == bowler) {
		teamTwoWicketCount++;
		teamTwoPlayersScors[teamTwoWicketCount][3] = playedBalles;
		playedBalles = 1;
	    }else if((batter >= 1 && batter <= 4) || batter == 6){
		teamTwoScore += batter;
		teamTwoPlayersScors[teamTwoWicketCount][0] += batter;
		teamTwoPlayersScors[teamTwoWicketCount][1] += batter  == 4 ? 1 : 0;
		teamTwoPlayersScors[teamTwoWicketCount][2] += batter == 6 ? 1 : 0;
		playedBalles++;
	    }
	}
	target = teamTwoScore;
    }
    void Batting() throws InterruptedException {
	Scanner in = new Scanner(System.in);
	for(int i = 1, playedBalles = 1; i <= totalNumOfBalls && teamOneWicketCount < 10; i++) {
	    if(target > 0 && teamOneScore > target)
		break;
	    int playedOver = (finesedNumOfBalls % 6) == 0 ? (finesedNumOfBalls / 6) : (finesedNumOfBalls / 6) + 1;
	    int PlayedBall = (finesedNumOfBalls % 6) == 0 ? 6 : finesedNumOfBalls % 6;
	    System.out.println("Enter Number 0 - 6 to Bat\n" + "Over " + playedOver + " Ball " + PlayedBall);
	    int batter = 10;
	    do {
		try {
		    batter = in.nextInt();
		} catch (InputMismatchException e) {
		    System.out.println("Invalid Input Try Again");
		}catch (NoSuchElementException e) {}
	    }while(!(batter >= 0 && batter <= 6));
	    int  bowler = (int)(Math.random() * 7);
	    if(batter == bowler) {
		System.out.printf("%s is out\n", teamOnePlayers[teamOneWicketCount]);
		teamOneWicketCount++;
		teamOnePlayersScors[teamOneWicketCount][3] = playedBalles;
		playedBalles = 1;
	    }else if((batter >= 1 && batter <= 4) || batter == 6) {
		teamOneScore += batter;
		teamOnePlayersScors[teamOneWicketCount][0] += batter;
		teamOnePlayersScors[teamOneWicketCount][1] += batter  == 4 ? 1 : 0;
		teamOnePlayersScors[teamOneWicketCount][2] += batter == 6 ? 1 : 0;
		System.out.printf("%s's Run : %d\n", teamOnePlayers[teamOneWicketCount], teamOnePlayersScors[teamOneWicketCount][0]);
		playedBalles++;
	    }else {
		System.out.printf("%s's Run : %d\n", teamOnePlayers[teamOneWicketCount], teamOnePlayersScors[teamOneWicketCount][0]);
	    }
	    finesedNumOfBalls++;
	}
	in.close();
	target = teamOneScore;
    }    
    int[] getOversOptions() {
	return overs;
    }
    int getOvers(int index) {
	return overs[index];
    }
    int[][] getTeamOnePlayersScors() {
	return teamOnePlayersScors;
    }
    int[][] getTeamTwoPlayersScors(){
	return teamTwoPlayersScors;
    }
    String[][] getTeams() {
	String[][] teamAndPlayers = new String[3][];
	teamAndPlayers[0] = new String[] {teamOne, teamTwo};
	teamAndPlayers[1] = teamOnePlayers;
	teamAndPlayers[2] = teamTwoPlayers;
	return teamAndPlayers;
    }
    int getTarget() {
	return target;
    }
    void matchResult() {
	if(teamOneScore < teamTwoScore) {
	    System.out.println("\t\t\tTEAM TWO WIN'S");
	}else if(teamOneScore > teamTwoScore) {
	    System.out.println("\t\t\tTEAM ONE WIN'S");
	}else {
	    System.out.println("MATCH IS TIE");
	}
	
	System.out.println("\t\t\tTEAM ONE");
	System.out.println("Score : " + teamOneScore);
	System.out.println("Wicket : " + teamOneWicketCount + "\n");
	System.out.println("\t\t\tTEAM TWO");
	System.out.println("Score : " + teamTwoScore);
	System.out.println("Wicket : " + teamTwoWicketCount);
    }
}
