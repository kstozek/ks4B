public class Zadnie22 {
    public static void main(String[] args) {
        int liczbaAkcji = 1000;
        double cenaZakupu = 32.87;
        double prowizjaZakupu = 0.02;
        double cenaSprzedazy = 33.92;
        double proizjaSprzedazy = 0.02;

        double kosztAkcji = liczbaAkcji * cenaZakupu;
        double prowizjaZakupuWartosc = kosztAkcji * prowizjaZakupu;
        double przychodZeSprzedazy = liczbaAkcji * cenaSprzedazy;
        double prowizjaSprzedazyWartosc = przychodZeSprzedazy * proizjaSprzedazy;
        double zysk = przychodZeSprzedazy - kosztAkcji - prowizjaZakupuWartosc - prowizjaSprzedazyWartosc;

        System.out.println("Kwota zapłacona z akcje " + kosztAkcji + " zł");
        System.out.println("Wartość prowizji zapłaconej przy zakupie: " + prowizjaZakupuWartosc);
        System.out.println("Kwota otrzymana ze sprzedaży akcji: " + przychodZeSprzedazy + " zł");
        System.out.println("Wartość prowizji zapłaconej przy sprzedaży: " + zysk + " zł");
    }
}
