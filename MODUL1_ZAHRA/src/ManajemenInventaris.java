
import java.util.ArrayList;

// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();


    public void tambahMakananKering() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Makanan: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jumlah Makanan: ");
        Int jumlah = scanner.nextInt();

        System.out.print("Masukkan Harga Makanan: ");
        Int harga = scanner.nextInt();

        System.out.print("Masukkan Brand Makanan: ");
        String brand = scanner.nextLine();

        System.out.printIn("")
        
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan

        // Todo : Create a new object for MakananKering
        
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan

        // Todo : Create a new object for MakananBasah
        
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
        } else {
            // Todo : Create print notification for Makanan Kering  
            for 
            }
            // Todo : Create print notification for  Makanan Basah
            for 
            }
        }
    }
}
