import java.util.ArrayList;
import java.util.Scanner;

class Penerbangan {
    private String kodePenerbangan;
    private String asalBandara;
    private String tujuanBandara;
    private String jamBerangkat;
    private String jamTiba;
    private float tarif;

    public Penerbangan(String kodePenerbangan, String asalBandara, String tujuanBandara, 
                       String jamBerangkat, String jamTiba, float tarif) {
        this.kodePenerbangan = kodePenerbangan;
        this.asalBandara = asalBandara;
        this.tujuanBandara = tujuanBandara;
        this.jamBerangkat = jamBerangkat;
        this.jamTiba = jamTiba;
        this.tarif = tarif;
    }

    public String getKodePenerbangan() {
        return kodePenerbangan;
    }

    public String getAsalBandara() {
        return asalBandara;
    }

    public String getTujuanBandara() {
        return tujuanBandara;
    }

    public String getJamBerangkat() {
        return jamBerangkat;
    }

    public String getJamTiba() {
        return jamTiba;
    }

    public float getTarif() {
        return tarif;
    }

    public void tampilkanDetailPenerbangan() {
        System.out.println("Nomor Penerbangan: " + kodePenerbangan);
        System.out.println("Bandara Keberangkatan: " + asalBandara + " --> Bandara Tujuan: " + tujuanBandara);
        System.out.println("Waktu Keberangkatan: " + jamBerangkat + " --> Waktu Kedatangan: " + jamTiba);
        System.out.println("Harga: Rp." + tarif);
    }
}

class Penumpang {
    private String NIK;
    private String namaAwal;
    private String namaAkhir;

    public Penumpang(String NIK, String namaAwal, String namaAkhir) {
        this.NIK = NIK;
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }

    public void tampilkanDetailPenumpang() {
        System.out.println("Nomor Induk Kependudukan: " + NIK);
        System.out.println("Nama Lengkap: " + namaAwal + " " + namaAkhir);
    }
}

public class TPMODUL1_ZAHRA {
    private static ArrayList<Penerbangan> penerbanganTersedia = new ArrayList<>();
    private static Penumpang penumpang;
    private static Penerbangan penerbanganTerpilih;

    public static void main(String[] args) {

        penerbanganTersedia.add(new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1150000.0f));
        penerbanganTersedia.add(new Penerbangan("QZ202", "SUB, Surabaya", "MDN, Medan", "09:00", "11:45", 1350000.0f));

        Scanner scanner = new Scanner(System.in);
        int pilihanMenu;

        do {
            // Menu utama
            System.out.println("======= EAD Ticket Booking System =======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            pilihanMenu = scanner.nextInt();

            switch (pilihanMenu) {
                case 1:
                    tampilkanDaftarPenerbangan();
                    break;
                case 2:
                    pesanTiket(scanner);
                    break;
                case 3:
                    lihatTiket();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihanMenu != 4);

        scanner.close();
    }

    private static void tampilkanDaftarPenerbangan() {
        System.out.println("Daftar Penerbangan:");
        for (int i = 0; i < penerbanganTersedia.size(); i++) {
            System.out.println((i + 1) + ". ");
            penerbanganTersedia.get(i).tampilkanDetailPenerbangan();
            System.out.println();
        }
    }

    private static void pesanTiket(Scanner input) {
        if (penumpang == null) {
            // Input data penumpang jika belum ada
            System.out.println("Silakan isi data diri anda terlebih dahulu!");
            System.out.print("Masukkan NIK: ");
            String NIK = input.next();
            System.out.print("Masukkan Nama Depan: ");
            String namaDepan = input.next();
            System.out.print("Masukkan Nama Belakang: ");
            String namaBelakang = input.next();
            penumpang = new Penumpang(NIK, namaDepan, namaBelakang);
            System.out.println("Terima kasih telah Mengisi Data Pelanggan. Silahkan Pilih Tiket Penerbangan Yang Tersedia");
        }

        tampilkanDaftarPenerbangan();
        System.out.print("Pilih nomor penerbangan (ex: 1): ");
        int pilihanPenerbangan = input.nextInt();

        if (pilihanPenerbangan > 0 && pilihanPenerbangan <= penerbanganTersedia.size()) {
            penerbanganTerpilih = penerbanganTersedia.get(pilihanPenerbangan - 1);
            System.out.println("Pemesanan Tiket Berhasil Dilakukan, Cek Pesanan Tiket pada Menu (3)");
        } else {
            System.out.println("Pemesanan Tiket Belum Berhasil.");
        }
    }

    private static void lihatTiket() {
        if (penerbanganTerpilih != null && penumpang != null) {
            System.out.println("======= Detail Tiket Penerbangan =======");
            penumpang.tampilkanDetailPenumpang();
            penerbanganTerpilih.tampilkanDetailPenerbangan();
        } else {
            System.out.println("Pembelian Tiket Tidak Ada.");
        }
    }
}
