package com.cloudsherpas.kandidatos.candidate;

import com.cloudsherpas.kandidatos.accomplishment.Accomplishment;
import com.cloudsherpas.kandidatos.bio.Biography;

/**
 * Created by jcaronan on 1/19/16.
 */
public class Candidate {

    private String candidateId;
    private Biography bio;
    private Accomplishment accomplishment;

    public Candidate(String candidateId, Biography bio, Accomplishment accomplishment) {
        this.candidateId = candidateId;
        this.bio = bio;
        this.accomplishment = accomplishment;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public Biography getBio() {
        return bio;
    }

    public void setBio(Biography bio) {
        this.bio = bio;
    }

    public Accomplishment getAccomplishment() {
        return accomplishment;
    }

    public void setAccomplishment(Accomplishment accomplishment) {
        this.accomplishment = accomplishment;
    }
}
