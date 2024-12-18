public class appinventory {

    int jumlahtotal, jumlahrented;
    String judul, nama;

    public appinventory(String judul, String nama, int jumlahtotal, int jumlahrented) {
        this.judul = judul;
        this.nama = nama;
        this.jumlahtotal = jumlahtotal;
        this.jumlahrented = jumlahrented;
    }

    public int getJumlahtotal() {
        return jumlahtotal;
    }

    public int getJumlahrented() {
        return jumlahrented;
    }

    public String getJudul() {
        return judul;
    }

    public String getNama() {
        return nama;
    }

    public void setJumlahtotal(int jumlahtotal) {
        this.jumlahtotal = jumlahtotal;
    }

    public void setJumlahrented(int jumlahrented) {
        this.jumlahrented = jumlahrented;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}