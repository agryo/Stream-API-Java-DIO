package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando Stream API para agrupar os números em pares e ímpares
        Map<Boolean, List<Integer>> numerosAgrupados = numeros.stream()
                /*
                 * O método "Collectors.partitioningBy()" é um método estático da classe "java.util.stream.Collectors"
                 * introduzido no Java 8 como parte da Stream API. Ele é usado para particionar os elementos de um
                 * fluxo em dois grupos, com base em uma condição "booleana". Um dos grupos conterá os elementos que
                 * atendem à condição verdadeira (true) e o outro grupo conterá os elementos que não atendem à condição
                 * falsa (false).
                 * A assinatura básica do método é a seguinte:
                 * 
                 * public static <T> Collector<T, ?, Map<Boolean, List<T>>> partitioningBy(Predicate<? super T> predicate)
                 * 
                 *      predicate: Uma expressão lambda ou referência de método que avalia a condição de particionamento.
                 * 
                 * O método "Collectors.partitioningBy()" retorna um "Collector" que agrupa os elementos de um fluxo em um
                 * mapa onde as chaves são Boolean (true ou false) e os valores são listas contendo os elementos que
                 * satisfazem ou não satisfazem a condição fornecida.
                 */
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        List<Integer> pares = numerosAgrupados.get(true);
        List<Integer> impares = numerosAgrupados.get(false);

        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
    }
}
