package esercizi2;

public class Esercizi2 {

    public static double calcolaNuovoPrezzo(double prezzoIniziale, int scontoApplicato) {
        double fattoreDiSconto = (100 - scontoApplicato) / 100.0;

        return prezzoIniziale * fattoreDiSconto;
    }


    public static boolean isEven(int numeroDaTestare) {
        if (numeroDaTestare % 2 == 0) {
            return true;
        }

        return false;


        //return numeroDaTestare % 2 == 0;
    }

    public static void main(String[] args) {

        System.out.println(calcolaNuovoPrezzo(99.99, 20));


        double[] values = {1.5, 1.7, 2.0, 0.75, 3.14, 5.25, 0};

        // Calcolo della media aritmetica
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        System.out.println(sum / values.length);

        // Ricerca del massimo
        double max = values[0];
        for (double value : values) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println(max);

        // Ricerca del minimo
        double min = values[0];
        for (double value : values) {
            if (value < min) {
                min = value;
            }
        }
        System.out.println(min);

    }
}
