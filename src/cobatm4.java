
import java.util.Scanner;


public class cobatm4 {
public static void main(String[] args) {
        // Deklarasi array untuk menyimpan nama-nama mahasiswa
        String[] namaPasien = {"Andi", "Budi", "Citra", "Dewi", "Eka"};
        
        // Cetak daftar nama mahasiswa
        System.out.println("Daftar Nama Pasien:");
        for (String nama : namaPasien) {
            System.out.println(nama);
        }
        
        // Membuat Scanner untuk menerima input pengguna
        Scanner input = new Scanner(System.in);
        
        // Mencari nama dalam array
        System.out.print("\nMasukkan nama yang ingin dicari: ");
        String namaDicari = input.nextLine();
        
        boolean ditemukan = false;
        for (String nama : namaPasien) {
            if (nama.equalsIgnoreCase(namaDicari)) {
                ditemukan = true;
                break;
            }
        }
        
        if (ditemukan) {
            System.out.println(namaDicari + " ditemukan dalam daftar mahasiswa.");
        } else {
            System.out.println(namaDicari + " tidak ditemukan dalam daftar mahasiswa.");
        }
        
        // Menambah nama baru ke array
        System.out.print("\nMasukkan nama mahasiswa baru yang ingin ditambahkan: ");
        String namaBaru = input.nextLine();
        
        // Menggabungkan array lama dengan nama baru
        String[] namaPasienBaru = new String[namaPasien.length + 1];
        System.arraycopy(namaPasien, 0, namaPasienBaru, 0, namaPasien.length);
        namaPasienBaru[namaPasien.length] = namaBaru;
        
        // Cetak daftar nama mahasiswa terbaru
        System.out.println("\nDaftar Nama Mahasiswa Terbaru:");
        for (String nama : namaPasienBaru) {
            System.out.println(nama);
        }
        
        // Menggabungkan semua nama menjadi satu string
        String gabunganNama = String.join(", ", namaPasienBaru);
        System.out.println("\nNama Mahasiswa yang digabungkan: " + gabunganNama);
    }
}
    

