public class Array {
    public static void main(String[] args) {
        String[] arrayStrings;
        arrayStrings = new String[3];

        arrayStrings[0] = "Wahyu";
        arrayStrings[1] = "Maulana";
        arrayStrings[2] = "Prawiro";

        System.out.println(arrayStrings[0]);
        System.out.println(arrayStrings[1]);
        System.out.println(arrayStrings[2]);

        String[] arrayString2 = new String[3];

        // Array initializer

        String[] namaNama = {
                "Wahyu ", "Maulana ", "Prawiro "
        };
        int[] ArrayInt = new int[]{
                1,2,3,4,5,6,7,8,9
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };
        System.out.println(arrayLong.length);

        // Array di dalam array
        String[][] members = {
                {"Wahyu ", "Maulana"},
                {"Eko ", "Kurniawan"},
                {"Prawiro"}
        };
        System.out.println(members[1][0]);
    }
}
