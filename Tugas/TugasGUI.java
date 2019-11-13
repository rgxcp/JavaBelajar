import javax.swing.JOptionPane;

public class TugasGUI {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukkan Nama");
        String npm = JOptionPane.showInputDialog("Masukkan NPM");
        String kelas = JOptionPane.showInputDialog("Masukkan Kelas");
        String nilai1 = JOptionPane.showInputDialog("Masukkan Nilai Pertama");
        String nilai2 = JOptionPane.showInputDialog("Masukkan Nilai Kedua");
        String nilai3 = JOptionPane.showInputDialog("Masukkan Nilai Ketiga");
        String nilaiUTS = JOptionPane.showInputDialog("Masukkan Nilai UTS");
        String nilaiUAS = JOptionPane.showInputDialog("Masukkan Nilai UAS");
        int nilai1Parsed = Integer.parseInt(nilai1);
        int nilai2Parsed = Integer.parseInt(nilai2);
        int nilai3Parsed = Integer.parseInt(nilai3);
        int nilaiUTSParsed = Integer.parseInt(nilaiUTS);
        int nilaiUASParsed = Integer.parseInt(nilaiUAS);

        int nilaiTugas = (nilai1Parsed+nilai2Parsed+nilai3Parsed)/3;
        int nilaiUjian = (nilaiUTSParsed+nilaiUASParsed)/2;
        double nilaiTotal = (nilaiTugas*0.4)+(nilaiUjian*0.6);

        JOptionPane.showMessageDialog(null,
            "Nama Anda : " + nama + "\n" +
            "NPM Anda : " + npm + "\n" +
            "Kelas Anda : " + kelas + "\n" +
            "--------------------------------------------" + "\n" +
            "Nilai Tugas : " + nilaiTugas + "\n" +
            "Nilai Ujian : " + nilaiUjian + "\n" +
            "Nilai Total : " + nilaiTotal);
    }
}