package Matajari.Mitra.Solusi.App;

import Matajari.Mitra.Solusi.Data.LoginRequest;
import Matajari.Mitra.Solusi.Error.ValidationException;
import Matajari.Mitra.Solusi.Utill.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("faza","rahhasia");
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException exception){
            System.out.println("Data tidak valid : "+exception.getMessage());
        } catch (NullPointerException exception) {
            System.out.println("Data null : "+ exception.getMessage());
        } finally {
            System.out.println("Selalu di eksekusi");
        }

        //runtime exception tanpa try catch//
        LoginRequest loginRequest2 = new LoginRequest(null,null);
        ValidationUtil.validateRuntime(loginRequest2);
    }
}
