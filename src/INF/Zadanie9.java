package INF;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double waga, odleglosc;

        System.out.print("Podaj wagę przesyłki (w kilogramach): ");
        waga = scanner.nextDouble();
        System.out.print("Podaj odległosci przesyłki (w kilometrach): ");
        odleglosc = scanner.nextDouble();

        double cena = 0.0;

        if (waga <= 1.0){
            cena = 1.1;
        } else if (waga > 1.0 && waga <= 3.0) {
            cena = 2.2;
        } else if (waga > 3.0 && waga <= 5.0) {
            cena = 3.7;
        } else if (waga > 5.0) {
            cena = 3.8;
        }

        double oplataZa500km = cena;
        if (odleglosc > 500.0){
            oplataZa500km = cena * Math.ceil(odleglosc / 500.0);
        }


        double cenaPrzesylki = oplataZa500km * (odleglosc / 500.0);
        BigDecimal bd = new BigDecimal(cenaPrzesylki).setScale(2, RoundingMode.HALF_UP);
        double liczbaZaokroglona = bd.doubleValue();



        System.out.println("Koszt przesyłki wynosi: " +  liczbaZaokroglona + " złotych");


    }


}
