package Bab7;

public class KueJadi extends Kue {
    protected double jumlah;
    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double hitungHargaTotal() {
        return harga * jumlah;
    }
    
}
