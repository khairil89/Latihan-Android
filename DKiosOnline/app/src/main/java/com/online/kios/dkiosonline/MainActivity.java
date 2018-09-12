package com.online.kios.dkiosonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void gotolistbarang(View v) {
        Intent intent = new Intent(this, ViewListBarangActivity.class);
        startActivity(intent);
    }

    public void gotolisttroli(View v) {
        Intent intent = new Intent(this, ListTroliActivity.class);
        startActivity(intent);
    }
}