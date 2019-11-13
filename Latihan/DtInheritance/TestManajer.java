public class TestManajer {
    public static void main(String[] args) {
        Manajer kar = new Manajer("Rommy", 5987000);
        System.out.println("Nama Karyawan : " + kar.getNama());
        System.out.println("Bonus Karyawan : " + kar.getBonus());
        System.out.println("Gaji Karyawan : " + kar.getGaji());
    }
}