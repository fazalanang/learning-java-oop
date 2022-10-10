package Data;
import Matajari.Mitra.Solusi.Annotation.Fancy;

//Annotation//
@Fancy(name = "Car", tags = {"application","java"})
public interface Car extends HasBrand, isMaintenance{
    void drive();
    int getTire();
    //Default Method//
    default boolean isBig(){
        return false;
    }
}
