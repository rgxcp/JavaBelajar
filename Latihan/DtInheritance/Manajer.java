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