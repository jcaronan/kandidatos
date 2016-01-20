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
                        "RA 8759 - establishing in all municipalities a Public Employment Service Office which serves as employment facilitation and information center, and links all job opportunities within the region\n" +
                                "RA 8748 - amending the Special Economic Zone Act by directly allocating to the municipality or city 2% (out of the 5%) gross tax to be collected from the establishments operating in the ecozone and providing for disturbance compensation for persons to be displaced or evicted by publicly-owned ecozones;\n" +
                                "RA 8756 - incentivizing the establishment of regional headquarters to encourage investment and operation of multinational companies in the country and to generate more jobs.\n" +
                                "RA 7880 - also known as the Roxas Law, which ensures fair distribution of the education capital budget among all the provinces.",
                        "Sixteenth Lee Kuan Yew Fellow")
        ));

        candidates.add(new Candidate("1", "tile_poe",
                new Biography("Grace Poe", "Mary Grace", "Poe", "Llamanzares", "September 3, 1968", "Independent", "\"Walang maiiwan.\""),
                new Accomplishment("Focused on rights of every Filipino people, specially children to have access to quality education.",
                        "No data","Head of Mamasapano clash inquiry on the senate. Against BBL.",
                        "No data","No data",
                        "With the support of colleagues, Poe championed the initiative in the 2015 Budget Law for an institutionalized free lunch feeding program for public school kids nationwide to address malnutrition and produce able young Filipinos, as contained in her Sustansya para sa Batang Pilipino bill." +
                                "In regards with RH Bill, Poe believes that condoms, pills and injectibles are not abortifacient. She believes in the woman’s right to choose, and a support system that builds on the family unit. She believes in day care centers for women, and the proper enforcement of detention centers for children in conflict with the law.",
                        "NoShe also led the hearings, as chair of the public services sub-committee, on MRT and LRT issues to provide solutions to “MRT challenges that imperil the safety and welfare of commuters, as well as diminish their productivity.",
                        "No data"),
                new Credential("University of the Philippines Manila, Boston College","MTRCB Chairperson, Senator","As the chairperson of the Committee on Public Information and Mass Media, she championed the passage of the Freedom of Information (FOI) Act, which was approved on third reading by the Senate on March 10. She believes that the attainment of a just, progressive and lasting peace in the country greatly depends upon the free flow of information to the public.\n" +
                        "Filed a bill promoting film tourism which aims to make the Philippines a primary location for local and international films\n" +
                        "Poe also filed the \"Sustenance for the Filipino child\" bill which seeks to give free nutritious meals to children enrolled in public elementary schools and high schools in K-12.\n" +
                        "Another notable bill filed by Poe is the \"First 1000 days\" bill which seeks to protect and support Filipino children in their first 1,000 days after they were bor.\n" +
                        "Poe is also pushing for the Freedom of Information bill which will promote greater transparency and lessen corruption in the government.","None")
        ));

        candidates.add(new Candidate("2", "tile_binay",
                new Biography("Jejomar \"Jojo\" Binay", "Jejomar", "Cabauatan", "Binay", "November 11, 1942", "United Nationalist Alliance", "\"Gaganda ang buhay kay Binay.\""),
                new Accomplishment("As mayor, he built the best equipped public schools in the country, provided public school students with free school supplies and books from pre-school to college.",
                        "Urged the Department of Agriculture (DA) to maximize the use of a P1-billion fund intended to help small farmers and fishermen obtain credit and allow them to procure needed materials and  equipment to earn and provide for their family's daily needs.",
                        "Speaker at the SecureAsia@Manila cyber security conference",
                        "No data","No data",
                        " As a student activist, he used to rebel against a system where only the rich could get the best health services. He has done something about it. In Makati, medicines and hospital accommodations are free for the poor.",
                        "Extends Assistance on OFW", "Served as the first chairman of Metropolitan Manila Development Authority."),
                new Credential("UP College of Law","MMDA Chair, Makati Mayor, Vice Mayor","No data","Outstanding Award, MMDA, World Mayor Award")
        ));

        candidates.add(new Candidate("3", "tile_santiago",
                new Biography("Miriam Defensor-Santiago", "Miriam", "Defensor", "Santiago", "June 15, 1945", "People's Reform Party", "\"Stupid is not forever\"."),
                new Accomplishment("No data",
                        "Improvement of the quality of primary and secondary education in the classroom.\n" +
                                "Promotion of safety in schools and campuses.\n" +
                                "Advancement of science and technology education.\n" +
                                "Strengthening of the recruitment process of Filipino teachers.",
                        "Miriam endorsed to Congress an alternative “people’s agrarian reform program” (Parcode) drafted by the Congress for People’s Agrarian Reform, a coalition of farmers’ groups including the militant Kilusang Magbubukid ng Pilipinas (KMP) and the conservative Federation of Free Farmers (FFF).  She said the Parcode was a “superior piece of legislation” and “rational, highly logical, and consistent.”  The Parcode put land retention limits to five hectares.  Under the CARL, the retention limit was 11 hectares, which virtually exempted 75% of all agricultural lands from land reform.  Miriam’s endorsement was hailed by farmers’ organizations.",
                        "Strengthening of the criminal laws by providing for punishment of crimes committed through the use of modem technology.\n" +
                                "Strengthening of the criminal laws by providing stiffer penalties for gambling.\n" +
                                "Strengthening of the prohibition against entry of illegal drugs.\n" +
                                "Regulation of use of firearms and motor vehicles.\n" +
                                "Strengthening of the fight against terrorism.",
                        "She served as chair of the foreign affairs committee of the Commission on Appointments." +
                                "In June 2015, she submitted to the Supreme Court a draft resolution expressing \"a strong sense\" of the Senate that the military-to-military agreement between the Philippines and the US is \"invalid\" without the approval of the Senate.",
                        "Promotion of health programs and health products in order to combat diseases like cancer, fertility, hepatitis C, dystonia and lead poisoning, by enacting and strengthening laws relating to anti-tobacco campaigns, reduction of metals in packaging, a national folic acid education program, research program regarding birth defects, health care cost reduction programs, poison prevention and control programs.",
                        "Promotion of entrepreneurship by allowing disposal of unused public lands to deserving persons for use by them as collateral for bank loans.\n" +
                                "Provision of more jobs to the unemployed population by helping small and medium sized entrepreneurs establish their businesses.",
                        "Public Transport Preservation Bill  which seeks to amend Act No. 3815, also known as the Penal Code, and the Anti-Fencing of Government Property Bill, which will amend Presidential Decree No. 1612, also known as the Anti-Fencing Law."),
                new Credential("University of the Philippines, University of Michigan,Xavier University, Centro Escolar University",
                        "Judge of the International Criminal Court, Senator, Secretary Agrarian Reform, Commissioner of Immigration and Deportation, Presiding Judge RTC",
                        "538 Bills and Resolutions passed (e.g. Reproductive Health Act of 2012, sin Tax Law, Climate Change Act of 2009, renewable Energy Act, Magna Carta of Women, etc.)",
                        "Google Top 20 Most Influential Filipinas of 2010, “Order of Civil Merit,” Kingdom of Spain, Magsaysay Award for Government Service, 1988., TOYM Award for Law"  )
        ));

        candidates.add(new Candidate("4", "tile_duterte",
                new Biography("Rodrigo \"The Punisher\" Duterte", "Rodrigo", "Roa", "Duterte", "March 28, 1945", "PDP-Laban", "\"Tapang at malasakit.\"."),
                new Accomplishment("Davao City bagged the Department of Education’s Most Outstanding Local Government Unit in the National Literacy Awards, then copped the Most Culture-Friendly City in the Philippines in 2009.",
                        "Fought rice smuggling in davao.",
                        "Davao city is now world's 4th safest city.",
                        "Encourage foreign investments.",
                        "Davao City 911",
                        "Fight against illegal drugs. ",
                        "Put up TESDA centers within the city to address shortage of craftsmen. ",
                        "Dismantled the illegal terminals put up by colorum vans in Davao city."),
                new Credential("Lyceum of the Philippines, San Beda College of Law","City Prosecutor, Vice-Mayor, Mayor",
                        "City Council amended ordinance No. 1627, Series of 1994, which imposed a prohibition on selling, serving, drinking and consumption of liquor and alcoholic beverages from 13:00 until 08:00\n" +
                                "Executive Order no. 39 was signed by Duterte, setting the speed limits for all kinds of motor vehicles within the territorial jurisdiction of Davao City in the interest of public safety and order." +
                                "Duterte also signed Executive Order no. 04, Series of 2013 to impose an order creating the implementing of rules and regulations for the new comprehensive anti-smoking ordinance no. 0367-12, Series of 2012" +
                                "Davao City's Firecracker Ban was also implemented with ordinance no. 060-02/1406-02, Series of 2002 by the City Council through the support of Duterte" +
                                "Duterte, through E.O no. 24, ordered all shopping malls and commercial centers to install, operate and maintain high end and high definition closed circuit television (CCTV) cameras in all entrance and exit points of their premises.",
                        "National Literacy Hall of Fame for bagging the awards on Outstanding Local Government Highly Urbanized category for three times")
        ));

        candidates.add(new Candidate("5", "tile_seneres",
                new Biography("Roy Seneres", "Roy", "No data", "Seneres", "July 6, 1947", "Partido ng Manggagawa at Magsasaka", "\"Isalba Mo Bayan ko.\""),
                new Accomplishment("No data",
                        "No data","No data","No data","No data","No data", "No data", "No data"),
                new Credential("No data","Chairman of National Labor Relations (2002-2005), Philippine Ambassadir to UAE (1994-1998)","No data","No data")
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
