public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Wahyu", "Maulana");
        sayHello("Handoko", "Kurniawan");
    }
    static void sayHello(String fName, String lName){
        System.out.println("Hello " + fName + " " + lName);
    }
}
