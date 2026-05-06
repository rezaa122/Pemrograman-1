package pertemuan_8.source.tugas;
import java.util.Scanner;
public class tugas_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalNilai = 0;
        int jumlahData = 0;
        char pilihan; 

        System.out.println("=== Total Nilai Mahasiswa ===");
        do {
            // Menginput nilai
            System.out.print("Masukan Nilai :");
            double nilai = input.nextDouble();

            // Menjumlahkan nilai
            totalNilai += nilai;
            jumlahData++;

            // do-while untuk pengulangan
            System.out.print("Input Nilai lagi? (y/t) :");
            pilihan = input.next().charAt(0);

        } while (pilihan == 'y' || pilihan == 'Y');
        System.out.println("Program Selesai");

        // Menampilkan total nilai
        System.out.println("Total Nilai");
        System.out.println("Total Mahasiswa yang di input :" + jumlahData);
        System.out.println("Total Penjumlahan Nilai :" + totalNilai);

        input.close();
    }
}