import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Method mhs1 = new Method();
        mhs1.Biodata();
    }

    public String Biodata() {
        Scanner input = new Scanner(System.in);
        String nama, npm, kelas;
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan NPM : ");
        npm = input.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = input.nextLine();
        return nama, kelas, npm;
    }
}