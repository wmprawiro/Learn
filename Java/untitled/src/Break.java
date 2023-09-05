public class Break {
    public static void main(String[] args) {
        for (var count = 1; count <= 10 ; count++){
            System.out.println("Perulangan Ke-" + count);
            if (count >= 6){
                break;
            }
        } System.out.println("Perulangan berhenti");
    }
}
