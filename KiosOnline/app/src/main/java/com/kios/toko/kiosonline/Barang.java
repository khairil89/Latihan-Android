package com.kios.toko.kiosonline;

public class Barang {

    public String namaBarang;
    public String kategoriBarang;
    public Integer gambarBarang;
    public int hargaBarang;
    public String deskripsiBarang;
    public boolean stats = false;

    public Barang(String namaBarang, Integer gambarBarang,
                  String deskripsiBarang, int hargaBarang,
                  String kategoriBarang) {
        this.namaBarang      = namaBarang;
        this.kategoriBarang  = kategoriBarang;
        this.gambarBarang    = gambarBarang;
        this.hargaBarang     = hargaBarang;
        this.deskripsiBarang = deskripsiBarang;
    }
}
