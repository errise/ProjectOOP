/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Novel extends Buku {

    private String seri;
    private boolean berseri;
    private int tebalBuku;

    public Novel() {
        super();
        this.seri = "Tidak ada";
        this.berseri = false;
        this.tebalBuku = 0;
    }

    public Novel(String idBuku, String judulBuku, String penulis, String penerbit, double harga, int stok, boolean status, String kategori, String seri, boolean berseri, int tebalBuku) {
        super(idBuku, judulBuku, penulis, penerbit, harga, stok, status, kategori);
        this.seri = seri;
        this.berseri = berseri;
        this.tebalBuku = tebalBuku;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public boolean isBerseri() {
        return berseri;
    }

    public void setBerseri(boolean berseri) {
        this.berseri = berseri;
    }

    public int getTebalBuku() {
        return tebalBuku;
    }

    public void setTebalBuku(int tebalBuku) {
        this.tebalBuku = tebalBuku;
    }

    @Override
    public void show() {
        super.show();
        if (isBerseri()) {
            System.out.println("Berseri");
            System.out.println("Seri    : " + this.seri);
            System.out.println("Tebal   : " + this.tebalBuku + " halaman");
        }
        if (isStatus()) {
            System.out.println("Status  : tersedia");
            System.out.println("Harga   : Rp " + getHarga());
        } else {
            System.out.println("Status  : Tidak tersedia");
        }
    }

}
