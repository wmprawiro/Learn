public class TipeDataNumber {
    public static void main(String[] args) {
        byte iniByte = 100;
        short iniShort = 10000;
        int iniInt = 1000000000;
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;

        System.out.println(iniLong2);

        float iniFloat = 10.10F;
        double iniDouble = 10.10;

        System.out.println(iniDouble);

        int decimalInt = 34;
        int hexInt = 0xFFFFFF;
        int binInt = 0b1011101;

        System.out.println(binInt);

        int amount = 1_000_000_000;

        System.out.println(amount);

    }
}
