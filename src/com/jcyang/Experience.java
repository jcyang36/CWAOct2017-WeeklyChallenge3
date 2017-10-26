package com.jcyang;

import java.util.ArrayList;

public class Experience {
    private String title;
    private String company;
    private String duration;
    private ArrayList<String> duties;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public ArrayList<String> getDuties() {
        return duties;
    }

    public void setDuties(ArrayList<String> duties) {
        this.duties = duties;
    }
}