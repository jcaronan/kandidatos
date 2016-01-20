package com.cloudsherpas.kandidatos.bio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.cloudsherpas.kandidatos.R;
import com.cloudsherpas.kandidatos.candidate.Candidate;
import com.cloudsherpas.kandidatos.candidate.CandidateListDao;
import com.cloudsherpas.kandidatos.profile.CandidateProfileActivity;

public class BiographyFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.biography_fragment, container, false);
        String candidateId = ((CandidateProfileActivity)getActivity()).getCurrentCandidateId();

        Candidate c = CandidateListDao.getById(candidateId);
        TextView textPoliticalname = (TextView) view.findViewById(R.id.textView2);
        textPoliticalname.setText(c.getBio().getPoliticalName());

        TextView textCompleteName = (TextView) view.findViewById(R.id.textView3);
        textCompleteName.setText(c.getBio().getFirstname() + " " +
                c.getBio().getMiddlename() + " " +
                c.getBio().getLastname());

        TextView textBday = (TextView) view.findViewById(R.id.textView4);
        textBday.setText(c.getBio().getBirthdate());

        TextView textSlogan = (TextView) view.findViewById(R.id.textView5);
        textSlogan.setText(c.getBio().getCampaignSlogan());

        ListView listView = (ListView) view.findViewById(R.id.list);

        // Defined Array values to show in ListView
        String[] values = new String[] { "Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View"
        };

        /*
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(),R.layout.linearLayout,values);

        // Assign adapter to ListView
        listView.setAdapter(adapter);
        */

        return view;
    }
}
