public class DtString {
    public static void main(String[] args) {
        System.out.println("----- COBA 1 -----");
        String teks = "Belajar Java Itu Mudah";
        String teks_a = "Java";        
        System.out.println("teks = " + teks);
        System.out.println("teks_a = " + teks_a);
        System.out.println("substring(0,3) = " + teks.substring(0,3));
        System.out.println("charAt(6) = " + teks.charAt(6));
        System.out.println("length() = " + teks.length());
        System.out.println("concat(, Setuju?) = " + teks.concat(", Setuju?"));
        System.out.println("replace('a','A') = " + teks.replace('a','A'));
        System.out.println("toLowerCase() = " + teks.toLowerCase());
        System.out.println("toUpperCase() = " + teks.toUpperCase());
        System.out.println("trim() = " + teks.trim());
        System.out.println("equals(Java) = " + teks_a.equals("Java"));
        System.out.println("equalsIgnoreCase(JAVA) = " + teks_a.equalsIgnoreCase("JAVA"));
        System.out.print();

        System.out.println("----- COBA 2 -----");
        System.out.println("charAt() dengan perulangan = ");
        for (int i = 0; i < teks.length(); i++) {
            System.out.print(teks.charAt(i));
            System.out.println();
        }
        System.out.print("");

        System.out.println("----- COBA 3 -----");
        String teks_b = new String(teks_a);
        if (teks_a.equals(teks_b)) {
            System.out.println("teks_a == teks_b");
        } else {
            System.out.println("teks_a != teks_b");
        }
        System.out.print("");

        System.out.println("----- COBA 4 -----");
        int result = teks.compareTo(teks_a);
        if (result == 0) {
            System.out.println("teks and teks_b are equal");
        } else if (result < 0) {
            System.out.println("teks is less than teks_b");
        } else {
            System.out.println("teks is greater than teks_a");
        }
        System.out.print("");

        System.out.println("----- COBA 5 -----");
        String str2 = "One Two Three One";
        int idx1 = str2.indexOf("Two");
        //int idx2 = str2.lastIndexOf("One");
        System.out.println("index of first occurrence of Two = " + idx1);
        //System.out.println("index of last occurrence of One = " + idx2);
        System.out.print("");
    }
}