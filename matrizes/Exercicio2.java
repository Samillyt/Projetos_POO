package matrizes;

public class Exercicio2 {

    public static void main(String[] args) {

        int[][] matriz = {
                { 1, 0, 0, 0 },
                { 0, 1, 0, 0 },
                { 0, 0, 1, 0 },
                { 0, 0, 2, 1 }
        };

        int i, j;

        System.out.println("===============================");

        System.out.println("Conteúdo da matriz completa:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("===============================");

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println("===============================");

    }
}
