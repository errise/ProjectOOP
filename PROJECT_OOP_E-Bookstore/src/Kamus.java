/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Kamus extends Buku {

    private String bahasa;

    public Kamus() {
        super();
        this.bahasa = "Tidak ada";
    }

    public Kamus(String idBuku, String judulBuku, String penulis, String penerbit, double harga, int stok, boolean status, String kategori, String bahasa) {
        super(idBuku, judulBuku, penulis, penerbit, harga, stok, status, kategori);
        this.bahasa = bahasa;
    }

    public String getBahasa() {
        return bahasa;
    }

    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Bahasa  : " + this.bahasa);
        if (isStatus()) {
            System.out.println("Status  : tersedia");
            System.out.println("Harga   : Rp " + getHarga());
        } else {
            System.out.println("Status  : Tidak tersedia");
        }
    }

}
