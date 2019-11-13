class Karyawan {
    private String nama;
    private double gaji;
    private static double persenGaji = 0.10;

    Karyawan(String nm, double gj) {
        nama = nm;
        gaji = gj;
    }

    void setNama(String nm) {
        nama = nm;
    }
    void setGaji(double gj) {
        gaji = gj;
    }
    void setPersentase(double persen) {
        persenGaji = persen;
    }
    String getNama() {
        return nama;
    }
    double getGaji() {
        return gaji;
    }
    double getPersentase() {
        return persenGaji;
    }
}

class Manajer extends Karyawan {
    private static double bonus = 500000;

    Manajer(String nm, double gj) {
        super(nm, gj);
    }
    double getBonus() {
        return bonus;
    }
    void setBonus(double bns) {
        bonus = bns;
    }
    double getGaji() {
        double gajiDasar = super.getGaji();
        return (gajiDasar + bonus);
    }
}

public class DtInheritance {
    public static void main(String[] args) {
        Manajer kar = new Manajer("Rommy", 5987000);
        System.out.println("Nama Karyawan : " + kar.getNama());
        System.out.println("Bonus Karyawan : " + kar.getBonus());
        System.out.println("Gaji Karyawan : " + kar.getGaji());
    }
}