package İhaMesafe;

import static İhaMesafe.EngelKonumAl.hesaplaMesafe;

public class engelYukseklikHesapla  {
    // Engellere dair verileri hesaplayan fonksiyonlar
   
   
    public static double engelYukseklikHesapla(double ilkEnlem, double ilkBoylam, double ikinciEnlem, double ikinciBoylam) {
        // Gerçek dünya verileri olmadan bir örnek yükseklik hesaplaması
        double engelYukseklik = 0.0; // Örnek yükseklik değeri (metre)

        // İki nokta arasındaki mesafeyi hesaplayın
        double mesafe = hesaplaMesafe();

        // Örnek: Mesafeye bağlı olarak engel yüksekliği hesaplama
        if (mesafe < 50.0) {
            engelYukseklik = 5.0; // 50 km'den daha yakınsa yükseklik 5 metre (örnek)
        } else {
            engelYukseklik = 10.0; // Uzaksa yükseklik 10 metre (örnek)
        }

        return engelYukseklik;
    }

}
