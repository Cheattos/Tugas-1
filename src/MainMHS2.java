public class MainMHS2 {

    public static void main(String []args){

        MainMahasiswa Budi = new MainMahasiswa("Budi", "12345678", 3.14);

        Budi.PrintData();
        Budi.UbahNama("Budi Setiawan");
        Budi.PrintData();
    }
}
