
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
public class TokoBuku {

    private String idTokoBuku;
    private String kota;
    private String password;
    private String alamat;
    private String noTelepon;
    private LinkedList<Buku> daftarBuku;
    private LinkedList<Pesanan> daftarPesanan;

    public TokoBuku(String idTokoBuku, String password, String kota, String alamat, String noTelepon, LinkedList<Buku> daftarBuku, LinkedList<Pesanan> daftarPesanan) {
        this.idTokoBuku = idTokoBuku;
        this.kota = kota;
        this.password = password;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.daftarBuku = daftarBuku;
        this.daftarPesanan = daftarPesanan;
    }

    public TokoBuku() {
        this.kota = "Tidak ada";
        this.idTokoBuku = "Tidak ada";
        this.password = "Tidak ada";
        this.alamat = "Tidak ada";
        this.noTelepon = "Tidak ada";
        this.daftarBuku = new LinkedList();
        this.daftarPesanan = new LinkedList();
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getIdTokoBuku() {
        return idTokoBuku;
    }

    public void setIdTokoBuku(String idTokoBuku) {
        this.idTokoBuku = idTokoBuku;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public LinkedList<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public void setDaftarBuku(LinkedList<Buku> daftarBuku) {
        this.daftarBuku = daftarBuku;
    }

    public LinkedList<Pesanan> getDaftarPesanan() {
        return daftarPesanan;
    }

    public void setDaftarPesanan(LinkedList<Pesanan> daftarPesanan) {
        this.daftarPesanan = daftarPesanan;
    }

    public void addBuku(Buku bukuBaru) {
        if (daftarBuku.isEmpty()) {//daftar buku masih kosong
            daftarBuku.addFirst(bukuBaru);//Memasukkan buku baru ke dalam daftar buku dari depan
        } else {//daftar buku tidak kosong
            daftarBuku.add(bukuBaru);//Memasukkan buku baru ke dalam daftar buku
        }
    }

    public void editBuku(Buku bukuEdit) {
        if (daftarBuku.contains(bukuEdit)) {//daftar buku memiliki buku yang ingin diedit
            daftarBuku.set(daftarBuku.indexOf(bukuEdit), bukuEdit);//Mengganti buku yang ada di daftar buku dengan buku yang baru
        }
    }

    public void hapusBuku(Buku bukuHapus) {
        if (daftarBuku.contains(bukuHapus)) {//daftar buku memiliki buku yang ingin dihapus
            daftarBuku.remove(daftarBuku.indexOf(bukuHapus));//Menghapus buku yang ada di daftar buku
        }
    }

    public void tambahStok(Buku tambahBuku, int tambahStok) {
        if (daftarBuku.contains(tambahBuku)) {//daftar buku memiliki buku yang ingin ditambah stoknya
            daftarBuku.get(daftarBuku.indexOf(tambahBuku)).setStok(daftarBuku.get(daftarBuku.indexOf(tambahBuku)).getStok() + tambahStok);//menambahkan stok buku dengan jumlah yang diinputkan
        }
    }

    public void kurangStok(Buku kurangBuku, int kurangStok) {
        if (daftarBuku.contains(kurangBuku)) {//daftar buku memiliki buku yang ingin dikurangi stoknya
            daftarBuku.get(daftarBuku.indexOf(kurangBuku)).setStok(daftarBuku.get(daftarBuku.indexOf(kurangBuku)).getStok() - kurangStok);//mengurangkan stok buku dengan jumlah yang diinputkan
        }
    }

    public void editTokoBuku(String kota, String alamat, String noTelepon) {
        this.kota = kota;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
    }

    public void batalPesanan(Pesanan pesananBatal) {
        if (daftarPesanan.contains(pesananBatal)) {//daftar pesanan memiliki pesanan yang ingin dibatalkan
            daftarPesanan.remove(pesananBatal);//membatalkan pesanan dan menghapusnya
        }
    }

    public void pesananLunas(Pesanan pesananLunas) {
        if (daftarPesanan.contains(pesananLunas)) {//daftar pesanan memiliki pesanan yang mau diubah status 
            if (daftarPesanan.get(daftarPesanan.indexOf(pesananLunas)).isStatus() == false) {//pesanan belum lunas
                daftarPesanan.get(daftarPesanan.indexOf(pesananLunas)).setStatus(true);//mengubah status pesanan menjadi lunas
            }
        }
    }

    public Buku cariBuku(String judulTokoBuku) {
        Buku bukuDicari = null;
        for (int i = 0; i < daftarBuku.size(); i++) {
            if (daftarBuku.get(i).getJudulBuku().equals(judulTokoBuku)) {
                bukuDicari = daftarBuku.get(i);
            }
        }
        return bukuDicari;
    }

    public void lihatDaftarBuku() {
        for (int i = 0; i < daftarBuku.size(); i++) {
            if (daftarBuku.get(i).isStatus()) {
                System.out.println((i + 1) + ". " + daftarBuku.get(i).getJudulBuku() + " - " + daftarBuku.get(i).getPenulis() + ", Tersedia");
            } else {
                System.out.println((i + 1) + ". " + daftarBuku.get(i).getJudulBuku() + " - " + daftarBuku.get(i).getPenulis() + ", Tidak tersedia");
            }
        }
    }
    
    public void lihatDaftarPesanan(){
        for (int i = 0; i < daftarPesanan.size(); i++) {
            if (daftarPesanan.get(i).isStatus()) {
                System.out.println((0+1)+". ["+daftarPesanan.get(i).getIdPesanan()+"] "+daftarPesanan.get(i).getNamaUser()+" - Rp"+daftarPesanan.get(i).getTotalHarga()+" - Lunas");
            }else{
                System.out.println((0+1)+". ["+daftarPesanan.get(i).getIdPesanan()+"] "+daftarPesanan.get(i).getNamaUser()+" - Rp"+daftarPesanan.get(i).getTotalHarga()+" - Belum lunas");
            }
        }
    }
}
