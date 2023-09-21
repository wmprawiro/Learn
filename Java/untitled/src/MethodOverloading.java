public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Wahyu");
        sayHello("Wahyu", "Maulana");
    }

    static void sayHello(){
        System.out.println("Hello ");
    }
    static void sayHello(String fname){
        System.out.println("Hello " + fname);
    }
    static void sayHello(String fname, String lname){
        System.out.println("Hello " + fname + " " + lname);
    }
}
