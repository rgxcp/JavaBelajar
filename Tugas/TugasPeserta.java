import java.util.Scanner;

public class TugasPeserta {
    public void IO_Peserta() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Peserta : ");
        int jumlahPeserta = input.nextInt();

        String[] namaDepan = new String[jumlahPeserta];
        String[] namaBelakang = new String[jumlahPeserta];
        String[] npm = new String[jumlahPeserta];
        String[] kelas = new String[jumlahPeserta];
        String[] agama = new String[jumlahPeserta];
        String[] jenisKelamin = new String[jumlahPeserta];
        String[] jurusan = new String[jumlahPeserta];
        String[] angkatan = new String[jumlahPeserta];

        for (int i = 0; i < jumlahPeserta; i++) {
            System.out.println("---------------------------");
            System.out.println("|          INPUT          |");
            System.out.println("---------------------------");
            System.out.print("Masukkan Nama Depan : ");
            namaDepan[i] = input.next();
            System.out.print("Masukkan Nama Belakang : ");
            namaBelakang[i] = input.next();
            System.out.print("Masukkan NPM : ");
            npm[i] = input.next();
            System.out.print("Masukkan Kelas : ");
            kelas[i] = input.next();
            System.out.println("-----------------");
            System.out.println("| Pilihan Agama |");
            System.out.println("| 1. Islam      |");
            System.out.println("| 2. Kristen    |");
            System.out.println("| 3. Hindu      |");
            System.out.println("| 4. Buddha     |");
            System.out.println("-----------------");
            System.out.print("Masukkan Agama : ");
            agama[i] = input.next();
            System.out.println("-------------------------");
            System.out.println("| Pilihan Jenis Kelamin |");
            System.out.println("| 1. Laki-Laki          |");
            System.out.println("| 2. Perempuan          |");
            System.out.println("-------------------------");
            System.out.print("Masukkan Jenis Kelamin : ");
            jenisKelamin[i] = input.next();
            System.out.println("");

            if (agama[i].equals("1")) {
                agama[i] = "Islam";
            } else if (agama[i].equals("2")) {
                agama[i] = "Kristen";
            } else if (agama[i].equals("3")) {
                agama[i] = "Hindu";
            } else {
                agama[i] = "Buddha";
            }

            if (jenisKelamin[i].equals("1")) {
                jenisKelamin[i] = "Laki-Laki";
            } else {
                jenisKelamin[i] = "Perempuan";
            }
            
            jurusan[i] = npm[i].substring(0,2);
            if (jurusan[i].equals("11")) {
                jurusan[i] = "TK";
            } else if (jurusan[i].equals("12")) {
                jurusan[i] = "MI";
            } else if (jurusan[i].equals("13")) {
                jurusan[i] = "TI";
            } else if (jurusan[i].equals("14")) {
                jurusan[i] = "SK";
            } else {
                jurusan[i] = "SI";
            }
            
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
                angkatan[i] = "Anda bukan mahasiswa aktif.";
            }
        }

        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.format("%5s%20s%15s%15s%15s%20s%15s%15s",
            "| NO.", "Nama Lengkap", "NPM", "Kelas", "Agama", "Jenis Kelamin", "Jurusan", "Angkatan |");
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < jumlahPeserta; i++) {
            System.out.format("%5s%20s%15s%15s%15s%20s%15s%15s",
                (i+1),
                namaDepan[i] + " " + namaBelakang[i],
                npm[i],
                kelas[i],
                agama[i],
                jenisKelamin[i],
                jurusan[i],
                angkatan[i]);
            System.out.println("");
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.format("%105s", "Jumlah Data : " + jumlahPeserta);
    }

    public static void main(String[] args) {
        TugasPeserta tampilkan = new TugasPeserta();
        tampilkan.IO_Peserta();
    }
}