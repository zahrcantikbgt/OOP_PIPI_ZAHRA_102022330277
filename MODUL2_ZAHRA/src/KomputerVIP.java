class KomputerVIP extends Komputer {
    protected boolean vipCard;

    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    @Override
    public void Informasi() {
        super.Informasi();
        if (vipCard);
        System.out.println("Status: " + vipCard);
        System.out.println("Benefit Member VIP: ");
        System.out.println("- Diskon 10% untuk bermain di atas 3 jam");
        System.out.println("- Gratis minuman setiap 4 jam bermain");
        System.out.println("- Prioritas booking komputer gaming");

    }

    public void Login(String Username) {
        System.out.println("Login dengan Username: " + Username);
    }

    public void Bermain(int jam) {
        System.out.println("Bermain selama" + jam);
    }

    public void Bermain(int jam, int menitTambahan) {
        System.out.println("Nambah billing selama" + jam + menitTambahan);
    }    
    // To do: Buatlah 1 variable sesuai ketentuan
    
    // To do: Buatlah constructor pada class KomputerVIP
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Login sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan



}