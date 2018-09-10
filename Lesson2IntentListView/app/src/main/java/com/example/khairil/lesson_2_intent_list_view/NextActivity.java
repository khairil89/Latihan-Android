package com.example.khairil.lesson_2_intent_list_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        initActivity();
    }

    public void initActivity() {
        String parsedDataText  = "";
        String parsedDataText1 = "";
        String key  = "parse_data";
        String keys = "parse_data1";
        TextView text = findViewById(R.id.text);
        TextView text1 = findViewById(R.id.text1);

//        if(getIntent().hasExtra("parse_data")) {
//            key = "parse_data";
//        }
//        else {
//            key = "parsed_data";
//        }

//        if(getIntent().hasExtra("parse_data")) {
            parsedDataText  = getIntent().getExtras().getString(key);
            parsedDataText1 = getIntent().getExtras().getString(keys);
            text.setText(parsedDataText);
            text1.setText(parsedDataText1);
//        }

    }
}
