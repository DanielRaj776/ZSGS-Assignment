package cricket;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class Main {
    
    public static void main(String[] args) throws InterruptedException {
	Display dis = new Display();
	Match match = new Match();
	Teams teams = new Teams();
	boolean toss;
	boolean firstInnings = false;
	int startMenuSelection = 0;
	int selectedTeam = 0;
	int overMenuSelection = 0;
	
	Scanner in = new Scanner(System.in);
	
	do {
	    dis.displayStartMenu();
	    try {
		startMenuSelection = in.nextInt();
	    } catch (InputMismatchException e) {
		System.out.println("Invalid Input Try Again.");
	    }
	}while(!(startMenuSelection == 1 || startMenuSelection == 2));
	
	switch(startMenuSelection) {
	case 1:
	    do {
		dis.displayTeams(teams);
		try {
		    selectedTeam = in.nextInt();
		} catch (InputMismatchException e) {
		    System.out.println("Invalid Input Try Again.");
		}
	    }while(!(selectedTeam >= 1 && selectedTeam <= 10));
	    int randomTeam = (int)(Math.random() * 10);
	    randomTeam = randomTeam == 0 ? 1 : randomTeam;
	    randomTeam = randomTeam != selectedTeam ? randomTeam : 10;
	    match.setTeam(selectedTeam, randomTeam, teams);
	    dis.displayMatch(match);
	    
	    do {
		dis.displayOverOptions(match);
		try {
		    overMenuSelection = in.nextInt();
		} catch (InputMismatchException e) {
		    System.out.println("Invalid Input Try Again.");
		}
	    }while(!(overMenuSelection >= 1 && overMenuSelection <= 4));
	    match.setNumOfBalls(match.getOvers(overMenuSelection - 1));
	    dis.displayTossOptions();
	    int t = 0;
	    do {
		try {
		    t = in.nextInt();
		} catch (InputMismatchException e) {
		    System.out.println("Invalid input Try Again.");
		}
	    } while (!(t>= 1 && t <= 2));
	    
	    Random r = new Random();
	    toss = r.nextBoolean();
	    
	    if(toss) {
		System.out.println("\nYou Won The Toss");
		Thread.sleep(500);
		boolean flag = true;
		do {
		    try {
			    dis.displayBattingBowling();
			    firstInnings = (in.nextInt() == 1);
			    flag = false;
		    } catch (InputMismatchException e) {
			System.out.println("Invalid Input Try Again.");
		    }
		}while(flag );
	    }else {
		System.out.println("\nYou Loss");
		Thread.sleep(500);
		firstInnings = r.nextBoolean();
	    }
	    
	    if(firstInnings) {
		System.out.println("\n\tFirst Innings");
		Thread.sleep(500);
		System.out.println("\n\tBatting");
		Thread.sleep(500);
		match.Batting();
		System.out.println("Target : " + match.getTarget());
		Thread.sleep(1000);
		System.out.println("\n\tSecond Innings");
		Thread.sleep(500);
		System.out.println("\n\tBowling");
		Thread.sleep(500);
		match.Bowling();
	    }else {
		System.out.println("\n\tFirst Innings");
		Thread.sleep(500);
		System.out.println("\n\tBowling");
		Thread.sleep(500);
		match.Bowling();
		System.out.println("Target : " + match.getTarget());
		Thread.sleep(1000);
		System.out.println("\n\tSecond Innings");
		Thread.sleep(500);
		System.out.println("\n\tBatting");
		Thread.sleep(500);
		match.Batting();
	    }
	    dis.displayResults(match);
	    break;
	case 2:
	    System.out.println("\tBye");
	    break;
	}
	in.close();
    }
}
