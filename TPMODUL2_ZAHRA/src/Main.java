public class Main {
    public static void main(String[] args) {
        System.out.println("Detail Hewan\n");
        
        Kucing Cat = new Kucing("Cat", 3, "Anggora");
        Cat.kenalan();
        Cat.suara();
        Cat.makan();
        Cat.makan("whiskas");
        System.out.println();
        
        Burung Dara = new Burung("Dara", 2, "Biru");
        Dara.kenalan();
        Dara.suara();
        Dara.makan();
        Dara.makan("jagung");
        System.out.println();
        
        Cat.infoHewan();
        Dara.infoHewan();
    }
}