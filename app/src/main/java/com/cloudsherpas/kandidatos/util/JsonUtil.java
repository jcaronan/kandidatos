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
            // Here we convert Java Object to JSON
            JSONObject jsonBio = new JSONObject();
            jsonBio.put("politicalName", candidate.getBio().getPoliticalName()); // Set the first name/pair
            jsonBio.put("firstname", candidate.getBio().getFirstname()); // Set the first name/pair
            jsonBio.put("middlename", candidate.getBio().getMiddlename());
            jsonBio.put("lastname", candidate.getBio().getLastname());
            jsonBio.put("birthdate", candidate.getBio().getBirthdate());
            jsonBio.put("campaignSlogan", candidate.getBio().getCampaignSlogan());

            JSONObject jsonAccom = new JSONObject(); // we need another object to store the address
            jsonAccom.put("educationSector", candidate.getAccomplishment().getEducationSector());
            jsonAccom.put("agricultureSector", candidate.getAccomplishment().getAgricultureSector());
            jsonAccom.put("legislationSector", candidate.getAccomplishment().getLegislationSector());
            jsonAccom.put("environmentSector", candidate.getAccomplishment().getEnvironmentSector());
            jsonAccom.put("leadershipSector", candidate.getAccomplishment().getLeadershipSector());

            // We add the object to the main object
            jsonObj.put("bio", jsonBio);
            jsonObj.put("accomplishment", jsonAccom);

            return jsonObj.toString();

        } catch (JSONException ex) {
            ex.printStackTrace();
        }

        return null;

    }
}
