public class KonversiNumber {
    public static void main(String[] args) {
        // Konversi Tipe Data
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2; // Number Overflow
    }
}
