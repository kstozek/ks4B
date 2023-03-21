

public class Zadanie18 {
    public static void main(String[] args) {
         int iloscAkcji = 600;
         double cenaAkcji = 21.77;
         double prowizja = 0.02;

         double kwotaZaAkcje = iloscAkcji * cenaAkcji;
         double wysokoscProwizji = kwotaZaAkcje * prowizja;
         double lacznaKwota = kwotaZaAkcje + wysokoscProwizji;

         System.out.println("Kwota zapłacona za same akcje: " + kwotaZaAkcje + " zł");
         System.out.println("Wysokość prowizji: " + wysokoscProwizji + " zł");
         System.out.println("Łączna zapłacona kwota: " + lacznaKwota + " zł");

    }
}
