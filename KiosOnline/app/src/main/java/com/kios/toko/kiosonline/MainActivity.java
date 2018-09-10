package com.kios.toko.kiosonline;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @NonNull
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void initNextToList(View v) {
        Intent intent = new Intent(this, ListBarangActivity.class);
        startActivity(intent);
    }

    public void initNextToTroli(View v) {
        Intent intent = new Intent(this, ListTroliActivity.class);
        startActivity(intent);
    }
}
