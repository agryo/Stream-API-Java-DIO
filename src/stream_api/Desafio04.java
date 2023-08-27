package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio04 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0) // Filtrar números pares
                .collect(Collectors.toList());

        System.out.println("Números pares: " + numerosPares);
    }
}
