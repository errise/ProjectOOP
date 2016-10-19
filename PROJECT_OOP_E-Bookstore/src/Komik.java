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
        super.show(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Volume  : "+this.volume);
    }
    
}
