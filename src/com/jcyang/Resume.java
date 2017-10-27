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
        //validating initial
        String middleInitial=scanner.nextLine();
         while (middleInitial.length()!=1) {
             System.out.println("Middle Initial must be have length 1.  Enter middle initial: ");
            middleInitial=scanner.nextLine();
         }
        name.setMiddleInitial(middleInitial);
        System.out.println("Enter last name: ");
        name.setLastName(scanner.nextLine());
        System.out.println("Enter email: ");
        //validating email
         String email = scanner.nextLine();
         while(!email.contains("@")){
             System.out.println("Email must be of the form name@website.  Enter email: ");
             email=scanner.nextLine();
         }
        name.setEmail(email);}



    public void enterEducationalAchievement(){
        ArrayList<EducationalAchievement> educations = new ArrayList<>();
        String repeatSwitch="";
        int count =0;
        while (!repeatSwitch.equalsIgnoreCase("no")) {

            if (count>=10){
                break;
            }
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
            count++;
        }
    }


    public void enterExperience(){
        String repeatSwitch="";
            int count =0;
        while (!repeatSwitch.equalsIgnoreCase("no")){
            if (count>=10){
                break;
            }
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
            count++;
        }


    }

    public void enterSkill(){
        String repeatSwitch = "";
        int count = 0;
        while(!repeatSwitch.equalsIgnoreCase("no")){
            if (count>=20){
                break;
            }
            Skill skill = new Skill();
            skills.add(skill);
            System.out.println("Enter skill: ");
            skill.setAsset(scanner.nextLine());
            System.out.println("Enter proficiency: ");
            skill.setProficiency(scanner.nextLine());
            System.out.println("Would you like to enter a new skill? Enter any key to continue or 'no' to exit");
            repeatSwitch=scanner.nextLine();
            count++;
        }


    }

}