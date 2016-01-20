package com.cloudsherpas.kandidatos.profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.cloudsherpas.kandidatos.R;
import com.cloudsherpas.kandidatos.accomplishment.Accomplishment;
import com.cloudsherpas.kandidatos.bio.Biography;
import com.cloudsherpas.kandidatos.bio.BiographyActivity;
import com.cloudsherpas.kandidatos.candidate.Candidate;
import com.cloudsherpas.kandidatos.candidate.CandidateListDao;
import com.cloudsherpas.kandidatos.util.JsonUtil;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

import java.util.ArrayList;
import java.util.Arrays;

public class CandidateProfileActivity extends AppCompatActivity {

    private RadarChart mChart;
    private ImageView iView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate_profile);

        Intent intent = getIntent();
        final String candidateId = intent.getExtras().getString("CandidateID");

        mChart = (RadarChart) findViewById(R.id.profileChart);
        CandidateProfileChartService service = new CandidateProfileChartService();
        service.setupRadarChart(mChart);

        //Left-hand image
        iView = (ImageView) findViewById(R.id.imageView);

        switch(candidateId){
            case "0":  iView.setImageResource(R.drawable.tile_roxas); break;
            case "1":  iView.setImageResource(R.drawable.tile_poe); break;
            case "2":  iView.setImageResource(R.drawable.tile_binay); break;
            case "3":  iView.setImageResource(R.drawable.tile_santiago); break;
            case "4":  iView.setImageResource(R.drawable.tile_duterte); break;
            case "5":  iView.setImageResource(R.drawable.tile_seneres); break;
        }

        //mChart.setBackgroundResource(R.drawable.mar_roxas);


        LinearLayout profile = (LinearLayout) findViewById (R.id.linearLayout);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBioPage(CandidateListDao.getById(candidateId));
            }
        });

        //Setup Data Bindings here
        Candidate c = CandidateListDao.getById(candidateId);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_candidate_profile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void goToBioPage(Candidate candidate){
        final Intent intent = new Intent(this, BiographyActivity.class);
        intent.putExtra("CANDIDATE", JsonUtil.toJson(candidate));
        startActivity(intent);
    }
}
