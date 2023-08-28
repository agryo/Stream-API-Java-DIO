package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    public static void main(String[] args) {
        /*
         * Nesse código, utilizamos a função "allMatch()" da Stream API para verificar se todos os números da lista
         * satisfazem a condição especificada. A expressão lambda "num -> num.equals(numeros.get(0))" compara cada
         * número com o primeiro número da lista. Se todos os números forem iguais, a variável "todosIguais" será "true",
         * caso contrário, será "false". O resultado é impresso no console.
         */
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando Stream API para verificar se todos os números são iguais
        boolean todosIguais = numeros.stream()
                .allMatch(num -> num.equals(numeros.get(0)));

        System.out.println("Todos os números são iguais? " + todosIguais);
    }
}
