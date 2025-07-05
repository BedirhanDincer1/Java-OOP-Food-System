import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FoodManager manager = new FoodManager();

        while (true) {
            System.out.println("\n📋 Yemek Yönetim Sistemi");
            System.out.println("1- Yemek Ekle");
            System.out.println("2- Yemekleri Listele");
            System.out.println("3- Fiyat Güncelle");
            System.out.println("4- Yemek Ara");
            System.out.println("5- Yemek Sil");
            System.out.println("6- Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.println("Yemek Adı: ");
                    String ad = scanner.nextLine();

                    System.out.println("Kalori: ");
                    int kalori = scanner.nextInt();

                    System.out.println("Fiyatı: ");
                    double fiyat = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Kategoriyi seçin: ");
                    Kategori[] kategoriler = Kategori.values();
                    for(int i=0;i<kategoriler.length;i++){
                        System.out.println((i+1) + "- " + kategoriler[i]);
                    }
                    System.out.println("Seçiminiz: ");
                    int kategoriSecim= scanner.nextInt();
                    scanner.nextLine();
                    if (kategoriSecim < 1 || kategoriSecim > kategoriler.length) {
                        System.out.println("Geçersiz kategori seçimi!");
                        break;
                    }
                    Kategori secilenKategori = kategoriler[kategoriSecim - 1];
                    Food yeniYemek = new Food(ad, kalori, fiyat, secilenKategori);
                    manager.yemekEkle(yeniYemek);
                    break;

                case 2:
                    manager.yemekleriListele();
                    ;
                    break;
                case 3:
                    System.out.println("Güncellemek istediğiniz yemeği girin: ");
                    String yemekAdi = scanner.nextLine();
                    System.out.println("Yeni fiyat: ");
                    double yeniFiyat = scanner.nextDouble();
                    scanner.nextLine();
                    manager.fiyatGuncelle(yemekAdi, yeniFiyat);
                    break;
                case 4:
                    System.out.println("Aranacak yemek adı: ");
                    String arananYemek = scanner.nextLine();
                    manager.yemekAra(arananYemek);
                    break;
                case 5:
                    System.out.println(" Silinecek yemek adı: ");
                    String yemekSil = scanner.nextLine();
                    manager.yemekSil(yemekSil);
                    break;
                case 6:
                    System.out.println("Çıkış yapılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçim!");

            }
        }
    }
}
