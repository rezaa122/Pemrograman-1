package pertemuan_3.source.latihan;

import java.util.Scanner;
public class pt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // --- Bagian Input (S1) ---
        System.out.println("--------------------------------------------------");
        System.out.println(" PROGRAM HITUNG NILAI AKHIR ");
        System.out.println("--------------------------------------------------");
        System.out.print("Jumlah Kehadiran      : ");
        int hadir = scanner.nextInt();
        System.out.print("Nilai Tugas Mahasiswa : ");
        int nTugas = scanner.nextInt();
        System.out.print("Nilai UTS             : ");
        int nUts = scanner.nextInt();
        System.out.print("Nilai UAS             : ");
        int nUas = scanner.nextInt();
        final int TARGET_HADIR = 21; 
        double skorHadir = ((double) hadir / TARGET_HADIR) * 0.10; // 10%
        double skorTugas = (double) nTugas * 0.20;                // 20%
        double skorUts   = (double) nUts * 0.30;                  // 30%
        double skorUas   = (double) nUas * 0.40;                  // 40%
        double totalSkor = skorHadir + skorTugas + skorUts + skorUas;
        
        // --- Bagian Output (S2) ---
        System.out.println("--------------------------------------------------");
        System.out.printf("Hasil Bobot Kehadiran : %.2f\n", skorHadir);
        System.out.printf("Hasil Bobot Tugas     : %.2f\n", skorTugas);
        System.out.printf("Hasil Bobot UTS       : %.2f\n", skorUts);
        System.out.printf("Hasil Bobot UAS       : %.2f\n", skorUas);
        System.out.println("--------------------------------------------------");
        System.out.println("NILAI AKHIR TOTAL     : " + totalSkor);
        System.out.println("--------------------------------------------------");
        scanner.close(); // Praktik yang baik untuk menutup scanner
    }
}

