package Matajari.Mitra.Solusi.Data;

public class Application {
    public static final int PROCESSOR;

    static {
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
