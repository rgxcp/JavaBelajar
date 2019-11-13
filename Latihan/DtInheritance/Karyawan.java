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