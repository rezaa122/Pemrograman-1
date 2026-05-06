package pertemuan_8.source.tugas;
import java.util.Scanner;
public class tugas_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilihan; 
        do { 
            // Menginput nilai
            System.out.println("==== INPU NILAI MAHASISWA ===");

            System.out.print("Masukan Nama Mahasiswa : ");
            String nama = input.nextLine();

            System.out.print("Masukan Nilai Mahasiswa : ");
            double nilai = input.nextDouble();
            input.nextLine();

            // Menampilkan Nilai
            System.out.println("=== Nilai Anda ===");
            System.out.println("Nama :" + nama);
            System.out.println("Nilai :" + nilai);

            // Mengulang input/ berhenti
            System.out.println("Apakah adan ingin menginput data lagi? (y/t) :");
            pilihan = input.next().charAt(0);
            input.nextLine();

        } while (pilihan == 'y' || pilihan == 'Y');        
        System.out.println("Program Selesai, terimah kasih");
        input.close();

    }
}