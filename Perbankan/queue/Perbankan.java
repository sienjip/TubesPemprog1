package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Perbankan {
    Queue<Nasabah> antrianTeller = new LinkedList<>();

    public void tambahNasabahKeAntrian(Nasabah n) {
        antrianTeller.add(n);
        System.out.println("Nasabah " + n.nama + " telah ditambahkan ke antrian teller.");
    }

    public void prosesAntrianTeller() {
        Nasabah n = antrianTeller.poll();
        if (n != null) {
            System.out.println("Memproses transaksi untuk nasabah: " + n.nama);
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilkanAntrianTeller() {
        System.out.println("Antrian Teller:");
        for (Nasabah n : antrianTeller) {
            System.out.println(n);
        }
    }
}