import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String PierwszeImie, DrugieImie, nazwisko;

        System.out.print("Podaj imię: ");
        PierwszeImie = scanner.nextLine();
        System.out.print("Podaj drugie imię: ");
         DrugieImie = scanner.nextLine();
        System.out.print("Podaj nazwisko: ");
        nazwisko = scanner.nextLine();

        char PierwszeInicjal = PierwszeImie.charAt(0);
        char DrugieInicjal = DrugieImie.charAt(0);
        char TrzeciInicjal = nazwisko.charAt(0);

        System.out.println("Twoje inicjały to: " + PierwszeInicjal + DrugieInicjal+ TrzeciInicjal);
    }
}
