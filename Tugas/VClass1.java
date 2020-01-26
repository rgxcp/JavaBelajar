import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VClass1 {

    // Deklarasi variable
    private JButton mButtonRed, mButtonGreen, mButtonBlue;
    private JFrame mFrame;
    private JPanel mPanelKiri, mPanelKanan;
    private JSplitPane mSplitPane;

    // Constructor
    public VClass1() {
        // Frame
        mFrame = new JFrame();

        // Button
        mButtonRed = new JButton("RED");
        mButtonGreen = new JButton("GREEN");
        mButtonBlue = new JButton("BLUE");

        // Panel kiri
        mPanelKiri = new JPanel();
        mPanelKiri.setLayout(new BoxLayout(mPanelKiri, BoxLayout.Y_AXIS));
        mPanelKiri.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        mPanelKiri.setBackground(Color.GREEN);
        mPanelKiri.add(mButtonRed);
        mPanelKiri.add(mButtonGreen);
        mPanelKiri.add(mButtonBlue);
        mFrame.add(mPanelKiri);

        // Panel kanan
        mPanelKanan = new JPanel();
        mPanelKanan.setBackground(Color.WHITE);
        mFrame.add(mPanelKanan);

        // Membagi panel
        mSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, mPanelKiri, mPanelKanan);
        mSplitPane.setDividerLocation(200);
        mFrame.add(mSplitPane);

        // Action
        mButtonRed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mPanelKanan.setBackground(Color.RED);
            }
        });

        mButtonGreen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mPanelKanan.setBackground(Color.GREEN);
            }
        });

        mButtonBlue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mPanelKanan.setBackground(Color.BLUE);
            }
        });

        // Menampilkan frame
        mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mFrame.setLocationRelativeTo(null);
        mFrame.setSize(500,300);
        mFrame.setTitle("Latihan GUI 1");
        mFrame.setVisible(true);
    }

    public static void main(String[] args) {
        // Menjalankan program utama
        new VClass1();
    }
}
