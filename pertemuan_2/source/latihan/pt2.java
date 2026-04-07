package pertemuan_2.source.latihan;
import java.util.Scanner;

public class pt2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String nama; int usia;
            System.out.print("input nama: ");
            nama = input.nextLine();
            System.out.print("input usia: ");
            usia = input.nextInt();
            System.out.println("Nama: " + nama);
            System.out.println("Usia: " + usia);
        }
                            
    }
}
