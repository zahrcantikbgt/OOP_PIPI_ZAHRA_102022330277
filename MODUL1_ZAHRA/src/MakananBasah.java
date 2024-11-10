// Don't delete any comments below!!!
public class MakananBasah {
    private String nama;
    private int jumlah;
    private int harga;
    private String bahan;

    public MakananBasah(String nama, int jumlah, int harga, String bahan) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.bahan = bahan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public void tampilanmakananbasah() {
        System.out.println("Nama: " + nama + "Jumlah: " + jumlah + "Harga: " + harga + "Bahan: " + bahan);
    }

   
}
