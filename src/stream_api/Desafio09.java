package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio09 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verifica se todos os números da lista são distintos
        boolean saoDistintos = numeros.stream()
            .distinct()
            /*
             * O método "count()" é um método terminal da Stream API em Java, que é usado para contar o número
             * de elementos presentes no fluxo. Ele retorna um valor do tipo "long", representando a contagem de
             * elementos no fluxo. Ele percorre o fluxo e conta o número de elementos presentes nele.
             * Ele é uma operação terminal, o que significa que, após sua chamada, não é possível encadear outras
             * operações no mesmo fluxo.
             * O método "count()" é frequentemente usado em combinação com outros métodos para realizar comparações
             * ou verificar propriedades dos elementos em um fluxo. Por exemplo, ao verificar se todos os elementos
             * atendem a uma condição.
             * O método "count()" não modifica o fluxo original, ele apenas realiza a contagem.
             * O retorno é um valor "long", que pode ser grande o suficiente para representar a contagem de elementos
             * em fluxos maiores. Em resumo, ele é usado para contar o número de elementos em um fluxo.
             * Ele é útil para obter informações sobre o tamanho ou quantidade de elementos em um contexto específico.
             */
            .count() == numeros.size();

        if (saoDistintos) {
            System.out.println("Todos os números são distintos.");
        } else {
            System.out.println("Pelo menos um número se repete na lista.");
        }
    }
}
