// Don't delete any comments below!!!

public class MakananKering {
    private String nama;
    private int jumlah;
    private int harga;
    private String brand;

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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void tampilanmakanankering() {
        System.out.println("Nama: " + nama + "Jumlah: " + jumlah + "Harga: " + harga + "Brand: " + brand);
    }
    
}
