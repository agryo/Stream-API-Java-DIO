package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando Stream API para encontrar o maior número primo da lista
        int maiorPrimo = numeros.stream()
                                .filter(Desafio14::isPrimo)
                                .max(Integer::compareTo)
                                .orElse(-1);

        System.out.println("Maior número primo: " + (maiorPrimo != -1 ? maiorPrimo : "Nenhum primo encontrado"));
    }

    // Função auxiliar para verificar se um número é primo
    private static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
