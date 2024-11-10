public class Burung extends Hewan {
    private String warnaBulu;
    
    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }
    
    @Override
    public void suara() {
        System.out.println(nama + " kur kur ");
    }
    
    @Override
    public void infoHewan() {
        super.infoHewan();
        System.out.println("Warna bulu: " + warnaBulu);
    }
}