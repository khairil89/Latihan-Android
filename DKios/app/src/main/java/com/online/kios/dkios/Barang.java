package com.online.kios.dkios;

public class Barang {

    private int id;
    private String nama_barang;
    private String detail_barang;
    private int harga_barang;

    public Barang() {

    }

    public Barang(int id, String nama_barang, String detail_barang, int harga_barang) {
        this.id = id;
        this.nama_barang = nama_barang;
        this.detail_barang = detail_barang;
        this.harga_barang = harga_barang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getDetail_barang() {
        return detail_barang;
    }

    public void setDetail_barang(String detail_barang) {
        this.detail_barang = detail_barang;
    }

    public int getHarga_barang() {
        return harga_barang;
    }

    public void setHarga_barang(int harga_barang) {
        this.harga_barang = harga_barang;
    }
}
