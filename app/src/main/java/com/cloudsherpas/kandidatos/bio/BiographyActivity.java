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

        ImageView image = (ImageView) findViewById(R.id.imageView);
        String uri = "@drawable/" + c.getPortrait(); //should have no extension
        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        image.setBackgroundResource(imageResource);

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

        Credential cred = c.getCredential();

        ListView listView = (ListView) findViewById(R.id.list);

        // Defined Array values to show in ListView

        ArrayList<String> values = new ArrayList<>();
        values.add(cred.getSchool());
        values.add(cred.getPositions());
        values.add(cred.getBills());
        values.add(cred.getAwards());
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.credential_list,values.toArray(new String[values.size()]));
        // Assign adapter to ListView
        listView.setAdapter(adapter);
    }
}
