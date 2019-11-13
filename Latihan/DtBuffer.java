import java.io.*;

public class DtBuffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan bilangan pertama = ");
        String bil1 = br.readLine();
        System.out.print("Masukkan bilangan kedua = ");
        String bil2 = br.readLine();
        int bil1parsed = Integer.parseInt(bil1);
        int bil2parsed = Integer.parseInt(bil2);
        System.out.println("Hasil penjumlahan = " + (bil1parsed + bil2parsed));
        System.out.println("Hasil pengurangan = " + (bil1parsed - bil2parsed));
        System.out.println("Hasil perkalian = " + (bil1parsed * bil2parsed));
        System.out.println("Hasil pembagian = " + (bil1parsed / bil2parsed));
        System.out.println("Hasil sisa hasil bagi = " + (bil1parsed % bil2parsed));
    }
}