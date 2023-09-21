public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Wahyu", "Maulana");
        sayHello("Handoko", "Kurniawan");
    }
    static void sayHello(String fname, String lName){
        System.out.println("Hello " + fname + " " + lName);
    }
}
