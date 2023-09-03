public class OperasiBoolean {
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAkhhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilai = nilaiAkhhir == 80;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }
}
