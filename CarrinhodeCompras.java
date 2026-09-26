import java.util.Scanner;

    public class CarrinhodeCompras {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double[] precos = new double[6];
            double total = 0;

            for (int i = 0; i < 6; i++) {
                System.out.print("Preço do produto " + (i + 1) + ": R$ ");
                precos[i] = sc.nextDouble();

                total += precos[i];
            }

            System.out.printf("Total da compra: R$ ", total);

            System.out.print("Quanto dinheiro você possui? R$ ");
            double dinheiro = sc.nextDouble();

            if (dinheiro >= total) {
                System.out.println("Dinheiro suficiente para realizar a compra.");
            } else {
                System.out.println("Dinheiro insuficiente para realizar a compra.");
            }
        }
    }


