/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class BukuPelajaran extends Buku {

    private String tingkatPendidikan;

    public BukuPelajaran() {
        super();
        this.tingkatPendidikan = "Tidak ada";
    }

    public BukuPelajaran(String idBuku, String judulBuku, String penulis, String penerbit, double harga, int stok, boolean status, String kategori, String tingkatPendidikan) {
        super(idBuku, judulBuku, penulis, penerbit, harga, stok, status, kategori);
        this.tingkatPendidikan = tingkatPendidikan;
    }

    public String getTingkatPendidikan() {
        return tingkatPendidikan;
    }

    public void setTingkatPendidikan(String tingkatPendidikan) {
        this.tingkatPendidikan = tingkatPendidikan;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Tingkat : " + this.tingkatPendidikan);
        if (isStatus()) {
            System.out.println("Status  : tersedia");
            System.out.println("Harga   : Rp " + getHarga());
        } else {
            System.out.println("Status  : Tidak tersedia");
        }
    }

}
