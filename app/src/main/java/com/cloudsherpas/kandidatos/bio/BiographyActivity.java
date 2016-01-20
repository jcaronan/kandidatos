package com.cloudsherpas.kandidatos.bio;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.cloudsherpas.kandidatos.R;
import com.cloudsherpas.kandidatos.candidate.Candidate;
import com.cloudsherpas.kandidatos.candidate.CandidateListDao;
import com.cloudsherpas.kandidatos.credential.Credential;

import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by jcaronan on 1/19/16.
 */
public class BiographyActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biography_fragment);

        String candidateId = getIntent().getStringExtra("candidateId");
        Candidate c = CandidateListDao.getById(candidateId);

        Biography bio = c.getBio();

        TextView textPoliticalname = (TextView) findViewById(R.id.textView2);
        textPoliticalname.setText(bio.getPoliticalName());;

        TextView textCompleteName = (TextView) findViewById(R.id.textView3);
        textCompleteName.setText(bio.getFirstname() + " " +
                bio.getMiddlename() + " " +
                bio.getLastname());

        TextView textBday = (TextView) findViewById(R.id.textView4);
        textBday.setText(bio.getBirthdate());

        TextView textSlogan = (TextView) findViewById(R.id.textView5);
        textSlogan.setText(bio.getCampaignSlogan());
    }
}
