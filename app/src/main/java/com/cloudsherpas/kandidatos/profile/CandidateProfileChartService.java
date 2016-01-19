package com.cloudsherpas.kandidatos.profile;

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
        dataSetArrayList.add(new Entry(3f, 0));
        dataSetArrayList.add(new Entry(10f, 1));
        dataSetArrayList.add(new Entry(9f, 2));
        dataSetArrayList.add(new Entry(1f, 3));
        dataSetArrayList.add(new Entry(6f, 4));
        dataSetArrayList.add(new Entry(4f, 5));
        dataSetArrayList.add(new Entry(1f, 6));
        dataSetArrayList.add(new Entry(7f, 7));

        RadarDataSet set1 = new RadarDataSet(dataSetArrayList, "Candidate");
        set1.setColor(ColorTemplate.VORDIPLOM_COLORS[0]);
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
