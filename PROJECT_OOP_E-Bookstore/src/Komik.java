/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Komik extends Buku{
    private String volume;

    public Komik( String idBuku, String judulBuku, String penulis, String penerbit, double harga, int stok, boolean status, String kategori, String volume) {
        super(idBuku, judulBuku, penulis, penerbit, harga, stok, status, kategori);
        this.volume = volume;
    }

    public Komik() {
        super();
        this.volume = "Tidak ada";
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public void show() {
        super.show(); 
        System.out.println("Volume  : "+this.volume);
        System.out.println("Harga   : "+getHarga());
        if (isStatus()) {
            System.out.println("Status  : tersedia");
            System.out.println("Harga   : Rp " + getHarga());
        } else {
            System.out.println("Status  : Tidak tersedia");
        }
    }
    
}
