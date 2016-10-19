/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Majalah extends Buku{
    
    private String edisi;

    public Majalah() {
        super();
        this.edisi = "Tidak ada";
    }

    public Majalah( String idBuku, String judulBuku, String penulis, String penerbit, double harga, int stok, boolean status, String kategori, String edisi) {
        super(idBuku, judulBuku, penulis, penerbit, harga, stok, status, kategori);
        this.edisi = edisi;
    }

    public String getEdisi() {
        return edisi;
    }

    public void setEdisi(String edisi) {
        this.edisi = edisi;
    }

    @Override
    public void show() {
        super.show(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Edisi   : "+this.edisi);
    }
    
    
}
