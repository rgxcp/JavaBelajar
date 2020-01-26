import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VClass2 {

    // Deklarasi variable
    private Double mBil1, mBil2;
    private JButton mButtonAdd, mButtonClear, mButtonExit;
    private JFrame mFrame;
    private JLabel mLabelBil1, mLabelBil2, mLabelHasil;
    private JPanel mPanel;
    private JTextField mTextBil1, mTextBil2, mTextHasil;
    private String mHasil;

    // Constructor
    public VClass2() {
        // Frame
        mFrame = new JFrame();

        // Label
        mLabelBil1 = new JLabel("Bilangan Pertama : ");
        mLabelBil2 = new JLabel("Bilangan Kedua : ");
        mLabelHasil = new JLabel("Hasil : ");

        // Text field
        mTextBil1 = new JTextField();
        mTextBil2 = new JTextField();
        mTextHasil = new JTextField();
        mTextHasil.setEditable(false);

        // Button
        mButtonAdd = new JButton("ADD");
        mButtonClear = new JButton("CLEAR");
        mButtonExit = new JButton("EXIT");

        // Panel
        mPanel = new JPanel(new GridLayout(5,2, 20,30));
        mPanel.setBorder(BorderFactory.createTitledBorder("JAVA GUI"));
        mPanel.add(mLabelBil1);
        mPanel.add(mTextBil1);
        mPanel.add(mLabelBil2);
        mPanel.add(mTextBil2);
        mPanel.add(mLabelHasil);
        mPanel.add(mTextHasil);
        mPanel.add(mButtonAdd);
        mPanel.add(mButtonClear);
        mPanel.add(mButtonExit);

        // Action
        mButtonAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mBil1 = Double.parseDouble(mTextBil1.getText());
                mBil2 = Double.parseDouble(mTextBil2.getText());
                mHasil = String.valueOf(mBil1 + mBil2);
                mTextHasil.setText(mHasil);
            }
        });

        mButtonClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mTextBil1.setText("");
                mTextBil2.setText("");
                mTextHasil.setText("");
            }
        });

        mButtonExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Menampilkan frame
        mFrame.add(mPanel);
        mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mFrame.setLocationRelativeTo(null);
        mFrame.setSize(300,400);
        mFrame.setTitle("Latihan GUI 2");
        mFrame.setVisible(true);
    }

    public static void main(String[] args) {
        // Mencoba membuat tampilan sesuai dengan sistem yang sedang dipakai
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        // Menangkap kesalahan
        } catch (Exception e) {
            e.printStackTrace();
        // Menjalankan program utama, terlepas dari tampilan sesuai atau tidak
        } finally {
            new VClass2();
        }
    }
}
