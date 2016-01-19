package com.cloudsherpas.kandidatos.bio;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.cloudsherpas.kandidatos.R;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by jcaronan on 1/19/16.
 */
public class BiographyActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biography);

        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.marroxas);

        try {
            JSONObject obj = new JSONObject(getIntent().getStringExtra("CANDIDATE"));
            TextView textPoliticalname = (TextView) findViewById(R.id.textView2);
            textPoliticalname.setText(obj.getJSONObject("bio").getString("politicalName"));;

            TextView textCompleteName = (TextView) findViewById(R.id.textView3);
            textCompleteName.setText(obj.getJSONObject("bio").getString("firstname") + " " +
                    obj.getJSONObject("bio").getString("middlename") + " " +
                    obj.getJSONObject("bio").getString("lastname"));

            TextView textBday = (TextView) findViewById(R.id.textView4);
            textBday.setText(obj.getJSONObject("bio").getString("birthdate"));

            TextView textSlogan = (TextView) findViewById(R.id.textView5);
            textSlogan.setText(obj.getJSONObject("bio").getString("campaignSlogan"));

            ListView listView = (ListView) findViewById(R.id.list);

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


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.credential_list,values);


            // Assign adapter to ListView
            listView.setAdapter(adapter);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
