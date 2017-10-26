package com.jcyang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Resume resume = new Resume();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first name: ");
        /** Name **/
        Name name = resume.getName();
       resume.EnterName();

        /** Name **/

        /** Education **/


        resume.enterEducationalAchievement();

        /** Education **/




        /** Experience **/
       resume.enterExperience();

        /** Experience **/


        /**Skills**/

      resume.enterSkill();
        /**Skills  **/

        String outString = name.getFirstName();
        outString+=" ";
        outString+=name.getMiddleInitial();
        outString+=" ";
        outString+=name.getLastName();
        outString+=" \n";
        outString+=name.getEmail();
        outString +="\n";
        outString +="\n";

        outString+="Education \n";
        for( EducationalAchievement entry: resume.getEducationAchievements()){
            outString += entry.getDegree();
            outString +=" ";
            outString += entry.getField();
            outString +=" \n";
            outString += entry.getSchool();
            outString +=", ";
            outString += entry.getYearGrad();
            outString += "\n";
        }
        outString +="\n";

        outString +="Experience \n";
        for(Experience entry: resume.getExperiences()){
            outString +=entry.getTitle();
            outString +="\n";
            outString +=entry.getCompany();
            outString +=", ";
            outString +=entry.getDuration();
            outString +="\n";
            int counter = 0;
            for (String e: entry.getDuties()){
                outString +=" Duty ";
                outString +=++counter;
                outString +=", ";
                outString +=e;
                outString +="\n";
            }
        }
        outString +="\n";

        outString +="Skills \n";
        for(Skill entry: resume.getSkills()){
            outString += entry.getAsset();
            outString += ", ";
            outString += entry.getProficiency();
            outString += "\n";
        }
        outString +="\n";

        System.out.println(outString);

    }
}
