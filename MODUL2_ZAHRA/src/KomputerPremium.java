class KomputerPremium extends Komputer {
    protected boolean ruangPrivat;

    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    @Override
    public void Informasi() {
        super.Informasi();
        if (ruangPrivat);
        System.out.println("Status:" + ruangPrivat);
        System.out.println("Fasilitas Ruang Premium");
        System.out.println("- Ruangan ber-AC pribadi ");
        System.out.println("Sofa gaming exclusive");
        System.out.println("Komputer spesifikasi tinggi");
        System.out.println("Koneksi internet dedicated 100Mbps");
    }

    public void Pesan(int nomorKomputer) {
        System.out.println("Memesan komputer nomor: " + nomorKomputer);
    }

    public void TambahLayanan(String makanan) {
        System.out.println("Menambah layanan makanan: " + makanan);
    }

    public void TambahLayanan(String makanan, String minuman) {
        System.out.println("Menambah layanan makanan: " + makanan + "dan minuman: " + minuman);
    }


    
    // To do: Buatlah 1 variable sesuai ketentuan
    
    // To do: Buatlah constructor pada class KomputerPremium
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan


    
}
