import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            System.out.print("Wprowadź wartość produktu: ");
            double cenaProduktu = scanner.nextDouble();
            double podatekStanowy = cenaProduktu * 0.04;
            double podatekLokalny = cenaProduktu * 0.02;
            double cenaSprzedazy = cenaProduktu + podatekStanowy + podatekLokalny;

            System.out.println("Cena produktu:" + cenaProduktu);
            System.out.println("Podatek Stanowy: " + podatekStanowy);
            System.out.println("Podatek Lokalny: " + podatekLokalny);
            System.out.println("Łączna cena sprzedaży: " + cenaSprzedazy);


    }
}
