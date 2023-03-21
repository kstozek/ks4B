import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj cene posiłku: ");
        double cenaPosilku = scanner.nextDouble();

        double stawkaPodatku = 0.0675;
        double stawkaNapiwku = 0.20;
        double kwotaPodatku = cenaPosilku * stawkaPodatku;
        double sumaCenyIPodadku = cenaPosilku + kwotaPodatku;
        double kwotaNapiwku = sumaCenyIPodadku + stawkaNapiwku;
        double sumaDoZaplaty = sumaCenyIPodadku + kwotaNapiwku;

        System.out.println("Cena posiłku: " + cenaPosilku);
        System.out.println("Podatek: " + kwotaPodatku);
        System.out.println("Napiwek: " + kwotaNapiwku);
        System.out.println("łaczna kwota do zapłaty: " + sumaDoZaplaty);

        scanner.close();


    }
}
