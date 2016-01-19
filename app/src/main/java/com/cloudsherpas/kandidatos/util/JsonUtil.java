package com.cloudsherpas.kandidatos.util;

import com.cloudsherpas.kandidatos.candidate.Candidate;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by jcaronan on 1/19/16.
 */
public class JsonUtil {
    public static String toJson(Candidate candidate) {
        try {

            JSONObject jsonObj = new JSONObject();
            jsonObj.put("candidateId", candidate.getCandidateId());
            jsonObj.put("portrait", candidate.getPortrait());

            JSONObject jsonBio = new JSONObject();
            jsonBio.put("politicalName", candidate.getBio().getPoliticalName()); // Set the first name/pair
            jsonBio.put("firstname", candidate.getBio().getFirstname()); // Set the first name/pair
            jsonBio.put("middlename", candidate.getBio().getMiddlename());
            jsonBio.put("lastname", candidate.getBio().getLastname());
            jsonBio.put("birthdate", candidate.getBio().getBirthdate());
            jsonBio.put("campaignSlogan", candidate.getBio().getCampaignSlogan());

            JSONObject jsonAccom = new JSONObject(); // we need another object to store the address
            jsonAccom.put("education", candidate.getAccomplishment().getEducation());
            jsonAccom.put("agriculture", candidate.getAccomplishment().getAgriculture());
            jsonAccom.put("security", candidate.getAccomplishment().getSecurity());
            jsonAccom.put("trade", candidate.getAccomplishment().getTrade());
            jsonAccom.put("foreignAffairs", candidate.getAccomplishment().getForeignAffairs());
            jsonAccom.put("health", candidate.getAccomplishment().getHealth());
            jsonAccom.put("labor", candidate.getAccomplishment().getLabor());
            jsonAccom.put("transportation", candidate.getAccomplishment().getTransportation());

            JSONObject jsonCredential = new JSONObject();
            jsonCredential.put("school", candidate.getCredential().getSchool());
            jsonCredential.put("positions", candidate.getCredential().getPositions());
            jsonCredential.put("bills", candidate.getCredential().getBills());
            jsonCredential.put("awards", candidate.getCredential().getAwards());

            // We add the object to the main object
            jsonObj.put("bio", jsonBio);
            jsonObj.put("accomplishment", jsonAccom);
            jsonObj.put("credential", jsonCredential);

            return jsonObj.toString();

        } catch (JSONException ex) {
            ex.printStackTrace();
        }

        return null;

    }
}
