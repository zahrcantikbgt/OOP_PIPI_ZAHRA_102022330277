public class Kucing extends Hewan {
    private String ras;
    
    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }
    
    @Override
    public void suara() {
        System.out.println(nama + " meong meong");
    }
    
    @Override
    public void infoHewan() {
        super.infoHewan();
        System.out.println("Ras: " + ras);
    }
}