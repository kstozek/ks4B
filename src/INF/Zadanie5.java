package INF;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        double masa, niutony;

        System.out.println("Podaj masę obiektu: ");
        masa = dane.nextDouble();

        niutony = masa*9.8;

        if(niutony<10){
            System.out.println("Obiekt jest za lekki");
        } else if (niutony<=1000){
            System.out.println("Obiekt waży: " + niutony + "niutonów");
        }else{
            System.out.println("Obiekt jest zbyt ciężki");
        }
    }
}