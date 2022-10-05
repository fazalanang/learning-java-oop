package Matajari.Mitra.Solusi.Data;

public interface Car extends HasBrand, isMaintenance{
    void drive();
    int getTire();
    //Default Method//
    default boolean isBig(){
        return false;
    }
}
