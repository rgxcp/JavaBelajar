import java.util.Scanner;

public class Belajar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka Pertama = ");
        int bilangan1 = input.nextInt();
        System.out.print("Masukkan Angka Kedua = ");
        int bilangan2 = input.nextInt();
        System.out.println("Hasil penjumlahan = " + (bilangan1 + bilangan2));
        System.out.println("Hasil pengurangan = " + (bilangan1 - bilangan2));
        System.out.println("Hasil perkalian = " + (bilangan1 * bilangan2));
        System.out.println("Hasil pembagian = " + (bilangan1 / bilangan2));
        System.out.println("Hasil sisa hasil bagi = " + (bilangan1 % bilangan2));
    }
}