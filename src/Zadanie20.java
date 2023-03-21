import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
         double cukier = 1.5;
         double maslo = 1.0;
         double maka = 2.75;
         int iloscCiasteczek = 48;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę ciasteczek: ");
        int oczekiwanaIlosc = scanner.nextInt();

        double wspolczynnik = (double) oczekiwanaIlosc / iloscCiasteczek;
        double potrzebnyCukier = cukier * wspolczynnik;
        double potrzebneMaslo = maslo * wspolczynnik;
        double potrzebnaMaka = maka * wspolczynnik;

        System.out.println("Do upieczenia " + oczekiwanaIlosc + " ciasteczek potrzeba:");
        System.out.println(potrzebnyCukier + " szklanki cukru" );
        System.out.println(potrzebneMaslo + " szklanki masła");
        System.out.println(potrzebnaMaka + " szklanki mąki");
    }
}
