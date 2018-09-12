package com.online.kios.dkios;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class BarangHelper extends SQLiteOpenHelper {

    //static variabel untuk db version
    private static final int DB_VERSION = 1;

    //initialize nama database
    private static final String DATABASE_NAME = "DbKios";

    //initialize nama tabel
    private static final String TABLE_NAME = "barang";

    //column tables
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "nama_barang";
    private static final String KEY_DESC = "detail_barang";
    private static final String KEY_HARGA = "harga_barang";

    public BarangHelper(Context context) {
        super(context, DATABASE_NAME, null, DB_VERSION);
    }

    //create table
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_BARANG_TABLE = "CREATE TABLE IF NOT EXISTS "
                + TABLE_NAME + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + KEY_NAME + " TEXT NULL,"
                + KEY_DESC + " TEXT NULL,"
                + KEY_HARGA + " INTEGER NULL" + ")";
    }

    //On Upgrade database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    //insert data ke Database
    public void addBarang(Barang barang) {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, barang.getNama_barang());
        values.put(KEY_DESC, barang.getDetail_barang());
        values.put(KEY_HARGA, barang.getHarga_barang());

        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    //membaca data dari database
    public Barang getBarang(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_NAME, new String[] {
        KEY_ID, KEY_NAME, KEY_DESC, KEY_HARGA }, KEY_ID + "=?",
        new String[] { String.valueOf(id) }, null, null,
        null, null);

        if(cursor != null)
           cursor.moveToFirst();

        Barang newBarang = new Barang(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2),
                Integer.parseInt(cursor.getString(3)));
        return newBarang;
    }

    //membaca data semua record
    public List<Barang> getAllRecord() {
        List<Barang> barangList = new ArrayList<Barang>();
        //query All
        String selectQuery = "SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if(cursor.moveToFirst()) {
            do {
                Barang barang = new Barang();

                barang.setId(Integer.parseInt(cursor.getString(0)));
                barang.setNama_barang(cursor.getString(1));
                barang.setDetail_barang(cursor.getString(2));
                barang.setHarga_barang(Integer.parseInt(cursor.getString(3)));

                barangList.add(barang);
            }
            while (cursor.moveToNext());
        }

        return barangList;
    }

    //jumlah record dalam tabel
    public int getCountBarang() {
        String countQuery = "SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        //return count
        return cursor.getCount();
    }
}
