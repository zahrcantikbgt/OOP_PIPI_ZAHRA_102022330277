public class Hewan {
    protected String nama;
    protected int umur;
    
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    public void kenalan() {
        System.out.println("ini adalah " + nama);
    }

    public void suara() {
        System.out.println(nama + " bersuara");
    }
    
    public void makan() {
        System.out.println(nama + " sedang makan");
    }
    
    public void makan(String makanan) {
        System.out.println(nama + " sedang makan " + makanan);
    }
    
    public void infoHewan() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun");
    }
}