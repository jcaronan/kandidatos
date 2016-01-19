package com.cloudsherpas.kandidatos.candidate;

import com.cloudsherpas.kandidatos.accomplishment.Accomplishment;
import com.cloudsherpas.kandidatos.bio.Biography;
import com.cloudsherpas.kandidatos.credential.Credential;

/**
 * Created by jcaronan on 1/19/16.
 */
public class Candidate {

    private String candidateId;
    private String portrait;
    private Biography bio;
    private Accomplishment accomplishment;
    private Credential credential;

    public Candidate(String candidateId, String portrait, Biography bio, Accomplishment accomplishment, Credential credential) {
        this.candidateId = candidateId;
        this.portrait = portrait;
        this.bio = bio;
        this.accomplishment = accomplishment;
        this.credential = credential;

    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
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

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }
}
