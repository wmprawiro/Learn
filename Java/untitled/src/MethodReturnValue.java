public class MethodReturnValue {
    public static void main(String[] args) {
        var result = sum(100, 200);
        System.out.println(result);
        System.out.println(sum(200,300));

    }
    static int sum(int num1, int num2){
        var total = num1 + num2;
        return total;
    }
}
