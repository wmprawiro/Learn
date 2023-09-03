public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Wahyu Maulana Prawiro";

        System.out.println(name);

        int age = 21;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Wahyu Ganteng";
        System.out.println(name);

        // jika menggunakan var harus diisi langsung variabelnya
        // namun jika tidak wajib mendeklarasikan tipe datanya terlebih dahulu seperti diatas
        var firstName = "Wahyu ";
        var middleName = "Maulana ";
        var lastName = "Prawiro";

        System.out.println(firstName + middleName + lastName);

        //penggunaan kata kunci final digunakan untuk variable konstan atau tidak bisa diubah valuenya
        final String application = "Belajar Java";

        System.out.println(application);

    }
}
