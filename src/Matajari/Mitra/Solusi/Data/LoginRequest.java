package Matajari.Mitra.Solusi.Data;

public record LoginRequest(String userName, String password) {

    //Record class constructure//
    public LoginRequest {
        System.out.println("Consturctor utama dipanggil");
    }

    public LoginRequest(String userName) {
        this(userName,"");
    }
}
