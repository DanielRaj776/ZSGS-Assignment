package model;

public class Interviewee {
    private String name;
    private int age;
    private String education;
    private int previousWorkExperience;
    
    public Interviewee(String name, int age, String education, int previousWorkEcperience) {
	this.name = name;
	this.age = age;
	this.education = education;
	this.previousWorkExperience = previousWorkEcperience;
    }
    
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getEducation() {
        return education;
    }
    public int getPreviousWorkExperience() {
        return previousWorkExperience;
    }
}
