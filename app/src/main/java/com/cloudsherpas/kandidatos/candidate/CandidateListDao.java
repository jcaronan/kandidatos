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

        candidates.add(new Candidate("1", "tile_roxas",
                new Biography("Mar \"Mr.Palenge\" Roxas", "Manuel", "Araneta", "Roxas", "May 13, 1957", "Liberal Party", "\"Itutuloy ang daang matuwid\"."),
                new Accomplishment("MAR intensified his commitment to quality education through the Personal Computers for Public Schools (PCPS) Program, which distributed over 30,000 computers to 2,000 public high schools all over the country. PCPS computers provided some 500,000 high school students with the necessary ICT tools and skills.",
                        "Being the proponent of the philosophy of 'palengkenomics', which considers the palengke as the economy's weathervane and the mirror by which its over-all health can be seen and measured, MAR to this day continues to conduct weekly monitoring of the prices of prime commodities and maintains strong linkages with suppliers, traders, and vendors in the different wet markets.",
                        "As head of DILG, he was linked to the failure of SAF44 operation in Mamasapano.",
                        "MAR's work regarding trade policy was highlighted during the 2003 WTO Meeting in Cancun, Mexico, where he fought for increased market access for Philippine exports, particularly agricultural products and a rationalized Philippine trade regime so domestic industries would not be unduly harmed.",
                        "No data.",
                        "Initiate projects like Presyong Tama, Gamot Pampamilya to make affordable and quality medicines accessible to Filipinos,",
                        "MAR worked for the reopening of the National Steel Corporation which provided thousands of jobs, income and livelihood to Iligan City, Northern Mindanao and adjacent regions. He also launched the Garment Export Industry Transformation Plan and Assistance Package to enhance the competitiveness of the industry and ensure its viability and vibrancy beyond 2004. Moreover, he initiated the Motor/Vehicle Development Program to promote exports, create a viable market base for our car manufacturers and secure jobs for our workers.",
                        "Former transportation secretary. Plans to decongest main thoroughfares through infrastructure and fix the bus franchise system."),
                new Credential("Ateneo de Manila (1974) , Wharton School of Economics at the University of Pennsylvania (1979)","House of representatives (1993), DTI Secretary (2004) , Senator",
                        "RA 8759 - establishing in all municipalities a Public Employment Service Office which serves as employment facilitation and information center, and links all job opportunities within the region\n\n" +
                                "RA 8748 - amending the Special Economic Zone Act by directly allocating to the municipality or city 2% (out of the 5%) gross tax to be collected from the establishments operating in the ecozone and providing for disturbance compensation for persons to be displaced or evicted by publicly-owned ecozones;\n\n" +
                                "RA 8756 - incentivizing the establishment of regional headquarters to encourage investment and operation of multinational companies in the country and to generate more jobs.\n\n" +
                                "RA 7880 - also known as the Roxas Law, which ensures fair distribution of the education capital budget among all the provinces.",
                        "16th Lee Kuan Yew Fellow")
        ));

        candidates.add(new Candidate("1", "tile_poe",
                new Biography("Grace Poe", "Grace", "", "Poe", "May 13, 1957", "Liberal Party", "\"Itutuloy ang daang matuwid\"."),
                new Accomplishment("MAR intensified his commitment to quality education through the Personal Computers for Public Schools (PCPS) Program, which distributed over 30,000 computers to 2,000 public high schools all over the country. PCPS computers provided some 500,000 high school students with the necessary ICT tools and skills.",
                        "","","","","", "", ""),
                new Credential("","","","")
        ));

        candidates.add(new Candidate("1", "tile_binay",
                new Biography("Jejomar Binay", "Jejomar", "", "Binay", "May 13, 1957", "Liberal Party", "\"Itutuloy ang daang matuwid\"."),
                new Accomplishment("MAR intensified his commitment to quality education through the Personal Computers for Public Schools (PCPS) Program, which distributed over 30,000 computers to 2,000 public high schools all over the country. PCPS computers provided some 500,000 high school students with the necessary ICT tools and skills.",
                        "","","","","", "", ""),
                new Credential("","","","")
        ));

        candidates.add(new Candidate("1", "tile_santiago",
                new Biography("Miriam Defensor-Santiago", "Miriam", "", "Santiago", "May 13, 1957", "Liberal Party", "\"Itutuloy ang daang matuwid\"."),
                new Accomplishment("MAR intensified his commitment to quality education through the Personal Computers for Public Schools (PCPS) Program, which distributed over 30,000 computers to 2,000 public high schools all over the country. PCPS computers provided some 500,000 high school students with the necessary ICT tools and skills.",
                        "","","","","", "", ""),
                new Credential("","","","")
        ));

        candidates.add(new Candidate("1", "tile_duterte",
                new Biography("Rodrigo Duterte", "Rodrigo", "", "Duterte", "May 13, 1957", "Liberal Party", "\"Itutuloy ang daang matuwid\"."),
                new Accomplishment("MAR intensified his commitment to quality education through the Personal Computers for Public Schools (PCPS) Program, which distributed over 30,000 computers to 2,000 public high schools all over the country. PCPS computers provided some 500,000 high school students with the necessary ICT tools and skills.",
                        "","","","","", "", ""),
                new Credential("","","","")
        ));

        candidates.add(new Candidate("1", "tile_seneres",
                new Biography("Roy Seneres", "Roy", "", "Seneres", "May 13, 1957", "Liberal Party", "\"Itutuloy ang daang matuwid\"."),
                new Accomplishment("MAR intensified his commitment to quality education through the Personal Computers for Public Schools (PCPS) Program, which distributed over 30,000 computers to 2,000 public high schools all over the country. PCPS computers provided some 500,000 high school students with the necessary ICT tools and skills.",
                        "","","","","", "", ""),
                new Credential("","","","")
        ));

    }


    public static Candidate getById(String id){
        int index = Integer.parseInt(id);
        return candidates.get(index);
    }

    public static List<Candidate> getCandidates() {
        return candidates;
    }
}
