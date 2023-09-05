public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Anda Lulus");
                break;
            case "B":
            case "C":
                System.out.println("Cukup Baik");
                break;
            case "D":
                System.out.println("Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

        // switch dengan lambda expression
        switch (nilai) {
            case "A" -> System.out.println("Anda Lulus");
            case "B","C" -> System.out.println("Cukup Baik");
            case "D" -> System.out.println("Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }
        // switch dengan yield

        String ucapan;
        ucapan = switch (nilai) {
            case "A": yield "Anda Lulus";
            case "B","C": yield "Cukup Baik";
            case "D": yield "Tidak Lulus";
            default: yield "Anda Salah jurusan";
        };
        System.out.println(ucapan);
    }
}
