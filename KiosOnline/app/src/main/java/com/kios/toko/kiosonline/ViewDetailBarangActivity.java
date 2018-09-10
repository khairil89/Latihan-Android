package com.kios.toko.kiosonline;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewDetailBarangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailbarang);

        initActivity();
    }

    public void initActivity() {
        String parseDetailNamaBarang = "";
        String parseDetailTipeBarang = "";
        Integer parseDetailGambarBarang = 0;
        String parseDetailDeskripsiBarang = "";
        String parseDetailStatusBarang = "";
        String parseDetailHargaBarang = "";
        String parseDetailRatingBarang = "";
        String parseDetailStokBarang = "";
        String parseDetailKategoriBarang = "";
        String keyNama = "parse_detailnamabarang";
        String keyTipe = "parse_detailtipebarang";
        String keyGambar = "parse_detailgambarbarang";
        String keyDeskripsi = "parse_detaildeskripsibarang";
        String keyStatus = "parse_detailstatusbarang";
        String keyHarga = "parse_detailhargabarang";
        String keyRating = "parse_detailratingbarang";
        String keyStok = "parse_detailstokbarang";
        String keyKategori = "parse_detailkategoribarang";

        TextView detailNama = findViewById(R.id.detailnamabarang);
        TextView detailTipe = findViewById(R.id.detailtipebarang);
        ImageView detailGambar = findViewById(R.id.detailgambarbarang);
        TextView detailDeskripsi = findViewById(R.id.detaildeskripsibarang);
        TextView detailStatus = findViewById(R.id.detailstatusbarang);
        TextView detailHarga = findViewById(R.id.detailhargabarang);
        TextView detailRating = findViewById(R.id.detailratingbarang);
        TextView detailStok = findViewById(R.id.detailstokbarang);
        TextView detailKategori = findViewById(R.id.detailkategoribarang);

        parseDetailNamaBarang = getIntent().getExtras().getString(keyNama);
        parseDetailTipeBarang = getIntent().getExtras().getString(keyTipe);
        parseDetailGambarBarang = getIntent().getIntExtra(keyGambar, 0);
        parseDetailDeskripsiBarang = getIntent().getExtras().getString(keyDeskripsi);
        parseDetailStatusBarang = getIntent().getExtras().getString(keyStatus);
        parseDetailHargaBarang = getIntent().getExtras().getString(keyHarga);
        parseDetailRatingBarang = getIntent().getExtras().getString(keyRating);
        parseDetailStokBarang = getIntent().getExtras().getString(keyStok);
        parseDetailKategoriBarang = getIntent().getExtras().getString(keyKategori);

        detailNama.setText(parseDetailNamaBarang);
        detailTipe.setText(parseDetailTipeBarang);
        detailDeskripsi.setText(parseDetailDeskripsiBarang);
        detailGambar.setImageResource(parseDetailGambarBarang);
        detailStatus.setText(parseDetailStatusBarang);
        detailHarga.setText(parseDetailHargaBarang);
        detailRating.setText(parseDetailRatingBarang);
        detailStok.setText(parseDetailStokBarang);
        detailKategori.setText(parseDetailKategoriBarang);
    }

    public void backToList() {
        Intent intent = new Intent( ViewDetailBarangActivity.this, ListBarangActivity.class);
        startActivity(intent);
    }

}

