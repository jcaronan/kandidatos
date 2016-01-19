package com.cloudsherpas.kandidatos.bio;

/**
 * Created by jcaronan on 1/19/16.
 */
public class Biography {
    private String politicalName;
    private String firstname;
    private String middlename;
    private String lastname;
    private String birthdate;
    private String politicalParty;
    private String campaignSlogan;

    public Biography(String politicalName, String firstname, String middlename, String lastname, String birthdate,
                     String politicalParty, String campaignSlogan) {
        this.politicalName = politicalName;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.politicalParty = politicalParty;
        this.campaignSlogan = campaignSlogan;
    }

    public String getPoliticalName() {
        return politicalName;
    }

    public void setPoliticalName(String politicalName) {
        this.politicalName = politicalName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        this.politicalParty = politicalParty;
    }

    public String getCampaignSlogan() {
        return campaignSlogan;
    }

    public void setCampaignSlogan(String campaignSlogan) {
        this.campaignSlogan = campaignSlogan;
    }
}
