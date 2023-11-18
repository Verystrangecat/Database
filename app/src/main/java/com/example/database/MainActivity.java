package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.database.utils.Network_utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    EditText enter;
    Button submit;
    TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter=findViewById(R.id.editTextText);
        submit=findViewById(R.id.button);
        show=findViewById(R.id.textView);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    querydata();
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }

            }
        });
    }

    private void querydata() throws MalformedURLException {
        String food=enter.getText().toString();
        getData();
    }

    private void getData() throws MalformedURLException {
        Uri uri=Uri.parse("https://api.nal.usda.gov/fdc/v1/food/1750340?api_key=DEMO_KEY")
                .buildUpon().build();
        URL url=new URL(uri.toString());
        new Dotask().execute(url);
    }
    class Dotask extends AsyncTask<URL, Void,String> {

        @Override
        protected String doInBackground(URL... urls) {
            URL url = urls[0];
            String data = null;
            try {
                data = Network_utils.makeHtttpsrequest(url);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return data;
        }

        protected void onPostExecute(String s) {
            try {
                parseJson(s);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


        private void parseJson(String data) throws JSONException {
            FoodData food=null;
            try {
                food=Converter.fromJsonString(data);
                String des=food.getDescription();
                show.setText(des);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            }

        }
    }
