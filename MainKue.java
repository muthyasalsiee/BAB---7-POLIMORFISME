package Bab7;

public class MainKue {
    public static void main(String[] args) {

        Kue [] kue = new Kue[20];

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                kue[i] = new KueJadi("Kue Jadi " + i, 5000, i+2);
            } else {
                kue[i] = new KuePesanan("Kue Pesanan " + i, 1000, i+1);
            }
        }
        double totalHarga = 0;
        double totalHargaPesanan = 0;
        double totalberatsPesanan = 0;
        double totalJumlahKueJadi = 0;
        double totalHargajadi = 0;

        Kue maxKue = kue[0];

        for (Kue k : kue) {
            System.out.println("\n" + k.toString() +"\n" + "Harga Total: " +  k.hitungHargaTotal());
            totalHarga += k.hitungHargaTotal();

            if (k instanceof KuePesanan) {
                KuePesanan kp = (KuePesanan) k;
                totalHargaPesanan += kp.hitungHargaTotal();
                totalberatsPesanan += kp.berat;
            } else if (k instanceof KueJadi) {
                KueJadi kj = (KueJadi) k;
                totalJumlahKueJadi += kj.jumlah;
                totalHargajadi += kj.hitungHargaTotal();
            }

            if (k.hitungHargaTotal() > maxKue.hitungHargaTotal()) {
                maxKue = k;
            }
        }
        System.out.println("\n==============================");
        System.out.println("== Hasil Perhitungan ==");
        System.out.println("==============================");
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Total Harga Pesanan: " + totalHargaPesanan);
        System.out.println("Total Berat Pesanan: " + totalberatsPesanan);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlahKueJadi);
        System.out.println("Total Harga Kue Jadi: " + totalHargajadi);
        System.out.println("Kue dengan harga tertinggi: " + maxKue.toString());

    }
    
}
