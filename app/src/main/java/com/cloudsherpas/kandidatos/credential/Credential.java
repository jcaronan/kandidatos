package com.cloudsherpas.kandidatos.credential;

/**
 * Created by jcaronan on 1/19/16.
 */
public class Credential {
    private String school;
    private String positions;
    private String bills;
    private String awards;

    public Credential(String school, String positions, String bills, String awards) {
        this.school = school;
        this.positions = positions;
        this.bills = bills;
        this.awards = awards;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPositions() {
        return positions;
    }

    public void setPositions(String positions) {
        this.positions = positions;
    }

    public String getBills() {
        return bills;
    }

    public void setBills(String bills) {
        this.bills = bills;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }
}
