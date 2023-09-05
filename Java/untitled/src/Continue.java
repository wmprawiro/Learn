public class Continue {
    public static void main(String[] args) {
        for (var count = 1; count <= 100 ; count++){
            if (count % 2 == 0){
                continue;
            }
            System.out.println("Perulangan Gajil Ke-" + count);
        }
    }
}
