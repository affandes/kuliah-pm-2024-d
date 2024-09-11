public class Main {
    public static void main(String[] args) {
        String teks = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String[] katakata = teks.split(" ");

        // Hitung jumlah kata secara rekursif
        System.out.println("Jumlah kata: " + hitungKata(katakata, 0));

        // Cetak setiap kata secara rekursif
        cetakKata(katakata, 0);
    }

    // Fungsi rekursif untuk menghitung jumlah kata
    public static int hitungKata(String[] kata, int index) {
        if (index == kata.length) {
            return 0;
        }
        return 1 + hitungKata(kata, index + 1);
    }

    // Fungsi rekursif untuk mencetak kata-kata
    public static void cetakKata(String[] kata, int index) {
        if (index == kata.length) {
            return;
        }
        System.out.println(kata[index]);
        cetakKata(kata, index + 1);
    }
}
