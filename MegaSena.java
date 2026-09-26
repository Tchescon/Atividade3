import java.util.Scanner;

    public class MegaSena {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] sorteados = {5, 12, 23, 31, 44, 58};
            int[] aposta = new int[6];

            int acertos = 0;

            for (int i = 0; i < 6; i++) {
                System.out.print("Digite o " + (i + 1) + "º número da aposta: ");
                aposta[i] = sc.nextInt();
            }

            System.out.print("\nNúmeros apostados: ");
            for (int i = 0; i < 6; i++) {
                System.out.print(aposta[i] + " ");
            }

            System.out.print("\nNúmeros sorteados: ");
            for (int i = 0; i < 6; i++) {
                System.out.print(sorteados[i] + " ");
            }


            System.out.print("\nNúmeros acertados: ");

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (aposta[i] == sorteados[j]) {
                        acertos++;
                        System.out.print(aposta[i] + " ");
                        break;
                    }
                }
            }

        }
    }