public class Zadanie19 {
    public static void main(String[] args) {
        int liczbaAnkietowanych = 12467;
        double procentKupujacych = 0.14;
        double procentCytrusowych = 0.64;

        int liczbaKupujacych = (int) Math.round(liczbaAnkietowanych * procentKupujacych);
        int liczbaCytrusowych = (int) Math.round(liczbaKupujacych * procentCytrusowych);

        System.out.println("Liczba ankietowanych kupujących przynajmniej jeden napój energetyczny: " + liczbaKupujacych);
        System.out.println("Liczba ankietowanych preferującychnapoje energetyczne o smaku cytrusowym: " + liczbaCytrusowych);

    }
}
