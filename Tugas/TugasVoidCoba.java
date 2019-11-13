import java.util.Scanner;

public class TugasVoidCoba {
    String Nama, NPM, Kelas;
    double Nilai1, Nilai2, Nilai3, NilaiUTS, NilaiUAS, NilaiTugas, NilaiUjian, NilaiTotal;
    
    public String GetNama() {
        return Nama;
    }
    public void SetNama(String nama) {
        Nama = nama;
    }

    public String GetNPM() {
        return NPM;
    }
    public void SetNPM(String npm){
        NPM = npm;
    }
    
    public String GetKelas() {
        return Kelas;
    }
    public void SetKelas(String kelas) {
        Kelas = kelas;
    }
    
    public double GetNilai1() {
        return Nilai1;
    }
    public void SetNilai1(double nilai1) {
        Nilai1 = nilai1;
    }

    public double GetNilai2() {
        return Nilai2;
    }
    public void SetNilai2(double nilai2) {
        Nilai2 = nilai2;
    }

    public double GetNilai3() {
        return Nilai3;
    }
    public void SetNilai3(double nilai3) {
        Nilai3 = nilai3;
    }

    public double GetNilaiUTS() {
        return NilaiUTS;
    }
    public void SetNilaiUTS(double nilaiUTS) {
        NilaiUTS = nilaiUTS;
    }

    public double GetNilaiUAS() {
        return NilaiUAS;
    }
    public void SetNilaiUAS(double nilaiUAS) {
        NilaiUAS = nilaiUAS;
    }

    public double GetNilaiTugas() {
        return NilaiTugas;
    }
    public void SetNilaiTugas(double nilai1, double nilai2, double nilai3) {
        NilaiTugas = (nilai1+nilai2+nilai3)/3;
    }

    public double GetNilaiUjian() {
        return NilaiUjian;
    }
    public void SetNilaiUjian(double nilaiUTS, double nilaiUAS) {
        NilaiUjian = (nilaiUTS+nilaiUAS)/2;
    }

    public double GetNilaiTotal() {
        return NilaiTotal;
    }
    public void SetNilaiTotal(double nilaiTugas, double nilaiUjian) {
        NilaiTotal = (nilaiTugas*0.4)+(nilaiUjian*0.6);
    }
    
    void Tampilkan() {
        System.out.println("----- OUTPUT -----");
        System.out.println("Nama        : " + GetNama());
        System.out.println("NPM         : " + GetNPM());
        System.out.println("Kelas       : " + GetKelas());
        System.out.println("Nilai Tugas : " + GetNilaiTugas());
        System.out.println("Nilai Ujian : " + GetNilaiUjian());
        System.out.println("Nilai Total : " + GetNilaiTotal());
    }
    
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        String nama, npm, kelas;
        double nilai1, nilai2, nilai3, nilaiUTS, nilaiUAS, nilaiTugas, nilaiUjian, nilaiTotal;
        TugasVoidCoba data1 = new TugasVoidCoba();

        System.out.println("----- INPUT -----");
        System.out.print("Masukkan Nama Anda    : ");
        nama = input.nextLine();
        data1.SetNama(nama);
        System.out.print("Masukkan NPM Anda     : ");
        npm = input.nextLine();
        data1.SetNPM(npm);
        System.out.print("Masukkan Kelas Anda   : ");
        kelas = input.nextLine();
        data1.SetKelas(kelas);
        System.out.print("Masukkan Nilai ke-1   : ");
        nilai1 = input.nextDouble();
        data1.SetNilai1(nilai1);
        System.out.print("Masukkan Nilai ke-2   : ");
        nilai2 = input.nextDouble();
        data1.SetNilai2(nilai2);
        System.out.print("Masukkan Nilai ke-3   : ");
        nilai3 = input.nextDouble();
        data1.SetNilai3(nilai3);
        System.out.print("Masukkan Nilai UTS    : ");
        nilaiUTS = input.nextDouble();
        data1.SetNilaiUTS(nilaiUTS);
        System.out.print("Masukkan Nilai UAS    : ");
        nilaiUAS = input.nextDouble();
        data1.SetNilaiUAS(nilaiUAS);
        System.out.println("");

        data1.SetNilaiTugas(nilai1, nilai2, nilai3);
        data1.SetNilaiUjian(nilaiUTS, nilaiUAS);
        //data1.SetNilaiTotal(nilaiTugas, nilaiUjian);
        data1.Tampilkan();
    }
}