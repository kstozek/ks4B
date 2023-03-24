package INF;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę kalorii w produkcie: ");
        double kalorie = scanner.nextDouble();

        System.out.print("Podaj liczbę gramów tłuszczu w produkcie: ");
        double tluszcz = scanner.nextDouble();


        double kalorieZTluszcz = tluszcz * 9;
        double calkowiteKalorie = kalorie + kalorieZTluszcz;

        if(kalorieZTluszcz > calkowiteKalorie){
            System.out.println("BŁĄD: Liczba kalorii z tłuszczu nie może być większa niż łączna liczbe kalorii w produkcie ");

        }else {
            double procentKaloriiTluszczu = (kalorieZTluszcz / calkowiteKalorie) * 100;

            System.out.printf("Procent kalorii pochodzących z tłuszczu %.2f procent \n", procentKaloriiTluszczu);

            if(procentKaloriiTluszczu < 30){
                System.out.println("Produkt jest niskotłuszczowy.");
            }
        }

    }
}
