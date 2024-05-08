import İhaMesafe.EngelKonumAl;
import İhaMesafe.Mesafe;
import İhaMesafe.enKısaMesafeHesapla;

import java.util.Map;

public class iha {
    private static Map<enKısaMesafeHesapla.Coordinate, Map<enKısaMesafeHesapla.Coordinate, Double>> yollar;

    public static void main(String[] args) {
        double ilkEnlem = 40.0;
        double ilkBoylam = -74.0;
        double ikinciEnlem = 41.0;
        double ikinciBoylam = -88.0;
        Double mesafe = 100.0; // Örnek mesafe

        İhaMesafe.enKısaMesafeHesapla.Coordinate ilkKoordinat = new İhaMesafe.enKısaMesafeHesapla.Coordinate(ilkEnlem, ilkBoylam);
        İhaMesafe.enKısaMesafeHesapla.Coordinate ikinciKoordinat = new İhaMesafe.enKısaMesafeHesapla.Coordinate(ikinciEnlem, ikinciBoylam);

        // İlk ve ikinci koordinatları kullanarak en kısa yolu hesapla
        İhaMesafe.enKısaMesafeHesapla.Dijkstra enKisaYolHesaplayici = new İhaMesafe.enKısaMesafeHesapla.Dijkstra();
        java.util.List<İhaMesafe.enKısaMesafeHesapla.Coordinate> enKisaYol = enKisaYolHesaplayici.enKisaYol(ilkKoordinat, ikinciKoordinat, yollar);

        // En kısa yolu kullanarak istediğiniz işlemi yapabilirsiniz
        for (İhaMesafe.enKısaMesafeHesapla.Coordinate nokta : enKisaYol) {
            System.out.println("Nokta: " + nokta);
        }
    }
}







