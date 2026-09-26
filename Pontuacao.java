import java.util.Scanner;

public class Pontuacao {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int[] pontuacoes = new int[5];

            for (int i = 0; i < 5; i++) {
                System.out.print("Qual foi a pontuação do jogador " + (i + 1) + ": ");
                pontuacoes[i] = sc.nextInt();
            }

            System.out.println("A pontuação dos jogadores foi:");

            for (int i = 0; i < 5; i++) {
                System.out.println("Jogador " + (i + 1) + ": "
                        + pontuacoes[i] + " pontos");
            }
        }
}