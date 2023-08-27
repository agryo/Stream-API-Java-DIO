package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio08 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Realiza a soma dos números da lista
        int somaDosNumeros = numeros.stream()
                .mapToInt(Integer::intValue) // Converte para um fluxo de inteiros
                .sum(); // Soma todos os números no fluxo

        System.out.println("Soma dos números da lista: " + somaDosNumeros);
    }
}
