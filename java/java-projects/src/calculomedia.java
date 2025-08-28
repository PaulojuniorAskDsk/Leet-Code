
// Importa a classe Scanner, usada para ler dados digitados pelo usuário
import java.util.Scanner;

public class calculomedia {

    public static void main(String[] args) {
        // Cria um objeto da classe Scanner para capturar entradas do teclado
        // (System.in)
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis do tipo double (números reais com casas decimais)
        double A, B, media;

        // Lê o primeiro valor digitado pelo usuário e armazena em A
        A = sc.nextDouble();

        // Lê o segundo valor digitado pelo usuário e armazena em B
        B = sc.nextDouble();

        // Calcula a média ponderada:
        // - Multiplica A por 3.5 (peso da primeira nota)
        // - Multiplica B por 7.5 (peso da segunda nota)
        // - Soma os resultados e divide por 11 (soma dos pesos 3.5 + 7.5)
        media = (A * 3.5 + B * 7.5) / 11;

        // Imprime o resultado formatado:
        // - "MEDIA = " é o texto fixo
        // - "%.5f" formata o número em ponto flutuante com 5 casas decimais
        System.out.printf("MEDIA = %.5f", media);

        // Apenas quebra a linha após a saída
        System.out.println();

        // Fecha o objeto Scanner para liberar recursos (boa prática)
        sc.close();
    }
}
