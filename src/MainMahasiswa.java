public class MainMahasiswa {
    //atribute
    String nama, nim;
    double ip;

    //constructor
    public MainMahasiswa(String nama, String nim, double ip){
        this.nama = nama;
        this.nim = nim;
        this.ip = ip;
    }




    public void PrintData(){
        System.out.println("Nama : " + nama);
        System.out.println("Nim  : " + nim);
        System.out.println("Ip   : " + ip);
    }

    public void UbahNama(String nama){
        this.nama = nama;
    }

    String GetNama(){
        return this.nama;
    }
}
