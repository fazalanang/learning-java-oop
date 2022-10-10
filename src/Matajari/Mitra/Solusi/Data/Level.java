package Matajari.Mitra.Solusi.Data;

public enum Level {
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    Level(String descrption){
        this.description = descrption;
    }
    public String getDescription() {
        return description;
    }
}
