package queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perbankan perbankan = new Perbankan();

        while (true) {
            System.out.println("\nPilih opsi:");
            System.out.println("1. Tambah Nasabah ke Antrian Teller");
            System.out.println("2. Proses Antrian Teller");
            System.out.println("3. Tampilkan Antrian Teller");
            System.out.println("4. Keluar");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan ID Nasabah:");
                    int idNasabah = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Masukkan Nama Nasabah:");
                    String namaNasabah = scanner.nextLine();
                    perbankan.tambahNasabahKeAntrian(new Nasabah(idNasabah, namaNasabah));
                    break;
                case 2:
                    perbankan.prosesAntrianTeller();
                    break;
                case 3:
                    perbankan.tampilkanAntrianTeller();
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
