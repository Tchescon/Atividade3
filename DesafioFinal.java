   import java.util.Scanner;

    public class DesafioFinal {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String[] nomes = new String[10];
            double[] notas = new double[10];

            double soma = 0;
            double maior = 0;
            double menor = 0;

            int aprovados = 0;
            int reprovados = 0;

            String nomeMaior = "";

            for (int i = 0; i < 10; i++) {

                System.out.print("Digite o nome do aluno: ");
                nomes[i] = sc.nextLine();

                System.out.print("Digite a nota: ");
                notas[i] = sc.nextDouble();
                sc.nextLine();

                soma = soma + notas[i];

                if (i == 0) {
                    maior = notas[i];
                    menor = notas[i];
                    nomeMaior = nomes[i];
                }

                if (notas[i] > maior) {
                    maior = notas[i];
                    nomeMaior = nomes[i];
                }

                if (notas[i] < menor) {
                    menor = notas[i];
                }

                if (notas[i] >= 6) {
                    aprovados++;
                } else {
                    reprovados++;
                }
            }

            double media = soma / 10;

            System.out.println("Alunos:");

            for (int i = 0; i < 10; i++) {
                if (notas[i] >= 6) {
                    System.out.println(nomes[i] + " - " + notas[i] + " - APROVADO");
                } else {
                    System.out.println(nomes[i] + " - " + notas[i] + " - REPROVADO");
                }
            }

            System.out.println("Media: " + media);
            System.out.println("Maior nota: " + maior);
            System.out.println("Menor nota: " + menor);
            System.out.println("Aprovados: " + aprovados);
            System.out.println("Reprovados: " + reprovados);
            System.out.println("Aluno com maior nota: " + nomeMaior);

            System.out.print("\nDigite o nome de um aluno para pesquisar: ");
            String pesquisa = sc.nextLine();

            boolean achou = false;

            for (int i = 0; i < 10; i++) {
                if (nomes[i].equalsIgnoreCase(pesquisa)) {

                    System.out.println("Nome: " + nomes[i]);
                    System.out.println("Nota: " + notas[i]);

                    if (notas[i] >= 6) {
                        System.out.println("Situacao: APROVADO");
                    } else {
                        System.out.println("Situacao: REPROVADO");
                    }

                    achou = true;
                }
            }

            if (!achou) {
                System.out.println("Aluno nao encontrado.");
            }
        }
    }
