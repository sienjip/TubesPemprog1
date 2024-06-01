package queue;

public class Nasabah {
    String nama;
    int id;

    public Nasabah(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    @Override
    public String toString() {
        return id + ": " + nama;
    }
}