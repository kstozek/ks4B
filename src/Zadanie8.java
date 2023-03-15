import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pierwsze dwa
        double dlugoscPokoju1, szerokoscPokoju1, dlugoscPokoju2, szerokoscPokoju2;
        System.out.println("Podaj wymiary pokoju nr 1 (długość i szerokość w metrach):");
        dlugoscPokoju1 = scanner.nextDouble();
        szerokoscPokoju1 = scanner.nextDouble();

        System.out.println("Podaj wymiary pokoju nr 2 (długość i szerokość w metrach):");
        dlugoscPokoju2 = scanner.nextDouble();
        szerokoscPokoju2 = scanner.nextDouble();


        // trzeci pokój
        double dlugoscPokoju3, szerokoscPokoju3;
        System.out.println("Podaj wymiary pokoju nr 3 (długość i szerokość w metrach):");
        dlugoscPokoju3 = scanner.nextDouble();
        szerokoscPokoju3 = scanner.nextDouble();

        // czwarty pokój
        double dlugoscPokoju4, szerokoscPokoju4;
        System.out.println("Podaj wymiary pokoju nr 4 (długość i szerokość w metrach):");
        dlugoscPokoju4 = scanner.nextDouble();
        szerokoscPokoju4 = scanner.nextDouble();

        double powierzchniaPokoju1 = dlugoscPokoju1 * szerokoscPokoju1;
        double powierzchniaPokoju2 = dlugoscPokoju2 * szerokoscPokoju2;
        double powierzchniaPokoju3 = dlugoscPokoju3 * szerokoscPokoju4;
        double powierzchniaPokoju4 = dlugoscPokoju4 * szerokoscPokoju4;

        // obliczanie powierzchni całkowitej mieszkania
        double powierzchniaCalkowita = powierzchniaPokoju1 + powierzchniaPokoju2 + powierzchniaPokoju3 + powierzchniaPokoju4;

        // wyświetlanie wyników
        System.out.println("Powierzchnia pokoju nr 1 wynosi: " + powierzchniaPokoju1 + " metrów kwadratowych");
        System.out.println("Powierzchnia pokoju nr 2 wynosi: " + powierzchniaPokoju2 + " metrów kwadratowych");
        System.out.println("Powierzchnia pokoju nr 3 wynosi: " + powierzchniaPokoju3 + " metrów kwadratowych");
        System.out.println("Powierzchnia pokoju nr 4 wynosi: " + powierzchniaPokoju4 + " metrów kwadratowych");
        System.out.println("Powierzchnia całkowita mieszkania wynosi: " + powierzchniaCalkowita + " metrów kwadratowych");
    }
}
