package INF;


   import java.util.Scanner;
    public class Zadanie4 {
        public static void main(String[] args) {
            Scanner dane = new Scanner(System.in);
            double test1, test2, test3, srednia;

            System.out.println("Podaj wynik 1 testu: ");
            test1 = dane.nextDouble();
            dane.nextLine();

            System.out.println("Podaj wynik 2 testu: ");
            test2 = dane.nextDouble();
            dane.nextLine();

            System.out.println("Podaj wynik 3 testu: ");
            test3 = dane.nextDouble();

            srednia = (test1 + test2 + test3)/3;

            if(srednia<60){
                System.out.println("Średnia z testów: " + srednia + " Odpowiadająca czena: 1");
            }else if(srednia<=69){
                System.out.println("Średnia z testów: " + srednia + " Odpowiadająca czena: 2");
            }else if(srednia<=79){
                System.out.println("Średnia z testów: " + srednia + " Odpowiadająca czena: 3");
            }else if(srednia<=89){
                System.out.println("Średnia z testów: " + srednia + " Odpowiadająca czena: 4");
            }else if(srednia>=90){
                System.out.println("Średnia z testów: " + srednia + " Odpowiadająca czena: 5");
            }



        }
    }

