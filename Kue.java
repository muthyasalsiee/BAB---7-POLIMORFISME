package Bab7;
public abstract class Kue {
    protected String nama;
    protected double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    public abstract double hitungHargaTotal();

    public String toString() {
        return "Nama: " + nama + "\n" + "Harga: " + harga;
    }
}