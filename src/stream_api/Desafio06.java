package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio06 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verifica se a lista contém algum número maior que 10
        boolean contemMaiorQueDez = numeros.stream()
                /*
                 * O método "anyMatch()" da Stream API para verificar se a lista contém algum número maior que 10.
                 * O método retorna "true" se pelo menos um número atender à condição especificada, caso contrário, retorna "false".
                 * A diferença dos seus semelhantes métodos é que o "anyMatch()" verifica se "algum" (any) número atende o teste,
                 * e não todos os números.
                 */
                .anyMatch(numero -> numero > 10);

        if (contemMaiorQueDez) {
            System.out.println("A lista contém números maiores que 10.");
        } else {
            System.out.println("A lista não contém números maiores que 10.");
        }
    }
}
