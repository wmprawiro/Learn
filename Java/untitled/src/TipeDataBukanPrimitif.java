public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000L;
        Byte iniByte = null;

        System.out.println(iniByte);
        iniByte = 100;
        System.out.println(iniByte);

        // konversi dari tipe data primitif ke bukan primitif
        int iniInt = 10;
        Integer iniKonversiInt = iniInt;
        System.out.println(iniKonversiInt);

        // ngerubah tipe data ke primitif namun tidak kompatibel menggunakan method
        short iniShort = iniKonversiInt.shortValue();
        long iniLong2 = iniKonversiInt.longValue();
        float iniFloat = iniKonversiInt.floatValue();
    }
}
