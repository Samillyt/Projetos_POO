package vetores;

public class Exercicio3 {

    public static void main(String[] args) {

        System.out.println("===============================");

        double[] notas = new double[] { 7.5, 8.0, 9.5, 10.0 };
        double soma = 0.0;
        // Imprimir as notas
        System.out.println("As notas são: " + notas[0] + ", " + notas[1] + ", " + notas[2] + ", " + notas[3]);

        // Imprimir a média das notas
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / 4;

        System.out.println("A média é " + media);
        System.out.println("===============================");

    }
}