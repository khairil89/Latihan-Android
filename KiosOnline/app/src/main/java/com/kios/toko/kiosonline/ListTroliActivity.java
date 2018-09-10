package com.kios.toko.kiosonline;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListTroliActivity extends AppCompatActivity {

    String[] daftar;
    ListView listTroli;
    Menu menu;
    protected Cursor cursor;
    DataHelperBarang dbcenter;
    public static ListTroliActivity lta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listtroli);

        lta = this;
        dbcenter = new DataHelperBarang(this);
        RefreshList();
    }

    public void RefreshList() {
        SQLiteDatabase dbs = dbcenter.getReadableDatabase();
        cursor = dbs.rawQuery("SELECT * FROM troli_barang", null);
        daftar = new String[cursor.getCount()];
        cursor.moveToFirst();
        for( int cc=0; cc < cursor.getCount(); cc++) {
            cursor.moveToPosition(cc);
            daftar[cc] = cursor.getString(0).toString();
        }
        listTroli = findViewById(R.id.listTroli);
        listTroli.setAdapter(new ArrayAdapter(this, android.R.layout.list_content, daftar));
        listTroli.setSelected(true);
    }

}
