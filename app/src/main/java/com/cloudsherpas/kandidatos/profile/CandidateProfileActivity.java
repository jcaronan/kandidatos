package com.cloudsherpas.kandidatos.profile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.cloudsherpas.kandidatos.R;
import com.cloudsherpas.kandidatos.accomplishment.Accomplishment;
import com.cloudsherpas.kandidatos.bio.BiographyActivity;
import com.cloudsherpas.kandidatos.candidate.Candidate;
import com.cloudsherpas.kandidatos.candidate.CandidateListDao;
import com.cloudsherpas.kandidatos.util.JsonUtil;

import java.util.ArrayList;

public class CandidateProfileActivity extends AppCompatActivity {

    private ImageView iView;
    private TextView tView;
    private ListView listView;
    ArrayAdapter<String> adapter;
    private String currentCandidateId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate_profile);

        Intent intent = getIntent();
        this.currentCandidateId = intent.getExtras().getString("CandidateID");

        /*LinearLayout profile = (LinearLayout) findViewById (R.id.linearLayout);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBioPage(CandidateListDao.getById(candidateId));
            }
        });*/

        //Setup Data Bindings here

        Candidate c = CandidateListDao.getById(this.currentCandidateId);

        //Profile image
        iView = (ImageView) findViewById(R.id.profileImage);
        String uri = "@drawable/" + c.getPortrait(); //should have no extension
        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        iView.setBackgroundResource(imageResource);

        //Profile name
        tView = (TextView) findViewById(R.id.candidateProfileName);
        tView.setText(c.getBio().getFirstname() + "\n" + c.getBio().getLastname());

        //Tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Biography"));
        tabLayout.addTab(tabLayout.newTab().setText("Work Profile"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final ProfilePagerAdapter adapter = new ProfilePagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
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

    public String getCurrentCandidateId(){
        return this.currentCandidateId;
    }
}
