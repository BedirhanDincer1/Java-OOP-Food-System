public class Food {
    private String yemek;
    private int kalori;
    private double fiyat;

    public Food(String yemek, int kalori, double fiyat) {
        this.yemek = yemek;
        this.kalori = kalori;
        this.fiyat = fiyat;
    }

    public String getYemek() {
        return yemek;
    }

    public int getKalori() {
        return kalori;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String yemekDetaylari() {
        return "Yemek adı: " + yemek + " | Kalorisi: " + kalori + " | Fiyatı: " + fiyat + " TL";
    }
}
