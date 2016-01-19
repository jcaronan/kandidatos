package com.cloudsherpas.kandidatos.accomplishment;

import java.util.ArrayList;

/**
 * Created by jcaronan on 1/19/16.
 */
public class Accomplishment {
    private String education;
    private String agriculture;
    private String security;
    private String trade;
    private String foreignAffairs;
    private String health;
    private String labor;
    private String transportation;

    public Accomplishment(String education, String agriculture, String security, String trade, String foreignAffairs, String health, String labor, String transportation) {
        this.education = education;
        this.agriculture = agriculture;
        this.security = security;
        this.trade = trade;
        this.foreignAffairs = foreignAffairs;
        this.health = health;
        this.labor = labor;
        this.transportation = transportation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(String agriculture) {
        this.agriculture = agriculture;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

    public String getForeignAffairs() {
        return foreignAffairs;
    }

    public void setForeignAffairs(String foreignAffairs) {
        this.foreignAffairs = foreignAffairs;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }
}
