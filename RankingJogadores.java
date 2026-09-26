import java.util.Scanner;

    public class RankingJogadores {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String[] nomes = new String[5];
            int[] pontos = new int[5];

            int maiorPontuacao = 0;
            String campeao = "";

            for (int i = 0; i < 5; i++) {
                System.out.print("Digite o nome do jogador " + (i + 1) + ": ");
                nomes[i] = sc.nextLine();

                System.out.print("Digite a pontuação: ");
                pontos[i] = sc.nextInt();
                sc.nextLine();
            }

            for (int i = 0; i < 5; i++) {
                if (pontos[i] > maiorPontuacao) {
                    maiorPontuacao = pontos[i];
                    campeao = nomes[i];
                }
            }

            System.out.println("--- PLACAR ---");

            for (int i = 0; i < 5; i++) {
                System.out.println(nomes[i] + " - " + pontos[i] + " pontos");
            }

            System.out.println("Campeão: " + campeao
                    + " - " + maiorPontuacao + " pontos");
        }
    }