package Bab7;

public abstract class Employee {
    private String name;
    private String noKTP;
    private String tanggalLahir; 

    public Employee(String name, String noKTP) {
        this.name = name;
        this.noKTP = noKTP;
    }

    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String toString() {
        return String.format(" " + getName() + 
                             "\nNo. KTP :" + getNoKTP() + 
                             "\nTanggal Lahir :" + getTanggalLahir());
    }

    public abstract double earnings();// pendapatan
}