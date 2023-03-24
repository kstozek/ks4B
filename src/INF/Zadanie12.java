package INF;

import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wybierz nośnik: powietrze, woda lub stal: ");
        String nosnik = scanner.nextLine().toLowerCase();

        System.out.print("Podaj odległość (w metrach): ");
        double odleglosc = scanner.nextDouble();

        double czas;
        switch (nosnik){
            case "powietrze":
                czas = odleglosc /343;
                break;
            case "woda":
                czas = odleglosc / 1490;
                break;
            case "stal":
                czas = odleglosc / 5100;
                break;
            default:
                System.out.println("Nieznany nośnik!");
                return;
        }

        System.out.printf("Czas potrzeby do pokonania odelgłości: %.2f s \n", czas);


    }
}
