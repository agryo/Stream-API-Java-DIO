package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Calcula a soma dos quadrados dos números
        int somaDosQuadrados = numeros.stream()
            .mapToInt(numero -> numero * numero) // Calcula o quadrado de cada número
            .sum(); // Soma os resultados

        System.out.println("Soma dos quadrados dos números: " + somaDosQuadrados);
    }
}
