package com.kios.toko.kiosonline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ListBarangActivity extends AppCompatActivity {

    BarangAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listbarang);

        // Construct the data source
        ArrayList<Barang> arrayOfBarang = new ArrayList<>();

        // Create the adapter to convert the array to views
        adapter = new BarangAdapter(this, arrayOfBarang);

        // Attach the adapter to a ListView
        ListView listView = findViewById(R.id.listBarang);
        listView.setAdapter(adapter);

        clearItems();
        initItems();
    }

    public void clearItems() {
        this.adapter.clear();
    }

    public void initItems() {
        Barang newBarang1 = new Barang("Pizza Galau", R.drawable.pizza_galau, "Kue", 125000, "Pizza dengan kualitas super rasanya yang memukau dan bisa menggoda lidah.");
        Barang newBarang2 = new Barang("Roti Unyil", R.drawable.roti_unyil, "Kue", 81000, "Roti kecil mungil dengan rasa yang penuh sensasi butter nya");
        Barang newBarang3 = new Barang("Kue Tart Keju", R.drawable.kue_tart_keju, "Kue", 167000, "Kue tart paling banyak kejunya dilengkapi dengan krim keju di setiap lapisan cake");

        adapter.add(newBarang1);
        adapter.add(newBarang2);
        adapter.add(newBarang3);
    }

}
