import javax.swing.JOptionPane;

public class DtGUI {
    public static void main(String[] args) {
        String nilai1 = JOptionPane.showInputDialog("Masukkan Nilai Pertama");
        int nilai1parsed = Integer.parseInt(nilai1);
        String nilai2 = JOptionPane.showInputDialog("Masukkan Nilai Kedua");
        int nilai2parsed = Integer.parseInt(nilai2);
        JOptionPane.showMessageDialog(null, "Hasil penjumlahan = " + (nilai1parsed + nilai2parsed) + "\n" +
                                            "Hasil pengurangan = " + (nilai1parsed - nilai2parsed) + "\n" +
                                            "Hasil perkalian = " + (nilai1parsed * nilai2parsed) + "\n" +
                                            "Hasil pembagian = " + (nilai1parsed / nilai2parsed) + "\n" +
                                            "Hasil sisa hasil bagi = " + (nilai1parsed % nilai2parsed));
    }
}