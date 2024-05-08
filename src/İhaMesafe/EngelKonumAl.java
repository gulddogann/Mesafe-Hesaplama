package İhaMesafe;

public class EngelKonumAl  {
    // Engel konumunu hesaplayan fonksiyon
    public static String engelKonumAl(double ilkEnlem, double ilkBoylam, double ikinciEnlem, double ikinciBoylam) {
        // Gerçek dünya verileri olmadan bir örnek konum hesaplama
        String engelKonumu = "Örnek Konum (Latitude, Longitude)";

        // İki nokta arasındaki mesafeyi hesaplayın
        double mesafe = hesaplaMesafe();

        // Örnek bir engel konumu hesaplama
        if (mesafe < 50.0) {
            engelKonumu = "Engel Konumu A (Örnek, 40.7128, -74.0060)";
        } else {
            engelKonumu = "Engel Konumu B (Örnek, 41.8781, -87.6298)";
        }

        return engelKonumu;
    }

    static double hesaplaMesafe() {

        return hesaplaMesafe();
    }

}
