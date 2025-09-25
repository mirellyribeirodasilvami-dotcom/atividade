import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[8]; // vetor para armazenar as 8 notas
        double soma1Semestre = 0, soma2Semestre = 0;

        // Entrada das notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            if (i < 4) {
                soma1Semestre += notas[i]; // primeiras 4 notas
            } else {
                soma2Semestre += notas[i]; // últimas 4 notas
            }
        }

        // Cálculo das médias
        double media1Semestre = soma1Semestre / 4;
        double media2Semestre = soma2Semestre / 4;
        double mediaFinal = (media1Semestre + media2Semestre) / 2;

        // Saída organizada
        System.out.println("\n===== RESULTADOS =====");

        // Mostrando médias bimestrais
        for (int i = 0; i < 8; i++) {
            System.out.printf("Média do %dº bimestre: %.2f%n", (i + 1), notas[i]);
        }

        // Mostrando médias semestrais e final
        System.out.printf("\nMédia do 1º semestre: %.2f%n", media1Semestre);
        System.out.printf("Média do 2º semestre: %.2f%n", media2Semestre);
        System.out.printf("MÉDIA FINAL: %.2f%n", mediaFinal);

        sc.close();
    }
}
