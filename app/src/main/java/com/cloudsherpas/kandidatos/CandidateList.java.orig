package com.cloudsherpas.kandidatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cloudsherpas.kandidatos.accomplishment.Accomplishment;
import com.cloudsherpas.kandidatos.bio.Biography;
import com.cloudsherpas.kandidatos.bio.BiographyActivity;
import com.cloudsherpas.kandidatos.candidate.Candidate;
import com.cloudsherpas.kandidatos.util.JsonUtil;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;

public class CandidateList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate_list);

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToBioPage();
            }
        });
    }

    private void goToBioPage(){
        final Intent intent = new Intent(this, BiographyActivity.class);
        Biography bio = new Biography("Mar \"Mr. Palengke\" Roxas", "Manuel", "Araneta", "Roxas", "May 13, 1957", "Liberal Party", "\"Itutuloy ang daang matuwid.\"");
        Accomplishment accomplishment = new Accomplishment(
                new ArrayList<String>(Arrays.asList("a", "b", "c")),
                new ArrayList<String>(Arrays.asList("d", "e", "f")),
                new ArrayList<String>(Arrays.asList("ag", "gb", "gc")),
                new ArrayList<String>(Arrays.asList("ha", "hb", "hc")),
                new ArrayList<String>(Arrays.asList("ha", "hb", "hc")),
                new ArrayList<String>(Arrays.asList("ha", "hb", "hc")));
        Candidate candidate = new Candidate("mar",bio, accomplishment);
        intent.putExtra("CANDIDATE", JsonUtil.toJson(candidate));
        startActivity(intent);
    }
}

