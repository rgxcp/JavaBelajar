import javax.swing.JOptionPane;

public class DtCariArray {
    public static void main(String[] args) {
        String nama[] = {"Rommy", "Kessie", "Rivan", "Nieko", "Iqbal"};
        String cariNama = JOptionPane.showInputDialog("Siapa yang dicari?");
        boolean dapatNama = false;

        
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equals(cariNama)) {
                dapatNama = true;
                break;
            }
        }
        if (dapatNama) {
            JOptionPane.showMessageDialog(null, cariNama + " Ditemukan");
        }
        else {
            JOptionPane.showMessageDialog(null, cariNama + " Tidak Ditemukan");
        }
    }
}