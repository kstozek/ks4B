package INF;

import java.util.Scanner;

public class Zadanie14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wybierz pakiet: A, B lub C:");
        String pakiet = scanner.nextLine().toUpperCase();

        System.out.print("Podaj liczbę minut rozmów:");
        int minuty = scanner.nextInt();

        double cenaAktualnegoPakietu;
        double cenaPakietuB = 59.99;
        double cenaPakietuC = 69.99;

        switch (pakiet) {
            case "A":
                cenaAktualnegoPakietu = obliczCenePakietuA(minuty);
                double oszczednosciAB = cenaAktualnegoPakietu - obliczCenePakietuB(minuty);
                double oszczednosciAC = cenaAktualnegoPakietu - cenaPakietuC;
                if (oszczednosciAB > 0) {
                    System.out.printf("Możesz zaoszczędzić %.2f zł wybierając pakiet B.%n", oszczednosciAB);
                }
                if (oszczednosciAC > 0) {
                    System.out.printf("Możesz zaoszczędzić %.2f zł wybierając pakiet C.%n", oszczednosciAC);
                }
                break;
            case "B":
                cenaAktualnegoPakietu = obliczCenePakietuB(minuty);
                double oszczednosciBC = cenaAktualnegoPakietu - cenaPakietuC;
                if (oszczednosciBC > 0) {
                    System.out.printf("Możesz zaoszczędzić %.2f zł wybierając pakiet C.%n", oszczednosciBC);
                }
                break;
            case "C":
                cenaAktualnegoPakietu = cenaPakietuC;
                break;
            default:
                System.out.println("Nieznany pakiet!");
                return;
        }

        System.out.println("Miesięczny rachunek: " + cenaAktualnegoPakietu + " złotych");
    }

    private static double obliczCenePakietuA(int minuty) {
        double cena = 39.99;
        if (minuty > 450) {
            cena += (minuty - 450) * 0.45;
        }
        return cena;
    }

    private static double obliczCenePakietuB(int minuty) {
        double cena = 59.99;
        if (minuty > 900) {
            cena += (minuty - 900) * 0.40;
        }
        return cena;
    }
}
