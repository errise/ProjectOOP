
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Pesanan {
    private String idPesanan;
    private LinkedList<Buku> daftarBuku;
    private int[] daftarJumlahBukuYangDipesan;
    private String idUser;
    private String idTokoBuku;
    private String namaTokoBuku;
    private String namaUser;
    private boolean status;
    private double totalHarga;

    public Pesanan() {
        this.idPesanan = "Tidak ada";
        this.daftarBuku = new LinkedList();
        this.daftarJumlahBukuYangDipesan = new int[10];
        this.idUser = "Tidak ada";
        this.idTokoBuku = "Tidak ada";
        this.namaTokoBuku = "Tidak ada";
        this.namaUser = "Tidak ada";
        this.status = false;
        this.totalHarga = 0;
    }

    public String getIdPesanan() {
        return idPesanan;
    }

    public void setIdPesanan(String idPesanan) {
        this.idPesanan = idPesanan;
    }

    public LinkedList<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public void setDaftarBuku(LinkedList<Buku> daftarBuku) {
        this.daftarBuku = daftarBuku;
    }

    public int[] getDaftarJumlahBukuYangDipesan() {
        return daftarJumlahBukuYangDipesan;
    }

    public void setDaftarJumlahBukuYangDipesan(int[] daftarJumlahBukuYangDipesan) {
        this.daftarJumlahBukuYangDipesan = daftarJumlahBukuYangDipesan;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdTokoBuku() {
        return idTokoBuku;
    }

    public void setIdTokoBuku(String idTokoBuku) {
        this.idTokoBuku = idTokoBuku;
    }

    public String getNamaTokoBuku() {
        return namaTokoBuku;
    }

    public void setNamaTokoBuku(String namaTokoBuku) {
        this.namaTokoBuku = namaTokoBuku;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }
    
    public double hitungTotalHarga(){
        double total = 0;
        for (int i = 0; i < daftarBuku.size(); i++) {
            total = total +(daftarBuku.get(i).getHarga()*daftarJumlahBukuYangDipesan[i]);
        }
        return total;
    }
        
    public void show(){
        System.out.println("Id Pesanan      : "+this.idPesanan);
        System.out.println("Pemesan         : "+this.namaUser);
        System.out.println("Dipesan dari    : "+this.namaTokoBuku);
        for (int i = 0; i < daftarBuku.size(); i++) {
            System.out.println((i+1)+". "+daftarBuku.get(i).getJudulBuku()+" x"+daftarJumlahBukuYangDipesan[i]);
        }
        System.out.println("Total harga     : Rp "+hitungTotalHarga());
        if (status == false) {
            System.out.println("Status lunas    : Belum lunas");
        }else{
            System.out.println("Status lunas    : Lunas");
        }
    }
}
