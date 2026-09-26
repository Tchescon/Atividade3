   import java.util.Scanner;

    public class ProcurandoNumero {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] numeros = new int[10];

            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o " + (i + 1) + "º número: ");
                numeros[i] = sc.nextInt();
            }

            System.out.print("Qual número deseja procurar? ");
            int numeroProcurado = sc.nextInt();

            boolean encontrado = false;

            for (int i = 0; i < 10; i++) {
                if (numeros[i] == numeroProcurado) {
                    System.out.println("Número encontrado na posição " + i + ".");
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("Número não encontrado.");
            }
        }
    }