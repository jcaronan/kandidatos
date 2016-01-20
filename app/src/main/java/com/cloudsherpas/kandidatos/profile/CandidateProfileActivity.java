package com.cloudsherpas.kandidatos.profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

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
    private TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate_profile);

        mChart = (RadarChart) findViewById(R.id.profileChart);
        CandidateProfileChartService service = new CandidateProfileChartService();
        service.setupRadarChart(mChart);

        Intent intent = getIntent();
        final String candidateId = intent.getExtras().getString("CandidateID");

        /*LinearLayout profile = (LinearLayout) findViewById (R.id.linearLayout);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBioPage(CandidateListDao.getById(candidateId));
            }
        });*/

        //Setup Data Bindings here
        Candidate c = CandidateListDao.getById(candidateId);

        //Profile image
        iView = (ImageView) findViewById(R.id.profileImage);
        String uri = "@drawable/" + c.getPortrait(); //should have no extension
        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        iView.setBackgroundResource(imageResource);

        //Profile name
        tView = (TextView) findViewById(R.id.candidateProfileName);
        tView.setText(c.getBio().getFirstname()+ "\n" + c.getBio().getLastname());
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
