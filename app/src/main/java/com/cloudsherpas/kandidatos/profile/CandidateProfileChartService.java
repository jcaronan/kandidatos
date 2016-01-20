package com.cloudsherpas.kandidatos.profile;

import android.graphics.Color;
import android.util.Log;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dong on 1/19/16.
 */
public class CandidateProfileChartService {
    private final String[] areas = new String[]{
        "Education", "Agriculture", "Security", "Trade", "Foreign Affairs", "Health", "Labor", "Transportation"
    };

    public int setupRadarChart(RadarChart chart){
        chart.setDescription("");
        chart.setWebLineWidth(1.5f);
        chart.setWebAlpha(60);
        chart.getLegend().setEnabled(false);
        chart.setRotationEnabled(false);
        chart.setWebColor(Color.BLUE);
        chart.setWebColorInner(Color.WHITE);

        XAxis xAxis = chart.getXAxis();
        xAxis.setTextSize(9f);

        YAxis yAxis = chart.getYAxis();
        //yAxis.setLabelCount(5, false);
        yAxis.setTextSize(9f);
        yAxis.setDrawLabels(false);
        yAxis.setStartAtZero(true);

        chart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry e, int dataSetIndex, Highlight h) {
                Log.v("Value Selected", areas[dataSetIndex]);
            }

            @Override
            public void onNothingSelected() {

            }
        });

        return this.fillRadarData("1", chart);
    }

    public int fillRadarData(String candidateId, RadarChart chart){
        ArrayList<Entry> dataSetArrayList = new ArrayList<Entry>();
        //Mock Data
        //TODO: Parse real data
        float minX = 0.0f;
        float maxX = 10.0f;
        Random rand = new Random();
        for(int i = 0; i < 7; i++){
            dataSetArrayList.add(new Entry(rand.nextFloat() * (maxX - minX) + minX, 0));
        }

        RadarDataSet set1 = new RadarDataSet(dataSetArrayList, "Candidate");
        set1.setColor(Color.YELLOW);
        set1.setDrawFilled(true);
        set1.setLineWidth(2f);

        RadarData data = new RadarData(areas, set1);
        data.setValueTextSize(6f);
        data.setDrawValues(false);

        chart.setData(data);

        chart.invalidate();

        return 0;
    }
}
