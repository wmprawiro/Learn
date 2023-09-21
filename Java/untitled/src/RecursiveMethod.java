public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursice(5));
        loop(10000);
    }

    static int factorialLoop(int value){
        var result = 1;
        for (var count = 1; count <= value; count++){
            result *= count;
        }

        return result;
    }

    static int factorialRecursice(int value){
        if(value ==1){
            return 1;
        } else {
            return value * factorialRecursice(value-1);
        }
    }
    static void loop(int value){
        if(value == 0){
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value-1);
        }
    }
}
