 import java.util.Scanner;

    public class Radar {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] velocidades = new int[10];

            int acimaDoLimite = 0;
            int maiorVelocidade = 0;

            for (int i = 0; i < 10; i++) {
                System.out.print("Digite a velocidade do veículo " + (i + 1) + ": ");
                velocidades[i] = sc.nextInt();
            }

            for (int i = 0; i < 10; i++) {

                if (velocidades[i] > 80) {
                    System.out.println("Veículo " + (i + 1) + ": "
                            + velocidades[i] + " km/h - ACIMA DO LIMITE");

                    acimaDoLimite++;
                } else {
                    System.out.println("Veículo " + (i + 1) + ": "
                            + velocidades[i] + " km/h");
                }

                if (velocidades[i] > maiorVelocidade) {
                    maiorVelocidade = velocidades[i];
                }
            }

            System.out.println("Total acima do limite: " + acimaDoLimite);
            System.out.println("Maior velocidade registrada: "
                    + maiorVelocidade + " km/h");
        }
    }