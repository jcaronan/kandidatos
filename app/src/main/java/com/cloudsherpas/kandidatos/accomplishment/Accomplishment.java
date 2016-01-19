package com.cloudsherpas.kandidatos.accomplishment;

import java.util.ArrayList;

/**
 * Created by jcaronan on 1/19/16.
 */
public class Accomplishment {
    private ArrayList<String> educationSector;
    private ArrayList<String> agricultureSector;
    private ArrayList<String> legislationSector;
    private ArrayList<String> environmentSector;
    private ArrayList<String> leadershipSector;
    private ArrayList<String> awards;

    public Accomplishment(ArrayList<String> educationSector, ArrayList<String> agricultureSector, ArrayList<String> legislationSector,
                          ArrayList<String> environmentSector, ArrayList<String> leadershipSector, ArrayList<String> awards) {
        this.educationSector = educationSector;
        this.agricultureSector = agricultureSector;
        this.legislationSector = legislationSector;
        this.environmentSector = environmentSector;
        this.leadershipSector = leadershipSector;
    }

    public ArrayList<String> getEducationSector() {
        return educationSector;
    }

    public void setEducationSector(ArrayList<String> educationSector) {
        this.educationSector = educationSector;
    }

    public ArrayList<String> getAgricultureSector() {
        return agricultureSector;
    }

    public void setAgricultureSector(ArrayList<String> agricultureSector) {
        this.agricultureSector = agricultureSector;
    }

    public ArrayList<String> getLegislationSector() {
        return legislationSector;
    }

    public void setLegislationSector(ArrayList<String> legislationSector) {
        this.legislationSector = legislationSector;
    }

    public ArrayList<String> getEnvironmentSector() {
        return environmentSector;
    }

    public void setEnvironmentSector(ArrayList<String> environmentSector) {
        this.environmentSector = environmentSector;
    }

    public ArrayList<String> getLeadershipSector() {
        return leadershipSector;
    }

    public void setLeadershipSector(ArrayList<String> leadershipSector) {
        this.leadershipSector = leadershipSector;
    }

}
