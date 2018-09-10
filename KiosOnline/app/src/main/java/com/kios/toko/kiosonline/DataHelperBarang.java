package com.kios.toko.kiosonline;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelperBarang extends SQLiteOpenHelper {

    private static final String DB_NAME = "barang.db";
    private static final int DB_VERSION = 1;
    public DataHelperBarang(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        // TODO Auto-generated constructor sub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated constructor sub
        String sql = "CREATE TABLE troli_barang (" +
                "id_barang integer autoincrement," +
                "nama_barang text null, " +
                "harga_barang text null, " +
                "status_barang text null)";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub
    }
}