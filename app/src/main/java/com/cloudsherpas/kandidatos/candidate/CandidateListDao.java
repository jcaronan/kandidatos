package com.cloudsherpas.kandidatos.candidate;

import android.media.audiofx.AcousticEchoCanceler;

import com.cloudsherpas.kandidatos.accomplishment.Accomplishment;
import com.cloudsherpas.kandidatos.bio.Biography;
import com.cloudsherpas.kandidatos.credential.Credential;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dong on 1/18/16.
 */
public class CandidateListDao {


    private static List<Candidate> candidates = new ArrayList<Candidate>();

    public CandidateListDao() {

        candidates.add(new Candidate("1", "test.png",
                new Biography("Mar \"Mr.Palenge\" Roxas", "Manuel", "Araneta", "Roxas", "May 13, 1957", "Liberal Party", "\"Itutuloy ang daang matuwid\"."),
                new Accomplishment("MAR intensified his commitment to quality education through the Personal Computers for Public Schools (PCPS) Program, which distributed over 30,000 computers to 2,000 public high schools all over the country. PCPS computers provided some 500,000 high school students with the necessary ICT tools and skills.",
                        "","","","","", "", ""),
                new Credential("","","","")
        ));

        candidates.add(new Candidate("1", "test.png",
                new Biography("Mar \"Mr.Palenge\" Roxas", "Manuel", "Araneta", "Roxas", "May 13, 1957", "Liberal Party", "\"Itutuloy ang daang matuwid\"."),
                new Accomplishment("MAR intensified his commitment to quality education through the Personal Computers for Public Schools (PCPS) Program, which distributed over 30,000 computers to 2,000 public high schools all over the country. PCPS computers provided some 500,000 high school students with the necessary ICT tools and skills.",
                        "","","","","", "", ""),
                new Credential("","","","")
        ));

        candidates.add(new Candidate("1", "test.png",
                new Biography("Mar \"Mr.Palenge\" Roxas", "Manuel", "Araneta", "Roxas", "May 13, 1957", "Liberal Party", "\"Itutuloy ang daang matuwid\"."),
                new Accomplishment("MAR intensified his commitment to quality education through the Personal Computers for Public Schools (PCPS) Program, which distributed over 30,000 computers to 2,000 public high schools all over the country. PCPS computers provided some 500,000 high school students with the necessary ICT tools and skills.",
                        "","","","","", "", ""),
                new Credential("","","","")
        ));

        candidates.add(new Candidate("1", "test.png",
                new Biography("Mar \"Mr.Palenge\" Roxas", "Manuel", "Araneta", "Roxas", "May 13, 1957", "Liberal Party", "\"Itutuloy ang daang matuwid\"."),
                new Accomplishment("MAR intensified his commitment to quality education through the Personal Computers for Public Schools (PCPS) Program, which distributed over 30,000 computers to 2,000 public high schools all over the country. PCPS computers provided some 500,000 high school students with the necessary ICT tools and skills.",
                        "","","","","", "", ""),
                new Credential("","","","")
        ));

        candidates.add(new Candidate("1", "test.png",
                new Biography("Mar \"Mr.Palenge\" Roxas", "Manuel", "Araneta", "Roxas", "May 13, 1957", "Liberal Party", "\"Itutuloy ang daang matuwid\"."),
                new Accomplishment("MAR intensified his commitment to quality education through the Personal Computers for Public Schools (PCPS) Program, which distributed over 30,000 computers to 2,000 public high schools all over the country. PCPS computers provided some 500,000 high school students with the necessary ICT tools and skills.",
                        "","","","","", "", ""),
                new Credential("","","","")
        ));

        candidates.add(new Candidate("1", "test.png",
                new Biography("Mar \"Mr.Palenge\" Roxas", "Manuel", "Araneta", "Roxas", "May 13, 1957", "Liberal Party", "\"Itutuloy ang daang matuwid\"."),
                new Accomplishment("MAR intensified his commitment to quality education through the Personal Computers for Public Schools (PCPS) Program, which distributed over 30,000 computers to 2,000 public high schools all over the country. PCPS computers provided some 500,000 high school students with the necessary ICT tools and skills.",
                        "","","","","", "", ""),
                new Credential("","","","")
        ));

    }


    public static Candidate getById(String id){
        int index = Integer.parseInt(id) - 1;
        return candidates.get(index);
    }

    public static List<Candidate> getCandidates() {
        return candidates;
    }
}
