package com.example.khairil.lesson_2_intent_list_view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    UsersAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Construct the data source
        ArrayList<User> arrayOfUsers = new ArrayList<User>();

        // Create the adapter to convert the array to views
        adapter = new UsersAdapter(this, arrayOfUsers);

        // Attach the adapter to a ListView
        ListView listView = findViewById(R.id.lvItems);
        listView.setAdapter(adapter);

        clearItems();
        initItems();
    }

    public void clearItems() {
        this.adapter.clear();
    }

    public void initItems() {
        User newUser1 = new User("Khairil", "Banjarmasin");
        User newUser2 = new User("Malik", "Cimahi");
        User newUser3 = new User("Alifhar", "Jambi");
        User newUser4 = new User("Arief", "Garut");
        User newUser5 = new User("Rizal", "Leles");
        User newUser6 = new User("Vikri", "Cimahi");

        adapter.add(newUser1);
        adapter.add(newUser2);
        adapter.add(newUser3);
        adapter.add(newUser4);
        adapter.add(newUser5);
        adapter.add(newUser6);
    }

    public void initNextToActivity(View v) {
        EditText inputText = findViewById(R.id.inputan);

        Log.d("Main activity", v.toString());

        Intent intent = new Intent(getApplicationContext(), NextActivity.class);
        intent.putExtra("parse_data", inputText.getText() + "");
        startActivity(intent);
    }
}
