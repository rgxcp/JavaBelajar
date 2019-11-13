import java.util.Scanner;

public class TugasCLI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama          : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NPM           : ");
        String npm = input.next();
        System.out.print("Masukkan Kelas         : ");
        String kelas = input.next();
        System.out.print("Masukkan Nilai Pertama : ");
        int nilai1 = input.nextInt();
        System.out.print("Masukkan Nilai Kedua   : ");
        int nilai2 = input.nextInt();
        System.out.print("Masukkan Nilai Ketiga  : ");
        int nilai3 = input.nextInt();
        System.out.print("Masukkan Nilai UTS     : ");
        int nilaiUTS = input.nextInt();
        System.out.print("Masukkan Nilai UAS     : ");
        int nilaiUAS = input.nextInt();

        int nilaiTugas = (nilai1+nilai2+nilai3)/3;
        int nilaiUjian = (nilaiUTS+nilaiUAS)/2;
        double nilaiTotal = (nilaiTugas*0.4)+(nilaiUjian*0.6);

        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("+           OUTPUT           +");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Nama Anda   : " + nama);
        System.out.println("NPM Anda    : " + npm);
        System.out.println("Kelas Anda  : " + kelas);
        System.out.println("------------------------------");
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("Nilai Ujian : " + nilaiUjian);
        System.out.println("Nilai Total : " + nilaiTotal);
    }
}