package com.cloudsherpas.kandidatos.candidate;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.cloudsherpas.kandidatos.R;
import com.cloudsherpas.kandidatos.profile.CandidateProfileActivity;

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
                intent.putExtra("CandidateID", "1");
                //based on item add info to intent
                startActivity(intent);
            }
        });
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

            Candidate c = candidates[position];
            String uri = "@drawable/" + c.getPortrait(); //should have no extension
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());

            ImageView imageView = (ImageView)grid.findViewById(R.id.candidateListImage);
            imageView.setImageResource(imageResource);

            TextView textView = (TextView)grid.findViewById(R.id.itemText);
            textView.setText(c.getBio().getLastname());

            return grid;
        }
    }
}
