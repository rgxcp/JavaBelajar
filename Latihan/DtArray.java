public class DtArray {
    String [] nama = {"Ali", "Bobi", "Caca", "Doni"};
    String [] kelas = new String[nama.length];

    void CetakNama() {
        int i = 0;
        System.out.println(nama[i] + " " + kelas[i]); i++;
        System.out.println(nama[i] + " " + kelas[i]); i++;
        System.out.println(nama[i] + " " + kelas[i]); i++;
        System.out.println(nama[i] + " " + kelas[i]);
    }

    public static void main(String[] args) {
        DtArray a = new DtArray();
        System.out.println();
        System.out.println("----------");
        a.CetakNama();
        System.out.println("----------");
        a.kelas[0] = "3IA03";
        a.kelas[1] = "4IA01";
        a.kelas[2] = "2IA01";
        a.kelas[3] = "3IA07";
        a.CetakNama();
        System.out.println("----------");
    }
}