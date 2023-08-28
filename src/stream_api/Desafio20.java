package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio20 {
    public static void main(String[] args) {
        /*
         * Nesse código, utilizamos a função "filter()" da Stream API para manter apenas os números da lista que
         * são divisíveis tanto por 3 quanto por 5. A expressão lambda "num -> num % 3 == 0 && num % 5 == 0" verifica
         * se um número atende a essa condição. Em seguida, usamos "mapToInt()" para converter os números filtrados
         * em um fluxo de inteiros primitivos e, finalmente, usamos "sum()" para calcular a soma desses números.
         * O resultado é impresso no console.
         */
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando Stream API para encontrar a soma dos números divisíveis por 3 e 5
        int soma = numeros.stream()
                .filter(num -> num % 3 == 0 && num % 5 == 0) // Ambos tem que ser verdadeiro (true)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Soma dos números divisíveis por 3 e 5: " + soma);
    }
}
