import  java.util.ArrayList;
public class FoodManager {
    private ArrayList<Food> yemekListesi = new ArrayList<>();

    public void yemekSil(String yemekAdi) {
        String aranan = yemekAdi.trim().toLowerCase();

        for (Food f : yemekListesi) {
            if (f.getYemek().toLowerCase().equals(aranan)) {
                yemekListesi.remove(f);
                System.out.println("Yemek silindi: " + yemekAdi);
                return;
            }
        }
        System.out.println("Yemek bulunamadı: " + yemekAdi);
    }


    public void yemekEkle(Food yemek) {
        yemekListesi.add(yemek);

        System.out.println("Yemek eklendi: " + yemek.getYemek());
    }
    public void  yemekleriListele(){
        if(yemekListesi.isEmpty()) {
            System.out.println("Hiç yemek eklenmemiş");
        }
        else {
            for(Food f: yemekListesi){
                System.out.println(f.yemekDetaylari());
            }
        }
    }
    public void fiyatGuncelle(String yemekAdi , double yeniFiyat){
        for(Food f : yemekListesi){
            if(f.getYemek().equalsIgnoreCase(yemekAdi)) {
                f.setFiyat(yeniFiyat);
                System.out.println("Fiyat güncellendi: " + yeniFiyat + " TL");
                return;
            }
        }
        System.out.println( "Yemek bulunamadı " + yemekAdi);
    }

    public void yemekAra(String yemekAdi){
        for(Food f : yemekListesi){
            if(f.getYemek().equalsIgnoreCase(yemekAdi)) {
                System.out.println(f.yemekDetaylari());
            return;
            }
        }
        System.out.println("Yemek bulunamadı.");
    }

}
