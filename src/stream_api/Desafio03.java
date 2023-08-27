package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio03 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosPositivos = numeros.stream()
            /*
            * O método allMatch() é uma função fornecida pela interface "Stream" no Java. 
            * Ele é usado para verificar se todos os elementos de um fluxo (stream) satisfazem uma determinada condição.
            * Ex.: boolean allMatch(Predicate<? super T> predicate)
            * O "Predicate<? super T>" predicate é uma expressão lambda ou referência a método que especifica a condição 
            * que cada elemento do fluxo deve atender. O método allMatch() retorna "true" se todos os elementos do fluxo 
            * atenderem à condição especificada pelo predicado. Caso contrário, ele retorna false.
            * No método abaixo, ele testa se todos os elementos de da "List" de "numeros" são positivos e obtém o
            * resultado (true ou false) e guarda ma variável booleana "todosPositivos".
            */
            .allMatch(n -> n > 0);

        // Aqui continua fazendo o teste apartir do resuldado e exibe as mensagens se for "true" ou se for "false".
        if (todosPositivos)
            System.out.println("Todos os números são positivos.");
        else
            System.out.println("Existem números negativos!");
    }
}
