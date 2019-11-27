import java.util.Scanner;

class Input {
    private String nama_pelanggan;
    private String alamat_pelanggan;
    private double tipe_kamar;
    private double lama_menginap;
    private double tipe_pembayaran;
    
    Input(String NamaPelanggan, String AlamatPelanggan, double TipeKamar, double LamaMenginap, double TipePembayaran) {
        nama_pelanggan = NamaPelanggan;
        alamat_pelanggan = AlamatPelanggan;
        tipe_kamar = TipeKamar;
        lama_menginap = LamaMenginap;
        tipe_pembayaran = TipePembayaran;
    }

    void setNamaPelanggan(String NamaPelanggan) {
        nama_pelanggan = NamaPelanggan;
    }
    String getNamaPelanggan() {
        return nama_pelanggan;
    }

    void setAlamatPelanggan(String AlamatPelanggan) {
        alamat_pelanggan = AlamatPelanggan;
    }
    String getAlamatPelanggan() {
        return alamat_pelanggan;
    }

    void setTipeKamar(double TipeKamar) {
        tipe_kamar = TipeKamar;
    }
    double getTipeKamar() {
        return tipe_kamar;
    }

    void setLamaMenginap(double LamaMenginap) {
        lama_menginap = LamaMenginap;
    }
    double getLamaMenginap() {
        return lama_menginap;
    }

    void setTipePembayaran(double TipePembayaran) {
        tipe_pembayaran = TipePembayaran;
    }
    double getTipePembayaran() {
        return tipe_pembayaran;
    }
}

class Proses extends Input {
    private static double hargaStandart = 400000;
    private static double hargaDeluxe = 600000;
    private static double hargaSuperior = 900000;

    Proses(String NamaPelanggan, String AlamatPelanggan, double TipeKamar, double LamaMenginap, double TipePembayaran) {
        super(NamaPelanggan, AlamatPelanggan, TipeKamar, LamaMenginap, TipePembayaran);
    }

    double getSubTotalStandart() {
        double lama_menginap = super.getLamaMenginap();
        return (lama_menginap * hargaStandart);
    }

    double getSubTotalDeluxe() {
        double lama_menginap = super.getLamaMenginap();
        return (lama_menginap * hargaDeluxe);
    }

    double getSubTotalSuperior() {
        double lama_menginap = super.getLamaMenginap();
        return (lama_menginap * hargaSuperior);
    }
}

public class Kuis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Pelanggan : ");
        String namaPelanggan = input.nextLine();
        System.out.print("Masukkan Alamat : ");
        String alamatPelanggan = input.nextLine();
        System.out.println("Tipe Kamar");
        System.out.println("1. Standart = Rp 400.000");
        System.out.println("2. Deluxe = Rp 600.000");
        System.out.println("3. Superior = Rp 900.000");
        System.out.print("Masukkan Tipe Kamar : ");
        int tipeKamar = input.nextInt();
        System.out.print("Masukkan Lama Menginap : ");
        int lamaMenginap = input.nextInt();
        System.out.println("Tipe Pemabayaran");
        System.out.println("1. App Online");
        System.out.println("2. Travel");
        System.out.println("3. Credit Card");
        System.out.println("4. Debit Card");
        System.out.print("Masukkan Tipe Pembayaran : ");
        int tipePembayaran = input.nextInt();

        Proses detail = new Proses(namaPelanggan, alamatPelanggan, tipeKamar, lamaMenginap, tipePembayaran);
        System.out.println("");
        System.out.println("Nama Pelanggan : " + detail.getNamaPelanggan());
        System.out.println("Alamat : " + detail.getAlamatPelanggan());
        System.out.println("Tipe Kamar : " + detail.getTipeKamar());

        if (detail.getTipeKamar() == 1) {
            System.out.println("Fasilitas : - AC");
            System.out.println("            - Single Bed");
            System.out.println("            - Breakfast");
            System.out.println("Harga : 400.000");
        } else if (detail.getTipeKamar() == 2) {
            System.out.println("Fasilitas : - AC");
            System.out.println("            - Double Bed");
            System.out.println("            - Breakfast");
            System.out.println("            - Kulkas");
            System.out.println("Harga : 600.000");
        } else {
            System.out.println("Fasilitas : - AC");
            System.out.println("            - Double Bed");
            System.out.println("            - Breakfast");
            System.out.println("            - Kulkas");
            System.out.println("            - Best View");
            System.out.println("Harga : 900.000");
        }

        System.out.println("Lama Menginap : " + detail.getLamaMenginap());

        if (detail.getTipeKamar() == 1) {
            System.out.println("Sub Total : " + detail.getSubTotalStandart());
            System.out.println("Diskon : " + (0.3 * getSubTotalStandart));
        } else if (detail.getTipeKamar() == 2) {
            System.out.println("Sub Total : " + detail.getSubTotalDeluxe());
            System.out.println("Diskon : " + (0.3 * getSubTotalDeluxe));
        } else {
            System.out.println("Sub Total : " + detail.getSubTotalSuperior());
            System.out.println("Diskon : " + (0.3 * getSubTotalSuperior));
        }
    }
}