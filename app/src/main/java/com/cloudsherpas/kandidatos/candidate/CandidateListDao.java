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
    static {
        candidates.add(new Candidate("0", "tile_roxas",
                new Biography("Mar \"Mr.Palenge\" Roxas", "Manuel", "Araneta", "Roxas", "May 13, 1957", "Liberal Party", "\"Itutuloy ang daang matuwid.\""),
                new Accomplishment("MAR intensified his commitment to quality education through the Personal Computers for Public Schools (PCPS) Program, which distributed over 30,000 computers to 2,000 public high schools all over the country. PCPS computers provided some 500,000 high school students with the necessary ICT tools and skills.",
                        "Being the proponent of the philosophy of 'palengkenomics', which considers the palengke as the economy's weathervane and the mirror by which its over-all health can be seen and measured, MAR to this day continues to conduct weekly monitoring of the prices of prime commodities and maintains strong linkages with suppliers, traders, and vendors in the different wet markets.",
                        "As head of DILG, he was linked to the failure of SAF44 operation in Mamasapano. Pro BBL.",
                        "MAR's work regarding trade policy was highlighted during the 2003 WTO Meeting in Cancun, Mexico, where he fought for increased market access for Philippine exports, particularly agricultural products and a rationalized Philippine trade regime so domestic industries would not be unduly harmed.",
                        "No data.",
                        "In favor of RH Bill. Initiate projects like Presyong Tama, Gamot Pampamilya to make affordable and quality medicines accessible to Filipinos,",
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
                new Biography("Grace Poe", "Mary Grace", "Poe", "Llamanzares", "September 3, 1968", "Independent", "\"Walang maiiwan.\""),
                new Accomplishment("Focused on rights of every Filipino people, specially children to have access to quality education.",
                        "","Head of Mamasapano clash inquiry on the senate. Against BBL.",
                        "","",
                        "With the support of colleagues, Poe championed the initiative in the 2015 Budget Law for an institutionalized free lunch feeding program for public school kids nationwide to address malnutrition and produce able young Filipinos, as contained in her Sustansya para sa Batang Pilipino bill." +
                                "In regards with RH Bill, Poe believes that condoms, pills and injectibles are not abortifacient. She believes in the woman’s right to choose, and a support system that builds on the family unit. She believes in day care centers for women, and the proper enforcement of detention centers for children in conflict with the law.",
                        "NoShe also led the hearings, as chair of the public services sub-committee, on MRT and LRT issues to provide solutions to “MRT challenges that imperil the safety and welfare of commuters, as well as diminish their productivity.",
                        ""),
                new Credential("University of the Philippines Manila, Boston College","MTRCB Chairperson, Senator","As the chairperson of the Committee on Public Information and Mass Media, she championed the passage of the Freedom of Information (FOI) Act, which was approved on third reading by the Senate on March 10. She believes that the attainment of a just, progressive and lasting peace in the country greatly depends upon the free flow of information to the public.\n" +
                        "Filed a bill promoting film tourism which aims to make the Philippines a primary location for local and international films\n\n" +
                        "Poe also filed the \"Sustenance for the Filipino child\" bill which seeks to give free nutritious meals to children enrolled in public elementary schools and high schools in K-12.\n\n" +
                        "Another notable bill filed by Poe is the \"First 1000 days\" bill which seeks to protect and support Filipino children in their first 1,000 days after they were bor.\n\n" +
                        "Poe is also pushing for the Freedom of Information bill which will promote greater transparency and lessen corruption in the government.","None")
        ));

        candidates.add(new Candidate("2", "tile_binay",
                new Biography("Jejomar \"Jojo\" Binay", "Jejomar", "Cabauatan", "Binay", "November 11, 1942", "United Nationalist Alliance", "\"Gaganda ang buhay kay Binay.\""),
                new Accomplishment("As mayor, he built the best equipped public schools in the country, provided public school students with free school supplies and books from pre-school to college.",
                        "Urged the Department of Agriculture (DA) to maximize the use of a P1-billion fund intended to help small farmers and fishermen obtain credit and allow them to procure needed materials and  equipment to earn and provide for their family's daily needs.",
                        "Speaker at the SecureAsia@Manila cyber security conference",
                        "","",
                        " As a student activist, he used to rebel against a system where only the rich could get the best health services. He has done something about it. In Makati, medicines and hospital accommodations are free for the poor.",
                        "Extends Assistance on OFW", "Served as the first chairman of Metropolitan Manila Development Authority."),
                new Credential("UP College of Law","MMDA Chair, Makati Mayor, Vice Mayor","No data","Outstanding Award, MMDA, World Mayor Award")
        ));

        candidates.add(new Candidate("3", "tile_santiago",
                new Biography("Miriam Defensor-Santiago", "Miriam", "Defensor", "Santiago", "June 15, 1945", "People's Reform Party", "\"Stupid is not forever\"."),
                new Accomplishment("",
                        "","","","","", "", ""),
                new Credential("","","","")
        ));

        candidates.add(new Candidate("4", "tile_duterte",
                new Biography("Rodrigo Duterte", "Rodrigo", "", "Duterte", "May 13, 1957", "Liberal Party", "\"Itutuloy ang daang matuwid\"."),
                new Accomplishment("MAR intensified his commitment to quality education through the Personal Computers for Public Schools (PCPS) Program, which distributed over 30,000 computers to 2,000 public high schools all over the country. PCPS computers provided some 500,000 high school students with the necessary ICT tools and skills.",
                        "","","","","", "", ""),
                new Credential("","","","")
        ));

        candidates.add(new Candidate("5", "tile_seneres",
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
