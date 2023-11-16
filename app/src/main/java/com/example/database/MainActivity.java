package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

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
                querydata();

            }
        });
    }

    private void querydata() {
    }

}