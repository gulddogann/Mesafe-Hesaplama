package İhaMesafe;
import java.util.Scanner;

public class Mesafe {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("İlk noktanın enlemini girin :");
        double ilkEnlem = input.nextDouble();
        System.out.print("İlk noktanın boylamını girin :");
        double ilkBoylam = input.nextDouble();

        System.out.print("İkinci noktanın enlemini girin :");
        double ikinciEnlem = input.nextDouble();
        System.out.print("İkinci noktanın boylamını girin :");
        double ikinciBoylam = input.nextDouble();

        double R = 6371;

        // İki nokta arasındaki φ (enlem) farkı
        double φ1 = ilkEnlem * Math.PI / 180;
        double φ2 = ikinciEnlem * Math.PI / 180;
        double φ_fark = φ2 - φ1;

        // İki nokta arasındaki λ (boylam) farkı
        double λ1 = ilkBoylam * Math.PI / 180;
        double λ2 = ikinciBoylam * Math.PI / 180;
        double λ_fark = λ2 - λ1;

        // Haversine formülü
        double mesafe = 2 * R * Math.asin(Math.sqrt(Math.pow(Math.sin(φ_fark / 2), 2) + Math.cos(φ1) * Math.cos(φ2) * Math.pow(Math.sin(λ_fark / 2), 2)));

        // Mesafeyi yazdırın
        System.out.println("İki nokta arasındaki mesafe : " + mesafe + " km");
    }
}



