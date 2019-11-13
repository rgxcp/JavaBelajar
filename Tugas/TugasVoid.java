import java.util.Scanner;

public class TugasVoid {
    public void Biodata() {
        Scanner input = new Scanner(System.in);
        String nama, npm, kelas;
        System.out.println("----- BIODATA -----");
        System.out.print("Masukkan Nama Anda  : ");
        nama = input.nextLine();
        System.out.print("Masukkan NPM Anda   : ");
        npm = input.nextLine();
        System.out.print("Masukkan Kelas Anda : ");
        kelas = input.nextLine();
        System.out.println("");
        System.out.println("Nama Anda  : " + nama);
        System.out.println("NPM Anda   : " + npm);
        System.out.println("Kelas Anda : " + kelas);
        System.out.println("");
    }

    public void Nilai() {
        Scanner input = new Scanner(System.in);
        double nilai1, nilai2, nilai3, nilaiUTS, nilaiUAS, nilaiTugas, nilaiUjian, nilaiTotal;
        System.out.println("----- TUGAS -----");
        System.out.print("Masukkan Nilai Pertama : ");
        nilai1 = input.nextDouble();
        System.out.print("Masukkan Nilai Kedua   : ");
        nilai2 = input.nextDouble();
        System.out.print("Masukkan Nilai Ketiga  : ");
        nilai3 = input.nextDouble();
        System.out.print("Masukkan Nilai UTS     : ");
        nilaiUTS = input.nextDouble();
        System.out.print("Masukkan Nilai UAS     : ");
        nilaiUAS = input.nextDouble();
        System.out.println("");

        nilaiTugas = (nilai1+nilai2+nilai3)/3;
        nilaiUjian = (nilaiUTS+nilaiUAS)/2;
        nilaiTotal = (nilaiTugas*0.4)+(nilaiUjian*0.6);

        System.out.println("Nilai Tugas Anda : " + nilaiTugas);
        System.out.println("Nilai Ujian Anda : " + nilaiUjian);
        System.out.println("Nilai Total Anda : " + nilaiTotal);
    }

    public static void main(String[] args) {
        TugasVoid tampilkan = new TugasVoid();
        tampilkan.Biodata();
        tampilkan.Nilai();
    }
}