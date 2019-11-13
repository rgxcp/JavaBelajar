import java.util.Scanner;

public class TugasArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data : ");
        int jumlahData = input.nextInt();
        System.out.println();

        String[] arrayNama = new String[jumlahData];
        String[] arrayNPM = new String[jumlahData];
        String[] arrayKelas = new String[jumlahData];
        int[] arrayNilai1 = new int[jumlahData];
        int[] arrayNilai2 = new int[jumlahData];
        int[] arrayNilai3 = new int[jumlahData];
        int[] arrayNilaiUTS = new int[jumlahData];
        int[] arrayNilaiUAS = new int[jumlahData];
        double[] arrayNilaiTugas = new double[jumlahData];
        double[] arrayNilaiUjian = new double[jumlahData];
        double[] arrayNilaiTotal = new double[jumlahData];
        String[] arrayStatus = new String[jumlahData];

        System.out.println("----- INPUT -----");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Mahasiswa ke-" + i);
            System.out.print("Masukkan Nama      : ");
            arrayNama[i] = input.next();
            System.out.print("Masukkan NPM       : ");
            arrayNPM[i] = input.next();
            System.out.print("Masukkan Kelas     : ");
            arrayKelas[i] = input.next();
            System.out.print("Masukkan Nilai 1   : ");
            arrayNilai1[i] = input.nextInt();
            System.out.print("Masukkan Nilai 2   : ");
            arrayNilai2[i] = input.nextInt();
            System.out.print("Masukkan Nilai 3   : ");
            arrayNilai3[i] = input.nextInt();
            System.out.print("Masukkan Nilai UTS : ");
            arrayNilaiUTS[i] = input.nextInt();
            System.out.print("Masukkan Nilai UAS : ");
            arrayNilaiUAS[i] = input.nextInt();
            System.out.println();
        }

        for (int i = 0; i < jumlahData; i++) {
            arrayNilaiTugas[i] = (arrayNilai1[i]+arrayNilai2[i]+arrayNilai3[i])/3;
            arrayNilaiUjian[i] = (arrayNilaiUTS[i]+arrayNilaiUAS[i])/2;
            arrayNilaiTotal[i] = (arrayNilaiTugas[i]*0.4)+(arrayNilaiUjian[i]*0.6);
            if (arrayNilaiTotal[i] >= 65) {
                arrayStatus[i] = "Berhasil";
            } else {
                arrayStatus[i] = "Gagal";
            }
        }

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("%5s%15s%15s%15s%15s%15s%15s%15s%15s%15s%15s",
            "| NO.", "Nama", "NPM", "Kelas", "Nilai 1", "Nilai 2", "Nilai 3", "Nilai Tugas", "Nilai Ujian", "Nilai Total", "Status |");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < jumlahData; i++) {
            System.out.format("%5s%15s%15s%15s%15s%15s%15s%15s%15s%15s%15s",
                i,
                arrayNama[i],
                arrayNPM[i],
                arrayKelas[i],
                arrayNilai1[i],
                arrayNilai2[i],
                arrayNilai3[i],
                arrayNilaiTugas[i],
                arrayNilaiUjian[i],
                arrayNilaiTotal[i],
                arrayStatus[i]);
            System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}