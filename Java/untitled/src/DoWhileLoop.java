public class DoWhileLoop {
    public static void main(String[] args) {
        var count = 100;
        // perbedaan perulangan while dan do while
        // do while paling tidak mengulang 1 kali
        // perulangan while
        while (count<=10) {
            System.out.println("Perulangan " + count);
            count++;
        }

        // perulangan do while akan meengulang setidakny satu
        do {
            System.out.println("Perulangan " + count);
            count++;
        } while (count <= 10);
    }
}
