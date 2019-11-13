import java.util.Scanner;

public class DtScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda = ");
        String nama = input.next();
        System.out.print("Masukkan bilangan pertama = ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua = ");
        int bil2 = input.nextInt();
        System.out.println("Nama = " + nama);
        System.out.println("Hasil penjumlahan = " + (bil1 + bil2));
        System.out.println("Hasil pengurangan = " + (bil1 - bil2));
        System.out.println("Hasil perkalian = " + (bil1 * bil2));
        System.out.println("Hasil pembagian = " + (bil1 / bil2));
        System.out.println("Hasil sisa hasil bagi = " + (bil1 % bil2));
    }
}