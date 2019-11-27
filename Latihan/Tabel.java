package coba;
import java.util.Scanner;

public class Tabel {
    
    public void Biodata() {
        // Inisialisasi
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Berapa Data : ");
        int totalDt = in.nextInt();
        int no = 1;
        
        String[] namaDepan = new String[totalDt];
        String[] namaBelakang = new String[totalDt];
        String[] npm = new String[totalDt];
        String[] kelas = new String[totalDt];
        String[] agama = new String[totalDt];
        String[] jenisKelamin = new String[totalDt];
        String[] jurusan = new String[totalDt];
        String[] angkatan = new String[totalDt];
        
        for (int i = 0; i < totalDt; i++) {
            System.out.println("+------------+");
            System.out.println("|   INPUT    |");
            System.out.println("+------------+");
            System.out.println("Mahasiswa ke-" + no);
            System.out.print("Masukkan Nama Depan    : ");
            namaDepan[i] = in.next();
            System.out.print("Masukkan Nama Belakang : ");
            namaBelakang[i] = in.next();
            System.out.print("Masukkan NPM (8 digit) : ");
            npm[i] = in.next();
            System.out.print("Masukkan Kelas         : ");
            kelas[i] = in.next();
            System.out.println("--------------");
            System.out.println("| 1. Budha   |");
            System.out.println("| 2. Hindu   |");
            System.out.println("| 3. Islam   |");
            System.out.println("| 4. Kristen |");
            System.out.println("--------------");
            System.out.print("Masukkan Agama         : ");
            agama[i] = in.next();
            System.out.println("+--------------+");
            System.out.println("| 1. Laki-Laki |");
            System.out.println("| 2. Perempuan |");
            System.out.println("+--------------+");
            System.out.print("Masukkan Jenis Kelamin : ");
            jenisKelamin[i] = in.next();
            System.out.println("");
            
            // Agama
            if (agama[i].equals("1")) {
                agama[i] = "Budha";
            } else if (agama[i].equals("2")) {
                agama[i] = "Hindu";
            } else if (agama[i].equals("3")) {
                agama[i] = "Islam";
            } else {
                agama[i] = "Kristen";
            }
            
            // Jenis Kelamin
            if (jenisKelamin[i].equals("1")) {
                jenisKelamin[i] = "Laki-Laki";
            } else {
                jenisKelamin[i] = "Perempuan";
            }
            
            // Jurusan
            jurusan[i] = npm[i].substring(0,2);
            if (jurusan[i].equals("15")) {
                jurusan[i] = "SI";
            } else if (jurusan[i].equals("11")) {
                jurusan[i] = "MI";
            } else if (jurusan[i].equals("12")) {
                jurusan[i] = "TI";
            } else if (jurusan[i].equals("13")) {
                jurusan[i] = "SK";
            } else {
                jurusan[i] = "TK";
            }
            
            //Angkatan
            angkatan[i] = npm[i].substring(3,5);
            if (angkatan[i].equals("16")) {
                angkatan[i] = "2016";
            } else if (angkatan[i].equals("17")) {
                angkatan[i] = "2017";
            } else if (angkatan[i].equals("18")) {
                angkatan[i] = "2018";
            } else if (angkatan[i].equals("19")) {
                angkatan[i] = "2019";
            } else {
                angkatan[i] = "Bukan mahasiswa aktif";
            }
            no++;
        }
        
        
        String leftAlignFormat = "| %-3s | %-14s | %-13s | %-9s | %-7s | %-7s | %-13s | %-7s | %-24s |%n";

        System.out.format("+-----+----------------+---------------+-----------+---------+---------+---------------+---------+--------------------------+%n");
        System.out.format("| NO. |   Nama Depan   | Nama Belakang |    NPM    |  Kelas  |  Agama  | Jenis Kelamin | Jurusan |         Angkatan         |%n");
        System.out.format("+-----+----------------+---------------+-----------+---------+---------+---------------+---------+--------------------------+%n");
        for (int i = 0; i < totalDt; i++) {
            
            System.out.format(leftAlignFormat, 
                i,
                namaDepan[i],
                namaBelakang[i],
                npm[i],
                kelas[i],
                agama[i],
                jenisKelamin[i],
                jurusan[i],
                angkatan[i]); 
        }
        System.out.format("+-----+----------------+---------------+-----------+---------+---------+---------------+---------+--------------------------+%n");
    }

    public static void main(String[] args) {
        Tabel tampilkan = new Tabel();
        tampilkan.Biodata();
    }
}