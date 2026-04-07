package pertemuan_4.source.latihan;

import java.util.Scanner;

public class pt4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalTrans = 0, totalMakan = 0, totalBelanja = 0;
        System.out.println("===============================================");
        System.out.println("Sistem Menghitung Pengeluaran Seminggu");
        System.out.println("===============================================");

        // Menggunakan loop untuk input hari 1 - 7
        for (int i = 1; i <= 7; i++) {
            System.out.println("======== Hari " + i + " ========");
            System.out.print("Pengeluaran transportasi: ");
            totalTrans += input.nextInt();
            System.out.print("Pengeluaran makan       : ");
            totalMakan += input.nextInt();
            System.out.print("Pengeluaran belanja     : ");
            totalBelanja += input.nextInt();
        }

        int totalSemua = totalTrans + totalMakan + totalBelanja;
        System.out.println("\n========= Total Pengeluaran ========");
        System.out.println("Total pengeluaran: " + totalSemua);
        System.out.println("====================================");

        // Kalkulasi Persentase
        System.out.println("============ Persentase =============");
        System.out.printf("Persentase makan       : %.2f%%\n", (totalMakan * 100.0) / totalSemua);
        System.out.printf("Persentase transportasi: %.2f%%\n", (totalTrans * 100.0) / totalSemua);
        System.out.printf("Persentase belanja     : %.2f%%\n", (totalBelanja * 100.0) / totalSemua);
        System.out.println("====================================");
        
        input.close();
    }
}