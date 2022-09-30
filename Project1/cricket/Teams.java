package cricket;

import java.util.Arrays;

class Teams {
    private String[] teams;
    private String[][] teamPlayers = new String[10][];
    
    Teams() {
	teams = new String[] {"Afghanistan", "Australia", "Bangladesh", "England", "India", "New Zealand", "Pakistan", "South Africa", "Sri Lanka", "West Indies"};
	teamPlayers[0] = new String[] {"Gulbadin Naib", "Asghar Afghan", "Dawlat Zadran", "Hamid Hassan", "Hashmatullah Shahidi", "Hazratullah Zazai", "Ikram Ali Khil", "Mohammad Nabi", "Mujeeb Ur Rahman", "Najibullah Zadran", "Noor Ali Zadran", "Rahmat Shah", "Rashid Khan", "Samiullah Shinwari", "Sayed Ahmad Shirzad"};
	teamPlayers[1] = new String[] {"Aaron Finch", "Jason Behrendorff", "Alex Carey", "Nathan Coulter-Nile", "Pat Cummins", "Peter Handscomb", "Usman Khawaja", "Nathan Lyon", "Glenn Maxwell", "Kane Richardson", "Steve Smith", "Mitchell Starc", "Marcus Stoinis", "David Warner", "Adam Zampa"};
	teamPlayers[2] = new String[] {"Mashrafe Mortaza", "Abu Jayed", "Liton Das", "Mahmudullah", "Mehidy Hasan", "Mohammad Mithun", "Mohammad Saifuddin", "Mosaddek Hossain", "Mushfiqur Rahim", "Mustafizur Rahman", "Rubel Hossain", "Sabbir Rahman", "Shakib Al Hasan", "Soumya Sarkar", "Tamim Iqbal"};
	teamPlayers[3] = new String[] {"Eoin Morgan", "Moeen Ali", "Jofra Archer", "Jonny Bairstow", "Jos Buttler", "Tom Curran", "Liam Dawson", "Liam Plunkett", "Adil Rashid", "Joe Root", "Jason Roy", "Ben Stokes", "James Vince", "Chris Woakes", "Mark Wood"};
	teamPlayers[4] = new String[] {"Virat Kohli", "Mayank Agarwal", "Jasprit Bumrah", "Yuzvendra Chahal", "MS Dhoni", "Ravindra Jadeja", "Kedar Jadhav", "Dinesh Karthik", "Bhuvneshwar Kumar", "Hardik Pandya", "Rishabh Pant", "KL Rahul", "Mohammed Shami", "Rohit Sharma", "Kuldeep Yadav"};
	teamPlayers[5] = new String[] {"Kane Williamson", "Tom Blundell", "Trent Boult", "Colin de Grandhomme", "Lockie Ferguson", "Martin Guptill", "Matt Henry", "Tom Latham", "Colin Munro", "Jimmy Neesham", "Henry Nicholls", "Mitchell Santner", "Ish Sodhi", "Tim Southee", "Ross Taylor"};
	teamPlayers[6] = new String[] {"Sarfaraz Ahmed" , "Asif Ali", "Babar Azam", "Fakhar Zaman", "Haris Sohail", "Hasan Ali", "Imad Wasim", "Imam-ul-Haq", "Mohammad Amir", "Mohammad Hafeez", "Mohammad Hasnain", "Shadab Khan", "Shaheen Afridi", "Shoaib Malik", "Wahab Riaz"};
	teamPlayers[7] = new String[] {"Faf du Plessis", "Hashim Amla", "Quinton de Kock", "JP Duminy", "Beuran Hendricks", "Aiden Markram", "David Miller", "Chris Morris", "Lungi Ngidi", "Andile Phehlukwayo", "Dwaine Pretorius", "Kagiso Rabada", "Tabraiz Shamsi", "Imran Tahir", "Rassie van der Dussen"};
	teamPlayers[8] = new String[] {"Dimuth Karunaratne", "Avishka Fernando", "Suranga Lakmal", "Lasith Malinga", "Angelo Mathews", "Jeevan Mendis", "Kusal Mendis", "Kusal Perera", "Thisara Perera", "Kasun Rajitha", "Dhananjaya de Silva", "Milinda Siriwardana", "Lahiru Thirimanne", "Isuru Udana", "Jeffrey Vandersay"};
	teamPlayers[9] = new String[] {"Jason Holder", "Fabian Allen", "Sunil Ambris", "Carlos Brathwaite", "Darren Bravo", "Sheldon Cottrell", "Shannon Gabriel", "Chris Gayle", "Shimron Hetmyer", "Shai Hope", "Evin Lewis", "Ashley Nurse", "Nicholas Pooran", "Kemar Roach", "Oshane Thomas"};
    }
    void showTeams() {
	System.out.println("\t\tTeams\n");
	for(int i = 0; i < teams.length; i++) {
	    System.out.printf("\t%2d. %s \n", (i + 1), teams[i]);
	}
    }
    String getTeam(int index) {
	return teams[index];
    }
    String[] getTeamPlayers(int index) {
	int temp = (int)(Math.random() * 5);
	return Arrays.copyOfRange(teamPlayers[index], temp, temp + 11);
    }
}
