import java.util.Scanner;

public class Temperatura {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            double[] temperaturas = new double[7];
            double soma = 0;

            for (int i = 0; i < 7; i++) {
                System.out.print("Temperatura do dia " + (i + 1) + ": ");
                temperaturas[i] = sc.nextDouble();

                soma = soma + temperaturas[i];
            }

            System.out.println("\nTemperaturas:");

            for (int i = 0; i < 7; i++) {
                System.out.print(temperaturas[i] + " ");
            }

            // Calculando a média
            double media = soma / 7;

            System.out.printf("\nMedia da semana: %.2f C%n", media);

        }
    }