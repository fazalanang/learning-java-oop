package Matajari.Mitra.Solusi.App;

import Matajari.Mitra.Solusi.Error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("faza","faza1234");
        System.out.println("Sukses");
    }

    public static void connectDatabase(String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("Tidak bisa masuk ke database");
        }
    }
}
