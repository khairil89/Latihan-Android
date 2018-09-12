package com.online.kios.dkiosonline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ViewListBarangActivity extends AppCompatActivity {

    BarangAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewlistbarang);

        // Construct the data source
        ArrayList<Barang> arrayOfBarang = new ArrayList<>();

        // Create the adapter to convert the array to views
        adapter = new BarangAdapter(this, arrayOfBarang);

        // Attach the adapter to a ListView
        ListView listView = findViewById(R.id.viewbarang);
        listView.setAdapter(adapter);

        clearItems();
        initItems();
    }

    public void clearItems() {
        this.adapter.clear();
    }

    public void initItems() {
        Barang produk1  = new Barang("Chicken Cheese Roll","Penganan Ringan" , R.drawable.chicken_cheese_roll, 12500, "Makanan bergizi dibalut keju parmesan, mozarella dan nikmatnya tak tertahankan");
        Barang produk2  = new Barang("Blue Burger", "Penganan Ringan", R.drawable.blue_burger, 14000, "Sensasi Produk burger dengan warna yang sangat asing oleh beberapa kalangan pencinta kuliner");
        Barang produk3  = new Barang("Croissant Sandwich", "Roti Patisserie", R.drawable.croissant_sandwich, 21000, "Cita rasa perancis dengan saus khas serta roti penuh aroma butter yang menggoda selera");
        Barang produk4  = new Barang("Factory Cheese Cake", "Tart", R.drawable.factory_cheese_cake, 205000, "Rasakan keju yang lumer dimulut dengan kue yang penuh dengan variasi keju seperti yang satu ini");
        Barang produk5  = new Barang("Black Forest", "Tart", R.drawable.kue_black_forest, 121000, "Temani buah hati anda dengan kue black forest yang penuh dengan coklat menggoda selera dan rasakan sesnasi coklat");
        Barang produk6  = new Barang("Kue Lapis", "Penganan Ringan", R.drawable.kue_lapis, 102400, "Temani hari santai anda dengan kue lapis berlapis vanilla dan coklat dalam satu gigitan");
        Barang produk7  = new Barang("Red Velvet", "Tart", R.drawable.kue_red_velvet, 153400, "Manjakan diri anda dengan kue yang penuh dengan warna merah dilapisi cream cheese yang menggugah selera");
        Barang produk8  = new Barang("Religieuse", "Roti Patisserie", R.drawable.kue_religieuse, 35000, "Bagi anda pencinta kuliner perancis rasakan sensasi kue berbentuk topi berikut");
        Barang produk9  = new Barang("Kue Semangka", "Tart", R.drawable.kue_semangka, 108000, "Unik dan asik melihat tampilan kue seperti buah semangka yang lezat dan nikmat");
        Barang produk10 = new Barang("Kue Tart Biru", "Tart", R.drawable.kue_tart_biru, 145000, "Bagi anda pencinta warna biru kue ini sangat cocok untuk anda dalam rangka ulang tahun bahkan acara lainnya");
        Barang produk11 = new Barang("Kue Tart WhiteSnow", "Tart", R.drawable.kue_tart_whitesnow, 139000, "Putri salju yang cantik kini tampilan dalam bentuk kue tart yang nikmat");
        Barang produk12 = new Barang("Macaron", "Penganan Ringan", R.drawable.macaron, 24500, "Manjakan diri anda dengan mencoba macaron dengan sensasi putih telur dan cream vanilla yang lezat");
        Barang produk13 = new Barang("Macha Cake", "Tart", R.drawable.macha_cake, 85000, "Citarasa khas jepang yang memanjakan hari anda dengan bahan dasar macha");
        Barang produk14 = new Barang("Pie Susu", "Penganan Ringan", R.drawable.pie_susu, 50000, "Cita rasa khas pulau dewata memanjakan diri anda untuk merasakan pie susu yang nikmat");
        Barang produk15 = new Barang("Rainbow Cake", "Tart", R.drawable.rainbow_cake, 189000, "Merah, Jingga, Kuning, Biru, Ungu serta warna lainnya yang memukau kue yang satu ini");
        Barang produk16 = new Barang("Vanilla Cupcake", "Penganan Ringan", R.drawable.vanilla_cupcake, 21000, "Senang dengan modal kecil untuk membeli kue ? Coba lah yang satu ini penuh dengan cream vanilla yang manis");
        Barang produk17 = new Barang("Watermelon Cake", "Tart", R.drawable.watermelon_cake, 204000, "Rasa yang manis namun dengan sentuhan dekorasi semangka yang lezat");
        Barang produk18 = new Barang("Roti Unyil", "Roti Patisserie", R.drawable.roti_unyil, 76000, "Bentuk kecil dan mungil sekali rasanya tidak kalah dengan kue bentuk besar lainnya");
        Barang produk19 = new Barang("Kue Tart Keju", "Tart", R.drawable.kue_tart_keju, 242000, "Bagi anda yang senang dengan kue tart penuh dengan keju pilihan inilah saatnya anda mencoba");
        Barang produk20 = new Barang("Pizza Galau", "Roti Patisserie", R.drawable.pizza_galau, 185000, "Pizza dengan topping banyak dan meriah silahkan coba terus dan rasakan");

        adapter.add(produk1);
        adapter.add(produk2);
        adapter.add(produk3);
        adapter.add(produk4);
        adapter.add(produk5);
        adapter.add(produk6);
        adapter.add(produk7);
        adapter.add(produk8);
        adapter.add(produk9);
        adapter.add(produk10);
        adapter.add(produk11);
        adapter.add(produk12);
        adapter.add(produk13);
        adapter.add(produk14);
        adapter.add(produk15);
        adapter.add(produk16);
        adapter.add(produk17);
        adapter.add(produk18);
        adapter.add(produk19);
        adapter.add(produk20);
    }

}
