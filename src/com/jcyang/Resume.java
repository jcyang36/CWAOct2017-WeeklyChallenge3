package com.jcyang;

import java.util.ArrayList;
import java.util.Scanner;

public class Resume {



    private Name name;
    private ArrayList<Experience> experiences;
    private ArrayList<EducationalAchievement> educationAchievements;
    private ArrayList<Skill> skills;
    public Scanner scanner = new Scanner(System.in);


    public  Resume(){
        name = new Name();
        experiences = new ArrayList<Experience>();
        educationAchievements= new ArrayList<EducationalAchievement>();
        skills = new ArrayList<Skill>();
    }



    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public ArrayList<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(ArrayList<Experience> experiences) {
        this.experiences = experiences;
    }

    public ArrayList<EducationalAchievement> getEducationAchievements() {
        return educationAchievements;
    }

    public void setEducationAchievements(ArrayList<EducationalAchievement> educationAchievements) {
        this.educationAchievements = educationAchievements;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    public void EnterName(){
name.setFirstName(scanner.nextLine());
        System.out.println("Enter middle initial: ");
        name.setMiddleInitial(scanner.nextLine());
        System.out.println("Enter last name: ");
        name.setLastName(scanner.nextLine());
        System.out.println("Enter email: ");
        name.setEmail(scanner.nextLine());}



    public void enterEducationalAchievement(){
        ArrayList<EducationalAchievement> educations = new ArrayList<>();
        String repeatSwitch="";
        while (!repeatSwitch.equalsIgnoreCase("no")) {


            EducationalAchievement education = new EducationalAchievement();
            educations.add(education);
            System.out.println("Enter degree: ");
            education.setDegree(scanner.nextLine());
            System.out.println("Enter field: ");
            education.setField(scanner.nextLine());
            System.out.println("Enter school: ");
            education.setSchool(scanner.nextLine());
            System.out.println("Enter year: ");
            education.setYearGrad(scanner.nextLine());
            System.out.println("Would you like to enter a new educational achievement? Enter any key to continue or 'no' to exit");
            repeatSwitch = scanner.nextLine();
            this.setEducationAchievements(educations);
        }
    }


    public void enterExperience(){
        String repeatSwitch="";

        while (!repeatSwitch.equalsIgnoreCase("no")){
            Experience experience = new Experience();
            experiences.add(experience);
            System.out.println("Enter title");
            experience.setTitle(scanner.nextLine());
            System.out.println("Enter company");
            experience.setCompany(scanner.nextLine());
            System.out.println("Enter duration");
            experience.setDuration(scanner.nextLine());

            String dutiesSwitch ="";
            ArrayList<String> duties = new ArrayList<>();
            experience.setDuties(duties);
            while(!dutiesSwitch.equalsIgnoreCase("no")) {
                System.out.println("Enter work duty");
                String duty = scanner.nextLine();
                experience.getDuties().add(duty);
                System.out.println("Would you like to enter a new duty? Enter any key to continue or 'no' to exit");
                dutiesSwitch = scanner.nextLine();
            }

            System.out.println("Would you like to enter a new experience? Enter any key to continue or 'no' to exit");
            repeatSwitch = scanner.nextLine();
        }

    }

    public void enterSkill(){
        String repeatSwitch = "";
        while(!repeatSwitch.equalsIgnoreCase("no")){
            Skill skill = new Skill();
            skills.add(skill);
            System.out.println("Enter skill: ");
            skill.setAsset(scanner.nextLine());
            System.out.println("Enter proficiency: ");
            skill.setProficiency(scanner.nextLine());
            System.out.println("Would you like to enter a new skill? Enter any key to continue or 'no' to exit");
            repeatSwitch=scanner.nextLine();
        }


    }

}