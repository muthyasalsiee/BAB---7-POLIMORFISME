package Bab7;

public class KuePesanan extends Kue {
    protected double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }
    public double hitungHargaTotal() {
        return harga * berat;
    }
    
}
