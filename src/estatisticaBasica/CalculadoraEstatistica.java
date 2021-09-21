package estatisticaBasica;

import java.util.Scanner;

public class CalculadoraEstatistica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1, x2, x3, x4;

        System.out.println("Insira o primeiro valor: ");
        x1 = scan.nextDouble();
        System.out.println("Insira o segundo valor: ");
        x2 = scan.nextDouble();
        System.out.println("Insira o terceiro valor: ");
        x3 = scan.nextDouble();
        System.out.println("Insira o quarto valor: ");
        x4 = scan.nextDouble();

        double mediaAritmetica = mediaAritmetica(x1, x2, x3, x4);
        double mediaGeometrica = mediaGeometrica(x1, x2, x3, x4);
        double mediaHarmonica = mediaHarmonica(x1, x2, x3, x4);
        double desvioPadrao = desvioPadrao(x1, x2, x3, x4);

        System.out.printf(
                "\nMédia Aritmética: " + "%.2f", mediaAritmetica);
        System.out.printf(
                "\nMédia Geométrica: " + "%.2f", mediaGeometrica);
        System.out.printf(
                "\nMédia Harmônica: " + "%.2f", mediaHarmonica);
        System.out.printf(
                "\nDesvio Padrão: " + "%.2f", desvioPadrao);
    }

    public static double mediaAritmetica(double x1, double x2, double x3, double x4) {
        return (x1 + x2 + x3 + x4)/4;
    }

    public static double mediaGeometrica (double x1, double x2, double x3, double x4) {
        double p = (x1 * x2 * x3 * x4);
        return Math.pow(p, 0.25);
    }

    public static double mediaHarmonica (double x1, double x2, double x3, double x4) {
        return 4/((1/x1) + (1/x2) + (1/x3) + (1/x4));
    }

    public static double desvioPadrao (double x1, double x2, double x3, double x4) {
        double m = (x1 + x2 + x3 + x4)/4;
        double s = (((x1 - m)*(x1 -m)) + ((x2 - m)*(x2 -m)) + ((x3 - m)*(x3 -m)) + ((x4 - m)*(x4 -m)))/4;
        return Math.pow(s, 0.25);
    }
}
