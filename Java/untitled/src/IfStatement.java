public class IfStatement {
    public static void main(String[] args) {
        var nilai = 80;
        var absen = 70;
        // If Expression
        if (nilai >= 75 && absen >= 75){
            System.out.println("Selamat Anda Lulus");
        } else {
            System.out.println("Maaf Anda Belum Lulus");
        }

        if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda B");
        } else {
            System.out.println("Nilai Anda C");
        }
    }
}
