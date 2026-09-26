import java.util.Scanner;

    import java.util.Scanner;

    public class GolsJogador {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] gols = new int[8];

            int maisGols = 0;
            int jogadorMaior = 0;

            for (int i = 0; i < 5; i++) {
                System.out.print("Quantos gols o jogador " + (i + 1) + " fez : ");
                gols[i] = sc.nextInt();
            }

            for (int i = 0; i < 8; i++) {
                if (gols[i] > maisGols) {
                    maisGols = gols[i];
                    jogadorMaior = i + 1;
                }
            }

            System.out.println("Maior quantidade de gols foi de : " + maisGols + " gols.");
            System.out.println("Jogador que marcou mais gols foi o : " + jogadorMaior);

        }
    }
