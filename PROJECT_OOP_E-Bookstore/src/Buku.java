/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Buku {

    private String idBuku;
    private String judulBuku;
    private String penulis;
    private String penerbit;
    private double harga;
    private int stok;
    private boolean status;
    private String kategori;

    public Buku() {
        this.idBuku = "Tidak ada";
        this.judulBuku = "Tidak ada";
        this.penulis = "Tidak ada";
        this.penerbit = "Tidak ada";
        this.harga = 0;
        this.stok = 0;
        this.status = false;
        this.kategori = "Tidak ada";
    }

    public Buku(String idBuku, String judulBuku, String penulis, String penerbit, double harga, int stok, boolean status, String kategori) {
        this.idBuku = idBuku;
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.harga = harga;
        this.stok = stok;
        this.status = status;
        this.kategori = kategori;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    public void show(){
        System.out.println("Judul   : "+this.judulBuku);
        System.out.println("Penulis : "+this.penulis);
        System.out.println("Penerbit: "+this.penerbit);
        System.out.println("Kategori: "+this.kategori);
    }
}
