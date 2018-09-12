package com.online.kios.dkiosonline;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TroliAdapter extends ArrayAdapter<Barang> {

    protected Cursor cursor;
    DataHelperBarang dbHelper;

    public BarangAdapter(Context context, ArrayList<Barang> Barang) {
        super(context, 0, Barang);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        final Barang barang = getItem(position); //posisi item Barang yang dipilih
        // Check if an existing view is being reused,
        // otherwise inflate the view
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.activity_viewparttroli, parent, false);
        }
        else {
            Button pilihbarangBtn = convertView.findViewById(R.id.btn__hapus);;

            if(barang.stats != 0) {
                pilihbarangBtn.setText("Pilih");
                pilihbarangBtn.setBackgroundColor(Color.parseColor("#202020"));
                pilihbarangBtn.setTextColor(Color.parseColor("#808080"));
            }
            else {
                pilihbarangBtn.setText("Kensel");
                pilihbarangBtn.setBackgroundColor(Color.parseColor("#339434"));
                pilihbarangBtn.setTextColor(Color.parseColor("#FEFEFE"));
            }
        }

        final Button pilihbarangBtn = convertView.findViewById(R.id.btn_pilih);;
        dbHelper = new DataHelperBarang(convertView.getContext());
        pilihbarangBtn.setTag(position);
        pilihbarangBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = (Integer) v.getTag();
                Barang setupBarang = getItem(position);

                if(setupBarang.stats != 0) {
                    pilihbarangBtn.setText("Pilih");
                    pilihbarangBtn.setBackgroundColor(Color.parseColor("#202020"));
                    pilihbarangBtn.setTextColor(Color.parseColor("#808080"));
                    setupBarang.stats = 1;

                    //update status_barnag menjadi = 1
                    dbHelper = new DataHelperBarang(v.getContext());
                    SQLiteDatabase dbd = dbHelper.getReadableDatabase();

                    ContentValues val = new ContentValues();
                    val.put("status_barang",1);

                    String[] id = { setupBarang.idBarang + "" };
                    dbd.update(
                            "tbl_barang",
                            val,
                            "id_barang = ?",
                            id
                    );

                    Toast.makeText(v.getContext(), "Masuk ke Troli", Toast.LENGTH_LONG).show();
//                    ListTroliActivity.lta.RefreshList();
                }
                else {
                    pilihbarangBtn.setText("Kensel");
                    pilihbarangBtn.setBackgroundColor(Color.parseColor("#339434"));
                    pilihbarangBtn.setTextColor(Color.parseColor("#FEFEFE"));
                    setupBarang.stats = 0;
                    dbHelper = new DataHelperBarang(v.getContext());
                    SQLiteDatabase dbd = dbHelper.getReadableDatabase();

                    ContentValues val = new ContentValues();
                    val.put("status_barang",0);

                    String[] id = { setupBarang.idBarang + "" };
                    dbd.update(
                            "tbl_barang",
                            val,
                            "id_barang = ?",
                            id
                    );
                }
            }
        });
        //activity_lihatbarang merupakan xml yang menjadi tempat dimana listview berada
        // Lookup view for data population
        TextView namabarang = convertView.findViewById(R.id.listNama);
        TextView hargabarang = convertView.findViewById(R.id.listHarga);
        ImageView gambarbarang = convertView.findViewById(R.id.listGambar);

        TextView detailnamabarang = convertView.findViewById(R.id.detailNama);
        ImageView detailgambarbarang = convertView.findViewById(R.id.detailgambar);
        TextView deskripsibarang = convertView.findViewById(R.id.detailDeskripsi);
        TextView detailhargabarang = convertView.findViewById(R.id.detailHarga);
        TextView detailkategoribarang = convertView.findViewById(R.id.detailKategori);


        // Populate the data into the template view using the data object
        namabarang.setText(barang.namaBarang);
        hargabarang.setText(barang.hargaBarang + "");
        gambarbarang.setImageResource(barang.gambarBarang);

        // Return the completed view to render on screen

        // Lookup view for data population
        Button detButton = convertView.findViewById(R.id.btn_detail);
        // Cache row position inside the button using `setTag`
        detButton.setTag(position);
        // Attach the click event handler
        detButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = (Integer) view.getTag();
                // Access the row position here to get the correct data item
                Barang Barang = getItem(position);

                Intent intent = new Intent(getContext(), ViewDetailBarangActivity.class);
                intent.putExtra("parse_namabarang", Barang.namaBarang);
                intent.putExtra("parse_gambarbarang", Barang.gambarBarang);
                intent.putExtra("parse_kategoribarang", Barang.kategoriBarang);
                intent.putExtra("parse_hargabarang", Barang.hargaBarang);

                intent.putExtra("parse_detailnamabarang", Barang.namaBarang);
                intent.putExtra("parse_detailgambarbarang", Barang.gambarBarang);
                intent.putExtra("parse_detaildeskripsibarang", Barang.deskripsiBarang);
                intent.putExtra("parse_detailhargabarang", Barang.hargaBarang);
                intent.putExtra("parse_detailkategoribarang", Barang.kategoriBarang);
                view.getContext().startActivity(intent);
            }
        });

        return convertView;
    }

}
