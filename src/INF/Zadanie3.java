package INF;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);

        double waga, wzrost, bmi;
        System.out.println("Podaj swoją wage: ");
        waga = dane.nextDouble();

        System.out.println("Podaj swój wzrost(z przecinkiem): ");
        wzrost = dane.nextDouble();

        bmi = waga/(wzrost*wzrost);

        System.out.println(bmi);

        if(bmi>=18.5 && bmi<=25){
            System.out.println("Twój indeks BMI jest optymalny");
        }else if(bmi<18){
            System.out.println("Twój indeks BMI wskazuje niedowagę");
        }else{
            System.out.println("Twój indeks BMI wskazuje nadwagę");
        }


    }
}
