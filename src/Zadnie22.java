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





import java.util.Scanner;

public class Biegacze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pytanie o nazwiska biegaczy i ich czasy
        System.out.println("Podaj nazwisko i czas ukończenia biegu dla każdego z trzech biegaczy:");
        System.out.print("Biegacz 1: ");
        String nazwisko1 = scanner.next();
        int czas1 = scanner.nextInt();
        System.out.print("Biegacz 2: ");
        String nazwisko2 = scanner.next();
        int czas2 = scanner.nextInt();
        System.out.print("Biegacz 3: ");
        String nazwisko3 = scanner.next();
        int czas3 = scanner.nextInt();
        
        // Wyświetlenie nazwisk biegaczy zgodnie z kolejnością na mecie
        System.out.println("Kolejność na mecie:");
        if (czas1 < czas2 && czas1 < czas3) {
            System.out.println(nazwisko1);
            if (czas2 < czas3) {
                System.out.println(nazwisko2);
                System.out.println(nazwisko3);
            } else {
                System.out.println(nazwisko3);
                System.out.println(nazwisko2);
            }
        } else if (czas2 < czas1 && czas2 < czas3) {
            System.out.println(nazwisko2);
            if (czas1 < czas3) {
                System.out.println(nazwisko1);
                System.out.println(nazwisko3);
            } else {
                System.out.println(nazwisko3);
                System.out.println(nazwisko1);
            }
        } else {
            System.out.println(nazwisko3);
            if (czas1 < czas2) {
                System.out.println(nazwisko1);
                System.out.println(nazwisko2);
            } else {
                System.out.println(nazwisko2);
                System.out.println(nazwisko1);
            }
        }
    }
}

