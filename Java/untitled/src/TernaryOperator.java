public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan;

        if (nilai>=75) {
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "Silahkan Coba Lagi";
        }
        System.out.println(ucapan);

        // dengan menggunakan Ternary Operator
        ucapan = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba Lagi";
        System.out.println(ucapan);
    }
}
