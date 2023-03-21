import java.util.Scanner;

public class Zadnie13 {
    public static void main(String[] args){
        final int CiasktaNaPudelko = 40;
        final int PorcjaNaPudelko = 10;
        final int KalorieNaPorcje = 300;

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj liczbę zjedzonych ciastek: ");
        int zjedzoneCiastka = input.nextInt();

        double ZjedzonePorcje = (double) zjedzoneCiastka / CiasktaNaPudelko * PorcjaNaPudelko;
        double ZjedzoneKalorie = ZjedzonePorcje * KalorieNaPorcje;

        System.out.println("Skonsumowano " + ZjedzoneKalorie + " kalorii.");

    }
}
