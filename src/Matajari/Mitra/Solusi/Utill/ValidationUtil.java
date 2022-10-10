package Matajari.Mitra.Solusi.Utill;

import Data.LoginRequest;
import Matajari.Mitra.Solusi.Error.BlankException;
import Matajari.Mitra.Solusi.Error.ValidationException;

public class ValidationUtil {
    public  static void  validate (LoginRequest loginRequest) throws ValidationException {
        if (loginRequest.userName() == null){
            throw new ValidationException("username is null");
        } else if (loginRequest.userName().isBlank()) {
            throw new ValidationException("username is blank");
        } else if (loginRequest.password() == null) {
            throw new ValidationException("password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("password is blank");
        }
    }
    //runtime exception//
    public  static void  validateRuntime (LoginRequest loginRequest) {
        if (loginRequest.userName() == null){
            throw new NullPointerException("username is null");
        } else if (loginRequest.userName().isBlank()) {
            throw new BlankException("username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("password is blank");
        }
    }
}
