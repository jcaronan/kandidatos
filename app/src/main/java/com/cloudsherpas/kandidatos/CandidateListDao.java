package com.cloudsherpas.kandidatos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dong on 1/18/16.
 */
public class CandidateListDao {

    public List<Candidate> getCandidates(){
        List<Candidate> candidates = new ArrayList<Candidate>();
        //Mock Data
        //TODO: Real data gathering
        candidates.add(new Candidate("1", "Rody Duterte", "test.png"));
        candidates.add(new Candidate("2", "Jejomar Binay", "test.png"));
        candidates.add(new Candidate("3", "Grace Poe", "test.png"));
        candidates.add(new Candidate("4", "Mar Roxas", "test.png"));
        candidates.add(new Candidate("5", "Miriam Santiago", "test.png"));
        candidates.add(new Candidate("6", "Jasmin Caronan", "test.png"));
        return candidates;
    }
}
