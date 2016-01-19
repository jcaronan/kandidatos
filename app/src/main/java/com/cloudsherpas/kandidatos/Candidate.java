package com.cloudsherpas.kandidatos;

/**
 * Created by dong on 1/18/16.
 */
public class Candidate {
    private String candidateId;
    private String portrait;
    private String name;

    public Candidate(String candidateId, String name, String portrait){
        this.candidateId = candidateId;
        this.name = name;
        this.portrait = portrait;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
