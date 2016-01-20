package com.cloudsherpas.kandidatos.bio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
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

        TextView school = (TextView) view.findViewById(R.id.schools);
        StringBuffer schoolFormat = new StringBuffer("<h4>Academic Background</h4>");
        String[] array = c.getCredential().getSchool().split(",");
        for(int i=0; i<array.length; i++){
            schoolFormat.append("&#149").append(array[i]).append("<br/>");
        }
        school.setText(Html.fromHtml(schoolFormat.toString()));

        TextView pos = (TextView) view.findViewById(R.id.positions);
        StringBuffer posFormat = new StringBuffer("<h4>Positions Held</h4>");
        String[] arrayPos = c.getCredential().getPositions().split(",");
        for(int i=0; i<arrayPos.length; i++){
            posFormat.append("&#149").append(arrayPos[i]).append("<br/>");
        }
        pos.setText(Html.fromHtml(posFormat.toString()));

        TextView bills = (TextView) view.findViewById(R.id.bills);
        StringBuffer billsFormat = new StringBuffer("<h4>Bills Passed</h4>");
        String[] arrayBill = c.getCredential().getBills().split("\n");
        for(int i=0; i<arrayBill.length; i++){
            billsFormat.append("&#149").append(arrayBill[i]).append("<br/>");
        }
        bills.setText(Html.fromHtml(billsFormat.toString()));

        TextView awards = (TextView) view.findViewById(R.id.awards);
        StringBuffer awardsFormat = new StringBuffer("<h4>Awards Received</h4>");
        String[] arrayAward = c.getCredential().getAwards().split(",");
        for(int i=0; i<arrayAward.length; i++){
            awardsFormat.append("&#149").append(arrayAward[i]).append("<br/>");
        }
        awards.setText(Html.fromHtml(awardsFormat.toString()));

        return view;
    }
}
