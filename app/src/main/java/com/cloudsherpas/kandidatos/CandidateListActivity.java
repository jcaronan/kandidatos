package com.cloudsherpas.kandidatos;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

import com.cloudsherpas.kandidatos.accomplishment.Accomplishment;
import com.cloudsherpas.kandidatos.bio.Biography;
import com.cloudsherpas.kandidatos.bio.BiographyActivity;
import com.cloudsherpas.kandidatos.profile.CandidateProfileActivity;
import com.cloudsherpas.kandidatos.util.JsonUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CandidateListActivity extends AppCompatActivity {
    public Candidate[] candidates = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate_list);

        CandidateListDao cDao = new CandidateListDao();
        List<Candidate> candidateList = cDao.getCandidates();
        candidates = candidateList.toArray(new Candidate[candidateList.size()]);

        GridView gridview = (GridView) findViewById(R.id.candidateGrid);
        CandidateListAdapter adapter = new CandidateListAdapter(this);
        gridview.setAdapter(adapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long arg2) {
                //ItemClicked item = adapter.getItem(position);

                Intent intent = new Intent(CandidateListActivity.this, CandidateProfileActivity.class);
                //based on item add info to intent
                startActivity(intent);
            }
        });

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
        com.cloudsherpas.kandidatos.candidate.Candidate candidate = new com.cloudsherpas.kandidatos.candidate.Candidate("mar",bio, accomplishment);
        intent.putExtra("CANDIDATE", JsonUtil.toJson(candidate));
        startActivity(intent);
    }


    public class CandidateListAdapter extends BaseAdapter {
        private Context mContext;

        public CandidateListAdapter(Context c){
            this.mContext = c;
        }

        @Override
        public int getCount() {
            return candidates.length;
        }

        @Override
        public Object getItem(int arg0) {
            return candidates[arg0];
        }

        @Override
        public long getItemId(int arg0) {
            return arg0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View grid;

            if(convertView==null){
                grid = new View(mContext);
                LayoutInflater inflater=getLayoutInflater();
                grid=inflater.inflate(R.layout.candidate_list_item, parent, false);
            }else{
                grid = (View)convertView;
            }

            ImageView imageView = (ImageView)grid.findViewById(R.id.candidateListImage);
            imageView.setImageResource(R.mipmap.ic_launcher);
            //imageView.setImageResource(candidates[position].getPortrait());

            return grid;
        }
    }
}
