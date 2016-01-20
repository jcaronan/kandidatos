package com.cloudsherpas.kandidatos.accomplishment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.cloudsherpas.kandidatos.R;
import com.cloudsherpas.kandidatos.candidate.Candidate;
import com.cloudsherpas.kandidatos.candidate.CandidateListDao;
import com.cloudsherpas.kandidatos.profile.CandidateProfileActivity;
import com.cloudsherpas.kandidatos.profile.CandidateProfileChartService;
import com.github.mikephil.charting.charts.RadarChart;

/**
 * Created by dong on 1/20/16.
 */
public class AccomplishmentFragment extends Fragment {
    private RadarChart mChart;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.accomplishment_fragment, container, false);
        String candidateId = ((CandidateProfileActivity)getActivity()).getCurrentCandidateId();
        Candidate c = CandidateListDao.getById(candidateId);

        mChart = (RadarChart) view.findViewById(R.id.profileChart);
        CandidateProfileChartService service = new CandidateProfileChartService();
        service.setupRadarChart(mChart);

        return view;
    }
}
