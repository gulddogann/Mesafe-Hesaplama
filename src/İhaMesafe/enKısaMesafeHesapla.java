package İhaMesafe;

import java.util.*;

public class enKısaMesafeHesapla {



        public static void main(String[] args, double ilkEnlem, double ilkBoylam, double ikinciEnlem, double ikinciBoylam, Double mesafe) {
            // İki nokta arasındaki en kısa yolu hesapla
            Map<İhaMesafe.enKısaMesafeHesapla.Coordinate, Map<İhaMesafe.enKısaMesafeHesapla.Coordinate, Double>> yollar = new HashMap<>();
            yollar.put(new İhaMesafe.enKısaMesafeHesapla.Coordinate(), new HashMap<>());
            yollar.put(new Coordinate.coordinate(ikinciEnlem, ikinciBoylam), new HashMap<>());
            yollar.get(new enKısaMesafeHesapla.Coordinate()).put(new enKısaMesafeHesapla.Coordinate(), mesafe);
            yollar.get(new İhaMesafe.enKısaMesafeHesapla.Coordinate()).put(new enKısaMesafeHesapla.Coordinate(), mesafe);

            List<İhaMesafe.enKısaMesafeHesapla.Coordinate> enKisaYol = İhaMesafe.enKısaMesafeHesapla.Dijkstra.enKisaYol(new enKısaMesafeHesapla.Coordinate(), new enKısaMesafeHesapla.Coordinate(), yollar);

            // En kısa yolu yazdır
            for (İhaMesafe.enKısaMesafeHesapla.Coordinate nokta : enKisaYol) {
                System.out.println("Nokta: " + nokta);
            }
        }

        public static class Coordinate {
            double enlem;
            double boylam;

            public Coordinate() {
                this.enlem = enlem;
                this.boylam = boylam;
            }

            public Coordinate(double ilkEnlem, double ilkBoylam) {
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                İhaMesafe.enKısaMesafeHesapla.Coordinate that = (İhaMesafe.enKısaMesafeHesapla.Coordinate) o;
                return Double.compare(this.enlem, that.enlem) == 0 && Double.compare(this.boylam, that.boylam) == 0;
            }

            @Override
            public int hashCode() {
                return Objects.hash(enlem, boylam);
            }

            public static class coordinate extends enKısaMesafeHesapla.Coordinate {
                public coordinate(double ikinciEnlem, double ikinciBoylam) {
                    super();
                }
            }
        }

        public static class Dijkstra {
            public static List<İhaMesafe.enKısaMesafeHesapla.Coordinate> enKisaYol(İhaMesafe.enKısaMesafeHesapla.Coordinate baslangicNokta, İhaMesafe.enKısaMesafeHesapla.Coordinate bitisNokta, Map<İhaMesafe.enKısaMesafeHesapla.Coordinate, Map<İhaMesafe.enKısaMesafeHesapla.Coordinate, Double>> yollar) {
                // Dijkstra algoritmasını kullanarak en kısa yolu hesapla
                List<İhaMesafe.enKısaMesafeHesapla.Coordinate> enKisaYol = new ArrayList<>();
                Map<İhaMesafe.enKısaMesafeHesapla.Coordinate, Double> mesafeler = new HashMap<>();
                Set<İhaMesafe.enKısaMesafeHesapla.Coordinate> ziyaretEdilenler = new HashSet<>();
                return enKisaYol;
            }
        }
    }

