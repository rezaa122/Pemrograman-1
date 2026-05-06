package pertemuan_7.source.latihan;

import java.util.Scanner;

public class pt7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int status, pilihPaket = 0;
        String namaPelanggan = "", jenisLayanan = "", deskripsiKecepatan = "";

        System.out.println("=== Sistem Registrasi Paket Internet ===");
        System.out.println("1. Daftar Sekarang");
        System.out.println("2. Batal");
        System.out.print("Pilih opsi: ");
        
        status = input.nextInt();
        input.nextLine(); // Membersihkan buffer

        if (status == 1) {
            System.out.print("Masukan Nama Calon Pelanggan: ");
            namaPelanggan = input.nextLine();

            jenisLayanan = "Fiber Optic";

            System.out.println("\n--- Pilih Paket Kecepatan ---");
            System.out.println("1 - Starter (20 Mbps)");
            System.out.println("2 - Basic (50 Mbps)");
            System.out.println("3 - Pro (100 Mbps)");
            System.out.println("4 - Ultra (300 Mbps)");

            System.out.print("Masukan pilihan paket (1-4): ");
            pilihPaket = input.nextInt();

            // Menggunakan Switch Case untuk menentukan deskripsi kecepatan
            switch (pilihPaket) {
                case 1:
                    deskripsiKecepatan = "20 Mbps";
                    break;
                case 2:
                    deskripsiKecepatan = "50 Mbps";
                    break;
                case 3:
                    deskripsiKecepatan = "100 Mbps";
                    break;
                case 4:
                    deskripsiKecepatan = "300 Mbps";
                    break;
                default:
                    // Jika input di luar 1-4, otomatis masuk ke Basic
                    deskripsiKecepatan = "50 Mbps (Default)";
            }

            System.out.println("\nRegistrasi Berhasil!");

        } else {
            System.out.println("Terima kasih, silakan kembali lagi nanti.");
        }

        // Output akhir yang merangkum data
        System.out.println("------------------------------------------------");
        System.out.println("Pelanggan: " + namaPelanggan);
        System.out.println("Teknologi: " + jenisLayanan);
        System.out.println("Paket     : " + deskripsiKecepatan);
        System.out.println("Status    : Selesai");
        
        input.close();
    }
}
