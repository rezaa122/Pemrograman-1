package pertemuan_8.source.tugas;
import java.util.Scanner;
public class tugas_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalNilai = 0;
        int jumlahMahasiswa = 0;
        char pilihan;

        System.out.println("=== Program hitung rata-rata nilai ===");
        do { // Input Nilai
            System.out.print("Masukan Nilai :");
            double nilai = input.nextDouble();

            // Proses hitung
            totalNilai += nilai;
            jumlahMahasiswa++;

            System.out.print("Tambah nilai lagi? (y/t): ");
            pilihan = input.next().charAt(0);

        } while (pilihan == 'y' || pilihan == 'Y');

        // Menghitung dan menampilkan rata-rata
        if (jumlahMahasiswa > 0) {
            double rataRata = totalNilai / jumlahMahasiswa;
            System.out.println("\n[Laporan Hasil]");
            System.out.println("Total Nilai     : " + totalNilai);
            System.out.println("Jumlah Mahasiswa: " + jumlahMahasiswa);
            System.out.printf("Rata-Rata Nilai : %.2f\n", rataRata);
        } else {
            System.out.println("Tidak ada data yang diinput");
        }
        input.close();
    }
    
}
