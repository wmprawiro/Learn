public class MethodReturnValue {
    public static void main(String[] args) {
        var result = sum(100,200);
        System.out.println(result);

        System.out.println(sum(200,200));
        System.out.println(hitung(100, "+", 100));
        System.out.println(hitung(200, "-", 100));
        System.out.println(hitung(200, "salah", 100));

    }
    static int sum(int num1, int num2){
        var total = num1 + num2;
        return total;
    }

    static int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+":
                return value1+value2;
            case "-":
                return value1-value2;
            default:
                return 0;
        }
    }
}
