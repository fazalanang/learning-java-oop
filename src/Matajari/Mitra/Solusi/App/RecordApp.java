package Matajari.Mitra.Solusi.App;

import Matajari.Mitra.Solusi.Data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("fazaLanang", "SecretData");

        System.out.println(loginRequest.userName());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest("faza","secretData"));
    }
}
